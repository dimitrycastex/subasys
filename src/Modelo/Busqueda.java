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
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Busqueda {
    
    static ArrayList<ArrayList> lista_cliente = new ArrayList();
    static ArrayList<ArrayList> lista_factura = new ArrayList();
    static ArrayList<ArrayList> lista_remate = new ArrayList();
    static ArrayList<ArrayList> lista_producto = new ArrayList();
    static ArrayList<ArrayList> lista_causa = new ArrayList();
    static ArrayList<ArrayList> lista_recepcion_judicial = new ArrayList();
    
   
    public static void initClientes(){
    lista_cliente = Modelo.Cliente.get_Lista_Busqueda();
   // lista_factura = Modelo.Factura.get_Lista_Busqueda();
    //lista_producto = Modelo.Producto.get_Lista_Busqueda();
    //lista_causa = Modelo.Causa.get_Lista_Busqueda();
    lista_recepcion_judicial=Modelo.Recepcion_Judicial.get_Lista_Busqueda();
    
}
    public static void busca_cliente(String parametro,DefaultTableModel tmodel_cliente){
        
        String nombre = "";
        String apellidoP = "";
        String apellidoM = "";
        String nombre_c_d = "";
        String nombre_c_a = "";
        
        String RUT= "";
        //lista_cliente = Modelo.Cliente.get_Lista();
        int i=0;
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList cliente = it.next();
            RUT = cliente.get(0).toString();
            apellidoP = cliente.get(1).toString().trim();
            apellidoM = cliente.get(2).toString().trim();
            nombre = cliente.get(3).toString();
            nombre_c_d = nombre+" "+apellidoP+" "+apellidoM;
            nombre_c_a = apellidoP+" "+apellidoM+" "+nombre;
            
            if(nombre_c_d.toLowerCase().contains(parametro) || nombre_c_a.toLowerCase().contains(parametro)
                     || RUT.contains(parametro))
            {
                tmodel_cliente.insertRow(i, new Object[]{RUT,apellidoP,apellidoM,nombre,cliente.get(4),
                cliente.get(5),cliente.get(6)});
                i++;
            }
        }
        
    }
    
    public static void busqueda_causa(String parametro,DefaultTableModel model){
        
        
        String ROL = "";
        String Caratulado_como = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_causa.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            ROL = arrayList.get(0).toString();
            Caratulado_como = arrayList.get(3).toString().toLowerCase();
            if(ROL.contains(parametro) || 
                    Caratulado_como.contains(parametro)){
                model.insertRow(i, arrayList.toArray());
            i++;
        }
        
    }}
    
    public static void busqueda_producto(String parametro,DefaultTableModel model){
        
        
        
        String lote = "";
        String ID_REMATE = "";
        String Descripcion = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_producto.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            lote = arrayList.get(0).toString();
            ID_REMATE = arrayList.get(1).toString();
            Descripcion = arrayList.get(2).toString();
            if((lote+" "+ID_REMATE).toLowerCase().contains(parametro) ||
                    (ID_REMATE+" "+lote).toLowerCase().contains(parametro)
                    || Descripcion.toLowerCase().contains(parametro)){
                
                model.insertRow(i, arrayList.toArray());
                i++;
                
            }
               
            
        }
    }
    
    public static void busqueda_factura(String parametro,DefaultTableModel model){
        
        String nombre = "";
        String RUT = "";
        String apellidoP = "";
        String apellidoM = "";
        String nombre_c_d = "";
        String nombre_c_a = "";
        
        int i=0;
        for (Iterator<ArrayList> it = lista_factura.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            
            RUT = arrayList.get(1).toString();
            apellidoP = arrayList.get(2).toString().trim();
            apellidoM = arrayList.get(3).toString().trim();
            nombre = arrayList.get(4).toString();
            nombre_c_d = nombre+" "+apellidoP+" "+apellidoM;
            nombre_c_a = apellidoP+" "+apellidoM+" "+nombre;
            
            if(parametro.equalsIgnoreCase(arrayList.get(0).toString()))
            {
                model.insertRow(i,arrayList.toArray());
                i++;
            }
        
            else if(nombre_c_d.toLowerCase().contains(parametro) || nombre_c_a.toLowerCase().contains(parametro)
                    || RUT.contains(parametro)) {
                model.insertRow(i,arrayList.toArray());
                i++;
            }
            
        }
    }
    
    public static void busqueda_remate(String parametro,DefaultTableModel model){
             
        lista_remate = Modelo.Remate.get_Lista_Busqueda(parametro.toUpperCase());
        int i=0;
        for (Iterator<ArrayList> it = lista_remate.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            model.insertRow(i, arrayList.toArray());
            i++;
        }
    }
    
     public static void busqueda_recepcion_judicial(String parametro,DefaultTableModel model){
        
        
        String ROL = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_recepcion_judicial.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            ROL = arrayList.get(1).toString();
            if(ROL.contains(parametro)){
            model.insertRow(i, arrayList.toArray());
            i++;
        }
        
    }}
    
}
