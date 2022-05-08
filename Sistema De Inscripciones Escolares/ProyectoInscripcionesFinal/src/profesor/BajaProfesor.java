package profesor;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuProfesor;
import javax.swing.JOptionPane;

public class BajaProfesor extends javax.swing.JFrame {

    public BajaProfesor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfNumeroTrabajador = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jlBuscar = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCedula = new javax.swing.JLabel();
        jlGrado = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlMostrarNombre = new javax.swing.JLabel();
        jlMostrarApellidoPaterno = new javax.swing.JLabel();
        jlMostrarApellidoMaterno = new javax.swing.JLabel();
        jlMostrarCedula = new javax.swing.JLabel();
        jlMostrarGrado = new javax.swing.JLabel();
        jlMostrarCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfNumeroTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroTrabajadorKeyTyped(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlBuscar.setText("Numéro de trabajador:");

        jlNombre.setText(" ");

        jlApellidoPaterno.setText(" ");

        jlApellidoMaterno.setText(" ");

        jlCedula.setText(" ");

        jlGrado.setText(" ");

        jlCorreo.setText(" ");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Confirmar");
        jbConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarActionPerformed(evt);
            }
        });

        jbSalir.setText("Regresar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlMostrarNombre.setText(" ");

        jlMostrarApellidoPaterno.setText(" ");

        jlMostrarApellidoMaterno.setText(" ");

        jlMostrarCedula.setText(" ");

        jlMostrarGrado.setText(" ");

        jlMostrarCorreo.setText(" ");

        jLabel1.setText("Por favor ingrese el dato");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Baja Profesor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                        .addComponent(jlGrado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jbLimpiar)
                                        .addGap(59, 59, 59)
                                        .addComponent(jbConfirmar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jlMostrarApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlMostrarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlMostrarApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlMostrarCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlMostrarGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlMostrarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                        .addContainerGap(45, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jbSalir)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jbBuscar)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jtfNumeroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(131, 131, 131))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfNumeroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jlMostrarNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoPaterno)
                    .addComponent(jlMostrarApellidoPaterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoMaterno)
                    .addComponent(jlMostrarApellidoMaterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCedula)
                    .addComponent(jlMostrarCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGrado)
                    .addComponent(jlMostrarGrado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(jlMostrarCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirmar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
          
        try{
           
            Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
            Conexion.prepared = Conexion.conexion.prepareStatement("SELECT pers_nombre, pers_apaterno, pers_amaterno, prof_num_trabajador, prof_cedula, prof_grado, us_email FROM persona INNER JOIN profesor ON persona.pers_id_persona = profesor.pers_id_persona INNER JOIN usuario ON persona.pers_id_persona = usuario.pers_id_persona WHERE profesor.prof_num_trabajador = ?");
            Conexion.prepared.setString(1, jtfNumeroTrabajador.getText()); //numéro de trabajador
            
            Conexion.result = Conexion.prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
            
            if(Conexion.result.next()){
                
                jlMostrarNombre.setText(Conexion.result.getString("pers_nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlMostrarApellidoPaterno.setText(Conexion.result.getString("pers_apaterno"));
                jlMostrarApellidoMaterno.setText(Conexion.result.getString("pers_amaterno"));
                jlMostrarCedula.setText(Conexion.result.getString("prof_cedula"));
                jlMostrarGrado.setText(Conexion.result.getString("prof_grado"));
                jlMostrarCorreo.setText(Conexion.result.getString("us_email"));
                
                jlNombre.setText("Nombre: "); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlApellidoPaterno.setText("Apellido paterno: ");
                jlApellidoMaterno.setText("Apellido materno: ");           
                jlCedula.setText("Cedula: ");
                jlGrado.setText("Grado: ");
                jlCorreo.setText("Correo: ");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "El número de trabajador no existe");
                
            }
            
            Conexion.conexion.close(); //Se cierra la conexión a la BD 
            
        } catch (Exception e){
            /*Aquí se pueden personalizar las excepciones*/
            System.err.println("Error: " + e);
        
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        MenuProfesor jfMenuProfesor = new MenuProfesor(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuProfesor.pack(); //Para que se centre la ventana.
        jfMenuProfesor.setLocationRelativeTo(null); //
        jfMenuProfesor.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar (); 
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
        Conexion.conexion = null; 
        try{
           Conexion.conexion = Conexion.getConnection(); 
           Conexion.prepared = Conexion.conexion.prepareStatement("DELETE FROM profesor WHERE prof_num_trabajador=?"); 
           Conexion.prepared.setString(1, jtfNumeroTrabajador.getText());
           Conexion.resultado = Conexion.prepared.executeUpdate(); 
           
                if(Conexion.resultado > 0){
            JOptionPane.showMessageDialog(null, "Se eliminó correctamente al profesor :D");
            limpiar(); 
            
        }else{
           
                    JOptionPane.showMessageDialog(null, "Error al eliminar al profesor :(");
            
        }
        Conexion.conexion.close(); 
        
       }catch(Exception e){
           
             System.err.println("Error: " + e);
             
       }
        
        
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jtfNumeroTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTrabajadorKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfNumeroTrabajador.setText(null);
        }  
    }//GEN-LAST:event_jtfNumeroTrabajadorKeyTyped
    
     public void  limpiar(){
                jlMostrarNombre.setText(null); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlMostrarApellidoPaterno.setText(null);
                jlMostrarApellidoMaterno.setText(null);
                jlMostrarCedula.setText(null);
                jlMostrarGrado.setText(null);
                jlMostrarCorreo.setText(null);
                
                jlNombre.setText(null); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlApellidoPaterno.setText(null);
                jlApellidoMaterno.setText(null);
                jlCedula.setText(null);
                jlGrado.setText(null);
                jlCorreo.setText(null);
                jtfNumeroTrabajador.setText(null);
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
            java.util.logging.Logger.getLogger(BajaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlGrado;
    private javax.swing.JLabel jlMostrarApellidoMaterno;
    private javax.swing.JLabel jlMostrarApellidoPaterno;
    private javax.swing.JLabel jlMostrarCedula;
    private javax.swing.JLabel jlMostrarCorreo;
    private javax.swing.JLabel jlMostrarGrado;
    private javax.swing.JLabel jlMostrarNombre;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfNumeroTrabajador;
    // End of variables declaration//GEN-END:variables

   
}
