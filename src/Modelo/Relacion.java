/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Deico
 */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Relacion {
    
    public static void remate_has_factura(int ID_REMATE,int ID_FACTURA)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Factura (ID_REMATE,ID_FACTURA) values (?,?);");
           
            prep.setInt(1, ID_REMATE);
            prep.setInt(2, ID_FACTURA); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
   public static void factura_has_producto(int ID_FACTURA,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Factura_has_Producto (ID_FACTURA,ID_PRODUCTO) values (?,?);");
           
            prep.setInt(1, ID_FACTURA);
            prep.setInt(2, ID_PRODUCTO); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
  }
 
    public static void remate_has_producto(int ID_REMATE,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Producto (ID_REMATE,ID_PRODUCTO) values (?,?);");
           
            prep.setInt(1, ID_REMATE);
            prep.setInt(2, ID_PRODUCTO); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
      public static void cliente_has_factura(String RUT,int ID_FACTURA)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Cliente_has_Factura (RUT,ID_FACTURA) values (?,?);");
           
            prep.setString(1, RUT);
            prep.setInt(2, ID_FACTURA); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
       public static void remate_has_causa(int ID_REMATE,String ROL)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Causa (ID_REMATE,ROL) values (?,?);");
           
            prep.setInt(1, ID_REMATE);
            prep.setString(2, ROL); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
       
      public static void recepcion_judicial_has_producto(int ID_RJ,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Judicial_has_Producto (ID_RJ,ID_PRODUCTO) values (?,?);");
           
            prep.setInt(1, ID_RJ);
            prep.setInt(2, ID_PRODUCTO); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
      
    public static void recepcion_voluntaria_has_producto(int ID_RV,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Voluntaria_has_Producto (ID_RV,ID_PRODUCTO) values (?,?);");
           
            prep.setInt(1, ID_RV);
            prep.setInt(2, ID_PRODUCTO); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
        public static void cliente_has_Recepcion_Voluntaria(String RUT,int ID_RV)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Cliente_has_Recepcion_Voluntaria (RUT,ID_RV) values (?,?);");
           
            prep.setString(1, RUT);
            prep.setInt(2, ID_RV); 
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
