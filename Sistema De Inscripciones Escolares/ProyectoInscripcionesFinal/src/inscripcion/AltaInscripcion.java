package inscripcion;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuInscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class AltaInscripcion extends javax.swing.JFrame {
          
    //Creo dos variables de instancia una de tipo preparedstatement que prepara al sistema y resultedstatement. 
    PreparedStatement prepared;
    ResultSet result;
    
    /*Creo una variable para abrir y cerrar la conexión a la BD*/
    Connection conexion = null; 
    int resultado; //Variable que guardará un valor entero para el resultado de la ejecución del query.

    public AltaInscripcion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfAlumno = new javax.swing.JTextField();
        jtfGrupo = new javax.swing.JTextField();
        jtfHost = new javax.swing.JTextField();
        jtfLimpiar = new javax.swing.JButton();
        jtfGuardar = new javax.swing.JButton();
        jtfSalir = new javax.swing.JButton();
        jlTitulo1 = new javax.swing.JLabel();
        jbAlumno = new javax.swing.JButton();
        jbGrupo = new javax.swing.JButton();
        jLNombre = new javax.swing.JLabel();
        jLClave = new javax.swing.JLabel();

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Eliminar inscripción.");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese los datos:");

        jLabel2.setText("ID alumno:");

        jLabel3.setText("ID Grupo:");

        jLabel6.setText("Host (opcional):");
        jLabel6.setToolTipText("");

        jtfAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAlumnoKeyTyped(evt);
            }
        });

        jtfGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGrupoKeyTyped(evt);
            }
        });

        jtfLimpiar.setText("Limpiar");
        jtfLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLimpiarActionPerformed(evt);
            }
        });

        jtfGuardar.setText("Guardar");
        jtfGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfGuardarActionPerformed(evt);
            }
        });

        jtfSalir.setText("Regresar");
        jtfSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalirActionPerformed(evt);
            }
        });

        jlTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo1.setText("Registrar inscripción.");

        jbAlumno.setText("Ver");
        jbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlumnoActionPerformed(evt);
            }
        });

        jbGrupo.setText("Ver");
        jbGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(40, 40, 40))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jtfHost, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                                    .addComponent(jtfGrupo)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbGrupo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(175, 175, 175)
                                    .addComponent(jbAlumno)))
                            .addGap(4, 4, 4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfGuardar)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfSalir)
                        .addGap(33, 33, 33))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLClave, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jlTitulo1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jlTitulo1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAlumno)
                    .addComponent(jLNombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jbGrupo)
                    .addComponent(jLClave))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfLimpiar)
                    .addComponent(jtfGuardar)
                    .addComponent(jtfSalir))
                .addGap(27, 27, 27))
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

    private void jtfLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLimpiarActionPerformed
              
        limpiar();
        
    }//GEN-LAST:event_jtfLimpiarActionPerformed

    private void jtfSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalirActionPerformed
        MenuInscripcion jfMenuInscripcion = new MenuInscripcion(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuInscripcion.pack(); //Para que se centre la ventana.
        jfMenuInscripcion.setLocationRelativeTo(null); 
        jfMenuInscripcion.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();           
    }//GEN-LAST:event_jtfSalirActionPerformed

    private void jtfGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGuardarActionPerformed
        
        if ( jtfAlumno.getText().isEmpty()||jtfGrupo.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón guardar    
    
            Conexion.conexion = null;
            int resultado;
            try {
            Conexion.conexion = Conexion.getConnection();    
            if(jtfHost.getText().equals("")){
                prepared = Conexion.conexion.prepareStatement("INSERT INTO inscripcion VALUES (CURRENT_TIME, CURRENT_DATE, DEFAULT, ?, ?)");
                prepared.setInt(1, Integer.valueOf(jtfAlumno.getText())); 
                prepared.setInt(2, Integer.valueOf(jtfGrupo.getText()));
                resultado = prepared.executeUpdate();
            }else{
                prepared = Conexion.conexion.prepareStatement("INSERT INTO inscripcion VALUES (CURRENT_TIME, CURRENT_DATE, ?, ?, ?)");
                prepared.setString(1, jtfHost.getText());
                prepared.setInt(2, Integer.valueOf(jtfAlumno.getText())); 
                prepared.setInt(3, Integer.valueOf(jtfGrupo.getText()));
                resultado = prepared.executeUpdate();
            }
          
            if (resultado > 0){
                
                JOptionPane.showMessageDialog(null, "La inscripción se regsitró correctamente :D");
                limpiar();
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Error al registrar la inscripción :(");
            }
            
            Conexion.conexion.close(); //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
            
            
            } catch (Exception e){
            
                System.err.println("Error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.

            }
        }
    
    }//GEN-LAST:event_jtfGuardarActionPerformed

    private void jbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlumnoActionPerformed
        
        Conexion.conexion = null;
        
        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT (Pe.pers_nombre||' '||Pe.pers_apaterno)AS nombre FROM persona Pe INNER JOIN Alumno Al ON (Al.pers_id_persona=Pe.pers_id_persona) WHERE  alum_id_alumno=? ");
            prepared.setInt(1, Integer.valueOf(jtfAlumno.getText()));
            result = prepared.executeQuery();
            
            if(result.next()) {
                jLNombre.setText(result.getString("nombre"));                            
            } else {
                JOptionPane.showMessageDialog(null, "¡El ID del alumno no existe!");
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jbAlumnoActionPerformed

    private void jbGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGrupoActionPerformed
        Conexion.conexion = null;
        
        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT grup_clave AS clave FROM grupo WHERE  grup_id_grupo=? ");
           
            prepared.setInt(1, Integer.valueOf(jtfGrupo.getText()));
            result = prepared.executeQuery();
            
            if(result.next()) {
                jLClave.setText(result.getString("clave"));                            
            } else {
                JOptionPane.showMessageDialog(null, "¡El ID del grupo no existe!");
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jbGrupoActionPerformed

    private void jtfAlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAlumnoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfAlumno.setText(null);
        }  
    }//GEN-LAST:event_jtfAlumnoKeyTyped

    private void jtfGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfGrupo.setText(null);
        }  
    }//GEN-LAST:event_jtfGrupoKeyTyped

    private void limpiar(){
        
            jtfGrupo.setText(null);         
            jtfAlumno.setText(null); 
            //jtfHora.setText(null); 
            jtfHost.setText(null);
            //jtfFecha.setText(null);
            jLNombre.setText(null);
            jLClave.setText(null);
           
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
            java.util.logging.Logger.getLogger(AltaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLClave;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAlumno;
    private javax.swing.JButton jbGrupo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField jtfAlumno;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JButton jtfGuardar;
    private javax.swing.JTextField jtfHost;
    private javax.swing.JButton jtfLimpiar;
    private javax.swing.JButton jtfSalir;
    // End of variables declaration//GEN-END:variables
}
