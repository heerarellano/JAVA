package inscripcion;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuInscripcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class CambioInscripcion extends javax.swing.JFrame {
PreparedStatement prepared;
ResultSet result;

    public CambioInscripcion() {
        initComponents();
        this.jtfGrupoNuevo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlGrupo = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jlIngresarGrupo = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtfGrupo = new javax.swing.JTextField();
        jtfAlumno = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbBuscarInsc = new javax.swing.JButton();
        jlGrupoNuevo = new javax.swing.JLabel();
        jtfGrupoNuevo = new javax.swing.JTextField();
        jlFechaConsulta = new javax.swing.JLabel();
        jlHoraConsulta = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Ingresa el nombre:");
        jPanel1.setPreferredSize(new java.awt.Dimension(416, 500));

        jLabel1.setText("Por favor, ingrese los siguientes datos:");

        jlGrupo.setText("Grupo a cambiar:");

        jlAlumno.setText("ID del alumno:");

        jlIngresarGrupo.setText("                    ");

        jlHora.setText("                    ");

        jlFecha.setText("                           ");

        jbGuardar.setText("Guardar cambios");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Regresar");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscarInsc.setText("Buscar inscripción");
        jbBuscarInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarInscActionPerformed(evt);
            }
        });

        jlFechaConsulta.setText("              ");

        jlHoraConsulta.setText("                    ");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Cambiar Inscripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jlAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlGrupo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jbLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbGuardar)
                .addGap(35, 35, 35)
                .addComponent(jbSalir)
                .addGap(5, 5, 5))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jbBuscarInsc))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jlTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jlIngresarGrupo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel7))
                            .addComponent(jlFecha)
                            .addComponent(jlHora)
                            .addComponent(jlGrupoNuevo))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlHoraConsulta)
                            .addComponent(jlFechaConsulta)
                            .addComponent(jtfGrupoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGrupo)
                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBuscarInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jlIngresarGrupo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGrupoNuevo)
                    .addComponent(jtfGrupoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlFechaConsulta))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHora)
                    .addComponent(jlHoraConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar ();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarInscActionPerformed
        Conexion.conexion = null;

        try {
            /*Abrir la conexión*/
            Conexion.conexion = Conexion.getConnection();

            /*Preparar la sentencia SQL*/
            prepared = Conexion.conexion.prepareStatement   ("SELECT TO_CHAR(insc_fecha,'DD/MM/YY') AS insc_fecha, TO_CHAR(insc_hora,'HH:MI:SS') AS insc_hora\n" +
                "FROM inscripcion  \n" +
                "WHERE alum_id_alumno=? AND grup_id_grupo=?;");

            prepared.setInt(1, Integer.valueOf( jtfAlumno.getText()));
            prepared.setInt(2, Integer.valueOf( jtfGrupo.getText()));

            /*Ejecutar la sentencia SQL*/
            result = prepared.executeQuery();

            if(result.next()){
                jlFechaConsulta.setText(result.getString("insc_fecha"));
                jlHoraConsulta.setText(result.getString("insc_hora"));

                this.jtfGrupoNuevo.setVisible(true);
                jlIngresarGrupo.setText("Ingrese el nuevo grupo:");
                jlGrupoNuevo.setText("Grupo:");
                jlFecha.setText("Fecha de inscripción:");
                jlHora.setText("Hora de inscripción:");

            } else {
                JOptionPane.showMessageDialog(null, "los datos de la inscripción son incorrectos!");
            }

            //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
            Conexion.conexion.close();

        } catch (Exception e) {
            System.err.println("error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.
        }
    }//GEN-LAST:event_jbBuscarInscActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuInscripcion jfMenuInscripcion = new MenuInscripcion(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuInscripcion.pack(); //Para que se centre la ventana.
        jfMenuInscripcion.setLocationRelativeTo(null);
        jfMenuInscripcion.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        Conexion.conexion = null;
        int resultado;

        try {

            /*Abrir la conexión*/
            Conexion.conexion = Conexion.getConnection();

            /*Preparar la sentencia SQL*/
            prepared = Conexion.conexion.prepareStatement   ("UPDATE inscripcion \n" +
                                                    "SET GRUP_ID_GRUPO=?, INSC_FECHA=CURRENT_DATE, INSC_HORA=CURRENT_TIME\n" +
                                                    "WHERE alum_id_alumno=? AND grup_id_grupo=?;");

            prepared.setInt(1, Integer.valueOf( jtfGrupoNuevo.getText()));
            prepared.setInt(2, Integer.valueOf( jtfAlumno.getText()));
            prepared.setInt(3, Integer.valueOf( jtfGrupo.getText()));

            /*Ejecutar la sentencia SQL*/
            resultado = prepared.executeUpdate();

            if (resultado > 0){

                JOptionPane.showMessageDialog(null, "La inscripción se actualizó correctamente :D");
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "Error al actualizar la inscripción :(");
            }

            //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
            Conexion.conexion.close();

        } catch (Exception e){

            System.err.println("Error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed
    
    private void limpiar(){
        
        jtfGrupo.setText(null);
        jtfAlumno.setText(null);
        jtfGrupoNuevo.setText(null);
        jlIngresarGrupo.setText(null);
        jlGrupoNuevo.setText(null);
        jlFechaConsulta.setText(null);
        jlHoraConsulta.setText(null);
        jlFecha.setText(null);
        jlHora.setText(null);
        this.jtfGrupoNuevo.setVisible(false);
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
            java.util.logging.Logger.getLogger(CambioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarInsc;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlFechaConsulta;
    private javax.swing.JLabel jlGrupo;
    private javax.swing.JLabel jlGrupoNuevo;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlHoraConsulta;
    private javax.swing.JLabel jlIngresarGrupo;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfAlumno;
    private javax.swing.JTextField jtfGrupo;
    private javax.swing.JTextField jtfGrupoNuevo;
    // End of variables declaration//GEN-END:variables
}
