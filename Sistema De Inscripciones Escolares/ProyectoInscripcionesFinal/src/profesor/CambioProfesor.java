package profesor;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuProfesor;
import javax.swing.JOptionPane;

public class CambioProfesor extends javax.swing.JFrame {

    int id_persona=0; 
    String  nombre ="";
    String  apellidoPaterno="";
    String  apellidoMaterno="";
    String  numeroTrabajador="";
    String  cedula="";
    String  grado="";
    String  correo="";
    
    public CambioProfesor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlNumTrabajador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCedula = new javax.swing.JLabel();
        jlGrado = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jtfCedula = new javax.swing.JTextField();
        jtfGrado = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jtfNumeroTrabajador = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbGuardarCorreo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jlPersona = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese el dato:");

        jlNumTrabajador.setText("Número de Trabajador: ");

        jLabel3.setText("Modifique el o los datos:");

        jlNombre.setText("Nombre: ");

        jlApellidoPaterno.setText("Apellido Paterno:");

        jlApellidoMaterno.setText("Apellido Materno:");

        jlCedula.setText("Cédula:");

        jlGrado.setText("Grado(L/M/D):");

        jlCorreo.setText("Correo:");

        jtfNumeroTrabajador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroTrabajadorKeyTyped(evt);
            }
        });

        jbGuardarCorreo.setText("Guardar");
        jbGuardarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCorreoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cambio Profesor");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jlApellidoMaterno)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNumTrabajador)
                                .addGap(18, 18, 18)
                                .addComponent(jtfNumeroTrabajador))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombre)
                                    .addComponent(jLabel4)
                                    .addComponent(jlApellidoPaterno))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jtfApellidoPaterno)
                                    .addComponent(jtfNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCedula)
                                .addGap(100, 100, 100)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCedula)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscar)
                            .addComponent(jlPersona))
                        .addGap(24, 24, 24))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCorreo)
                    .addComponent(jbLimpiar))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGuardarCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jtfCorreo)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNumeroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNumTrabajador)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlCedula)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlApellidoPaterno)
                                .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlApellidoMaterno)
                            .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGrado))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarCorreo)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCorreoActionPerformed

        if ( jtfNombre.getText().isEmpty()||jtfApellidoPaterno.getText().isEmpty()||jtfCedula.getText().isEmpty()||jtfGrado.getText().isEmpty()
            ||jtfCorreo.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón guardar 
                Conexion.conexion = null;
         
                    try{
                        Conexion.conexion = Conexion.getConnection(); 
                        Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE persona \n" +
                                                                                "SET pers_nombre=?, pers_apaterno=?, pers_amaterno=?\n" +
                                                                                "WHERE pers_nombre=?\n" +
                                                                                "AND pers_apaterno=?\n" +
                                                                                "AND pers_amaterno =?");
              
               
                
                        Conexion.prepared.setString(1,jtfNombre.getText());
                        Conexion.prepared.setString(2, jtfApellidoPaterno.getText());
                        Conexion.prepared.setString(3, jtfApellidoMaterno.getText());
                        Conexion.prepared.setString(4, nombre);
                        Conexion.prepared.setString(5, apellidoPaterno);
                        Conexion.prepared.setString(6, apellidoMaterno);           
                        Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                        if(Conexion.resultado > 0){
                                 //JOptionPane.showMessageDialog(null, "Se actualizó correctamente el nombre del profesor");
            
            
                        }else{
                                JOptionPane.showMessageDialog(null, "Error al actualizar el nombre del profesor :(");
            
                        }
       
                                                                 
                        
                        Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE profesor\n" +
                                                                               "SET prof_cedula=?, prof_grado=?\n" +
                                                                               "WHERE prof_num_trabajador=?");
                             
                        Conexion.prepared.setString(1,jtfCedula.getText());
                        Conexion.prepared.setString(2,jtfGrado.getText());
                        Conexion.prepared.setString(3, numeroTrabajador);           
                        Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                        if(Conexion.resultado > 0){
                                 //JOptionPane.showMessageDialog(null, "Se actualizó correctamente  la cédula y el grado del profesor");
           
            
                        }else{
                                 JOptionPane.showMessageDialog(null, "Error al actualizar la cédula y el grado del profesor :(");
            
                        }
                        
                        Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE usuario\n" +
                                                                               "SET us_email=?\n" +
                                                                               "WHERE pers_id_persona=?");
                        Conexion.prepared.setString(1,jtfCorreo.getText());
                        Conexion.prepared.setInt(2, id_persona);           
                        Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                        if(Conexion.resultado > 0){
                                JOptionPane.showMessageDialog(null, "Se actualizó correctamente el profesor :D");
                                limpiar();
            
            
                        }else{
                                JOptionPane.showMessageDialog(null, "Error al actualizar el correo del profesor :(");
            
                        }
                        
                        Conexion.conexion.close();
                 
                        }catch(Exception e){
                                 System.err.println("Error: " + e); 
                        }
        }           
                    
    }//GEN-LAST:event_jbGuardarCorreoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
       Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
          
        try{
           
            Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
            Conexion.prepared = Conexion.conexion.prepareStatement("SELECT persona.pers_id_persona,pers_nombre, pers_apaterno, pers_amaterno, prof_num_trabajador, prof_cedula, prof_grado, us_email FROM persona INNER JOIN profesor ON persona.pers_id_persona = profesor.pers_id_persona INNER JOIN usuario ON persona.pers_id_persona = usuario.pers_id_persona WHERE profesor.prof_num_trabajador = ?"); 
            
            Conexion.prepared.setString(1, jtfNumeroTrabajador.getText()); //numéro de trabajador
            
            Conexion.result = Conexion.prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
            
            if(Conexion.result.next()){
                
                jlPersona.setText(Conexion.result.getString("pers_id_persona")); 
                jlPersona.setVisible(false);
                jtfNombre.setText(Conexion.result.getString("pers_nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jtfApellidoPaterno.setText(Conexion.result.getString("pers_apaterno"));
                jtfApellidoMaterno.setText(Conexion.result.getString("pers_amaterno"));
                jtfNumeroTrabajador.setText(Conexion.result.getString("prof_num_trabajador"));
                jtfCedula.setText(Conexion.result.getString("prof_cedula"));
                jtfGrado.setText(Conexion.result.getString("prof_grado"));
                jtfCorreo.setText(Conexion.result.getString("us_email"));
                
                id_persona= Integer.valueOf(jlPersona.getText()); 
                nombre =jtfNombre.getText(); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                apellidoPaterno=jtfApellidoPaterno.getText();
                apellidoMaterno =jtfApellidoMaterno.getText();
                numeroTrabajador=jtfNumeroTrabajador.getText();
                cedula = jtfCedula.getText();
                grado =  jtfCedula.getText();     
                correo= jtfCorreo.getText();
                
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
 
        MenuProfesor jfMenuProfesor = new MenuProfesor(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuProfesor.pack(); //Para que se centre la ventana.
        jfMenuProfesor.setLocationRelativeTo(null); //
        jfMenuProfesor.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtfNumeroTrabajadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroTrabajadorKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfNumeroTrabajador.setText(null);
        }  
    }//GEN-LAST:event_jtfNumeroTrabajadorKeyTyped
    
    private void limpiar(){
        
        jtfNombre.setText(null);
        jtfApellidoPaterno.setText(null);
        jtfApellidoMaterno.setText(null);
        jtfCedula.setText(null);
        jtfGrado.setText(null);
        jtfCorreo.setText(null);
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
            java.util.logging.Logger.getLogger(CambioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardarCorreo;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlGrado;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumTrabajador;
    private javax.swing.JLabel jlPersona;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfCedula;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfGrado;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfNumeroTrabajador;
    // End of variables declaration//GEN-END:variables
}
