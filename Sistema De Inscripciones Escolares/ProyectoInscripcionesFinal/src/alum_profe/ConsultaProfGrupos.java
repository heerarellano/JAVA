package alum_profe;
import SistemaInscripciones.LoginAdministrador;
import static SistemaInscripciones.LoginAdministrador.PASSWD;
import static SistemaInscripciones.LoginAdministrador.URL;
import static SistemaInscripciones.LoginAdministrador.USERNAME;
import static SistemaInscripciones.LoginAdministrador.User;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class ConsultaProfGrupos extends javax.swing.JFrame {
    public static final String URL = "jdbc:postgresql://localhost:5432/proyecto_inscripciones";
    public static final String USERNAME = "equipo"; //Usuario de la BD
    public static final String PASSWD = "equipo2021**"; //Password del usuario de la BD con el que se va a conectar. 
    PreparedStatement prepared;
    ResultSet result;

    /**
     * Creates new form ConsultaProfesor
     */
    public ConsultaProfGrupos() {
        initComponents();
        LoginAdministrador alumno = new LoginAdministrador();
        jlNumeroTrabajador.setText(LoginAdministrador.User);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlNumdeTrabajador = new javax.swing.JLabel();
        jbConsultar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlNumeroTrabajador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlNumdeTrabajador.setText("N??mero de Trabajador:");

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

        jlTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jlTitulo.setText("Grupos asignados");

        jlNumeroTrabajador.setText(" ");

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jlNumdeTrabajador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlNumeroTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jbConsultar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jlTitulo)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumdeTrabajador)
                    .addComponent(jbConsultar)
                    .addComponent(jlNumeroTrabajador))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        SistemaInscripciones.UIMenuProfesor jfUIMenuProfesor = new SistemaInscripciones.UIMenuProfesor(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfUIMenuProfesor.setSize(270, 160); //Al objeto le asignamos un tama??o (de ventana).
        jfUIMenuProfesor.pack(); //Para que se centre la ventana.
        jfUIMenuProfesor.setLocationRelativeTo(null); //
        jfUIMenuProfesor.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
       
          // TODO add your handling code here:
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Clave grupo");
        modelo.addColumn("Cupo");
        modelo.addColumn("Periodo");
        modelo.addColumn("Nombre asignatura");
       
        
        JTable.setModel(modelo);
        
        String datos[] = new String[4];
        
        Connection conexion = null;
        
        try {
            SistemaInscripciones.Conexion.conexion = SistemaInscripciones.Conexion.getConnection();
            prepared = SistemaInscripciones.Conexion.conexion.prepareStatement("SELECT grup_clave, grup_cupo, peri_id_periodo, asig_nombre FROM asignatura, grupo, \n" +
"profesor WHERE profesor.prof_id_profesor = grupo.prof_id_profesor\n" +
"AND asignatura.asig_id_asignatura = grupo.asig_id_asignatura\n" +
"AND profesor.prof_num_trabajador=?");
            prepared.setString(1,jlNumeroTrabajador.getText());
            result = prepared.executeQuery();
            
            while (result.next()){
                //jtfNombreAsignatura.setText(result.getString("asig_id_asignatura"));

                datos[0] = result.getString("grup_clave");
                datos[1] = result.getString("grup_cupo");
                datos[2] = result.getString("peri_id_periodo");
                datos[3] = result.getString("asig_nombre");
                
                modelo.addRow(datos);

            }
            
            SistemaInscripciones.Conexion.conexion.close();
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
    }//GEN-LAST:event_jbConsultarActionPerformed
   
    public Connection getConnection(){
        Connection conexion = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(URL, USERNAME, PASSWD);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa"); //Para verificar que nos haga la conexion
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        
        return conexion;    
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ConsultaProfGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProfGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProfGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlNumdeTrabajador;
    private javax.swing.JLabel jlNumeroTrabajador;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables

}
