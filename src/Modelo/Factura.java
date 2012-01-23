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

public class Factura {
    
    public static ArrayList factura = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
       java.util.Date fecha = (java.util.Date)unaLista.get(3);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
       
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Factura values (?,?,?,?,?,?,?,?,?,?,?);");
             
            prep.setInt(1, Integer.parseInt(unaLista.get(0).toString()));
            prep.setLong(2, Long.parseLong(unaLista.get(1).toString()));
            prep.setLong(3, Long.parseLong(unaLista.get(2).toString()));
            prep.setDate(4, fechaIngreso);
            prep.setString(5, unaLista.get(4).toString());  
            prep.setString(6, unaLista.get(5).toString());
            prep.setLong(7, Long.parseLong(unaLista.get(6).toString()));
            prep.setInt(8, Integer.parseInt(unaLista.get(7).toString()));
            prep.setInt(9, Integer.parseInt(unaLista.get(8).toString()));
            prep.setInt(10, Integer.parseInt(unaLista.get(9).toString()));
            prep.setInt(11, Integer.parseInt(unaLista.get(10).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ID_FACTURA){

        factura.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Factura where ID_FACTURA="+ID_FACTURA+"");
          
          while (rs.next()) {
          factura.add(rs.getInt("RUT"));
          factura.add(rs.getLong("Total"));
          factura.add(rs.getLong("Garantia"));
          factura.add(rs.getDate("Fecha_Emision"));
          factura.add(rs.getString("Estado"));
          factura.add(rs.getString("Exento"));
          factura.add(rs.getLong("Neto"));
          factura.add(rs.getInt("Impuestos"));
          factura.add(rs.getInt("Comision"));  
          factura.add(rs.getInt("IVA"));     
          factura.add(rs.getInt("comision_Factura"));


          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro la Factura", "Error", JOptionPane.WARNING_MESSAGE);
          
         return factura;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return factura;
    }
    
    public static void setUpdate(ArrayList unaLista)
 {
       java.util.Date fecha = (java.sql.Date)unaLista.get(3);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
       
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "update Factura set Total=?,Garantia=?,Fecha_Emision=?,Estado=?,"
                    + "Exento=?,Neto=?,Impuestos=?,Comision=?,IVA=?,"
                    + "Comision_Factura=? where ID_FACTURA="+unaLista.get(0)+";");
            
            prep.setLong(1, Long.parseLong(unaLista.get(1).toString()));
            prep.setLong(2, Long.parseLong(unaLista.get(2).toString()));
            prep.setDate(3, fechaIngreso);
            prep.setString(4, unaLista.get(4).toString());  
            prep.setString(5, unaLista.get(5).toString());
            prep.setLong(6, Long.parseLong(unaLista.get(6).toString()));
            prep.setInt(7, Integer.parseInt(unaLista.get(7).toString()));
            prep.setInt(8, Integer.parseInt(unaLista.get(8).toString()));
            prep.setInt(9, Integer.parseInt(unaLista.get(9).toString()));
            prep.setInt(10, Integer.parseInt(unaLista.get(10).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
    public static ArrayList<ArrayList> get_Lista(){

        ArrayList<ArrayList> lista_facturas = new ArrayList();

       
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Factura;");
          
          while (rs.next()) {
          ArrayList factura = new ArrayList();
          factura.clear();
          factura.add(rs.getInt("ID_FACTURA"));
          factura.add(rs.getLong("Total"));
          factura.add(rs.getLong("Garantia"));
          factura.add(rs.getDate("Fecha_Emision"));
          factura.add(rs.getString("Estado"));
          factura.add(rs.getString("Exento"));
          factura.add(rs.getLong("Neto"));
          factura.add(rs.getInt("Impuestos"));
          factura.add(rs.getInt("Comision"));  
          factura.add(rs.getInt("IVA"));     
          factura.add(rs.getInt("comision_Factura"));

          lista_facturas.add(factura);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro la Factura", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_facturas;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_facturas;
    }
    
    
    public static ArrayList<ArrayList> get_Lista_Busqueda(){

        ArrayList<ArrayList> lista_facturas = new ArrayList();

       
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("SELECT * FROM cliente NATURAL join cliente_has_factura NATURAL JOIN factura");
          
          while (rs.next()) {
          ArrayList factura = new ArrayList();
          factura.clear();
          factura.add(rs.getInt("ID_FACTURA"));
          factura.add(rs.getString("RUT"));
          factura.add(rs.getString("ApellidoP"));
          factura.add(rs.getString("ApellidoM"));
          factura.add(rs.getString("Nombre"));
          factura.add(rs.getLong("Total"));
          factura.add(rs.getLong("Garantia"));
          factura.add(rs.getDate("Fecha_Emision"));
          factura.add(rs.getString("Estado"));
          factura.add(rs.getString("Exento"));
          factura.add(rs.getLong("Neto"));
          factura.add(rs.getInt("Impuestos"));
          factura.add(rs.getInt("Comision"));  
          factura.add(rs.getInt("IVA"));     
          factura.add(rs.getInt("comision_Factura"));

          lista_facturas.add(factura);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro la Factura", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_facturas;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_facturas;
    }
}
