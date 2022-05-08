package grupo;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuGrupo;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BajaGrupo extends javax.swing.JFrame {
    PreparedStatement prepared;
    ResultSet result;

    public BajaGrupo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfClaveGrupo = new javax.swing.JTextField();
        jlPeri = new javax.swing.JLabel();
        jlCup = new javax.swing.JLabel();
        jlAsig = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBConfirmar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jlHora = new javax.swing.JLabel();
        jBSeleccionar = new javax.swing.JButton();
        jlProfe = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlTitulo = new javax.swing.JLabel();
        jlAsignatura = new javax.swing.JLabel();
        jlPeriodo = new javax.swing.JLabel();
        jlCupo = new javax.swing.JLabel();
        jlProfesor = new javax.swing.JLabel();
        jlDia = new javax.swing.JLabel();
        jlSalon = new javax.swing.JLabel();
        jlHoraIni = new javax.swing.JLabel();
        jlHoraFin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Clave del grupo:");

        jtfClaveGrupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfClaveGrupoKeyTyped(evt);
            }
        });

        jlPeri.setText("                                 ");

        jlCup.setText("                               ");

        jlAsig.setText("                                   ");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBConfirmar.setText("Confirmar");
        jBConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarActionPerformed(evt);
            }
        });

        jBSalir.setText("Regresar");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jlHora.setText("                     ");

        jBSeleccionar.setText("Buscar");
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        jlProfe.setText("                         ");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Eliminar Grupo");

        jlAsignatura.setText("                                             ");

        jlPeriodo.setText("                                  ");

        jlCupo.setText("                              ");

        jlProfesor.setText("                                   ");

        jlDia.setText("                          ");

        jlSalon.setText("                         ");

        jlHoraIni.setText("            ");

        jlHoraFin.setText("          ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSeleccionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHora)
                            .addComponent(jlPeri, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCup, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlCupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlHoraIni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSalon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jlTitulo))
                            .addComponent(jlAsig))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBConfirmar)
                .addGap(59, 59, 59)
                .addComponent(jBSalir)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfClaveGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAsig)
                    .addComponent(jlAsignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPeri)
                    .addComponent(jlPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCup)
                    .addComponent(jlCupo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlProfe)
                    .addComponent(jlProfesor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHora)
                    .addComponent(jlDia)
                    .addComponent(jlSalon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHoraIni)
                    .addComponent(jlHoraFin))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConfirmar)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(21, 21, 21))
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

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed

        Conexion.conexion = null;

        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("SELECT asig_nombre, peri_id_periodo, grup_cupo, (pers_nombre || ' ' || pers_apaterno) AS profesor, dia_nombre, hora_ini, hora_fin, salo_id_salon  FROM grupo INNER JOIN Horario ON grupo.grup_id_grupo=horario.grup_id_grupo INNER JOIN Hora ON Hora.hora_id_hora=Horario.hora_id_hora INNER JOIN Dia ON Horario.dia_id_dia=Dia.dia_id_dia INNER JOIN Profesor ON grupo.prof_id_profesor=profesor.prof_id_profesor INNER JOIN Persona ON persona.pers_id_persona=profesor.pers_id_persona INNER JOIN Asignatura ON grupo.asig_id_asignatura=asignatura.asig_id_asignatura WHERE grupo.grup_clave=?");
            prepared.setString(1, jtfClaveGrupo.getText());
            result = prepared.executeQuery();

            if(result.next()) {
                jlAsignatura.setText(result.getString("asig_nombre"));
                jlPeriodo.setText(result.getString("peri_id_periodo"));
                jlCupo.setText(result.getString("grup_cupo"));
                jlProfesor.setText(result.getString("profesor"));
                jlDia.setText(result.getString("dia_nombre"));
                jlHoraIni.setText(result.getString("hora_ini"));
                jlHoraFin.setText(result.getString("hora_fin"));
                jlSalon.setText(result.getString("salo_id_salon"));
                
                jlAsig.setText("Asignatura: ");
                jlPeri.setText("Periodo: ");
                jlCup.setText("Cupo: ");
                jlProfe.setText("Profesor: ");
                jlHora.setText("Horario: ");
                

            } else {

                JOptionPane.showMessageDialog(null, "¡La clave del grupo no existe! :(");

            }
            Conexion.conexion.close(); 
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        MenuGrupo jfMenuGrupo = new MenuGrupo(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuGrupo.setSize(270, 160); //Al objeto le asignamos un tamaño (de ventana).
        jfMenuGrupo.pack(); //Para que se centre la ventana.
        jfMenuGrupo.setLocationRelativeTo(null); //
        jfMenuGrupo.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarActionPerformed
        Conexion.conexion = null;
        int resultado;

        try {
            Conexion.conexion = Conexion.getConnection();
            prepared = Conexion.conexion.prepareStatement("DELETE FROM grupo WHERE grup_clave=?");
            prepared.setString(1, jtfClaveGrupo.getText());

            //Ejecutar la sentencia
            resultado = prepared.executeUpdate();

            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "El grupo se eliminó correctamente");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el grupo");
            }
            Conexion.conexion.close(); 
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }

    }//GEN-LAST:event_jBConfirmarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jtfClaveGrupoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfClaveGrupoKeyTyped
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese sólo de números.");
        jtfClaveGrupo.setText(null);
        }  
    }//GEN-LAST:event_jtfClaveGrupoKeyTyped
    
        private void limpiar(){
        jtfClaveGrupo.setText(null); 
        jlAsignatura.setText(null);
        jlPeriodo.setText(null);
        jlCupo.setText(null);
        jlProfesor.setText(null);
        jlDia.setText(null);
        jlHoraIni.setText(null);
        jlHoraFin.setText(null);
        jlSalon.setText(null);
                
        jlAsig.setText(null);
        jlPeri.setText(null);
        jlCup.setText(null);
        jlProfe.setText(null);
        jlHora.setText(null);
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
            java.util.logging.Logger.getLogger(BajaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlAsig;
    private javax.swing.JLabel jlAsignatura;
    private javax.swing.JLabel jlCup;
    private javax.swing.JLabel jlCupo;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlHoraFin;
    private javax.swing.JLabel jlHoraIni;
    private javax.swing.JLabel jlPeri;
    private javax.swing.JLabel jlPeriodo;
    private javax.swing.JLabel jlProfe;
    private javax.swing.JLabel jlProfesor;
    private javax.swing.JLabel jlSalon;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfClaveGrupo;
    // End of variables declaration//GEN-END:variables
}
