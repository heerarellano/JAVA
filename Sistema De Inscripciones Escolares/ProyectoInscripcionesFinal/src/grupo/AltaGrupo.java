package grupo;

import SistemaInscripciones.MenuGrupo;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import SistemaInscripciones.Conexion;


public class AltaGrupo extends javax.swing.JFrame {
    PreparedStatement prepared;

    public AltaGrupo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfIdA = new javax.swing.JTextField();
        jtfPeriodo = new javax.swing.JTextField();
        jtfClaveGrupo = new javax.swing.JTextField();
        jtfCupoGrupo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jtfIdProfesor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFNumDia = new javax.swing.JTextField();
        jTFHorarioId = new javax.swing.JTextField();
        jTFSalon = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jBGuardarH = new javax.swing.JButton();
        jlTitulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Clave Asignatura:");

        jLabel3.setText("Periodo:");

        jLabel4.setText("Clave del grupo:");

        jLabel5.setText("Cupo del grupo:");

        jtfIdA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdAKeyTyped(evt);
            }
        });

        jtfClaveGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfClaveGrupoKeyTyped(evt);
            }
        });

        jtfCupoGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCupoGrupoKeyTyped(evt);
            }
        });

        jLabel6.setText("Horario:");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setText("Regresar");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Profesor:");

        jtfIdProfesor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfIdProfesorKeyTyped(evt);
            }
        });

        jLabel8.setText("Numero del Día (1-7)");

        jLabel9.setText("Horario(Número 1-7)");

        jLabel10.setText("Salón(ejem:1291-A)");
        jLabel10.setToolTipText("");

        jTFNumDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumDiaKeyTyped(evt);
            }
        });

        jTFHorarioId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFHorarioIdKeyTyped(evt);
            }
        });

        jBGuardarH.setText("Guardar");
        jBGuardarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarHActionPerformed(evt);
            }
        });

        jlTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo2.setText("Registrar Grupo");

        jLabel1.setText("Por favor ingrese los datos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNumDia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(22, 22, 22))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfIdA, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(jtfPeriodo)
                                            .addComponent(jtfClaveGrupo)
                                            .addComponent(jtfCupoGrupo)
                                            .addComponent(jtfIdProfesor))
                                        .addGap(90, 90, 90))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTFHorarioId, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTFSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10))))))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardarH)
                .addGap(56, 56, 56)
                .addComponent(jBSalir)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfIdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtfCupoGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jtfIdProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNumDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFHorarioId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFSalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 106, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBLimpiar)
                            .addComponent(jBGuardarH)
                            .addComponent(jBSalir))
                        .addGap(42, 42, 42))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //Regresa a MenuGrupo
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        MenuGrupo jfMenuGrupo = new MenuGrupo(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuGrupo.pack(); //Para que se centre la ventana.
        jfMenuGrupo.setLocationRelativeTo(null); //
        jfMenuGrupo.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();       
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBGuardarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarHActionPerformed
    
        if ( jtfIdA.getText().isEmpty()||jtfPeriodo.getText().isEmpty()||jtfClaveGrupo.getText().isEmpty()||jtfCupoGrupo.getText().isEmpty()
            ||jtfIdProfesor.getText().isEmpty()||jTFNumDia.getText().isEmpty()||jTFHorarioId.getText().isEmpty()||jTFSalon.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón guardar 
        Conexion.conexion = null;
        int resultado;
        
        try{
                Conexion.conexion = Conexion.getConnection();
                prepared = Conexion.conexion.prepareStatement("INSERT INTO GRUPO(asig_id_asignatura,peri_id_periodo,grup_clave,grup_cupo,prof_id_profesor)"+ "VALUES(?,?,?,?,?)");                        
                prepared.setInt(1, Integer.valueOf(jtfIdA.getText()));
                prepared.setString(2, jtfPeriodo.getText());
                prepared.setString(3, jtfClaveGrupo.getText());
                prepared.setInt(4, Integer.valueOf(jtfCupoGrupo.getText()));
                prepared.setInt(5, Integer.valueOf(jtfIdProfesor.getText()));
                       
                resultado = prepared.executeUpdate();
            
                if(resultado > 0){
                        //JOptionPane.showMessageDialog(null, "Se registró correctamente el grupo");
                }else{
                
                        JOptionPane.showMessageDialog(null, "Error al regitrar los datos del grupo :(");
                }
        

                prepared = Conexion.conexion.prepareStatement("INSERT INTO horario(grup_id_grupo,salo_id_salon, dia_id_dia, hora_id_hora)"+ "VALUES((SELECT MAX(grup_id_grupo) FROM Grupo),"+"?,?,?)");
                prepared.setString(1,jTFSalon.getText());
                prepared.setInt(2,Integer.valueOf(jTFNumDia.getText()));
                prepared.setInt(3,Integer.valueOf(jTFHorarioId.getText()));
           
                resultado = prepared.executeUpdate();
            
                if(resultado > 0){
                        JOptionPane.showMessageDialog(null, "Se registró correctamente el grupo :D");
                }else{
                
                        JOptionPane.showMessageDialog(null, "Error al regitrar el horario del grupo :(");
                }
                 Conexion.conexion.close(); 
                
        }catch(Exception e){
                System.err.println("Error: " + e);
        }
        
            //Para que después de que se guarden los datos, se limpien los campos de texto. 
            jtfIdA.setText(null); //Nombre de la variable de tipo JTextField que se le asigne el texto nulo. 
            jtfPeriodo.setText(null);
            jtfClaveGrupo.setText(null);
            jtfCupoGrupo.setText(null);
            jtfIdProfesor.setText(null);
            jTFSalon.setText(null);
            jTFNumDia.setText(null);
            jTFHorarioId.setText(null);
        }
           
    }//GEN-LAST:event_jBGuardarHActionPerformed

    private void jtfIdAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdAKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El id de la asignatura se compone sólo de números");
        jtfIdA.setText(null);
        }
    }//GEN-LAST:event_jtfIdAKeyTyped

    private void jtfClaveGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfClaveGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "La clave del grupo se compone sólo de números");
        jtfClaveGrupo.setText(null);
        }
    }//GEN-LAST:event_jtfClaveGrupoKeyTyped

    private void jtfCupoGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCupoGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El cupo del grupo se compone sólo de números");
        jtfCupoGrupo.setText(null);
        }
    }//GEN-LAST:event_jtfCupoGrupoKeyTyped

    private void jTFNumDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumDiaKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números. Ejemplo: Lunes=1");
        jTFNumDia.setText(null);
        }
    }//GEN-LAST:event_jTFNumDiaKeyTyped

    private void jTFHorarioIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFHorarioIdKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números. Ejemplo: 7:00-9:00=1");
        jTFHorarioId.setText(null);
        }       
    }//GEN-LAST:event_jTFHorarioIdKeyTyped

    private void jtfIdProfesorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfIdProfesorKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El ID del profesor se compone sólo de números");
        jtfIdProfesor.setText(null);
        }  
    }//GEN-LAST:event_jtfIdProfesorKeyTyped

    
    private void limpiar() {                                          
        jtfIdA.setText(null); 
        jtfPeriodo.setText(null);
        jtfClaveGrupo.setText(null);
        jtfCupoGrupo.setText(null);
        jtfIdProfesor.setText(null);
        jTFHorarioId.setText(null);
        jTFNumDia.setText(null);
        jTFSalon.setText(null);
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
            java.util.logging.Logger.getLogger(AltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltaGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarH;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTFHorarioId;
    private javax.swing.JTextField jTFNumDia;
    private javax.swing.JTextField jTFSalon;
    private javax.swing.JLabel jlTitulo2;
    private javax.swing.JTextField jtfClaveGrupo;
    private javax.swing.JTextField jtfCupoGrupo;
    private javax.swing.JTextField jtfIdA;
    private javax.swing.JTextField jtfIdProfesor;
    private javax.swing.JTextField jtfPeriodo;
    // End of variables declaration//GEN-END:variables
}
