package alumno;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuAlumno;
import javax.swing.JOptionPane;

public class AltaAlumno extends javax.swing.JFrame {

    public AltaAlumno() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCuenta = new javax.swing.JLabel();
        jlGeneracion = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jtfCuenta = new javax.swing.JTextField();
        jtfGeneracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jtfContrasena = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbGuardarUsuario = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese los datos");

        jlNombre.setText("Nombre:");

        jlApellidoPaterno.setText("Apellido Paterno:");

        jlApellidoMaterno.setText("Apellido Materno:");

        jlCuenta.setText("Cuenta (número):");

        jlGeneracion.setText("Generación (año):");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoPaternoKeyTyped(evt);
            }
        });

        jtfApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoMaternoKeyTyped(evt);
            }
        });

        jtfCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCuentaKeyTyped(evt);
            }
        });

        jtfGeneracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGeneracionKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Registrar Alumno");

        jLabel2.setText("Contraseña:");

        jLabel5.setText("Email:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlApellidoPaterno)
                                .addComponent(jlNombre))
                            .addComponent(jlApellidoMaterno)))
                    .addComponent(jlGeneracion)
                    .addComponent(jlCuenta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(jtfApellidoPaterno)
                        .addComponent(jtfNombre))
                    .addComponent(jtfGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellidoPaterno)
                            .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlApellidoMaterno))
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCuenta)
                            .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlGeneracion))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Regresar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardarUsuario.setText("Guardar");
        jbGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardarUsuario)
                .addGap(55, 55, 55)
                .addComponent(jbSalir)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardarUsuario))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        /*Creamos un objeto jfMenuAlumno de tipo MenuAlumno (la clase es el tipo)*/
        MenuAlumno jfMenuAlumno = new MenuAlumno(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuAlumno.pack(); 
        jfMenuAlumno.setLocationRelativeTo(null); //Para que se centre la ventana.
        jfMenuAlumno.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarUsuarioActionPerformed
        
        if ( jtfNombre.getText().isEmpty()||jtfApellidoPaterno.getText().isEmpty()||jtfCuenta.getText().isEmpty()||jtfGeneracion.getText().isEmpty()
            ||jtfContrasena.getText().isEmpty()||jtfEmail.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón guardar 
            try{
                Conexion.conexion = Conexion.getConnection(); 
         
                Conexion.prepared=null; 
        
                Conexion.prepared = Conexion.conexion.prepareStatement("INSERT INTO persona (pers_nombre, pers_apaterno, pers_amaterno)" +
                                                                        "VALUES(?,?,?)");
                Conexion.prepared.setString(1, jtfNombre.getText());
                Conexion.prepared.setString(2, jtfApellidoPaterno.getText());
                Conexion.prepared.setString(3, jtfApellidoMaterno.getText());
            
                Conexion.resultado = Conexion.prepared.executeUpdate();
        
                if(Conexion.resultado > 0){
            
                    //JOptionPane.showMessageDialog(null, "El nombre del alumno ha sido registrado con exito :D");
             
                }else{
            
                    JOptionPane.showMessageDialog(null,"Error al registrar el nombre del alumno :(");
                }
            
                Conexion.prepared = Conexion.conexion.prepareStatement("INSERT INTO alumno(pers_id_persona, alum_num_cuenta, alum_generacion)" + 
                                                                        "VALUES ((SELECT MAX(pers_id_persona) FROM persona),?,?)");
                Conexion.prepared.setInt(1, Integer.valueOf(jtfCuenta.getText()));    
                Conexion.prepared.setInt(2, Integer.valueOf(jtfGeneracion.getText()));
                //Conexion.prepared.setInt(3, Integer.valueOf(jtfIDPersona.getText())); 
                Conexion.resultado= Conexion.prepared.executeUpdate(); //Por que es una manipulación a la BD  
            
                if(Conexion.resultado > 0){ 
                
                    //JOptionPane.showMessageDialog(null, "Se registró al profesor correctamente");
            
                }else{
            
                     JOptionPane.showMessageDialog(null, "Error al registrar número de cuenta y generación del alumno :(");
         
                }
            
                 Conexion.prepared= Conexion.conexion.prepareStatement("INSERT INTO usuario(pers_id_persona, us_passwd, us_email, us_rol)" + 
                    "VALUES ((SELECT MAX(pers_id_persona) FROM persona),?,?,'alumno')");
                Conexion.prepared.setString(1, jtfContrasena.getText());
                Conexion.prepared.setString(2, jtfEmail.getText());
                Conexion.resultado = Conexion.prepared.executeUpdate();
        
                if(Conexion.resultado > 0){

                    JOptionPane.showMessageDialog(null, "Se registró correctamente al alumno :D");
                    limpiar();
            
                }else{
            
                    JOptionPane.showMessageDialog(null, "Error al registrar la persona (usuario) :(");
         
                }
                 
                Conexion.conexion.close();
        
            }catch(Exception e){
           
                System.err.println("Error: " + e); 
            }
        }        
     
        
    }//GEN-LAST:event_jbGuardarUsuarioActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El nombre solo debe contener letras!");
        jtfNombre.setText(null);
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoPaternoKeyTyped
         //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El apellido solo debe contener letras!");
        jtfApellidoPaterno.setText(null);
        }
    }//GEN-LAST:event_jtfApellidoPaternoKeyTyped

    private void jtfApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoMaternoKeyTyped
         //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El apellido solo debe contener letras!");
        jtfApellidoMaterno.setText(null);
        }
    }//GEN-LAST:event_jtfApellidoMaternoKeyTyped

    private void jtfCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCuentaKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
	char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El número de cuenta solo se compone de números!");
        jtfCuenta.setText(null);
        }
    }//GEN-LAST:event_jtfCuentaKeyTyped

    private void jtfGeneracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGeneracionKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
	char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Introduzca un año (solo números sin espacios)");
        jtfGeneracion.setText(null);
        }
    }//GEN-LAST:event_jtfGeneracionKeyTyped

    private void limpiar(){
        
        jtfNombre.setText(null); 
        jtfApellidoMaterno.setText(null);
        jtfApellidoPaterno.setText(null);
        jtfCuenta.setText(null);
        jtfGeneracion.setText(null);
        jtfEmail.setText(null); 
        jtfContrasena.setText(null); 
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
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbGuardarUsuario;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCuenta;
    private javax.swing.JLabel jlGeneracion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfCuenta;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfGeneracion;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
