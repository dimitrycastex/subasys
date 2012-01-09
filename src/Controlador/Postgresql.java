/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Deico
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Postgresql {

    /**
     * @param args the command line arguments
     */
    public static  Connection DB_CONNECTION = getConnection();
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
     public static void crearDBASE() {

       
     try { Class.forName("org.sqlite.JDBC"); } catch (ClassNotFoundException error_driver) {
          JOptionPane.showMessageDialog(null, error_driver, "ERROR DRIVER", JOptionPane.WARNING_MESSAGE);
          System.exit(1);
          }
     
        Connection conn  =null;
        try {
        
        conn = DriverManager.getConnection("jdbc:sqlite:DB_MP.s3db");

        java.sql.Statement stat = conn.createStatement();

        String planilla1 = "CREATE TABLE i_p(investigador TEXT NOT NULL,proyecto TEXT NOT NULL)";
        String planilla2 = "CREATE TABLE p_ip(proyecto TEXT NOT NULL,iprincipal TEXT NOT NULL)";
        String planilla3 = "CREATE TABLE i_ip(investigador TEXT NOT NULL,iprincipal TEXT NOT NULL )";

        stat.executeUpdate(planilla1);
        stat.executeUpdate(planilla2);
        stat.executeUpdate(planilla3);
             
        conn.close();
        
        } catch (SQLException error_conexion) {
          JOptionPane.showMessageDialog(null, error_conexion, "ERROR CONEXION", JOptionPane.WARNING_MESSAGE);
          System.exit(1);
        }

    }
   
      public static Connection getConnection(){
      
     String driver = "org.postgresql.Driver";
     String dbname = "Subasys";
     String url = "jdbc:postgresql://localhost/" +  dbname;
     String username = "postgres";
     String password = "subasys";
        Connection conData = null;
       
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        try {
            conData = DriverManager.getConnection(url,username,password);
            return conData;
        } catch (SQLException ex) {
            System.out.println(ex);
            return conData;
        }
        
     
  }
    
    
     
}
