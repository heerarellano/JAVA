package alumno;

import SistemaInscripciones.Conexion;
import SistemaInscripciones.MenuAlumno;
import javax.swing.JOptionPane;

public class CambioAlumno extends javax.swing.JFrame {
    
        String nombre="";
        String aPaterno=""; 
        String aMaterno=""; 
        String generacion=""; 
        String correo=""; 
        String numeroCuenta=""; 
        int id_persona=0;
        
        
    public void limpiar(){
        jtfNombre.setText(null); 
        jtfApellidoPaterno.setText(null); 
        jtfApellidoMaterno.setText(null); 
        jtfGeneracion.setText(null); 
        jtfCorreo.setText(null); 
        
    }
    public CambioAlumno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlCuenta = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellidoPaterno = new javax.swing.JLabel();
        jlApellidoMaterno = new javax.swing.JLabel();
        jlCorreo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfApellidoPaterno = new javax.swing.JTextField();
        jtfApellidoMaterno = new javax.swing.JTextField();
        jtfCorreo = new javax.swing.JTextField();
        jtfCuenta = new javax.swing.JTextField();
        jlGeneracion = new javax.swing.JLabel();
        jtfGeneracion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbGuardarCorreo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jlPersona = new javax.swing.JLabel();
        jBRegresar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Por favor ingrese el dato:");

        jlCuenta.setText("Cuenta (número):");

        jlNombre.setText("Nombre:");

        jlApellidoPaterno.setText("Apellido Paterno:");

        jlApellidoMaterno.setText("Apellido Materno: ");

        jlCorreo.setText("Correo:");

        jLabel7.setText("Modifique el o los datos:");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jtfApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoPaternoKeyTyped(evt);
            }
        });

        jtfApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfApellidoMaternoKeyTyped(evt);
            }
        });

        jtfCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCuentaKeyTyped(evt);
            }
        });

        jlGeneracion.setText("Generación (año): ");

        jtfGeneracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfGeneracionKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cambio Alumno");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardarCorreo.setText("Guardar");
        jbGuardarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarCorreoActionPerformed(evt);
            }
        });

        jBRegresar.setText("Regresar");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlCuenta)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jlPersona))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbBuscar)))
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlApellidoPaterno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNombre)
                                        .addGap(93, 93, 93)
                                        .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(92, 92, 92)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlGeneracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jbGuardarCorreo)
                        .addGap(64, 64, 64)
                        .addComponent(jBRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCuenta)
                    .addComponent(jtfCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlPersona)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlApellidoPaterno))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidoMaterno)
                    .addComponent(jtfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlGeneracion))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCorreo)
                    .addComponent(jtfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarCorreo)
                    .addComponent(jBRegresar))
                .addGap(38, 38, 38))
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    //La clase Conexion es la que tiene las variables para conectarte, con el método getConnection();
                  
    if ( jtfCuenta.getText().isEmpty() ){

            JOptionPane.showMessageDialog(null, "Favor de ingresar el número de cuenta que desea buscar!");
        }
        
        else
            
        { //Código del botón buscar
            Conexion.conexion = null; //Lo ponemos en nulo porque ahorita no tenemos nada. PgConnection es la versión nueva de Connection para postgres.
          
        
        
        try{
           
            Conexion.conexion = Conexion.getConnection(); //En la variable conexion ya tengo el identificador de la BD. 
            Conexion.prepared = Conexion.conexion.prepareStatement("SELECT P.pers_id_persona,pers_nombre, pers_apaterno, pers_amaterno, alum_generacion, us_email\n" +
                                                                    "FROM persona P, alumno A, usuario U \n" +
                                                                    "WHERE P.pers_id_persona = A.pers_id_persona\n" +
                                                                    "AND P.pers_id_persona = U.pers_id_persona\n" +
                                                                    "AND A.alum_num_cuenta=?"); 
            
            Conexion.prepared.setString(1, jtfCuenta.getText()); //numéro de cuenta alumno
            
            Conexion.result = Conexion.prepared.executeQuery(); //Se le asigna el método a una variable de tipo resultSet porque es el tipo de objeto que regresa el método.
            
            
            if(Conexion.result.next()){
                
                jlPersona.setText(Conexion.result.getString("pers_id_persona"));
                jlPersona.setVisible(false);
                jtfNombre.setText(Conexion.result.getString("pers_nombre")); //Result ya tiene los atributos de la sentencia ejecutados en la BD
                jtfApellidoPaterno.setText(Conexion.result.getString("pers_apaterno"));
                jtfApellidoMaterno.setText(Conexion.result.getString("pers_amaterno"));
                jtfGeneracion.setText(Conexion.result.getString("alum_generacion"));
                jtfCorreo.setText(Conexion.result.getString("us_email"));
                
                nombre =jtfNombre.getText(); 
                aPaterno=jtfApellidoPaterno.getText(); 
                aMaterno=jtfApellidoMaterno.getText();
                generacion = jtfGeneracion.getText(); 
                correo = jtfCorreo.getText(); 
                numeroCuenta= jtfCuenta.getText(); 
                id_persona = Integer.valueOf(jlPersona.getText()); 
                
                  
                 
                
            } else {
                JOptionPane.showMessageDialog(null, "El número de cuenta no existe");
                
            }
            
            Conexion.conexion.close(); //Se cierra la conexión a la BD 
            
        } catch (Exception e){
            
            System.err.println("Error: " + e);
        }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarCorreoActionPerformed

        if ( jtfCuenta.getText().isEmpty() || jtfNombre.getText().isEmpty() || jtfApellidoPaterno.getText().isEmpty() ||
                jtfApellidoMaterno.getText().isEmpty() || jtfGeneracion.getText().isEmpty() || jtfCorreo.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Favor de no dejar campos vacíos");
        }
        
        else{
        Conexion.conexion = null;
         
            try{
                Conexion.conexion = Conexion.getConnection(); 
                Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE persona \n" +
                                                                     "SET pers_nombre=?, pers_apaterno=?, pers_amaterno=?\n" +
                                                                     "WHERE pers_nombre=?\n" +
                                                                     "AND pers_apaterno=?\n" +
                                                                     "AND pers_amaterno =?");
              
               
                
                Conexion.prepared.setString(1,jtfNombre.getText());
                Conexion.prepared.setString(2, jtfApellidoPaterno.getText());
                Conexion.prepared.setString(3, jtfApellidoMaterno.getText());
                Conexion.prepared.setString(4, nombre);
                Conexion.prepared.setString(5, aPaterno);
                Conexion.prepared.setString(6, aMaterno);           
                Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                if(Conexion.resultado > 0){
                        
                   // JOptionPane.showMessageDialog(null, "Se actualizo correctamente el nombre del alumno");
          
                }else{
            
                    JOptionPane.showMessageDialog(null, "Error al actualizar el nombre del alumno :(");
            
                }
                
                Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE alumno\n" +
                                                                        "SET alum_generacion=?\n" +
                                                                        "WHERE alum_num_cuenta=?");
                             
                Conexion.prepared.setInt(1,Integer.valueOf(jtfGeneracion.getText()));
                Conexion.prepared.setString(2, numeroCuenta);           
                Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                if(Conexion.resultado > 0){
                        //JOptionPane.showMessageDialog(null, "Se actualizo correctamente la generación del alumno");
                        jtfNombre.setText(nombre);
                        jtfApellidoMaterno.setText(aPaterno);
                        jtfApellidoPaterno.setText(aMaterno);
            
                }else{
                        JOptionPane.showMessageDialog(null, "Error al actualizar la generación del alumno :(");
            
                }
         
              
                Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE usuario\n" +
                                                                       "SET us_email=?\n" +
                                                                       "WHERE pers_id_persona=?");
                             
                Conexion.prepared.setString(1,jtfCorreo.getText());
                Conexion.prepared.setInt(2, id_persona);           
                Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                if(Conexion.resultado > 0){
                    
                    JOptionPane.showMessageDialog(null, "Se actualizó correctamente al alumno :D");
                    clean();
         
                }else{
                    JOptionPane.showMessageDialog(null, "Error al actualizar el correo del alumno :(");
            
                }
                
                Conexion.conexion.close();
                 
            }catch(Exception e){
            
            System.err.println("Error: " + e); 
            }
        }
    }                                                   

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*Conexion.conexion = null;
         
        try{
              Conexion.conexion = Conexion.getConnection(); 
              Conexion.prepared = Conexion.conexion.prepareStatement("UPDATE usuario\n" +
              "SET correo=?\n" +
              "WHERE pers_id_persona=?");
                             
               Conexion.prepared.setString(1,jtfCorreo.getText());
               Conexion.prepared.setInt(2, id_persona);           
               Conexion.resultado = Conexion.prepared.executeUpdate(); 
               
                if(Conexion.resultado > 0){
                        JOptionPane.showMessageDialog(null, "Se actualizó correctamente al alumno");
                        jtfNombre.setText(nombre);
                        jtfApellidoMaterno.setText(nombre);
                        jtfApellidoPaterno.setText(nombre);
            
                }else{
                        JOptionPane.showMessageDialog(null, "Error al actualizar la generación del alumno :(");
            
                }
                
            Conexion.conexion.close();
                 
        }catch(Exception e){
             System.err.println("Error: " + e); 
        }*/
         
    }//GEN-LAST:event_jbGuardarCorreoActionPerformed

    private void clean(){
        
        jtfCuenta.setText(null); 
        jtfApellidoMaterno.setText(null);
        jtfApellidoPaterno.setText(null);
        jtfGeneracion.setText(null);
        jtfCorreo.setText(null); 
        jtfNombre.setText(null);
    } 
    
    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
   
        /*Creamos un objeto jfMenuAlumno de tipo MenuAlumno (la clase es el tipo)*/
        MenuAlumno jfMenuAlumno = new MenuAlumno(); //Nombre de la clase, nombre de la variable = new Nombre de la Clase ();
        jfMenuAlumno.pack(); 
        jfMenuAlumno.setLocationRelativeTo(null); //Para que se centre la ventana.
        jfMenuAlumno.setVisible(true); //Para hcaer a la ventana visible.
        this.setVisible(false); 
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jtfCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCuentaKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
	char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El número de cuenta se compone solamente de números y no tiene espacios!");
        jtfCuenta.setText(null);
        }
    }//GEN-LAST:event_jtfCuentaKeyTyped

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El nombre solo debe contener letras!");
        jtfNombre.setText(null);
        }
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoPaternoKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El apellido solo debe contener letras!");
        jtfApellidoPaterno.setText(null);
        }
    }//GEN-LAST:event_jtfApellidoPaternoKeyTyped

    private void jtfApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfApellidoMaternoKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
        char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^A-Z,a-z,\b,\\s]")){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "El apellido solo debe contener letras!");
        jtfApellidoMaterno.setText(null);
        }
    }//GEN-LAST:event_jtfApellidoMaternoKeyTyped

    private void jtfGeneracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGeneracionKeyTyped
        //Este evento verifica que se introduzca el tipo de dato que se solicita.
	char validar=evt.getKeyChar();
        
        if (String.valueOf(validar).matches("[^0-9,\b]")) {
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingrese solo números!");
        jtfGeneracion.setText(null);
        }
    }//GEN-LAST:event_jtfGeneracionKeyTyped


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
            java.util.logging.Logger.getLogger(CambioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambioAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardarCorreo;
    private javax.swing.JLabel jlApellidoMaterno;
    private javax.swing.JLabel jlApellidoPaterno;
    private javax.swing.JLabel jlCorreo;
    private javax.swing.JLabel jlCuenta;
    private javax.swing.JLabel jlGeneracion;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPersona;
    private javax.swing.JTextField jtfApellidoMaterno;
    private javax.swing.JTextField jtfApellidoPaterno;
    private javax.swing.JTextField jtfCorreo;
    private javax.swing.JTextField jtfCuenta;
    private javax.swing.JTextField jtfGeneracion;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
