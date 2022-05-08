package alumno;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuAlumno;
import javax.swing.JOptionPane;

public class ConsultaAlumno extends javax.swing.JFrame {

    public ConsultaAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlGeneracion = new javax.swing.JLabel();
        jtfCuenta = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jbApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlMostrarNombre = new javax.swing.JLabel();
        jlMostrarApellidoPaterno = new javax.swing.JLabel();
        jlMostrarApellidoMaterno = new javax.swing.JLabel();
        jlMostrarGeneracion = new javax.swing.JLabel();
        jlMostrarCorreo = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese los datos");

        jLabel2.setText("Cuenta (número):");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        jbSalir.setText("Regresar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Consultar alumnos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlGeneracion, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlMostrarApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostrarApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostrarGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jlMostrarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jbApellidoPaterno))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jbLimpiar)
                                                .addGap(31, 31, 31)
                                                .addComponent(jbConsultar)))
                                        .addGap(28, 28, 28)
                                        .addComponent(jbSalir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbConsultar)
                    .addComponent(jbSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMostrarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMostrarApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlMostrarApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jlMostrarGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jlGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMostrarCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
         /*Creamos un objeto jfMenuAlumno de tipo MenuAlumno (la clase es el tipo)*/
        MenuAlumno jfMenuAlumno = new MenuAlumno(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuAlumno.pack(); //Para que se centre la ventana.
        jfMenuAlumno.setLocationRelativeTo(null); //
        jfMenuAlumno.setVisible(true); //Para hacer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        //Nombre de los objetos en los que el usuario ingresará el texto (JTextField), asignarles el texto nulo (vacío).
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
        
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        //La clase Conexion es la que tiene las variables para conectarte, con el método getConnection();
        
        if ( jtfCuenta.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón consultar
             
            Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
          
            try{
           
                    Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
                    
                    Conexion.prepared = Conexion.conexion.prepareStatement("SELECT pers_nombre, pers_apaterno, pers_amaterno, alum_generacion, us_email \n" +
                                                                            "FROM persona INNER JOIN alumno ON persona.pers_id_persona = alumno.pers_id_persona\n" +
                                                                            "INNER JOIN usuario ON persona.pers_id_persona = usuario.pers_id_persona \n" +
                                                                            "WHERE alumno.alum_num_cuenta =?");
            
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
                            JOptionPane.showMessageDialog(null, "El número de cuenta no existe");
                
                    }
            
                    Conexion.conexion.close(); //Se cierra la conexión a la BD 
            
            } catch (Exception e){
            
                    System.err.println("Error: " + e);
        
            }
        }
        
    }//GEN-LAST:event_jbConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbApellidoPaterno;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCorreo;
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
