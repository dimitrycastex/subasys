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

public class ReJudicial {
    
   public static ArrayList ReJudicial = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
        java.util.Date fecha = (java.sql.Date)unaLista.get(1);
        java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
        fecha = (java.sql.Date)unaLista.get(2);
        java.sql.Date fechaDevolucion =  new java.sql.Date(fecha.getTime());
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Judicial values (?,?,?,?,?,?);");
             
            //prep.setInt(1, Integer.parseInt(unaLista.get(0).toString())); 
            prep.setDate(2, fechaIngreso);
            prep.setDate(3, fechaDevolucion);
            prep.setString(4, unaLista.get(3).toString());  
            prep.setString(5, unaLista.get(4).toString());  
            prep.setInt(6, Integer.parseInt(unaLista.get(5).toString()));
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
          ReJudicial.add(rs.getString("Demandante"));
          ReJudicial.add(rs.getInt("Demandado"));         
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
    
  public static boolean setUpdate(String ID_RJ,ArrayList unaLista) {

        java.util.Date fecha1 = (Date)unaLista.get(1);
        java.util.Date fecha2 = (Date)unaLista.get(2);
        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("update Recepcion_Judicial set Fecha_Ingreso='"+fecha1.getTime()+"' where ID_RJ = "+ID_RJ+"");
        stat.executeUpdate("update Recepcion_Judicial set Fecha_Devolucion='"+fecha2.getTime()+"' where ID_RJ = "+ID_RJ+"");
        stat.executeUpdate("update Recepcion_Judicial set Demandante='"+unaLista.get(3).toString()+"' where ID_RJ = "+ID_RJ+"");
        stat.executeUpdate("update Recepcion_Judicial set Demandado='"+unaLista.get(4).toString()+"' where ID_RJ = "+ID_RJ+"");
        stat.executeUpdate("update Recepcion_Judicial set Bodegaje_Pagado="+Integer.parseInt(unaLista.get(5).toString())+" where ID_RJ = "+"'"+ID_RJ+"'");
        
       
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }

    }
  
}
