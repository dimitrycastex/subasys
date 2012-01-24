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

public class Recepcion_Judicial {
    
   public static ArrayList ReJudicial = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
        java.util.Date fecha = (java.sql.Date)unaLista.get(1);
        java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
        fecha = (java.sql.Date)unaLista.get(2);
        java.sql.Date fechaDevolucion =  new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Judicial (Fecha_Ingreso,Fecha_Devolucion,"
                    + "Demandante,Demandado,Bodegaje_Pagado) values (?,?,?,?,?);");

            prep.setDate(1, fechaIngreso);
            prep.setDate(2, fechaDevolucion);
            prep.setString(3, unaLista.get(3).toString());  
            prep.setString(4, unaLista.get(4).toString());  
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ID_RJ){

        ReJudicial.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Recepcion_Judicial where ID_RJ="+ID_RJ+"");
          
          while (rs.next()) {
          ReJudicial.add(rs.getInt("ID_RJ"));    
          ReJudicial.add(rs.getDate("Fecha_Ingreso"));
          ReJudicial.add(rs.getDate("Fecha_Devolucion"));
          ReJudicial.add(rs.getString("Demandante"));
          ReJudicial.add(rs.getString("Demandado"));         
          ReJudicial.add(rs.getInt("Bodegaje_Pagado"));


          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return ReJudicial;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return ReJudicial;
    }
    
  public static void setUpdate(ArrayList unaLista)
 {
        java.util.Date fecha = (java.sql.Date)unaLista.get(1);
        java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
        fecha = (java.sql.Date)unaLista.get(2);
        java.sql.Date fechaDevolucion =  new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "update Recepcion_Judicial Fecha_Ingreso=?,Fecha_Devolucion=?,Demandante=?,"
                    + "Demandado=?,Bodegaje_Pagado=? where ID_RJ="+unaLista.get(0)+";");

            prep.setDate(1, fechaIngreso);
            prep.setDate(2, fechaDevolucion);
            prep.setString(3, unaLista.get(3).toString());  
            prep.setString(4, unaLista.get(4).toString());  
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  public static ArrayList<ArrayList> get_Lista(){

       ArrayList<ArrayList> lista_rjudicial = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Recepcion_Judicial;");
          
          while (rs.next()) {
          ArrayList ReJudicial = new ArrayList();
          ReJudicial.add(rs.getInt("ID_RJ"));    
          ReJudicial.add(rs.getDate("Fecha_Ingreso"));
          ReJudicial.add(rs.getDate("Fecha_Devolucion"));
          ReJudicial.add(rs.getString("Demandante"));
          ReJudicial.add(rs.getString("Demandado"));         
          ReJudicial.add(rs.getInt("Bodegaje_Pagado"));
          lista_rjudicial.add(ReJudicial);

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_rjudicial;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_rjudicial;
    }
  
  
  public static ArrayList<ArrayList> get_Lista_Busqueda(){

       ArrayList<ArrayList> lista_rjudicial = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT *"+
          "FROM (select ROL,id_rj from causa) as causa_r NATURAL JOIN recepcion_judicial_has_producto "+
          "NATURAL JOIN (SELECT id_producto,descripcion,garantia,total from producto) AS producto_r;");
          
          while (rs.next()) {
          ArrayList ReJudicial = new ArrayList();     
                    
          ReJudicial.add(rs.getInt("ID_RJ"));
          ReJudicial.add(rs.getString("ROL"));
          ReJudicial.add(rs.getInt("ID_PRODUCTO"));    
          ReJudicial.add(rs.getString("Descripcion"));
          ReJudicial.add(rs.getInt("Garantia"));
          ReJudicial.add(rs.getInt("Total"));         
          lista_rjudicial.add(ReJudicial);

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_rjudicial;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_rjudicial;
    }
  
  
  public static ArrayList get_Lista_Causa_Recepcion_Judicial(String ROL_CAUSA){

        ArrayList ReJudicial = new ArrayList();    
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT *"+
          "FROM causa,recepcion_judicial "+
          "where ROL='"+ROL_CAUSA+"' AND causa.id_rj = recepcion_judicial.id_rj;");
          
          while (rs.next()) {
         
          
          ReJudicial.add(rs.getString("ROL"));
          ReJudicial.add(rs.getString("Juzgado"));
          ReJudicial.add(rs.getDate("Fecha_Ingreso"));    
          ReJudicial.add(rs.getString("Demandante"));
          ReJudicial.add(rs.getString("Demandado"));
          ReJudicial.add(rs.getString("Abogado"));   
          ReJudicial.add(rs.getString("Receptor"));
          ReJudicial.add(rs.getDate("Fecha_Devolucion"));
          ReJudicial.add(rs.getInt("Bodegaje_Pagado"));    
       
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return ReJudicial;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return ReJudicial;
    }
  
  
   public static ArrayList<ArrayList> get_Lista_Productos(String ROL_CAUSA){

       ArrayList<ArrayList> list = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT *"+
          "FROM (select ROL,id_rj from causa) as causa_r NATURAL JOIN recepcion_judicial_has_producto "+
          "NATURAL JOIN (SELECT id_producto,descripcion,garantia,total from producto) AS producto_r "
                  + "WHERE causa_r.ROL='"+ROL_CAUSA+"';");
          
          while (rs.next()) {
         
          ArrayList ReJudicial = new ArrayList();     
          ReJudicial.add(rs.getInt("ID_RJ"));
          ReJudicial.add(rs.getInt("ID_PRODUCTO"));    
          ReJudicial.add(rs.getString("Descripcion"));
          ReJudicial.add(rs.getInt("Garantia"));
          ReJudicial.add(rs.getInt("Total"));         
          list.add(ReJudicial);

          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el RecepcionJudicial", "Error", JOptionPane.WARNING_MESSAGE);
          
         return list;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return list;
    }
  
}
