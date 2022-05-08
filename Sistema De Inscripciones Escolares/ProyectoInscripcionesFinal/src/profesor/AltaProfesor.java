package profesor;


import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuProfesor;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AltaProfesor extends javax.swing.JFrame {
    //Creo dos variables de instancia una de tipo preparedstatement que prepara al sistema y resultedstatement. 
    PreparedStatement prepared;
    ResultSet result;

    public AltaProfesor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfNNombre = new javax.swing.JLabel();
        jtfNApellidoPat = new javax.swing.JLabel();
        jtfNApellidoMat = new javax.swing.JLabel();
        jtfNNumTrabajador = new javax.swing.JLabel();
        jtfNCedula = new javax.swing.JLabel();
        jtfNGrado = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfNumTrabajador = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfGrado = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jlTitulo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBGuardarUsu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jtfContrasena = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese los datos");

        jtfNNombre.setText("Nombre:");

        jtfNApellidoPat.setText("Apellido Paterno:");

        jtfNApellidoMat.setText("Apellido Materno:");

        jtfNNumTrabajador.setText("Número de trabajador:");

        jtfNCedula.setText("Cédula (número):");

        jtfNGrado.setText("Grado(L/M/D):");

        jtfNumTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumTrabajadorKeyTyped(evt);
            }
        });

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

        jlTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo2.setText("Registrar Profesor");

        jBGuardarUsu.setText("Guardar");
        jBGuardarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarUsuActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        jLabel3.setText("email");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitulo2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNCedula)
                            .addComponent(jtfNNumTrabajador)
                            .addComponent(jtfNNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNApellidoMat)
                            .addComponent(jtfNApellidoPat)
                            .addComponent(jtfNGrado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNumTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfGrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfContrasena)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBGuardarUsu)
                                .addGap(80, 80, 80)
                                .addComponent(jbSalir)
                                .addGap(69, 69, 69))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jlTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNApellidoPat)
                    .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNApellidoMat)
                    .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNNumTrabajador))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNCedula))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNGrado)
                    .addComponent(jtfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir)
                    .addComponent(jBGuardarUsu))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void limpiar(){
        
        jtfNombre.setText(null); 
        jtfApellidoMaterno.setText(null);
        jtfApellidoPaterno.setText(null);
        jtfNumTrabajador.setText(null);
        jtfCedula.setText(null);
        jtfGrado.setText(null);
        jtfContrasena.setText(null);
        jtfEmail.setText(null);
    }
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuProfesor jfMenuProfesor = new MenuProfesor(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuProfesor.pack(); //Para que se centre la ventana.
        jfMenuProfesor.setLocationRelativeTo(null); 
        jfMenuProfesor.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jBGuardarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarUsuActionPerformed
        
        if ( jtfNombre.getText().isEmpty()||jtfApellidoPaterno.getText().isEmpty()||jtfNumTrabajador.getText().isEmpty()||jtfCedula.getText().isEmpty()
            ||jtfContrasena.getText().isEmpty()||jtfEmail.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { 
            Conexion.conexion = null;
            int resultado;
            try{
                Conexion.conexion = Conexion.getConnection();
                prepared = Conexion.conexion.prepareStatement("INSERT INTO persona (pers_nombre, pers_apaterno, pers_amaterno)" +
                                                    "VALUES(?,?,?)");
                prepared.setString(1, jtfNombre.getText());
                prepared.setString(2, jtfApellidoPaterno.getText());
                prepared.setString(3, jtfApellidoMaterno.getText());
            
                resultado = prepared.executeUpdate();
                if(resultado > 0){
                     //JOptionPane.showMessageDialog(null, "El nombre del profesor ha sido registrado con exito :D ");
                 }else{
                     JOptionPane.showMessageDialog(null,"Error al registrar el nombre del profesor :(");
                }
                if(jtfGrado.getText().isEmpty()){
                prepared= Conexion.conexion.prepareStatement("INSERT INTO profesor(pers_id_persona, prof_num_trabajador, prof_cedula, prof_grado)" + 
                            "VALUES ((SELECT MAX(pers_id_persona) FROM persona),?,?,DEFAULT)");
                prepared.setString(1, jtfNumTrabajador.getText());
                prepared.setString(2, jtfCedula.getText());
                resultado = prepared.executeUpdate();
                if(resultado > 0){
                        // JOptionPane.showMessageDialog(null, "Los datos del profesor han sido registrados con exito");
                }else{
                        JOptionPane.showMessageDialog(null,"Error al registrar los datos del profesor :(");
                }
                }else{
                                    prepared= Conexion.conexion.prepareStatement("INSERT INTO profesor(pers_id_persona, prof_num_trabajador, prof_cedula, prof_grado)" + 
                            "VALUES ((SELECT MAX(pers_id_persona) FROM persona),?,?,?)");
                prepared.setString(1, jtfNumTrabajador.getText());
                prepared.setString(2, jtfCedula.getText());
                prepared.setString(3, jtfGrado.getText());
                resultado = prepared.executeUpdate();
                if(resultado > 0){
                        // JOptionPane.showMessageDialog(null, "Los datos del profesor han sido registrados con exito");
                }else{
                        JOptionPane.showMessageDialog(null,"Error al registrar los datos del profesor :(");
                }
                    
                }
        
                prepared= Conexion.conexion.prepareStatement("INSERT INTO usuario(pers_id_persona, us_passwd, us_email, us_rol)" + 
                    "VALUES ((SELECT MAX(pers_id_persona) FROM persona),?,?,'profesor')");
                prepared.setString(1, jtfContrasena.getText());
                prepared.setString(2, jtfEmail.getText());
           
                resultado = prepared.executeUpdate();
                if(resultado > 0){
                    JOptionPane.showMessageDialog(null, "El profesor ha sido registrado con éxito :D");
                    limpiar();
                }else{
                    JOptionPane.showMessageDialog(null,"Error al registrar la contraseña y el email del profesor :(");
                }
            
                Conexion.conexion.close();
            }catch (Exception e){
                System.err.println("Error: " + e);
            } 
        }
    }//GEN-LAST:event_jBGuardarUsuActionPerformed

    private void jtfNumTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumTrabajadorKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "el número de trabajador se compone sólo de números");
        jtfNumTrabajador.setText(null);
        }
    }//GEN-LAST:event_jtfNumTrabajadorKeyTyped


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
            java.util.logging.Logger.getLogger(AltaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarUsu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlTitulo2;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfContrasena;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfGrado;
    private javax.swing.JLabel jtfNApellidoMat;
    private javax.swing.JLabel jtfNApellidoPat;
    private javax.swing.JLabel jtfNCedula;
    private javax.swing.JLabel jtfNGrado;
    private javax.swing.JLabel jtfNNombre;
    private javax.swing.JLabel jtfNNumTrabajador;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNumTrabajador;
    // End of variables declaration//GEN-END:variables


}
