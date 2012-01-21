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
            "insert into Producto (Descripcion,Cantidad,Precio_Unitario,"
                    + "Total,Garantia,Descripcion_Larga) values (?,?,?,?,?,?);");

            prep.setString(1, unaLista.get(1).toString());               
            prep.setInt(2, Integer.parseInt(unaLista.get(2).toString()));
            prep.setInt(3, Integer.parseInt(unaLista.get(3).toString()));
            prep.setInt(4, Integer.parseInt(unaLista.get(4).toString()));
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));
            prep.setString(6, unaLista.get(6).toString());    
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
          producto.add(rs.getString("Descripcion_Larga"));

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
    
  
  public static void setUpdate(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "UPDATE Producto set Descripcion = ?,Cantidad = ?,Precio_Unitario=?,"
                    + "Total=?,Garantia=?,Descripcion_Larga=? where id_producto="+unaLista.get(0)+";");
            
            prep.setString(1, unaLista.get(1).toString());               
            prep.setInt(2, Integer.parseInt(unaLista.get(2).toString()));
            prep.setInt(3, Integer.parseInt(unaLista.get(3).toString()));
            prep.setInt(4, Integer.parseInt(unaLista.get(4).toString()));
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));
            prep.setString(6, unaLista.get(6).toString());    
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  public static ArrayList<ArrayList> get_Lista(){

        ArrayList<ArrayList> lista_productos = new ArrayList();
       
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Producto;");
          
          while (rs.next()) {
          ArrayList producto = new ArrayList();
          producto.add(rs.getInt("ID_PRODUCTO"));
          producto.add(rs.getString("Descripcion"));
          producto.add(rs.getInt("Cantidad"));
          producto.add(rs.getInt("Precio_Unitario"));
          producto.add(rs.getInt("Total"));
          producto.add(rs.getInt("Garantia"));
          producto.add(rs.getString("Descripcion_Larga"));
          lista_productos.add(producto);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_productos;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_productos;
    }
  
  /*
   * Obtiene el join entre Remate_has_Producto y Producto
   * Campos: Lote-ID_REMATE-ID_PRODUCTO{DATOS PRODUCTO}
   */
  public static ArrayList<ArrayList> get_Lista_Busqueda(){

        ArrayList<ArrayList> lista_productos = new ArrayList();
       
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Producto NATURAL JOIN Remate_has_Producto");
          
          while (rs.next()) {
          ArrayList producto = new ArrayList();
          producto.add(rs.getInt("Lote"));
          producto.add(rs.getString("ID_REMATE"));
          producto.add(rs.getInt("Descripcion"));
          producto.add(rs.getString("ID_PRODUCTO"));
          producto.add(rs.getInt("Cantidad"));
          producto.add(rs.getInt("Precio_Unitario"));
          producto.add(rs.getInt("Total"));
          producto.add(rs.getInt("Garantia"));
          producto.add(rs.getString("Descripcion_Larga"));
              System.out.println("-");
          lista_productos.add(producto);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_productos;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_productos;
    }
  
}
