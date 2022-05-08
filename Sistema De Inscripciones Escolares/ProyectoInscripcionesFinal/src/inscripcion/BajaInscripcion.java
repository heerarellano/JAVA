package inscripcion;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuInscripcion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class BajaInscripcion extends javax.swing.JFrame {
    PreparedStatement prepared;
    ResultSet result;
    public BajaInscripcion() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlGrupo = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfGrupo = new javax.swing.JTextField();
        jtfAlumno = new javax.swing.JTextField();
        jbLimpiar = new javax.swing.JButton();
        jbConfirmar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jlDatosInsc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlIDAlumno = new javax.swing.JLabel();
        jlIDGrupo = new javax.swing.JLabel();
        jlFecha = new javax.swing.JLabel();
        jlHora = new javax.swing.JLabel();
        jlIDAlumnoConsulta = new javax.swing.JLabel();
        jlIDGrupoConsulta = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jlFechaConsulta = new javax.swing.JLabel();
        jlHoraConsulta = new javax.swing.JLabel();
        jlHost = new javax.swing.JLabel();
        jlHostConsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlGrupo.setText("ID Grupo:");

        jlAlumno.setText("ID Alumno:");

        jLabel1.setText("Ingrese los siguientes datos:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbConfirmar.setText("Eliminar");
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

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitulo.setText("Eliminar inscripción.");

        jlDatosInsc.setText("                                     ");

        jlIDAlumno.setText("       ");

        jlIDGrupo.setText("      ");

        jlFecha.setText("            ");

        jlHora.setText("          ");

        jlIDAlumnoConsulta.setText("                  ");

        jlIDGrupoConsulta.setText("                  ");

        jLabel10.setText("                  ");

        jLabel11.setText("                  ");

        jbBuscar.setText("Buscar inscripción");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlFechaConsulta.setText("           ");

        jlHoraConsulta.setText("               ");

        jlHost.setText("              ");

        jlHostConsulta.setText("           ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlAlumno)
                                        .addGap(70, 70, 70)
                                        .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlGrupo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jbBuscar)))
                        .addGap(0, 92, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLimpiar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlIDAlumno)
                                .addComponent(jlIDGrupo)
                                .addComponent(jlHora)
                                .addComponent(jlFecha)
                                .addComponent(jlHost)))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlIDGrupoConsulta)
                                    .addComponent(jlIDAlumnoConsulta)
                                    .addComponent(jlFechaConsulta)
                                    .addComponent(jlHoraConsulta)
                                    .addComponent(jlHostConsulta))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbConfirmar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlTitulo))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jlDatosInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlumno)
                    .addComponent(jtfAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlGrupo)
                    .addComponent(jtfGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDatosInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDAlumno)
                    .addComponent(jlIDAlumnoConsulta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIDGrupo)
                    .addComponent(jlIDGrupoConsulta))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlFecha)
                            .addComponent(jlFechaConsulta))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlHora, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlHoraConsulta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlHost)
                            .addComponent(jlHostConsulta))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSalir)
                    .addComponent(jbConfirmar)
                    .addComponent(jbLimpiar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        MenuInscripcion jfMenuInscripcion = new MenuInscripcion(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuInscripcion.pack(); //Para que se centre la ventana.
        jfMenuInscripcion.setLocationRelativeTo(null); //
        jfMenuInscripcion.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarActionPerformed
       if ( jtfAlumno.getText().isEmpty()||jtfGrupo.getText().isEmpty() ){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else
            
        { //Código del botón confirmar    
        
                /*Abrir la conexión*/
                Conexion.conexion = null;
                int resultado;

                try {

                     Conexion.conexion = Conexion.getConnection();

                     /*Preparar la sentencia*/
                        prepared = Conexion.conexion.prepareStatement("DELETE FROM inscripcion WHERE alum_id_alumno=? AND grup_id_grupo=? ");
                        prepared.setInt(1, Integer.valueOf(jtfAlumno.getText()));
                        prepared.setInt(2, Integer.valueOf(jtfGrupo.getText()));

                    /*Ejecutar la sentencia SQL*/
                        resultado = prepared.executeUpdate();

                    if (resultado > 0){

                            JOptionPane.showMessageDialog(null, "La inscripción se eliminó correctamente :D");
                            limpiar();

                    } else {

                            JOptionPane.showMessageDialog(null, "Error al eliminar la inscripción :(");
                    }

                            //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
                    Conexion.conexion.close();

                } catch (Exception e){

                    System.err.println("Error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.

                }
        }
    }//GEN-LAST:event_jbConfirmarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar ();

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        Conexion.conexion = null;

        try {
            /*Abrir la conexión*/
            Conexion.conexion = Conexion.getConnection();

            /*Preparar la sentencia SQL*/
            prepared = Conexion.conexion.prepareStatement("SELECT P.pers_nombre || ' ' || P.pers_apaterno  || ' '|| P.pers_amaterno AS nombre,\n" +
                                                 "G.grup_clave, TO_CHAR(insc_hora,'HH:MI:SS') AS insc_hora, TO_CHAR (I.insc_fecha, 'DD/MM/YYYY') AS insc_fecha, I.insc_host\n" +
                                                 "FROM persona P, alumno A, grupo G, inscripcion I\n" +
                                                 "WHERE I.alum_id_alumno = ?\n" +
                                                 "AND I.grup_id_grupo = ?\n" +
                                                 "AND P.pers_id_persona = A.pers_id_persona\n" +
                                                 "AND G.grup_id_grupo = I.grup_id_grupo\n" +
                                                 "AND A.alum_id_alumno = I.alum_id_alumno;"); 
            
            prepared.setInt(1, Integer.valueOf( jtfAlumno.getText()));
            prepared.setInt(2, Integer.valueOf( jtfGrupo.getText()));

            /*Ejecutar la sentencia SQL*/
            result = prepared.executeQuery();

            if(result.next()){
                jlIDAlumnoConsulta.setText(result.getString("nombre"));
                jlIDGrupoConsulta.setText(result.getString("grup_clave"));
                jlFechaConsulta.setText(result.getString("insc_fecha")); 
                jlHoraConsulta.setText(result.getString("insc_hora"));
                jlHostConsulta.setText(result.getString("insc_host"));
                
                jlDatosInsc.setText("Datos que se van a eliminar:");
                jlIDAlumno.setText("nombre del alumno:"); 
                jlIDGrupo.setText("Grupo(clave):");
                jlFecha.setText("Fecha de inscripción:");
                jlHora.setText("Hora de inscripción:");
                jlHost.setText("Host:");
                
            } else {
                JOptionPane.showMessageDialog(null, "los datos de la inscripción son incorrectos!");
            }

            //Cerrar la conexión a la BD. Cuando ya se haya terminado la interacción con la BD.
            Conexion.conexion.close();

        } catch (Exception e) {
            System.err.println("error: " + e); //La variable e tiene cualquier tipo de excepción que se genere.
        }
    }//GEN-LAST:event_jbBuscarActionPerformed
    
    
    private void limpiar(){
        
        jtfGrupo.setText(null);        
        jtfAlumno.setText(null);
        jlDatosInsc.setText(null);
        jlIDAlumnoConsulta.setText(null); 
        jlIDGrupoConsulta.setText(null);
        jlFechaConsulta.setText(null);
        jlHoraConsulta.setText(null);
        jlHostConsulta.setText(null);
        jlIDAlumno.setText(null); 
        jlIDGrupo.setText(null);
        jlFecha.setText(null);
        jlHora.setText(null);
        jlHost.setText(null);
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
            java.util.logging.Logger.getLogger(BajaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaInscripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbConfirmar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlDatosInsc;
    private javax.swing.JLabel jlFecha;
    private javax.swing.JLabel jlFechaConsulta;
    private javax.swing.JLabel jlGrupo;
    private javax.swing.JLabel jlHora;
    private javax.swing.JLabel jlHoraConsulta;
    private javax.swing.JLabel jlHost;
    private javax.swing.JLabel jlHostConsulta;
    private javax.swing.JLabel jlIDAlumno;
    private javax.swing.JLabel jlIDAlumnoConsulta;
    private javax.swing.JLabel jlIDGrupo;
    private javax.swing.JLabel jlIDGrupoConsulta;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfAlumno;
    private javax.swing.JTextField jtfGrupo;
    // End of variables declaration//GEN-END:variables
}
