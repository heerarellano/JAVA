/*
Base de datos proyecto_inscripciones 
Enero 2021
*/

--                 Creacion de la Base de datos
--CREATE DATABASE proyecto_inscripciones;
--Agregamos esta extension para poder encriptar
CREATE EXTENSION IF NOT EXISTS pgcrypto;

--Iniciamos la creacion de las tablas que tendrá la base de datos

CREATE TABLE HORA(
    hora_id_hora  SERIAL PRIMARY KEY,
    hora_ini      TIME  NOT NULL,
    hora_fin      TIME  NOT NULL
);

CREATE TABLE DIA(
    dia_id_dia   SERIAL NOT NULL,
    dia_nombre   VARCHAR(9) NOT NULL,
    PRIMARY KEY (dia_id_dia)
);

CREATE TABLE SALON(
    salo_id_salon   VARCHAR(6) NOT NULL,
    salo_edificio   CHAR(1) NOT NULL,
    salo_piso       VARCHAR(2) NOT NULL,
    PRIMARY KEY(salo_id_salon)
);

CREATE TABLE Asignatura(
    asig_id_asignatura CHAR(4) NOT NULL,
    asig_nombre        VARCHAR(100) NOT NULL,
    asig_plan_estudio  CHAR(4) NOT NULL,
    PRIMARY KEY(asig_id_asignatura)
);

CREATE TABLE Periodo(
    peri_id_periodo     CHAR(6) NOT NULL,
    peri_fec_inicio     DATE NOT NULL,
    peri_fec_fin        DATE NOT NULL,
    peri_estado         INT NOT NULL,
    CHECK(peri_estado<=1),
    PRIMARY KEY(peri_id_periodo)
);

CREATE TABLE Persona(
    pers_id_persona SERIAL NOT NULL,
    pers_nombre     VARCHAR(50) NOT NULL,
    pers_apaterno   VARCHAR(50) NOT NULL,
    pers_amaterno   VARCHAR(50),
    PRIMARY KEY(pers_id_persona)
);

CREATE TABLE Profesor(
    prof_id_profesor    SERIAL NOT NULL,
    prof_num_trabajador VARCHAR(10) UNIQUE NOT NULL,
    prof_cedula         VARCHAR(10) UNIQUE NOT NULL,
    prof_grado          CHAR(1) NOT NULL DEFAULT 'L',
    pers_id_persona     INT NOT NULL,
    PRIMARY KEY (prof_id_profesor),
    FOREIGN KEY (pers_id_persona) REFERENCES Persona(pers_id_persona) ON DELETE CASCADE
);

CREATE INDEX Pers_Prof ON Profesor(pers_id_persona);

CREATE TABLE GRUPO(
    grup_id_grupo       SERIAL NOT NULL,
    grup_clave          VARCHAR(4) UNIQUE NOT NULL,
    grup_cupo           INT NOT NULL,
    prof_id_profesor    INT,
    peri_id_periodo     CHAR(6),
    asig_id_asignatura  CHAR(4),
    PRIMARY KEY (grup_id_grupo),
    FOREIGN KEY (prof_id_profesor) REFERENCES Profesor(prof_id_profesor) ON DELETE SET NULL,
    FOREIGN KEY (peri_id_periodo) REFERENCES Periodo(peri_id_periodo) ON DELETE SET NULL,
    FOREIGN KEY (asig_id_asignatura) REFERENCES Asignatura(asig_id_asignatura) ON DELETE SET NULL
);

CREATE INDEX Prof_Grupo ON Grupo(prof_id_profesor);
CREATE INDEX Grupo_peri ON Grupo(peri_id_periodo);
CREATE INDEX Grupo_Asi ON Grupo(asig_id_asignatura);

CREATE TABLE HORARIO(
    hora_id_horario SERIAL NOT NULL,
    grup_id_grupo   INT NOT NULL,
    salo_id_salon   VARCHAR(6) NOT NULL,
    dia_id_dia      INT NOT NULL,
    hora_id_hora    INT NOT NULL,
    PRIMARY KEY (hora_id_horario),
    FOREIGN KEY (grup_id_grupo) REFERENCES Grupo(grup_id_grupo) ON DELETE CASCADE,
    FOREIGN KEY (salo_id_salon) REFERENCES Salon(salo_id_salon),
    FOREIGN KEY (dia_id_dia) REFERENCES Dia(dia_id_dia),
    FOREIGN KEY (hora_id_hora) REFERENCES Hora(hora_id_hora) 
);

CREATE INDEX Hor_grup ON Horario(grup_id_grupo);
CREATE INDEX Hor_Salo ON Horario(salo_id_salon);
CREATE INDEX Hor_dia ON Horario(dia_id_dia);
CREATE INDEX Hor_hor ON Horario(hora_id_hora);



CREATE TABLE Alumno(
    alum_id_alumno   SERIAL NOT NULL,
    alum_num_cuenta  VARCHAR(9) UNIQUE NOT NULL,
    alum_generacion  INT NOT NULL,
    pers_id_persona  INT NOT NULL,
    PRIMARY KEY(alum_id_alumno),
    FOREIGN KEY(pers_id_persona) REFERENCES Persona(pers_id_persona) ON DELETE CASCADE
);

CREATE INDEX Pers_Alumno ON Alumno(pers_id_persona);

CREATE TABLE Inscripcion(
    insc_hora       TIME NOT NULL,
    insc_fecha      DATE NOT NULL,
    insc_host       CHAR(15) NOT NULL DEFAULT '192.168.0.8',
    alum_id_alumno  INT NOT NULL,
    grup_id_grupo   INT NOT NULL,
    PRIMARY KEY(alum_id_alumno, grup_id_grupo),
    FOREIGN KEY (alum_id_alumno) REFERENCES Alumno(alum_id_alumno) ON DELETE CASCADE,
    FOREIGN KEY (grup_id_grupo) REFERENCES Grupo(grup_id_grupo) ON DELETE CASCADE
);

CREATE INDEX Ins_Alum ON Inscripcion(alum_id_alumno);
CREATE INDEX Ins_Grup ON Inscripcion(grup_id_grupo);

CREATE TABLE Usuario (
    us_id_usuario       SERIAL NOT NULL,
    pers_id_persona     INT NOT NULL,
    us_passwd           VARCHAR(32) NOT NULL, 
    us_email            VARCHAR(60) NOT NULL,
    us_rol              VARCHAR(15) NOT NULL,
    PRIMARY KEY(us_id_usuario),
    FOREIGN KEY (pers_id_persona) REFERENCES Persona(pers_id_persona) ON DELETE CASCADE
);
CREATE INDEX Usu_Pers ON Usuario(pers_id_persona);

CREATE TABLE LOG_IN(
    log_id_login     SERIAL NOT NULL,
    us_id_usuario    INT NOT NULL,
    log_hora         TIME NOT NULL,
    log_fecha        DATE NOT NULL,
    PRIMARY KEY(log_id_login),
    FOREIGN KEY(us_id_usuario) REFERENCES Usuario(us_id_usuario) ON DELETE CASCADE
);


--                                          Funciones y triggers
--                  Encriptar contrasenia
--Encripta la contraseña del usuario que acaba de ser creado
--Procedimiento almacenado
CREATE OR REPLACE FUNCTION encriptar_contraseña() RETURNS TRIGGER AS $$
BEGIN
   UPDATE Usuario
   SET us_passwd = MD5(NEW.us_passwd) WHERE us_id_usuario=NEW.us_id_usuario;
   RETURN NEW;
END
$$ LANGUAGE plpgsql;

CREATE TRIGGER encriptar_contraseña
AFTER INSERT ON usuario
FOR EACH ROW
EXECUTE PROCEDURE encriptar_contraseña();

--                          Disminuir cupo
--Disminuye el cupo del grupo en el que se agregó una inscripción
--Procedimiento almacenado
CREATE OR REPLACE FUNCTION disminuir_cupo() RETURNS TRIGGER AS $$
BEGIN 
	UPDATE grupo
	SET grup_cupo= grup_cupo-1	
	WHERE grup_id_grupo = NEW.grup_id_grupo;
RETURN NEW;
END
$$ LANGUAGE plpgsql;
--Disparador
CREATE TRIGGER disminuircupo
AFTER INSERT ON inscripcion
FOR EACH ROW
EXECUTE PROCEDURE disminuir_cupo();


--                          Eliminar alumno

--Procedimiento almacenado
CREATE OR REPLACE FUNCTION f_eliminar_persona() RETURNS TRIGGER AS $$
DECLARE
  id_persona INT; 
BEGIN
	id_persona:= OLD.pers_id_persona; 
	DELETE 
	FROM persona
	WHERE persona.pers_id_persona = id_persona; 
	RETURN OLD; 
END;
$$ LANGUAGE plpgsql;
--TRIGGER
--Elimina por número de cuenta, primero elimina persona y luego alumno. 
CREATE TRIGGER t_eliminar_persona
AFTER DELETE ON alumno
FOR EACH ROW 
EXECUTE PROCEDURE f_eliminar_persona(); 


--                          Eliminar profesor
--Procedimiento almacenado
CREATE OR REPLACE FUNCTION f_eliminar_persona_profesor() RETURNS TRIGGER AS $$
DECLARE
  id_persona INT; 
BEGIN
	id_persona:= OLD.pers_id_persona; 
	DELETE 
	FROM persona
	WHERE persona.pers_id_persona = id_persona; 
	RETURN OLD; 
END;
$$ LANGUAGE plpgsql;


--Elimina por número de trabajador, primero elimina persona y luego profesor. 
CREATE TRIGGER t_eliminar_persona_profesor
AFTER DELETE ON profesor
FOR EACH ROW 
EXECUTE PROCEDURE f_eliminar_persona_profesor(); 


--                           Aqui inicia la insercion de los primeros valores
INSERT INTO hora(hora_id_hora,hora_ini,hora_fin) VALUES
(DEFAULT,'07:00','09:00'),
(DEFAULT,'09:00','11:00'),
(DEFAULT,'11:00','13:00'),
(DEFAULT,'13:00','15:00'),
(DEFAULT,'15:00','17:00'),
(DEFAULT,'17:00','19:00'),
(DEFAULT,'19:00','21:00');

INSERT INTO Dia(dia_id_dia, dia_nombre) VALUES
(DEFAULT,'Lunes'),
(DEFAULT,'Martes'),
(DEFAULT,'Miercoles'),
(DEFAULT,'Jueves'),
(DEFAULT,'Vierne'),
(DEFAULT,'Sabado'),
(DEFAULT,'Domingo');

INSERT INTO Salon(salo_id_salon, salo_edificio, salo_piso) VALUES
('1591-B','B','1'),
('2591-C','C','2'),
('3591-D','D','3'),
('2291-A','A','2'),
('1291-A','A','1');

INSERT INTO Asignatura(asig_id_asignatura, asig_nombre, asig_plan_estudio) VALUES
('0066','Ética 1','2016'),
('1547','Telecomunicaciones','2016'),
('0657','Derecho','2012'),
('6957','Administracion I','2012'),
('7857','Informatica I','2012');

INSERT INTO Periodo(peri_id_periodo, peri_fec_inicio, peri_fec_fin, peri_estado) VALUES
('2019-1','2018-08-5','2019-02-22',0),
('2019-2','2019-02-5','2019-06-22',0),
('2020-1','2019-08-5','2020-02-22',0),
('2020-2','2020-02-5','2020-06-22',0),
('2021-1','2021-08-5','2021-02-22',1),
('2021-2','2022-02-5','2022-06-22',0);


--Reiniciar la sequencia pers_id_persona
ALTER SEQUENCE persona_pers_id_persona_seq RESTART WITH 1;
INSERT INTO Persona(pers_id_persona, pers_nombre, pers_apaterno, pers_amaterno) VALUES
(DEFAULT,'Jose', 'Perez', 'Gomez'),
(DEFAULT,'Ada', 'Lovelace', 'Byron'),
(DEFAULT,'Amelia','Earhart','Mary'),
(DEFAULT,'Ana','Bolena','Gomez'),
(DEFAULT,'Carlota','Corday','Marat'),
(DEFAULT,'Catalina','de Aragon','Mendez'),
(DEFAULT,'Rebeca','Lane','Uribe'),
(DEFAULT,'Josue', 'Perez', 'Gomez'),
(DEFAULT,'Jesus', 'Perez', 'Gomez'),
(DEFAULT,'Jorge', 'Perez', 'Gomez'),
(DEFAULT,'Daniela', 'Perez', 'Gomez');

--Reiniciar la secuencia alum_id_alumno
ALTER SEQUENCE alumno_alum_id_alumno_seq RESTART WITH 1;
INSERT INTO Alumno(alum_id_alumno, alum_num_cuenta, alum_generacion, pers_id_persona) VALUES
(DEFAULT,'316325707','2018',6),
(DEFAULT,'315487512','2017',7),
(DEFAULT,'316854789','2018',8),
(DEFAULT,'315745554','2017',9),
(DEFAULT,'316587455','2017',10),
(DEFAULT,'316325708','2018',11);

--Reiniciar secuencia de prof_id_profesor
ALTER SEQUENCE profesor_prof_id_profesor_seq RESTART WITH 1;
INSERT INTO Profesor (prof_id_profesor, prof_num_trabajador, prof_cedula, prof_grado, pers_id_persona) VALUES 
(DEFAULT,'156985','7S5A8D','L',1),
(DEFAULT,'151248','545454','L',2),
(DEFAULT,'158745','54782a','L',3),
(DEFAULT,'158965','A4Asa7','M',4),
(DEFAULT,'157489','A89D8A','M',5);

--Reiniciar secuencia de grup_id_grupo
alter sequence grupo_grup_id_grupo_seq RESTART WITH 1;
INSERT INTO GRUPO(grup_id_grupo, grup_clave, grup_cupo, prof_id_profesor, peri_id_periodo, asig_id_asignatura) VALUES
(DEFAULT,'5875',40,1,'2021-1','0066'),
(DEFAULT,'9857',45,2,'2021-1','1547'),
(DEFAULT,'5785',55,3,'2021-1','0657'),
(DEFAULT,'5147',60,4,'2020-2','6957'),
(DEFAULT,'5898',42,5,'2020-2','7857'),
(DEFAULT,'5876',42,4,'2021-1','0066');

--Reiniciar secuencia de hora_id_horario
alter sequence horario_hora_id_horario_seq RESTART WITH 1;
INSERT INTO HORARIO(hora_id_horario, grup_id_grupo, salo_id_salon, dia_id_dia, hora_id_hora)VALUES
(DEFAULT,1,'1591-B',1,1),
(DEFAULT,2,'2591-C',2,1),
(DEFAULT,3,'3591-D',3,2),
(DEFAULT,4,'2291-A',4,3),
(DEFAULT,5,'1291-A',5,4);


INSERT INTO inscripcion(insc_hora, insc_fecha, alum_id_alumno, grup_id_grupo) VALUES
(CURRENT_TIME,CURRENT_DATE,1,1),
(CURRENT_TIME,CURRENT_DATE,1,2),
(CURRENT_TIME,CURRENT_DATE,2,3),
(CURRENT_TIME,CURRENT_DATE,3,4),
(CURRENT_TIME,CURRENT_DATE,4,5),
(CURRENT_TIME,CURRENT_DATE,5,6);

--Reiniciar secuencia de us_id_usuario
ALTER SEQUENCE usuario_us_id_usuario_seq RESTART WITH 1;
INSERT INTO Usuario (us_id_usuario, pers_id_persona, us_passwd, us_email, us_rol) VALUES
(DEFAULT,1,'joseperez','joseperez@gmail.com','profesor'),
(DEFAULT,2,'adalovelace','adalovelace@gmail.com','profesor'),
(DEFAULT,3,'ameliaearhart','ameliaearhart@gmail.com','profesor'),
(DEFAULT,4,'anabolena','anabolena@gmail.com','profesor'),
(DEFAULT,5,'carlotacorday','carlotacorday@gmail.com','profesor'),
(DEFAULT,6,'catalinaaragon','catalinaaragon@gmail.com','alumno'),
(DEFAULT,7,'rebecalane','rebecalane@gmail.com','alumno'),
(DEFAULT,8,'josueperez','josueperez@gmail.com','alumno'),
(DEFAULT,9,'jesusperez','jesusperez@gmail.com','alumno'),
(DEFAULT,10,'jorgeperez','jorgeperez@gmail.com','alumno');



--Crear y otorgar permisos al usuario que usaremos en el sistema *para administrador*
CREATE USER equipo WITH PASSWORD 'equipo2021**';
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA PUBLIC TO equipo WITH GRANT OPTION;

--Darle permisos para que no nos marque error al usar secuencia
GRANT USAGE, SELECT ON SEQUENCE horario_hora_id_horario_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE grupo_grup_id_grupo_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE persona_pers_id_persona_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE profesor_prof_id_profesor_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE usuario_us_id_usuario_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE alumno_alum_id_alumno_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE dia_dia_id_dia_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE hora_hora_id_hora_seq TO equipo;
GRANT USAGE, SELECT ON SEQUENCE log_in_log_id_login_seq TO equipo; 
