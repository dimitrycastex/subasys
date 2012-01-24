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
import java.util.Date;
import javax.swing.JOptionPane;

public class Remate {
    
   public static ArrayList remate = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
        java.sql.Date fecha =  new java.sql.Date( new java.util.Date(unaLista.get(3).toString()).getTime());
      
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate (ID_REMATE,Lugar,Diario,Fecha,Descripcion,Comision,Ciudad)"
                    + " values (?,?,?,?,?,?,?);");
            prep.setString(1, unaLista.get(0).toString());
            prep.setString(2, unaLista.get(1).toString());
            prep.setString(3, unaLista.get(2).toString());  
            prep.setDate(4, fecha);
            prep.setString(5, unaLista.get(4).toString());  
            prep.setInt(6, Integer.parseInt(unaLista.get(5).toString()));
            prep.setString(7, unaLista.get(6).toString());  

          
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ID_REMATE){

        remate.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Remate where ID_REMATE='"+ID_REMATE+"'");
          
          while (rs.next()) {
          remate.add(rs.getString("ID_REMATE"));
          remate.add(rs.getString("Lugar"));
          remate.add(rs.getString("Diario"));
          remate.add(rs.getDate("Fecha"));
          remate.add(rs.getString("Descripcion"));
          remate.add(rs.getInt("Comision"));
          remate.add(rs.getString("Ciudad"));


          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el remate", "Error", JOptionPane.WARNING_MESSAGE);
          
         return remate;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return remate;
    }
    
    public static void setUpdate(ArrayList unaLista)
 {
        java.sql.Date fecha =  new java.sql.Date( new java.util.Date(unaLista.get(3).toString()).getTime());
      
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "update Remate set Lugar=?,Diario=?,Fecha=?,Descripcion=?,Comision=?,Ciudad=?"
                    + " where ID_REMATE='"+unaLista.get(0)+"';");
             
            prep.setString(1, unaLista.get(1).toString());
            prep.setString(2, unaLista.get(2).toString());  
            prep.setDate(3, fecha);
            prep.setString(4, unaLista.get(4).toString());  
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));
            prep.setString(6, unaLista.get(6).toString());  

          
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    
    public static ArrayList<ArrayList> get_Lista(){

        ArrayList<ArrayList> lista_remate = new ArrayList();
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Remate ;");
          
          while (rs.next()) {
          ArrayList remate = new ArrayList();
          remate.add(rs.getString("ID_REMATE"));
          remate.add(rs.getString("Lugar"));
          remate.add(rs.getString("Diario"));
          remate.add(rs.getDate("Fecha"));
          remate.add(rs.getString("Descripcion"));
          remate.add(rs.getInt("Comision"));
          remate.add(rs.getString("Ciudad"));

          lista_remate.add(remate);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el remate", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_remate;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_remate;
    }
    
    
     public static ArrayList<ArrayList> get_Lista_Busqueda(String ID_REMATE){

        ArrayList<ArrayList> lista_remate = new ArrayList();
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select rut,nombre,apellidom,apellidop,telefono,direccion,id_factura,total "+
            "from Remate_has_Factura NATURAL JOIN factura NATURAL JOIN cliente_has_factura NATURAL JOIN cliente "+
            "where remate_has_factura.id_remate = '"+ID_REMATE+"';");
          
          while (rs.next()) {
          ArrayList remate = new ArrayList();
          remate.add(rs.getString("RUT"));
          remate.add(rs.getString("ApellidoP"));
          remate.add(rs.getString("ApellidoM"));
          remate.add(rs.getString("Nombre"));
          remate.add(rs.getString("Telefono"));
          remate.add(rs.getString("Direccion"));
          remate.add(rs.getInt("id_factura"));
          remate.add(rs.getLong("total"));
          lista_remate.add(remate);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el remate", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_remate;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_remate;
    }
     
      public static ArrayList<ArrayList> get_Lista_Caja_Remate(String ID_REMATE){

        ArrayList<ArrayList> lista_remate = new ArrayList();
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * "+
            "from Remate NATURAL JOIN Remate_has_Factura NATURAL JOIN factura "+
            "where remate_has_factura.id_remate = '"+ID_REMATE+"';");
          
          while (rs.next()) {
          ArrayList remate = new ArrayList();
          remate.add(rs.getInt("ID_FACTURA"));
          remate.add(rs.getLong("Total"));
          remate.add(rs.getLong("Garantia"));
          remate.add(rs.getDate("Fecha_Emision"));
          remate.add(rs.getString("Estado"));
          remate.add(rs.getString("Exento"));
          remate.add(rs.getLong("Neto"));
          remate.add(rs.getInt("Impuestos"));
          remate.add(rs.getInt("Comision"));  
          remate.add(rs.getInt("IVA"));     
          remate.add(rs.getInt("comision_Factura"));
          
          lista_remate.add(remate);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el remate", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_remate;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_remate;
    }
     
      public static ArrayList<ArrayList> get_Lista_Productos(String ID_REMATE){

        ArrayList<ArrayList> lista_remate = new ArrayList();
        
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * "+
            "from Remate_has_producto NATURAL JOIN Producto "+
            "where Remate_has_producto.id_remate ='"+ID_REMATE+"';");
          
          while (rs.next()) {
          ArrayList remate = new ArrayList();
          remate.add(rs.getInt("ID_PRODUCTO"));
          remate.add(rs.getInt("Lote"));
          remate.add(rs.getString("Descripcion"));
          remate.add(rs.getInt("Cantidad"));
          remate.add(rs.getInt("Precio_unitario"));  
          remate.add(rs.getInt("Garantia"));     
          remate.add(rs.getInt("Total"));
          
          lista_remate.add(remate);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el remate", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_remate;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_remate;
    }
      
     public static boolean isRemate(String ID_REMATE){


        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select id_remate from Remate where id_remate="+"'"+ID_REMATE+"'");
          
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
