package alumno;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuAlumno;
import javax.swing.JOptionPane;

public class BajaAlumno extends javax.swing.JFrame {

   public void  limpiar(){
       jtfCuenta.setText(null); 
        jlNombre.setText(null); 
        jlApellidoPaterno.setText(null); 
        jlApellidoMaterno.setText(null); 
        jlGeneracion.setText(null); 
        jlCorreo.setText(null); 
        
       
        jlMostrarNombre.setText(null); 
        jlMostrarApellidoPaterno.setText(null); 
        jlMostrarApellidoMaterno.setText(null); 
        jlMostrarGeneracion.setText(null); 
        jlMostrarCorreo.setText(null);
        
   }
    public BajaAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlCuenta = new javax.swing.JLabel();
        jlGeneracion = new javax.swing.JLabel();
        jtfCuenta = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlMostrarNombre = new javax.swing.JLabel();
        jlMostrarApellidoPaterno = new javax.swing.JLabel();
        jlMostrarApellidoMaterno = new javax.swing.JLabel();
        jlMostrarGeneracion = new javax.swing.JLabel();
        jlMostrarCorreo = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese el dato");

        jlCuenta.setText("Cuenta (número):");

        jlGeneracion.setText(" ");

        jtfCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCuentaKeyTyped(evt);
            }
        });

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

        jlNombre.setText(" ");

        jlApellidoPaterno.setText(" ");

        jlApellidoMaterno.setText(" ");

        jlCorreo.setText(" ");

        jlMostrarNombre.setText(" ");

        jlMostrarApellidoPaterno.setText(" ");

        jlMostrarApellidoMaterno.setText(" ");

        jlMostrarGeneracion.setText(" ");

        jlMostrarCorreo.setText(" ");

        jbConsultar.setText("Buscar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Baja Alumno");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jlGeneracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlMostrarApellidoMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlMostrarApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlMostrarGeneracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlMostrarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlMostrarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbLimpiar)
                        .addGap(71, 71, 71)
                        .addComponent(jbConfirmar)
                        .addGap(65, 65, 65)
                        .addComponent(jbSalir)
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCuenta)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCuenta)
                    .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jlMostrarNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMostrarApellidoPaterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMostrarApellidoMaterno))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGeneracion)
                    .addComponent(jlMostrarGeneracion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(jlMostrarCorreo))
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbConfirmar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar(); 
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        /*Creamos un objeto jfMenuAlumno de tipo MenuAlumno (la clase es el tipo)*/
        MenuAlumno jfMenuAlumno = new MenuAlumno(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuAlumno.pack(); //Para que se centre la ventana.
        jfMenuAlumno.setLocationRelativeTo(null); //
        jfMenuAlumno.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed

        try{
           Conexion.conexion = Conexion.getConnection(); 
           Conexion.prepared = Conexion.conexion.prepareStatement("DELETE FROM alumno WHERE alum_num_cuenta=?"); 
           Conexion.prepared.setString(1, jtfCuenta.getText());
           Conexion.resultado = Conexion.prepared.executeUpdate(); 
           
                if(Conexion.resultado > 0){
            JOptionPane.showMessageDialog(null, "Se elimino correctamente la persona");
            limpiar(); 
        }else{
            JOptionPane.showMessageDialog(null, "Error al eliminar la persona");
            
        }
        Conexion.conexion.close(); 
        
       }catch(Exception e){
           
             System.err.println("Error: " + e);
       }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        //La clase Conexion es la que tiene las variables para conectarte, con el método getConnection();
        
        Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
        
        if ( jtfCuenta.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón buscar 
            try{
           
                    Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
                    Conexion.prepared = Conexion.conexion.prepareStatement("SELECT pers_nombre, pers_apaterno, pers_amaterno, alum_generacion, us_email\n" +
                                                                            "FROM persona P, alumno A, usuario U \n" +
                                                                            "WHERE P.pers_id_persona = A.pers_id_persona\n" +
                                                                            "AND P.pers_id_persona = U.pers_id_persona\n" +
                                                                            "AND A.alum_num_cuenta=?"); 
            
                    Conexion.prepared.setString(1, jtfCuenta.getText()); //numéro de cuenta alumno
            
                    Conexion.result = Conexion.prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
            
                    if(Conexion.result.next()){
                
                            jlMostrarNombre.setText(Conexion.result.getString("pers_nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                            jlMostrarApellidoPaterno.setText(Conexion.result.getString("pers_apaterno"));
                            jlMostrarApellidoMaterno.setText(Conexion.result.getString("pers_amaterno"));
                            jlMostrarGeneracion.setText(Conexion.result.getString("alum_generacion"));
                            jlMostrarCorreo.setText(Conexion.result.getString("us_email"));
               
                
                            jlNombre.setText("Nombre: "); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                            jlApellidoPaterno.setText("Apellido paterno: ");
                            jlApellidoMaterno.setText("Apellido materno: ");
                            jlGeneracion.setText("Generación: ");
                            jlCorreo.setText("Correo: ");
                
                    } else {
                            JOptionPane.showMessageDialog(null, "El número de cuenta del alumno no existe");
                
                    }
            
                    Conexion.conexion.close(); //Se cierra la conexión a la BD 
            
            } catch (Exception e){
            
            System.err.println("Error: " + e);
        
            }
        }
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jtfCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCuentaKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
	char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El número de cuenta solo contiene números y no tiene espacios.");
        jtfCuenta.setText(null);
        }
    }//GEN-LAST:event_jtfCuentaKeyTyped

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
            java.util.logging.Logger.getLogger(BajaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCuenta;
    private javax.swing.JLabel jlGeneracion;
    private javax.swing.JLabel jlMostrarApellidoMaterno;
    private javax.swing.JLabel jlMostrarApellidoPaterno;
    private javax.swing.JLabel jlMostrarCorreo;
    private javax.swing.JLabel jlMostrarGeneracion;
    private javax.swing.JLabel jlMostrarNombre;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtfCuenta;
    // End of variables declaration//GEN-END:variables
}
