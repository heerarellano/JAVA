package profesor;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuProfesor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class ConsultaProfesor extends javax.swing.JFrame {
    PreparedStatement prepared;
    ResultSet result;

    public ConsultaProfesor() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNumdeTrabajador = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlNumTrabajador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlCedula = new javax.swing.JLabel();
        jlGrado = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlNom = new javax.swing.JLabel();
        jlApeP = new javax.swing.JLabel();
        jlApeM = new javax.swing.JLabel();
        jlNumT = new javax.swing.JLabel();
        jlCedu = new javax.swing.JLabel();
        jlGrad = new javax.swing.JLabel();
        jlCorre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNumdeTrabajador.setText("Número de Trabajador:");

        jtfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBuscarKeyTyped(evt);
            }
        });

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

        jlNombre.setText("                                           ");

        jlApellidoPaterno.setText("                                             ");

        jlApellidoMaterno.setText("                                              ");

        jlNumTrabajador.setText("                                           ");

        jlCedula.setText("                                       ");

        jlGrado.setText("                                             ");

        jlCorreo.setText("                              ");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Consulta de Profesores");

        jlNom.setText("                                   ");

        jlApeP.setText("                                                 ");

        jlApeM.setText("                                              ");

        jlNumT.setText("                                           ");

        jlCedu.setText("                                               ");

        jlGrad.setText("                                              ");

        jlCorre.setText("                                        ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNumdeTrabajador)
                        .addGap(18, 18, 18)
                        .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbConsultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNumTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlGrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlNom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlApeP, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jlApeM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNumT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCedu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlGrad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCorre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jlTitulo)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumdeTrabajador)
                    .addComponent(jtfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbConsultar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jlNom))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoPaterno)
                    .addComponent(jlApeP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoMaterno)
                    .addComponent(jlApeM))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumTrabajador)
                    .addComponent(jlNumT))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCedula)
                            .addComponent(jlCedu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlGrado)
                            .addComponent(jlGrad))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCorreo)
                            .addComponent(jlCorre))
                        .addGap(0, 67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpiar)
                            .addComponent(jbSalir))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

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

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
         String Grado;
        try{
           
            Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
            prepared = Conexion.conexion.prepareStatement("SELECT pers_nombre, pers_apaterno, pers_amaterno, prof_num_trabajador, prof_cedula,  us_email, "
                    + "CASE prof_grado WHEN 'L' THEN 'Licenciatura' WHEN 'M' THEN 'Maestria' WHEN 'D' THEN 'Doctorado' ELSE 'Licenciatura' END AS profe_grado"
                    + " FROM profesor INNER JOIN persona ON persona.pers_id_persona = profesor.pers_id_persona INNER JOIN usuario ON persona.pers_id_persona = usuario.pers_id_persona WHERE profesor.prof_num_trabajador = ?"); 
            
            prepared.setString(1, jtfBuscar.getText()); //numéro de trabajador
            
            result = prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
            
            if(result.next()){
                
                jlNom.setText(result.getString("pers_nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlApeP.setText(result.getString("pers_apaterno"));
                jlApeM.setText(result.getString("pers_amaterno"));
                jlNumT.setText(result.getString("prof_num_trabajador"));
                jlCedu.setText(result.getString("prof_cedula"));
                jlGrad.setText(result.getString("profe_grado"));
                jlCorre.setText(result.getString("us_email"));
                
                //charAtCharacter.valueOf(
                //jlGrado.setText("prof_grado");
                //Grado=result.getString("prof_grado");
                /*
                switch(jlGrado.getText()){
                    case "L":
                        jlGrad.setText("Licenciatura");
                            break;
                    case "D":
                        jlGrad.setText("Doctorado");
                        break;
                    case "M":
                        jlGrad.setText("Maestria");
                        break;
                     default:
                         jlGrad.setText("Licenciatura");
                         break;     
                }
                */
                jlNombre.setText("Nombre: "); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jlApellidoPaterno.setText("Apellido paterno: ");
                jlApellidoMaterno.setText("Apellido materno: ");
                jlNumTrabajador.setText("Numero de trabajador: ");
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
        
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void jtfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBuscarKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfBuscar.setText(null);
        }  
    }//GEN-LAST:event_jtfBuscarKeyTyped
    
    private void limpiar(){
        jtfBuscar.setText(null);        
        jlNumTrabajador.setText(null); 
        jlNombre.setText(null);
        jlApellidoPaterno.setText(null);
        jlApellidoMaterno.setText(null);
        jlNumTrabajador.setText(null);
        jlCedula.setText(null);
        jlGrado.setText(null); 
        jlCorreo.setText(null); 
        
        jlNom.setText(null);
        jlApeP.setText(null);
        jlApeM.setText(null);
        jlNumT.setText(null);
        jlCedu.setText(null);
        jlGrad.setText(null); 
        jlCorre.setText(null);
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
            java.util.logging.Logger.getLogger(ConsultaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApeM;
    private javax.swing.JLabel jlApeP;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCedu;
    private javax.swing.JLabel jlCedula;
    private javax.swing.JLabel jlCorre;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlGrad;
    private javax.swing.JLabel jlGrado;
    private javax.swing.JLabel jlNom;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumT;
    private javax.swing.JLabel jlNumTrabajador;
    private javax.swing.JLabel jlNumdeTrabajador;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfBuscar;
    // End of variables declaration//GEN-END:variables

}
