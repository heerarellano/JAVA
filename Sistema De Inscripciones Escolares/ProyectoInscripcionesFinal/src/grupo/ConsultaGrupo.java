package grupo;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuGrupo;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class ConsultaGrupo extends javax.swing.JFrame {
    PreparedStatement prepared;
    ResultSet result;

    public ConsultaGrupo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfClaveGrupo = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLBAsignatura = new javax.swing.JLabel();
        jLBPeriodo = new javax.swing.JLabel();
        jLBCupo = new javax.swing.JLabel();
        jLBHorario = new javax.swing.JLabel();
        jLBNProfesor = new javax.swing.JLabel();
        jLBDia = new javax.swing.JLabel();
        jLBHorario2 = new javax.swing.JLabel();
        jLBSalon = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtfNombreAsignatura = new javax.swing.JLabel();
        jtfPeriodo = new javax.swing.JLabel();
        jtfCupo = new javax.swing.JLabel();
        jtfNumTrabajador = new javax.swing.JLabel();
        jtfDia = new javax.swing.JLabel();
        jtfHoraIni = new javax.swing.JLabel();
        jtfHoraFin = new javax.swing.JLabel();
        jtfSalon = new javax.swing.JLabel();
        jlTitulo2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese los datos");

        jLabel2.setText("Clave del grupo:");

        jtfClaveGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfClaveGrupoKeyTyped(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jBSalir.setText("Regresar");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLBAsignatura.setText("                                   ");

        jLBPeriodo.setText("                                   ");

        jLBCupo.setText("                                   ");

        jLBHorario.setText("                   ");

        jLBNProfesor.setText("                                   ");

        jLBDia.setText("          ");

        jLBHorario2.setText("                ");

        jLBSalon.setText("          ");

        jtfNombreAsignatura.setText("                                 ");

        jtfPeriodo.setText("                                  ");

        jtfCupo.setText("                                 ");

        jtfNumTrabajador.setText("                                    ");

        jtfDia.setText("                 ");

        jtfHoraIni.setText("                      ");

        jtfHoraFin.setText("                     ");

        jtfSalon.setText("                        ");

        jlTitulo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo2.setText("Consultar Grupo.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBLimpiar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLBHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLBDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLBAsignatura, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLBPeriodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLBCupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLBNProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtfPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLBHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLBSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfNombreAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtfCupo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jtfNumTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(116, 116, 116))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(jBSalir))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTitulo2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jBConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpiar)
                    .addComponent(jBConsultar)
                    .addComponent(jBSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBAsignatura)
                    .addComponent(jtfNombreAsignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBPeriodo)
                    .addComponent(jtfPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBCupo)
                    .addComponent(jtfCupo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBNProfesor)
                    .addComponent(jtfNumTrabajador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBDia)
                    .addComponent(jLBHorario2)
                    .addComponent(jLBSalon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBHorario)
                    .addComponent(jtfDia)
                    .addComponent(jtfHoraIni)
                    .addComponent(jtfHoraFin)
                    .addComponent(jtfSalon))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        MenuGrupo jfMenuGrupo = new MenuGrupo(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuGrupo.pack(); //Para que se centre la ventana.
        jfMenuGrupo.setLocationRelativeTo(null); //
        jfMenuGrupo.setVisible(true); //Para hacaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        jtfClaveGrupo.setText(null); 
        jtfNombreAsignatura.setText(null);
        jtfPeriodo.setText(null);
        jtfCupo.setText(null);
        jtfNumTrabajador.setText(null);  
        jtfHoraFin.setText(null);
        jtfHoraIni.setText(null);
        jtfSalon.setText(null);
        jtfDia.setText(null);
        
        //Ahora borramos los nombres
                jLBAsignatura.setText(null);
                jLBPeriodo.setText(null);
                jLBCupo.setText(null);
                jLBNProfesor.setText(null);
                jLBDia.setText(null);
                jLBHorario2.setText(null);
                jLBSalon.setText(null);
                jLBHorario.setText(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed
        Conexion.conexion = null;
        
        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT asig_id_asignatura,peri_id_periodo,grup_cupo,prof_num_trabajador, dia_nombre, hora_ini, hora_fin, salo_id_salon  FROM grupo INNER JOIN Horario ON grupo.grup_id_grupo=horario.grup_id_grupo INNER JOIN Hora ON Hora.hora_id_hora=Horario.hora_id_hora INNER JOIN Dia ON Horario.dia_id_dia=Dia.dia_id_dia INNER JOIN Profesor ON grupo.prof_id_profesor=profesor.prof_id_profesor WHERE grupo.grup_clave=?");
            prepared.setString(1, jtfClaveGrupo.getText());
            result = prepared.executeQuery();
            
            if(result.next()) {
                jtfNombreAsignatura.setText(result.getString("asig_id_asignatura"));
                jtfPeriodo.setText(result.getString("peri_id_periodo"));
                jtfCupo.setText(result.getString("grup_cupo"));
                jtfNumTrabajador.setText(result.getString("prof_num_trabajador"));
                jtfDia.setText(result.getString("dia_nombre"));
                jtfHoraIni.setText(result.getString("hora_ini"));
                jtfHoraFin.setText(result.getString("hora_fin"));
                jtfSalon.setText(result.getString("salo_id_salon"));
                
                jLBAsignatura.setText("Asignatura: ");
                jLBPeriodo.setText("Periodo: ");
                jLBCupo.setText("Cupo: ");
                jLBNProfesor.setText("Número trabajador (profesor): ");
                jLBDia.setText("Dia ");
                jLBHorario2.setText("Horario");
                jLBSalon.setText("Salon");
                jLBHorario.setText("Horario: ");

                            
            } else {
                
                JOptionPane.showMessageDialog(null, "¡La clave del grupo no existe!");
                
            }
            Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
     
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jtfClaveGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfClaveGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfClaveGrupo.setText(null);
        }  
    }//GEN-LAST:event_jtfClaveGrupoKeyTyped
   

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
            java.util.logging.Logger.getLogger(ConsultaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLBAsignatura;
    private javax.swing.JLabel jLBCupo;
    private javax.swing.JLabel jLBDia;
    private javax.swing.JLabel jLBHorario;
    private javax.swing.JLabel jLBHorario2;
    private javax.swing.JLabel jLBNProfesor;
    private javax.swing.JLabel jLBPeriodo;
    private javax.swing.JLabel jLBSalon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlTitulo2;
    private javax.swing.JTextField jtfClaveGrupo;
    private javax.swing.JLabel jtfCupo;
    private javax.swing.JLabel jtfDia;
    private javax.swing.JLabel jtfHoraFin;
    private javax.swing.JLabel jtfHoraIni;
    private javax.swing.JLabel jtfNombreAsignatura;
    private javax.swing.JLabel jtfNumTrabajador;
    private javax.swing.JLabel jtfPeriodo;
    private javax.swing.JLabel jtfSalon;
    // End of variables declaration//GEN-END:variables
}
