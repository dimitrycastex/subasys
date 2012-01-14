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

public class Producto {
    
   public static ArrayList producto = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Producto values (?,?,?,?,?,?);");
             
            //prep.setInt(1, Integer.parseInt(unaLista.get(0).toString()));
            prep.setString(2, unaLista.get(1).toString());               
            prep.setInt(3, Integer.parseInt(unaLista.get(2).toString()));
            prep.setInt(4, Integer.parseInt(unaLista.get(3).toString()));
            prep.setInt(5, Integer.parseInt(unaLista.get(4).toString()));
            prep.setInt(6, Integer.parseInt(unaLista.get(5).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ID_PRODUCTO){

        producto.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Producto where ID_PRODUCTO="+ID_PRODUCTO+"");
          
          while (rs.next()) {
          producto.add(rs.getInt("ID_PRODUCTO"));
          producto.add(rs.getString("Descripcion"));
          producto.add(rs.getInt("Cantidad"));
          producto.add(rs.getInt("Precio_Unitario"));
          producto.add(rs.getInt("Total"));
          producto.add(rs.getInt("Garantia"));

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.WARNING_MESSAGE);
          
         return producto;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return producto;
    }
    
  public static boolean setUpdate(String ID_PRODUCTO,ArrayList unaLista) {

        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("update Producto set Descripcion='"+unaLista.get(1).toString()+"' where ID_PRODUCTO = "+"'"+ID_PRODUCTO+"'");
        stat.executeUpdate("update Producto set Cantidad="+Integer.parseInt(unaLista.get(2).toString())+" where ID_PRODUCTO = "+"'"+ID_PRODUCTO+"'");
        stat.executeUpdate("update Producto set Precio_Unitario="+Integer.parseInt(unaLista.get(3).toString())+" where ID_PRODUCTO = "+"'"+ID_PRODUCTO+"'");
        stat.executeUpdate("update Producto set Total="+Integer.parseInt(unaLista.get(4).toString())+" where ID_PRODUCTO = "+"'"+ID_PRODUCTO+"'");
        stat.executeUpdate("update Producto set Garantia="+Integer.parseInt(unaLista.get(5).toString())+" where ID_PRODUCTO = "+"'"+ID_PRODUCTO+"'");

        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }

    }
  
}
