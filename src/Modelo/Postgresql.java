/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Deico
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Postgresql {

    /**
     * @param args the command line arguments
     */
    public static  Connection DB_CONNECTION = getConnection();
    
    public static void main(String[] args) {
        // TODO code application logic here
        //PDF.get_Lista_Clientes();
        //Excel_to_SQL.cliente("-", "-", "-", "-","-", "-", "-", "-");
        
       
    }
    
     public static Connection getConnection(){
      
     String driver = "org.postgresql.Driver";
     //String dbname = "Subasys";
     String dbname = "subasys";
      String url = "jdbc:postgresql://146.83.144.58:302/" +  dbname;
     //String url = "jdbc:postgresql://localhost/" +  dbname;
      String username = "subasys";
      String password = "cscv$38l";
     //String username = "postgres";
     //String password = "subasys";
        Connection conData = null;
       
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
        try {
            conData = DriverManager.getConnection(url,username,password);
            return conData;
        } catch (SQLException ex) {
            System.out.println(ex);
            return conData;
        }
        
     
  }
     
     public static void crearDBASE() {
   
        Connection conn  = DB_CONNECTION;
        try {


        java.sql.Statement stat = conn.createStatement();


        stat.executeUpdate( "CREATE TABLE Cliente ("+
	"RUT varchar NOT NULL,"+
	"ApellidoP varchar,"+
	"ApellidoM varchar,"+
	"Nombre varchar,"+
	"Email varchar,"+
	"Web varchar,"+
	"Telefono varchar,"+
	"CodigoPostal varchar,"+
	"Direccion varchar,"+
	"Ciudad varchar,"+
	"Comuna varchar,"+
	"PRIMARY KEY(RUT));");
        
        stat.executeUpdate("CREATE TABLE Recepcion_Voluntaria ("+
	"ID_RV SERIAL NOT NULL,"+
	"Fecha_Ingreso date,"+
	"Descripcion varchar,"+
	"RUT varchar NOT NULL,"+
	"PRIMARY KEY(ID_RV));");
        
        stat.executeUpdate("CREATE TABLE Causa ("+
	"ROL varchar NOT NULL,"+
	"Receptor varchar,"+
	"Abogado varchar,"+
	"Caratulado_como varchar,"+
	"Juzgado varchar,"+
	"ID_RJ int4 NOT NULL,"+
	"PRIMARY KEY(ROL));");
         
        stat.executeUpdate("CREATE TABLE Remate ("+
	"ID_REMATE varchar NOT NULL,"+
	"Lugar varchar,"+
	"Diario varchar,"+
	"Fecha date,"+
	"Descripcion varchar,"+
	"Comision int4,"+
	"Ciudad varchar,"+
	"PRIMARY KEY(ID_REMATE));");
         
        stat.executeUpdate("CREATE TABLE Producto ("+
	"ID_PRODUCTO SERIAL NOT NULL,"+
	"Descripcion varchar,"+
	"Cantidad int4,"+
	"Precio_Unitario int4,"+
	"Total int4,"+
	"Garantia int4,"+
        "Descripcion_Larga varchar,"+
	"PRIMARY KEY(ID_PRODUCTO));");
         
        stat.executeUpdate("CREATE TABLE Factura ("+
	"ID_FACTURA int4 NOT NULL,"+
	"Total float4,"+
	"Garantia int4,"+
	"Fecha_Emision date,"+
	"Estado varchar,"+
	"Exento varchar,"+
	"Neto float4,"+
	"Impuestos float4,"+
	"Comision float4,"+
	"IVA float4,"+
	"Comision_Factura float4,"+
	"PRIMARY KEY(ID_FACTURA));");
        
        stat.executeUpdate("CREATE TABLE Factura_has_Producto ("+
	"NMID SERIAL NOT NULL,"+
	"ID_FACTURA int4 NOT NULL,"+
	"ID_PRODUCTO int4 NOT NULL,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Recepcion_Judicial ("+
	"ID_RJ SERIAL NOT NULL,"+
	"Fecha_Ingreso date,"+
	"Fecha_Devolucion date,"+
	"Demandante varchar,"+
	"Demandado varchar,"+
	"Bodegaje_Pagado int4,"+
	"PRIMARY KEY(ID_RJ));");
         
        stat.executeUpdate("CREATE TABLE Recepcion_Judicial_has_Producto ("+
	"NMID SERIAL NOT NULL,"+
	"ID_RJ int4 NOT NULL,"+
	"ID_PRODUCTO int4 NOT NULL,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Remate_has_Causa ("+
	"NMID SERIAL NOT NULL,"+
	"ID_REMATE varchar NOT NULL,"+
	"ROL varchar NOT NULL,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Cliente_has_Factura ("+
	"NMID SERIAL NOT NULL,"+
	"RUT varchar NOT NULL,"+
	"ID_FACTURA int4 NOT NULL,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Remate_has_Factura ("+
	"NMID SERIAL NOT NULL,"+
	"ID_REMATE varchar NOT NULL,"+
	"ID_FACTURA int4 NOT NULL,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Remate_has_Producto ("+
	"NMID SERIAL NOT NULL,"+
	"ID_REMATE varchar NOT NULL,"+
	"ID_PRODUCTO int4 NOT NULL,"+
	"Lote int4,"+
	"PRIMARY KEY(NMID));");
        
        stat.executeUpdate("CREATE TABLE Recepcion_Voluntaria_has_Producto ("+
	"NMID SERIAL NOT NULL,"+
	"ID_RV int4 NOT NULL,"+
	"ID_PRODUCTO int4 NOT NULL,"+
	"PRIMARY KEY(NMID));");
 
        
        conn.close();
        
        } catch (SQLException error_conexion) {
          JOptionPane.showMessageDialog(null, error_conexion, "ERROR CONEXION", JOptionPane.WARNING_MESSAGE);
          System.exit(1);
        }

     }
   
     public static boolean Update() {

        try {

        java.sql.Statement stat = Postgresql.DB_CONNECTION.createStatement();

        stat.executeUpdate("UPDATE producto SET total='100' WHERE id_producto='2'");
      
        
        return true;

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null, ex, "ERROR", JOptionPane.WARNING_MESSAGE);
        return false;
        }

    }


}
