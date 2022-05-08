package inscripcion;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuInscripcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultaInscripcion extends javax.swing.JFrame {
    //Creo dos variables de instancia una de tipo preparedstatement que prepara al sistema y resultedstatement. 
    PreparedStatement prepared;
    ResultSet result;
    
    int resultado; //Variable que guardará un valor entero para el resultado de la ejecución del query.
    
    public ConsultaInscripcion() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfLimpiar = new javax.swing.JButton();
        jtfConsultar = new javax.swing.JButton();
        jtfSalir = new javax.swing.JButton();
        jtfAlumno = new javax.swing.JTextField();
        jtfGrupo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jlIDAlumno = new javax.swing.JLabel();
        jlIDGrupo = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlHost = new javax.swing.JLabel();
        jlDatosInsc = new javax.swing.JLabel();
        jlIDAlumnoConsulta = new javax.swing.JLabel();
        jlIDGrupoConsulta = new javax.swing.JLabel();
        jlHoraConsulta = new javax.swing.JLabel();
        jlHostConsulta = new javax.swing.JLabel();
        jlFechaConsulta = new javax.swing.JLabel();
        jlTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Por favor ingrese los datos:");

        jLabel8.setText("ID del Alumno:");

        jLabel9.setText("ID del Grupo:");

        jtfLimpiar.setText("Limpiar");
        jtfLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimpiarActionPerformed(evt);
            }
        });

        jtfConsultar.setText("Consultar");
        jtfConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfConsultarActionPerformed(evt);
            }
        });

        jtfSalir.setText("Regresar");
        jtfSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalirActionPerformed(evt);
            }
        });

        jlTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo1.setText("Consultar inscripción.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIDGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHost, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlIDGrupoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIDAlumnoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHoraConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlHostConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfLimpiar)
                        .addGap(44, 44, 44)
                        .addComponent(jtfConsultar)
                        .addGap(36, 36, 36)
                        .addComponent(jtfSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlDatosInsc, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlTitulo1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jlTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfConsultar)
                    .addComponent(jtfLimpiar)
                    .addComponent(jtfSalir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addComponent(jlDatosInsc)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDAlumno)
                    .addComponent(jlIDAlumnoConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDGrupo)
                    .addComponent(jlIDGrupoConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHora)
                    .addComponent(jlHoraConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHost)
                    .addComponent(jlHostConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlFechaConsulta)
                    .addComponent(jlFecha))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalirActionPerformed
        MenuInscripcion jfMenuInscripcion = new MenuInscripcion(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuInscripcion.pack(); //Para que se centre la ventana.
        jfMenuInscripcion.setLocationRelativeTo(null); 
        jfMenuInscripcion.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jtfSalirActionPerformed

    private void jtfLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimpiarActionPerformed
        
        jtfGrupo.setText(null);
        jtfAlumno.setText(null);
        limpiar(); 
    }//GEN-LAST:event_jtfLimpiarActionPerformed

    private void jtfConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfConsultarActionPerformed

        if ( jtfAlumno.getText().isEmpty()||jtfGrupo.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón consultar           
                 //Crear variable de tipo conexion para mandar a llamar al método getConnection
                Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
        
        
                try{
            
                    //Lo que se debe de hacer y en caso de que algo dentro de este bloque falle, se ejecuta el bloque catch.
                    Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
                    prepared = Conexion.conexion.prepareStatement("SELECT P.pers_nombre || ' ' || P.pers_apaterno  || ' '|| P.pers_amaterno AS nombre,\n" +
                                                 "G.grup_clave, TO_CHAR(I.insc_hora, 'HH:MI:SS') AS insc_hora, TO_CHAR (I.insc_fecha, 'DD/MM/YYYY') AS insc_fecha, I.insc_host\n" +
                                                 "FROM persona P, alumno A, grupo G, inscripcion I\n" +
                                                 "WHERE I.alum_id_alumno = ?\n" +
                                                 "AND G.grup_id_grupo = ?\n" +
                                                 "AND P.pers_id_persona = A.pers_id_persona\n" +
                                                 "AND G.grup_id_grupo = I.grup_id_grupo\n" +
                                                 "AND A.alum_id_alumno = I.alum_id_alumno;"); 
            
                    //Al poner las aplicaciones requerimos poner los atributos que deseamos, no el * porque se tardaría más.
                     /*Se pone el signo de ? para que el primer valor que llegue, sea el que se tome. En el orden en el que lleguen
                    es como los va a poner en el select*/
            
                    prepared.setInt(1, Integer.valueOf(jtfAlumno.getText())); 
                    prepared.setInt(2, Integer.valueOf(jtfGrupo.getText())); 

                    result = prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
                     //Del objeto persona sus propiedades son los atributos de la consulta. Todos los atributos de la tabla persona o de un join, son las propiedades de ese objeto.
                     /*Si desearamos buscar por nombre en lugar de por id, cuando traemos más de un registro tenemos que recorrer la consulta, en lugar de un if se utilizaría un while
                     donde en cada vuelta nos muestre el resultado de la fila
            
                     while(result.next()) -- result next nos dice ¿Hay un registro siguiente?*/
            
                    if(result.next()){
                
                        jlIDAlumnoConsulta.setText(result.getString("nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                        jlIDGrupoConsulta.setText(result.getString("grup_clave"));
                        jlFechaConsulta.setText(result.getString("insc_fecha")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                        jlHoraConsulta.setText(result.getString("insc_hora"));
                        jlHostConsulta.setText(result.getString("insc_host"));
                    
                        jlDatosInsc.setText("Los datos de la inscripción son:");
                        jlIDAlumno.setText("Nombre del alumno:"); 
                        jlIDGrupo.setText("Grupo(clave):");
                        jlFecha.setText("Fecha de inscripción:");
                        jlHora.setText("Hora de inscripción:");
                        jlHost.setText("Host:");
                
                        //jtfNombreAlumno.setText(result.getString("nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                        //jtfGrupoClave.setText(result.getString("grup_clave"));
                        //jtfHora.setText(result.getString("insc_hora"));
                        //jtfHost.setText(result.getString("insc_fecha"));
                        //jtfFecha.setText(result.getString("insc_host"));
                

                     } else {
                
                        JOptionPane.showMessageDialog(null, "¡El ID de la Persona no Existe! :(");
                    }
            
                        Conexion.conexion.close(); //Se cierra la conexión a la BD 
            
                } catch (Exception e){
                    /*Aquí se pueden personalizar las excepciones*/
                    System.err.println("Error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.
                }
        }
    }//GEN-LAST:event_jtfConsultarActionPerformed

    
    private void limpiar(){
        
                jlIDAlumnoConsulta.setText(null); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlIDGrupoConsulta.setText(null);
                jlFechaConsulta.setText(null); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlHoraConsulta.setText(null);
                jlHostConsulta.setText(null);
                
                jlDatosInsc.setText(null);
                jlIDAlumno.setText(null); 
                jlIDGrupo.setText(null);
                jlFecha.setText(null);
                jlHora.setText(null);
                jlHost.setText(null);
            
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlDatosInsc;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlFechaConsulta;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlHoraConsulta;
    private javax.swing.JLabel jlHost;
    private javax.swing.JLabel jlHostConsulta;
    private javax.swing.JLabel jlIDAlumno;
    private javax.swing.JLabel jlIDAlumnoConsulta;
    private javax.swing.JLabel jlIDGrupo;
    private javax.swing.JLabel jlIDGrupoConsulta;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField jtfAlumno;
    private javax.swing.JButton jtfConsultar;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JButton jtfLimpiar;
    private javax.swing.JButton jtfSalir;
    // End of variables declaration//GEN-END:variables
}
