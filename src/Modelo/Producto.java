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
            "insert into Producto (ID_PRODUCTO,Descripcion,Cantidad,Precio_Unitario,"
                    + "Total,Garantia,Descripcion_Larga) values (?,?,?,?,?,?,?);");

            prep.setInt(1,Integer.parseInt(unaLista.get(0).toString()));
            prep.setString(2, unaLista.get(1).toString());               
            prep.setInt(3, Integer.parseInt(unaLista.get(2).toString()));
            prep.setInt(4, Integer.parseInt(unaLista.get(3).toString()));
            prep.setInt(5, Integer.parseInt(unaLista.get(4).toString()));
            prep.setInt(6, Integer.parseInt(unaLista.get(5).toString()));
            prep.setString(7, unaLista.get(6).toString());    
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos: "+ ex, "Error: Producto", JOptionPane.ERROR_MESSAGE);
        }
    }
   
   public static ArrayList getDatos(String ID_PRODUCTO){

        producto.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Producto where ID_PRODUCTO='"+ID_PRODUCTO+"'");
          
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
         JOptionPane.showMessageDialog(null,"Producto: Error de Base de Datos" + ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return producto;
    }
   
   public static int getID_Producto(String remate,int lote){

       int id_producto  = 0;
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select id_producto from Remate_has_Producto where id_remate='"+remate+"' AND "
                  + "Lote="+lote+";");
          
          while (rs.next()) {
         id_producto = (rs.getInt("ID_PRODUCTO"));

          flag=true;
          }
          rs.close();
          
        
          
         return id_producto;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return id_producto;
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
            prep.executeUpdate();
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  
  public static void setUpdateMigracion(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "UPDATE Producto set Cantidad = ?,Precio_Unitario=?,"
                    + "Garantia=?,Total=? where id_producto="+unaLista.get(0)+";");
          
            prep.setInt(1, Integer.parseInt(unaLista.get(1).toString()));
            prep.setInt(2, Integer.parseInt(unaLista.get(2).toString()));
            prep.setInt(3, Integer.parseInt(unaLista.get(3).toString()));
            prep.setInt(4, Integer.parseInt(unaLista.get(4).toString()));
            prep.executeUpdate();
            
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
          producto.add(rs.getInt("ID_PRODUCTO"));
          producto.add(rs.getInt("Lote"));
          producto.add(rs.getString("ID_REMATE"));
          producto.add(rs.getString("Descripcion"));
          producto.add(rs.getInt("Cantidad"));
          producto.add(rs.getInt("Precio_Unitario"));
          producto.add(rs.getInt("Total"));
          producto.add(rs.getInt("Garantia"));
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
  
   public static ArrayList<ArrayList> get_Lista_Busqueda_Facturados(){

        ArrayList<ArrayList> lista_productos = new ArrayList();
       
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT *"+
            "FROM (SELECT rut,id_factura from cliente_has_factura) AS cliente_f,"+
            "(SELECT id_factura,id_producto FROM factura_has_producto) AS factura_p,"+
            "(SELECT apellidoP,apellidoM,nombre,rut FROM cliente) AS mini_cliente,"+
            "(SELECT id_producto,descripcion,precio_unitario,garantia,total,cantidad from producto) AS mini_producto"+
            " where cliente_f.id_factura = factura_p.id_factura AND cliente_f.rut = mini_cliente.rut AND mini_producto.id_producto = factura_p.id_producto;");
          
          while (rs.next()) {
          ArrayList producto = new ArrayList();
          
          producto.add(rs.getInt("ID_PRODUCTO"));
          producto.add(rs.getInt("ID_FACTURA"));
          producto.add(rs.getString("RUT"));
          producto.add(rs.getString("ApellidoP"));
          producto.add(rs.getString("ApellidoM"));
          producto.add(rs.getString("Nombre"));
          producto.add(rs.getString("Descripcion"));
          producto.add(rs.getInt("Precio_Unitario"));
          producto.add(rs.getInt("Garantia"));
          producto.add(rs.getInt("Total"));
          
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
  
  
  
  public static boolean isFacturado(String ID_PRODUCTO){


        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select ID_PRODUCTO from Factura_has_Producto where ID_PRODUCTO="+ID_PRODUCTO+";");
          
          while (rs.next()) {
        
          flag=true;
          }
          rs.close();
          
          return flag;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return flag;
    }
  
  public static int get_ID_Factura(String ID_PRODUCTO){


        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select ID_FACTURA from Factura_has_Producto where ID_PRODUCTO="+ID_PRODUCTO+";");
          
          while (rs.next()) {
          return rs.getInt("ID_FACTURA");   
          }
          rs.close();
        
         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return 0;
    }
  
  public static String[] getJuzgado_Causa(String ID_PRODUCTO){

        String[] aux = new String[2];

        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select Juzgado,ROL "
                  + "from Causa,Recepcion_judicial_has_producto "
                  + "where ID_PRODUCTO="+ID_PRODUCTO+" AND Causa.ID_RJ = Recepcion_judicial_has_producto.ID_RJ;");
          
          while (rs.next()) {
          aux[0]=rs.getString("Juzgado");
          aux[1]=rs.getString("ROL");
          }
          rs.close();       
         // if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.WARNING_MESSAGE);       
         return aux;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return aux;
    }
  
  
   public static String get_Adjudicario(String ID_PRODUCTO){

        String aux ="";

        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select cliente.nombre,cliente.apellidop "
                  + "from (select cliente.nombre,cliente.apellidop,cliente.rut from cliente) as cliente_p "
                  + "NATURAL JOIN cliente_has_factura, "
                  + "where ID_PRODUCTO="+ID_PRODUCTO+" AND Causa.ID_RJ = Recepcion_judicial_has_producto.ID_RJ;");
          
          while (rs.next()) {
          aux=rs.getString("Juzgado");
        
          }
          rs.close();       
         // if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el producto", "Error", JOptionPane.WARNING_MESSAGE);       
         return aux;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return aux;
    }
  
  public static boolean borrar(int id_producto) {

        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("DELETE FROM Producto WHERE ID_PRODUCTO="+id_producto+";");
      
        
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }
    }
  
  public static boolean isExist(int id_producto){


        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select id_producto from Producto where id_producto="+id_producto+";");
          
          while (rs.next()) {
        
          flag=true;
          }
          rs.close();
          
          return flag;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return flag;
    }
  
}
