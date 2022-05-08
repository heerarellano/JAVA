package alum_profe;


//import static SistemaInscripciones.LoginAlumno.NumCuenta;
import SistemaInscripciones.LoginAdministrador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import static SistemaInscripciones.LoginAdministrador.usuario;
import static SistemaInscripciones.LoginAdministrador.PASSWD;
import static SistemaInscripciones.LoginAdministrador.URL;
import static SistemaInscripciones.LoginAdministrador.USERNAME;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alvaz
 */
public class Alta extends javax.swing.JFrame {

PreparedStatement prepared;
ResultSet resultado;
    
private String NumeroCuenta = SistemaInscripciones.LoginAdministrador.usuario;

    public Alta() {
        initComponents();
        jLNumeroCuenta.setText(LoginAdministrador.usuario);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jtfGrupo = new javax.swing.JTextField();
        jbRegresar = new javax.swing.JButton();
        jLNumeroCuenta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idalumno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa el ID del grupo al que desea inscribirse");

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jtfGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfGrupoActionPerformed(evt);
            }
        });

        jbRegresar.setText("Regresar");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jLNumeroCuenta.setText("                         ");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel3.setText("Inscribir grupo");

        idalumno.setText("                       ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbRegresar)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfGrupo)
                            .addComponent(jLNumeroCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(idalumno)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jLNumeroCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idalumno)
                .addGap(5, 5, 5)
                .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jbRegresar)
                .addGap(19, 19, 19))
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

    private void jtfGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGrupoActionPerformed
        // TODO add your handling code here:
        jLNumeroCuenta.setText(NumeroCuenta); 
        jtfGrupo.setText(null);         // TODO add your handling code here:
    }//GEN-LAST:event_jtfGrupoActionPerformed

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        SistemaInscripciones.UIMenuAlumno jfUIMenuAlumno = new SistemaInscripciones.UIMenuAlumno(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfUIMenuAlumno.pack();
        jfUIMenuAlumno.setLocationRelativeTo(null); //Para que se centre la ventana.
        jfUIMenuAlumno.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        Connection conexion = null;
        Integer alumid;
        
        try {
            
            conexion = getConnection(); //Abrimos la conexión a la BD. 
            prepared = conexion.prepareStatement("SELECT alum_id_alumno FROM alumno WHERE alum_num_cuenta=?");
            prepared.setString(1, jLNumeroCuenta.getText());
            resultado = prepared.executeQuery();
                          
           
            if (resultado.next()){
            idalumno.setText(resultado.getString("alum_id_alumno"));
            alumid=Integer.valueOf(idalumno.getText());
            
            prepared = conexion.prepareStatement("INSERT INTO inscripcion (insc_hora, insc_fecha, alum_id_alumno, grup_id_grupo) VALUES (CURRENT_TIME, CURRENT_DATE, ?, ?)");                      
            prepared.setInt(1, alumid);
            prepared.setInt(2, Integer.valueOf(jtfGrupo.getText()));

            resultado = prepared.executeQuery();
            if(resultado.next()){
                    JOptionPane.showMessageDialog(null, "La inscripción se regsitró correctamente");
            
            
            }else{
                    JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
                       
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            
            //Nos realiza el insert pero no nos manda el mensaje de que se registró exitosamente.
            jLNumeroCuenta.setText(null); 
            jtfGrupo.setText(null);   
   
                         
            conexion.close(); //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
            
            
        } catch (Exception e){
            
            System.err.println("Error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.

        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    public Connection getConnection () {
        Connection conexion = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWD);
            //JOptionPane.showMessageDialog(null,"conexion exitosa");
        } catch (Exception e){
            System.err.println("error" + e);
        }
            
        return conexion;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idalumno;
    private javax.swing.JLabel jLNumeroCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JTextField jtfGrupo;
    // End of variables declaration//GEN-END:variables
}
