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

public class PDF {
    
     static ArrayList<String[]> lista_clientes = new ArrayList();
    
     public static ArrayList getDatos(String ROL){

        lista_clientes.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Cliente");
          
          while (rs.next()) {
          
          lista_clientes.add(new String[]{
          rs.getString("RUT"),
          rs.getString("ApellidoP")+" "+
          rs.getString("ApellidoM")+" "+
          rs.getString("Nombre"),
          rs.getString("TelefonoMovil"),
          rs.getString("Direccion"),
          rs.getString("Ciudad"),
          rs.getString("Comuna"),
          rs.getString("Email"),
          });
         
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro la lista_clientes", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_clientes;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_clientes;
    }
     
}
