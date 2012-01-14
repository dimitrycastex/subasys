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
       java.util.Date fecha = (java.sql.Date)unaLista.get(3);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
       
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Factura values (?,?,?,?,?,?,?,?,?,?,?);");
             
            //prep.setInt(1, Integer.parseInt(unaLista.get(0).toString()));
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
   
   public static ArrayList getDatos(String RUT){

        factura.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Factura where RUT='"+RUT+"'");
          
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
    
  public static boolean setUpdate(String RUT,ArrayList unaLista) {

        java.util.Date fecha1 = (Date)unaLista.get(3);
        
        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        
        
        stat.executeUpdate("update Factura set Total='"+Long.parseLong(unaLista.get(1).toString())+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Garantia='"+Long.parseLong(unaLista.get(2).toString())+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Fecha_Emision='"+fecha1.getTime()+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Estado='"+unaLista.get(4).toString()+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Exento='"+unaLista.get(5).toString()+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Neto='"+Long.parseLong(unaLista.get(6).toString())+"' where RUT = "+RUT+"");
        stat.executeUpdate("update Factura set Impuestos="+Integer.parseInt(unaLista.get(7).toString())+" where RUT = "+"'"+RUT+"'");
        stat.executeUpdate("update Factura set Comision="+Integer.parseInt(unaLista.get(8).toString())+" where RUT = "+"'"+RUT+"'");
        stat.executeUpdate("update Factura set IVA="+Integer.parseInt(unaLista.get(9).toString())+" where RUT = "+"'"+RUT+"'");
        stat.executeUpdate("update Factura set Comision_Factura="+Integer.parseInt(unaLista.get(10).toString())+" where RUT = "+"'"+RUT+"'");
       
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }

    }
  
}
