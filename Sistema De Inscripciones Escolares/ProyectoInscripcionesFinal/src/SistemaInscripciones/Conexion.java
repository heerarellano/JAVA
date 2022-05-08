/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaInscripciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author herds
 */
public class Conexion {
    
    public static final String URL="jdbc:postgresql://localhost:5432/proyecto_inscripciones"; 
    //jdbc puerto bd
    public static final String USERNAME="equipo"; 
    public static final String PASSWD="equipo2021**"; 
    public static int resultado; 
    public static  PreparedStatement prepared; 
    public static  PreparedStatement prepared_aux; 
    public static ResultSet result; 
    public static Connection conexion; 
    
    
     public static Connection getConnection(){
        Connection conexion = null; 
        
       try{
           Class.forName("org.postgresql.Driver"); 
           conexion = DriverManager.getConnection(URL,USERNAME , PASSWD); 
           //JOptionPane.showMessageDialog(null,"Conexión exitosa");
       } catch (Exception e){
           System.err.println("Error:" + e); 
       }  
        
        return conexion; 
    }
   
    
}
