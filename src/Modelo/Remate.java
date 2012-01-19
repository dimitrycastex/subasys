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
          ResultSet rs = stat.executeQuery("select * from Remate where ID_REMATE="+ID_REMATE+"");
          
          while (rs.next()) {
          remate.add(rs.getInt("ID_REMATE"));
          remate.add(rs.getString("Lugar"));
          remate.add(rs.getInt("Diario"));
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
                    + " where ID_REMATE="+unaLista.get(0)+";");
             
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
  
}