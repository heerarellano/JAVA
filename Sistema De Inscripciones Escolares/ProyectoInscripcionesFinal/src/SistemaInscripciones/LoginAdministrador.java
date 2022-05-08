package SistemaInscripciones;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class LoginAdministrador extends javax.swing.JFrame {
public static final String URL = "jdbc:postgresql://localhost:5432/proyecto_inscripciones";
public static final String USERNAME = "equipo";
public static final String PASSWD = "equipo2021**";
public static String usuario; 
PreparedStatement prepared;
ResultSet result;
   
    public LoginAdministrador() {
        initComponents();
    }
public static String User="";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        jlContraseniaAdmin = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbAcceder = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();
        jtfContrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Inicio de Sesión");

        jlUsuario.setText("Usuario:");

        jlContraseniaAdmin.setText("Contraseña: ");

        jbAcceder.setText("Acceder");
        jbAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAccederActionPerformed(evt);
            }
        });

        jbRegresar.setText("Salir");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jtfContrasenia.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("¡Bienvenido al Sistema de Inscripciones!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContraseniaAdmin)
                            .addComponent(jlUsuario))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbRegresar)
                                .addComponent(jtfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jbAcceder))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsuario))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlContraseniaAdmin))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAcceder)
                    .addComponent(jbRegresar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        /*Cierre del sistema*/
        System.exit(0);
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAccederActionPerformed
        User=jtfUsuario.getText();
        usuario = jtfUsuario.getText();
        String contrasenia;
        String rol;
        String usuarioid;

        try {

            contrasenia = jtfContrasenia.getText();

            if(usuario.equals(Conexion.USERNAME) && contrasenia.equals(Conexion.PASSWD)){
                JOptionPane.showMessageDialog(null, "Bienvenido administrador");
                UIMenu jfUIMenu = new UIMenu();
                jfUIMenu.pack(); 
                jfUIMenu.setLocationRelativeTo(null);
                jfUIMenu.setVisible(true); 
                this.setVisible(false);
                this.dispose();
                              
            } else {
                Conexion.conexion = null;

                /*Abrir la conexión*/
                Conexion.conexion = Conexion.getConnection();

                /*Preparar la sentencia SQL*/
                prepared = Conexion.conexion.prepareStatement  ("SELECT A.alum_num_cuenta as num_usuario, U.us_passwd, U.us_rol, U.us_id_usuario\n" +
                                                                "FROM USUARIO U INNER JOIN persona PERS ON U.pers_id_persona=PERS.pers_id_persona\n" +
                                                                "INNER JOIN Alumno A ON PERS.pers_id_persona=A.pers_id_persona\n" +
                                                                "WHERE A.alum_num_cuenta = ? AND U.us_passwd=MD5(?)\n" +
                                                                "UNION\n" +
                                                                "SELECT P.prof_num_trabajador as num_usuario, U.us_passwd, U.us_rol, U.us_id_usuario\n" +
                                                                "FROM USUARIO U INNER JOIN persona PERS ON U.pers_id_persona=PERS.pers_id_persona\n" +
                                                                "INNER JOIN Profesor P ON PERS.pers_id_persona=P.pers_id_persona\n" +
                                                                "WHERE P.prof_num_trabajador = ? AND U.us_passwd=MD5(?)");
                prepared.setString(1, jtfUsuario.getText());
                prepared.setString(2, jtfContrasenia.getText());
                prepared.setString(3, jtfUsuario.getText());
                prepared.setString(4, jtfContrasenia.getText());

                /*Ejecutar la sentencia SQL*/
                result = prepared.executeQuery();

                if(result.next()){
                    usuario = jtfUsuario.getText();
                    contrasenia = result.getString("us_passwd");
                    rol = result.getString("us_rol");
                    usuarioid =result.getString("us_id_usuario"); 
                    
                    prepared = Conexion.conexion.prepareStatement("INSERT INTO LOG_IN (us_id_usuario,log_hora, log_fecha)\n"
                                + "VALUES(?,CURRENT_TIME,CURRENT_DATE)");
                    prepared.setInt(1, Integer.valueOf(usuarioid)); 
                        
                    prepared.executeUpdate();
                    
                    
                    if(rol.equals("alumno")){

                        JOptionPane.showMessageDialog(null, "Bienvenido alumno");
                        UIMenuAlumno jfUIMenuAlumno = new UIMenuAlumno();
                        jfUIMenuAlumno.pack(); 
                        jfUIMenuAlumno.setLocationRelativeTo(null);
                        jfUIMenuAlumno.setVisible(true); 
                        this.setVisible(false);
                        this.dispose();
                        }
                    else if (rol.equals("profesor")){
                        JOptionPane.showMessageDialog(null, "Bienvenido profesor");
                        UIMenuProfesor jfUIMenuProfesor = new UIMenuProfesor();
                        jfUIMenuProfesor.pack(); 
                        jfUIMenuProfesor.setLocationRelativeTo(null);
                        jfUIMenuProfesor.setVisible(true); 
                        this.setVisible(false);
                        this.dispose();
                                        
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }

                //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
                Conexion.conexion.close();
            }
            
            

        } catch (Exception e) {
            
            System.err.println("error: " + e);
            
        }
    }//GEN-LAST:event_jbAccederActionPerformed
   
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
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAcceder;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JLabel jlContraseniaAdmin;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jtfContrasenia;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
