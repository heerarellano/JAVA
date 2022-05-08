package grupo;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuGrupo;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CambioGrupo extends javax.swing.JFrame {
    PreparedStatement prepared;
    ResultSet result;
    
    public CambioGrupo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfClaveGrupo = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfIDAsig = new javax.swing.JTextField();
        jtfPeriodo = new javax.swing.JTextField();
        jtfCupo = new javax.swing.JTextField();
        jBSeleccionar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfIDProfesor = new javax.swing.JTextField();
        jBIDAsig = new javax.swing.JButton();
        jBIDProfesor = new javax.swing.JButton();
        jlTitulo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlAsignatura = new javax.swing.JLabel();
        jlProfesor = new javax.swing.JLabel();
        jlDia = new javax.swing.JLabel();
        jlHoraIni = new javax.swing.JLabel();
        jlHoraFin = new javax.swing.JLabel();
        jlSalon = new javax.swing.JLabel();

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Eliminar Grupo");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Clave del grupo:");

        jLabel3.setText("Modifique el o los datos");

        jtfClaveGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfClaveGrupoKeyTyped(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Regresar");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel4.setText("ID Asignatura:");

        jLabel5.setText("Periodo:");

        jLabel6.setText("Cupo:");

        jLabel7.setText("ID Horario:");

        jtfCupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCupoKeyTyped(evt);
            }
        });

        jBSeleccionar.setText("Seleccionar");
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        jLabel8.setText("ID Profesor:");

        jBIDAsig.setText("Ver");
        jBIDAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIDAsigActionPerformed(evt);
            }
        });

        jBIDProfesor.setText("Ver");
        jBIDProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIDProfesorActionPerformed(evt);
            }
        });

        jlTitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo1.setText("Modificar Grupo");

        jlAsignatura.setText("                          ");

        jlProfesor.setText("                   ");

        jlDia.setText("             ");

        jlHoraIni.setText("               ");

        jlHoraFin.setText("            ");

        jlSalon.setText("            ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(jlTitulo1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(277, 277, 277)
                            .addComponent(jBSeleccionar))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jtfIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBIDProfesor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jtfIDAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jBIDAsig)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jlAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalir))
                            .addComponent(jtfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlDia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlSalon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlTitulo1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIDAsig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIDAsig)
                            .addComponent(jlAsignatura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfIDProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBIDProfesor)
                            .addComponent(jlProfesor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDia)
                    .addComponent(jlHoraIni)
                    .addComponent(jlHoraFin)
                    .addComponent(jlSalon)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
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

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        
        if ( jtfIDAsig.getText().isEmpty()||jtfIDProfesor.getText().isEmpty()||jtfPeriodo.getText().isEmpty()||jtfCupo.getText().isEmpty()
            ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón guardar    
                    Conexion.conexion = null;
                    int resultado;
        
                    try {
                        Conexion.conexion = Conexion.getConnection();
                        prepared = Conexion.conexion.prepareStatement("UPDATE grupo SET asig_id_asignatura=?, prof_id_profesor=?"
                                                              + ", peri_id_periodo=?, grup_cupo=? WHERE grup_clave=?");
                        prepared.setString(1, jtfIDAsig.getText());
                        prepared.setInt(2, Integer.valueOf(jtfIDProfesor.getText()));
                        //prepared.setString(2, jtfIDProfesor.getText());
                        prepared.setString(3, jtfPeriodo.getText());
                        prepared.setInt(4, Integer.valueOf(jtfCupo.getText()));
                        //prepared.setString(5, jtfCupo.getText());
            
                        prepared.setString(5, jtfClaveGrupo.getText());
            
                        //Ejecutar la sentencia
            
                        resultado = prepared.executeUpdate();
            
                        if(resultado > 0){
                                JOptionPane.showMessageDialog(null, "Se actualizó correctamente el grupo");
                                limpiar();
                        } else {
                                JOptionPane.showMessageDialog(null, "Error al actualizar el grupo");
                        }
                        Conexion.conexion.close();
                    } catch (Exception e) {
                            System.err.println("Error: " + e);
                    }
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        MenuGrupo jfMenuGrupo = new MenuGrupo(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuGrupo.pack(); //Para que se centre la ventana.
        jfMenuGrupo.setLocationRelativeTo(null); //
        jfMenuGrupo.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();  
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed

        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            prepared = conexion.prepareStatement("SELECT asignatura.asig_id_asignatura AS asig, profesor.prof_id_profesor AS prof, hora_id_horario, asig_nombre, peri_id_periodo, grup_cupo, (pers_nombre || ' ' || pers_apaterno) AS profesor, dia_nombre, hora_ini, hora_fin, salo_id_salon  FROM grupo INNER JOIN Horario ON grupo.grup_id_grupo=horario.grup_id_grupo INNER JOIN Hora ON Hora.hora_id_hora=Horario.hora_id_hora INNER JOIN Dia ON Horario.dia_id_dia=Dia.dia_id_dia INNER JOIN Profesor ON grupo.prof_id_profesor=profesor.prof_id_profesor INNER JOIN Persona ON persona.pers_id_persona=profesor.pers_id_persona INNER JOIN Asignatura ON grupo.asig_id_asignatura=asignatura.asig_id_asignatura WHERE grupo.grup_clave=?");
            prepared.setString(1, jtfClaveGrupo.getText());
            result = prepared.executeQuery();
            
            if(result.next()) {
                jtfIDAsig.setText(result.getString("asig"));
                jtfIDProfesor.setText(result.getString("prof"));
                //jtfIDHora.setText(result.getString("hora_id_horario"));
                jtfPeriodo.setText(result.getString("peri_id_periodo"));
                jtfCupo.setText(result.getString("grup_cupo"));
                jlProfesor.setText(result.getString("profesor"));
                jlAsignatura.setText(result.getString("asig_nombre"));
                jlDia.setText(result.getString("dia_nombre"));
                jlHoraIni.setText(result.getString("hora_ini"));
                jlHoraFin.setText(result.getString("hora_fin"));
                jlSalon.setText(result.getString("salo_id_salon"));
                           
            } else {
                
                JOptionPane.showMessageDialog(null, "¡La clave del grupo no existe!");
                
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jBIDAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIDAsigActionPerformed
        // TODO add your handling code here:
        Conexion.conexion = null;
        
        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT asig_nombre FROM asignatura WHERE asig_id_asignatura=?");
            prepared.setString(1, jtfIDAsig.getText());
            result = prepared.executeQuery();
            
            if(result.next()) {
                jlAsignatura.setText(result.getString("asig_nombre"));                            
            } else {
                JOptionPane.showMessageDialog(null, "¡La clave del asignatura no existe!");
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jBIDAsigActionPerformed

    private void jBIDProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIDProfesorActionPerformed
        // TODO add your handling code here:
        Conexion.conexion = null;
        
        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT (pers_nombre || ' ' || pers_apaterno) AS profesor FROM profesor INNER JOIN persona ON profesor.pers_id_persona=persona.pers_id_persona WHERE prof_id_profesor=?");
            //prepared.setString(1, jtfIDProfesor.getText());
            prepared.setInt(1, Integer.valueOf(jtfIDProfesor.getText()));
            result = prepared.executeQuery();
            
            if(result.next()) {
                jlProfesor.setText(result.getString("profesor"));                            
            } else {
                JOptionPane.showMessageDialog(null, "¡La clave del profesor no existe!");
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jBIDProfesorActionPerformed

    private void jtfClaveGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfClaveGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfClaveGrupo.setText(null);
        }  
    }//GEN-LAST:event_jtfClaveGrupoKeyTyped

    private void jtfCupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfCupo.setText(null);
        }  
    }//GEN-LAST:event_jtfCupoKeyTyped

    private void limpiar(){
        jtfClaveGrupo.setText(null); 
        jtfPeriodo.setText(null);
        jtfCupo.setText(null);
        jlAsignatura.setText(null);
        jlProfesor.setText(null);
        //jtfIDHora.setText(null);
        jtfIDAsig.setText(null);
        jtfIDProfesor.setText(null);
        jlDia.setText(null);
        jlHoraIni.setText(null);
        jlHoraFin.setText(null);
        jlSalon.setText(null);
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
            java.util.logging.Logger.getLogger(CambioGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBIDAsig;
    private javax.swing.JButton jBIDProfesor;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlAsignatura;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlHoraFin;
    private javax.swing.JLabel jlHoraIni;
    private javax.swing.JLabel jlProfesor;
    private javax.swing.JLabel jlSalon;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlTitulo1;
    private javax.swing.JTextField jtfClaveGrupo;
    private javax.swing.JTextField jtfCupo;
    private javax.swing.JTextField jtfIDAsig;
    private javax.swing.JTextField jtfIDProfesor;
    private javax.swing.JTextField jtfPeriodo;
    // End of variables declaration//GEN-END:variables
}
