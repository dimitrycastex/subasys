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

public class Recepcion_Voluntaria {
    
     public static ArrayList ReVoluntaria = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
       java.util.Date fecha = (java.sql.Date)unaLista.get(1);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Voluntaria (Fecha_Ingreso,Descripcion,RUT) values (?,?,?);");

            prep.setDate(1, fechaIngreso);
            prep.setString(2, unaLista.get(2).toString());  
            prep.setString(3, unaLista.get(3).toString());  
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(int ID_RV){

        ReVoluntaria.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Recepcion_Voluntaria where ID_RV="+ID_RV+"");
          
          while (rs.next()) {
          ReVoluntaria.add(rs.getInt("ID_RV"));    
          ReVoluntaria.add(rs.getDate("Fecha_Ingreso"));
          ReVoluntaria.add(rs.getString("Descripcion"));
          ReVoluntaria.add(rs.getString("RUT"));

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return ReVoluntaria;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return ReVoluntaria;
    }
    
  public static void setUpdate(ArrayList unaLista)
 {
       java.util.Date fecha = (java.sql.Date)unaLista.get(1);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "update Recepcion_Voluntaria set Fecha_Ingreso=?,Descripcion=?,RUT=?"
                    + " where ID_RV="+unaLista.get(0)+";");

            prep.setDate(1, fechaIngreso);
            prep.setString(2, unaLista.get(2).toString());  
            prep.setString(3, unaLista.get(3).toString());  
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  public static ArrayList<ArrayList> get_Lista_Productos(int ID_RV){

       ArrayList<ArrayList> list = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT cliente.rut,cliente.direccion,cliente.nombre,cliente.apellidoP,producto.cantidad,producto.descripcion,producto.precio_unitario "+
          "FROM  cliente,(recepcion_voluntaria NATURAL JOIN recepcion_voluntaria_has_producto) AS recepcion_v,producto "+
          "WHERE cliente.rut = recepcion_v.rut AND recepcion_v.id_producto = producto.id_producto AND recepcion_v.id_rv="+ID_RV+";");
          
          while (rs.next()) {
         
          ArrayList ReVoluntaria= new ArrayList();     
          ReVoluntaria.add(rs.getString("RUT"));
          ReVoluntaria.add(rs.getString("Nombre"));
          ReVoluntaria.add(rs.getString("ApellidoP"));
          ReVoluntaria.add(rs.getString("Direccion"));    
          ReVoluntaria.add(rs.getInt("Cantidad"));
          ReVoluntaria.add(rs.getString("Descripcion"));
          ReVoluntaria.add(rs.getInt("Precio_unitario"));         
          list.add(ReVoluntaria);

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el Recepcion Voluntaria", "Error", JOptionPane.WARNING_MESSAGE);
          
         return list;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return list;
    }
  
  public static ArrayList<ArrayList> get_Lista(){

        ArrayList<ArrayList> lista_rvoluntaria = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Recepcion_Voluntaria;");
          
          while (rs.next()) {
          ArrayList ReVoluntaria = new ArrayList();
          ReVoluntaria.clear();
          ReVoluntaria.add(rs.getInt("ID_RV"));    
          ReVoluntaria.add(rs.getDate("Fecha_Ingreso"));
          ReVoluntaria.add(rs.getString("Descripcion"));
          ReVoluntaria.add(rs.getString("RUT"));
          lista_rvoluntaria.add(ReVoluntaria);
                  
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el Recepcion Voluntaria", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_rvoluntaria;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_rvoluntaria;
    }
  
  public static ArrayList<ArrayList> get_Lista_Busqueda(){

       ArrayList<ArrayList> lista_rjudicial = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT *"+
          "FROM Recepcion_voluntaria NATURAL JOIN Recepcion_voluntaria_has_producto NATURAL JOIN Producto;");
          
          while (rs.next()) {
          ArrayList ReJudicial = new ArrayList();     
          
          ReJudicial.add(rs.getInt("ID_RV"));
          ReJudicial.add(rs.getInt("RUT"));
          ReJudicial.add(rs.getInt("ID_PRODUCTO"));
          ReJudicial.add(rs.getString("Descripcion"));
          ReJudicial.add(rs.getInt("Garantia"));
          ReJudicial.add(rs.getInt("Total"));
          lista_rjudicial.add(ReJudicial);

          flag=true;
          }
          rs.close();
          
         // if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el Recepcion Voluntaria", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_rjudicial;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_rjudicial;
    }
    
  public static boolean borrar(int rv) {

        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("DELETE FROM recepcion_voluntaria WHERE id_rv="+rv+";");
      
        
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }
    }
}
