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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Excel_to_SQL {
    
     public static void cliente(String RUT,String ApeP,String ApeM,String Nombre,
             String Direccion,String Ciudad,String Telefono,String Comuna)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Cliente (RUT,ApellidoP,ApellidoM,Nombre,Direccion,"
                    + "Ciudad,Telefono,Comuna) values (?,?,?,?,?,?,?,?);");
             
            prep.setString(1, RUT);
            prep.setString(2, ApeP);
            prep.setString(3, ApeM);
            prep.setString(4, Nombre);
            prep.setString(5, Direccion);
            prep.setString(6, Ciudad);
            prep.setString(7, Telefono);
            prep.setString(8, Comuna);
           
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
      public static void causa(String ROL,String juzgado,String caratulado_como)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Causa (ROL,Juzgado,Caratulado_como,ID_RJ) values (?,?,?,?);");
             
            prep.setString(1, ROL);
            prep.setString(2, juzgado);
            prep.setString(3, caratulado_como);
            prep.setInt(4, 0);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
      
      public static void remate_has_causa(String ID_REMATE,String ROL)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Causa (ID_REMATE,ROL) values (?,?);");
             
            prep.setString(1, ID_REMATE);
            prep.setString(2, ROL);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
      
      
 public static void factura(String[] lista)
 {
     
       String fecha=lista[1]; 
        SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy"); 
        java.util.Date d = null; 
        try {
            d = sdf.parse(fecha);
        } catch (ParseException ex) {
        }
      
        java.sql.Date fechaEmision = new java.sql.Date(d.getTime());
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Factura (ID_FACTURA,Fecha_Emision,Estado,Exento,IVA,Neto,Impuestos,"
                    + "Comision_Factura,Total,Garantia,Comision) values (?,?,?,?,?,?,?,?,?,?,?);");
             
            prep.setInt(1, Integer.parseInt(lista[0]));
            prep.setDate(2, fechaEmision);
            prep.setString(3, lista[4]);
            prep.setString(4, lista[5]);
            prep.setInt(5, Integer.parseInt(lista[6]));
            prep.setLong(6,Long.parseLong(lista[7]));
            prep.setInt(7, Integer.parseInt(lista[8]));
            prep.setInt(8, Integer.parseInt(lista[9]));
            prep.setLong(9, Long.parseLong(lista[11]));
            prep.setLong(10, Long.parseLong(lista[12]));
            prep.setInt(11, Integer.parseInt(lista[13]));
            
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
      
       public static void cliente_has_factura(String RUT,int ID_FACTURA)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Cliente_has_Factura (RUT,ID_FACTURA) values (?,?);");

            prep.setString(1, RUT);
            prep.setInt(2, ID_FACTURA);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }    
       
       public static void remate_has_factura(String ID_REMATE,int ID_FACTURA)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Factura (ID_REMATE,ID_FACTURA) values (?,?);");
             
            prep.setString(1, ID_REMATE);
            prep.setInt(2, ID_FACTURA);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
       
    public static void producto(String[] lista)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Producto (Descripcion,Cantidad,Precio_Unitario,"
                    + "Total,Garantia,Descripcion_Larga) values (?,?,?,?,?,?);");
            /*
            prep.setString(1, lista[3]);               
            prep.setInt(2,Integer.parseInt(lista[4]) );
            prep.setInt(3,Integer.parseInt(lista[5]));
            prep.setInt(4,Integer.parseInt(lista[7]));
            prep.setInt(5,Integer.parseInt(lista[6]) );
            prep.setString(6, "");    */
            
             prep.setString(1, lista[2]);               
            prep.setInt(2,1 );
            prep.setInt(3,0);
            prep.setInt(4,0);
            prep.setInt(5,0 );
            prep.setString(6, "");
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
         public static void factura_has_producto(int ID_FACTURA,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Factura_has_Producto (ID_FACTURA,ID_PRODUCTO) values (?,?);");
             
            prep.setInt(1, ID_FACTURA);
            prep.setInt(2, ID_PRODUCTO);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
         
  public static void remate_has_producto(String ID_REMATE,int ID_PRODUCTO,int Lote)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate_has_Producto (ID_REMATE,ID_PRODUCTO,Lote) values (?,?,?);");
             
            prep.setString(1, ID_REMATE);
            prep.setInt(2, ID_PRODUCTO);
            prep.setInt(3, Lote);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
  
  
   public static void remate(String[] lista) throws ParseException
 {
       String fecha=lista[2]; 
       SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy"); 
       java.util.Date d=sdf.parse(fecha); 
       java.sql.Date fechaEmision = new java.sql.Date(d.getTime());
      
            
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Remate (ID_REMATE,Lugar,Diario,Fecha,Descripcion,Comision,Ciudad)"
                    + " values (?,?,?,?,?,?,?);");
            prep.setString(1, lista[0]);
            prep.setString(2, lista[3]);
            prep.setString(3, lista[6]);  
            prep.setDate(4, fechaEmision);
            prep.setString(5, lista[1]);  
            prep.setInt(6, Integer.parseInt(lista[4]));
            prep.setString(7, lista[5]);  

          
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   public static ArrayList get_Recepcion_Judicial_Table(){

        ArrayList list = new ArrayList();
        boolean flag = false;
        
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select Causa.ROL,Causa.Caratulado_como from Causa;");
          int i=1;
          while (rs.next()) {
          recepcion_judicial(rs.getString("Caratulado_como"));
          setUpdate(rs.getString("ROL"),i);
          i++;
          flag=true;
          }
          rs.close();
          
          if(!flag)JOptionPane.showMessageDialog(null, "No se encontro el cliente", "Error", JOptionPane.WARNING_MESSAGE);
          
         return list;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return list;
    }
   
   public static void setUpdate(String ROL,int ID_RJ)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "UPDATE Causa set ID_RJ=? "
                    + "where ROL='"+ROL+"'");
             
            prep.setInt(1,ID_RJ );
                   
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   
   
     public static void recepcion_judicial(String caratulado_como)
 {
        
        //java.sql.Date fechaIngreso = new java.sql.Date(fecha.getTime());
        
        String demandante = "";
        String demandado = "";
        
        if(caratulado_como.contains("/") && caratulado_como.split("/").length==2){
        String[] aux = caratulado_como.split("/");
        demandante+=aux[0];
        demandado+=aux[1];
        }

        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Judicial (Demandante,Demandado) values (?,?);");

            prep.setString(1, demandante);  
            prep.setString(2, demandado);  
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
     
     
      public static int getDatosID_PRODUCTO(String id_remate,int lote){

       int aux = 0;
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select ID_PRODUCTO from Remate_has_Producto "
                  + "where Lote="+lote+" and ID_REMATE='"+id_remate+"';");
          int i=1;
          while (rs.next()) {
          aux=rs.getInt("ID_PRODUCTO");
          i++;
          flag=true;
          }
          rs.close();
          
         if(!flag)
                System.out.println(lote+"-"+id_remate);
          
         return aux;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return aux;
    }
   
      public static int getDatosID_RJ(String rol){

       int aux = 0;
        boolean flag = false;
        try {

          java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();
          ResultSet rs = stat.executeQuery("select ID_RJ from Causa "
                  + "where ROL='"+rol+"';");
          int i=1;
          while (rs.next()) {
          aux=rs.getInt("ID_RJ");
          i++;
          flag=true;
          }
          rs.close();
   
         return aux;

         } catch (SQLException ex) { 
         JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
         }
         return aux;
    }
      
        public static void recepcion_judicial_has_producto(int ID_RJ,int ID_PRODUCTO)
 {
                
        try {

            PreparedStatement prep = Postgresql.DB_CONNECTION.prepareStatement(
            "insert into Recepcion_Judicial_has_Producto (ID_RJ,ID_PRODUCTO) values (?,?);");
             
            prep.setInt(1, ID_RJ);
            prep.setInt(2, ID_PRODUCTO);
            prep.executeUpdate();
            
            } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
         
}





