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

public class ReVoluntaria {
    
     public static ArrayList ReVoluntaria = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
       java.util.Date fecha = (java.sql.Date)unaLista.get(1);
       java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Voluntaria values (?,?,?,?);");
             
            //prep.setInt(1, Integer.parseInt(unaLista.get(0).toString())); 
            prep.setDate(2, fechaIngreso);
            prep.setString(3, unaLista.get(3).toString());  
            prep.setString(4, unaLista.get(4).toString());  
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ID_RJ){

        ReVoluntaria.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Recepcion_Voluntaria where ID_RJ="+ID_RJ+"");
          
          while (rs.next()) {
          ReVoluntaria.add(rs.getInt("ID_RV"));    
          ReVoluntaria.add(rs.getDate("Fecha_Ingreso"));
          ReVoluntaria.add(rs.getString("Direccion"));
          ReVoluntaria.add(rs.getString("Nombre"));



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
    
  public static boolean setUpdate(String ID_RV,ArrayList unaLista) {

        java.util.Date fecha1 = (Date)unaLista.get(1);

        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("update Recepcion_Voluntaria set Fecha_Ingreso='"+fecha1.getTime()+"' where ID_RV = "+ID_RV+"");
        stat.executeUpdate("update Recepcion_Voluntaria set Direccion='"+unaLista.get(3).toString()+"' where ID_RV = "+ID_RV+"");
        stat.executeUpdate("update Recepcion_Voluntaria set Nombre='"+unaLista.get(4).toString()+"' where ID_RV = "+ID_RV+"");
       
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }

    }
  
    
}
