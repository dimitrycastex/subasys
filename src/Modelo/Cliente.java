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

public class Cliente {
    
  public static ArrayList cliente = new ArrayList();
   
   public static void nuevo(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Cliente values (?,?,?,?,?,?,?,?,?,?,?);");
             
            prep.setString(1, unaLista.get(0).toString());
            prep.setString(2, unaLista.get(1).toString());
            prep.setString(3, unaLista.get(2).toString());
            prep.setString(4, unaLista.get(3).toString());
            prep.setString(5, unaLista.get(4).toString());
            prep.setString(6, unaLista.get(5).toString());
            prep.setString(7, unaLista.get(6).toString());            
            prep.setInt(8, Integer.parseInt(unaLista.get(7).toString()));
            prep.setString(9, unaLista.get(8).toString());   
            prep.setString(10, unaLista.get(9).toString());
            prep.setInt(11, Integer.parseInt(unaLista.get(10).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   
    
     
   public static ArrayList getDatos(String RUT){

        cliente.clear();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Cliente where RUT="+"'"+RUT+"'");
          
          while (rs.next()) {
          cliente.add(rs.getInt("RUT"));
          cliente.add(rs.getString("ApellidoP"));
          cliente.add(rs.getString("ApellidoM"));
          cliente.add(rs.getString("Nombre"));
          cliente.add(rs.getString("Email"));
          cliente.add(rs.getString("Web"));
          cliente.add(rs.getString("Telefono"));         
          cliente.add(rs.getInt("CodigoPostal"));
          cliente.add(rs.getString("Direccion")); 
          cliente.add(rs.getString("Ciudad"));
          cliente.add(rs.getString("Comuna")); 
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el cliente", "Error", JOptionPane.WARNING_MESSAGE);
          
         return cliente;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return cliente;
    }
    
   public static void setUpdate(ArrayList unaLista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "update Cliente set ApellidoP=?,ApellidoM=?,Nombre=?,Email=?,"
                    + "Web=?,Telefono=?,CodigoPostal=?,Direccion=?,"
                    + "Ciudad=?,Comuna=? where RUT='"+unaLista.get(0)+"';");
             
            prep.setString(1, unaLista.get(1).toString());
            prep.setString(2, unaLista.get(2).toString());
            prep.setString(3, unaLista.get(3).toString());
            prep.setString(4, unaLista.get(4).toString());
            prep.setString(5, unaLista.get(5).toString());
            prep.setString(6, unaLista.get(6).toString());            
            prep.setInt(7, Integer.parseInt(unaLista.get(7).toString()));
            prep.setString(8, unaLista.get(8).toString());   
            prep.setString(9, unaLista.get(9).toString());
            prep.setInt(10, Integer.parseInt(unaLista.get(10).toString()));
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList get_Lista(){

        ArrayList lista_clientes = new ArrayList();
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select * from Cliente;");
          
          while (rs.next()) {
          cliente.clear();
          cliente.add(rs.getInt("RUT"));
          cliente.add(rs.getString("ApellidoP"));
          cliente.add(rs.getString("ApellidoM"));
          cliente.add(rs.getString("Nombre"));
          cliente.add(rs.getString("Email"));
          cliente.add(rs.getString("Web"));
          cliente.add(rs.getString("Telefono"));         
          cliente.add(rs.getInt("CodigoPostal"));
          cliente.add(rs.getString("Direccion")); 
          cliente.add(rs.getString("Ciudad"));
          cliente.add(rs.getString("Comuna"));
          lista_clientes.add(cliente);
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el cliente", "Error", JOptionPane.WARNING_MESSAGE);
          
         return lista_clientes;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return lista_clientes;
    }
   
}
