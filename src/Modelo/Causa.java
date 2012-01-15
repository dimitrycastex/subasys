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

public class Causa {

   public static ArrayList causa = new ArrayList();
   
   public static void nueva(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Causa values (?,?,?,?,?,?);");
             
            prep.setString(1, unaLista.get(0).toString());
            prep.setString(2, unaLista.get(1).toString());
            prep.setString(3, unaLista.get(2).toString());
            prep.setString(4, unaLista.get(3).toString());
            prep.setString(5, unaLista.get(4).toString());
            prep.setInt(6, Integer.parseInt(unaLista.get(5).toString()));           
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList getDatos(String ROL){

        causa.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Causa where ROL="+"'"+ROL+"'");
          
          while (rs.next()) {
          causa.add(rs.getString("ROL"));
          causa.add(rs.getString("Receptor"));
          causa.add(rs.getString("Abogado"));
          causa.add(rs.getString("Caratulado_como"));
          causa.add(rs.getString("Juzgado"));
          causa.add(rs.getInt("ID_RJ"));
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro la causa", "Error", JOptionPane.WARNING_MESSAGE);
          
         return causa;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return causa;
    }
    
  
   public static void setUpdate(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "UPDATE Causa set Receptor=?,Abogado=?,Caratulado_como=?,Juzgado=?,ID_RJ=? "
                    + "where ROL='"+unaLista.get(0)+"'");
             
            prep.setString(1, unaLista.get(1).toString());
            prep.setString(2, unaLista.get(2).toString());
            prep.setString(3, unaLista.get(3).toString());
            prep.setString(4, unaLista.get(4).toString());
            prep.setInt(5, Integer.parseInt(unaLista.get(5).toString()));           
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  
      
}
