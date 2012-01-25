/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Deico
 */

import java.lang.reflect.Array;
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
    static ArrayList<ArrayList> lista_recepcion_voluntaria = new ArrayList();
    static ArrayList<ArrayList> lista_producto_facturado = new ArrayList();
    static ArrayList<ArrayList> lista_remate_productos = new ArrayList();
    public static ArrayList buffer = new ArrayList();
   
    public static void initClientes(){lista_cliente = Modelo.Cliente.get_Lista_Busqueda();}
    public static void initProductosFac(){lista_producto_facturado = Modelo.Producto.get_Lista_Busqueda_Facturados();}
    public static void initRV(){lista_recepcion_voluntaria = Modelo.Recepcion_Voluntaria.get_Lista_Busqueda();}
    public static void initCausas(){lista_causa = Modelo.Causa.get_Lista_Busqueda();}
    public static void initFacturas(){lista_factura = Modelo.Factura.get_Lista_Busqueda();}
    public static void initProductos(){lista_producto = Modelo.Producto.get_Lista_Busqueda();}
    public static void initRJ(){lista_recepcion_judicial=Modelo.Recepcion_Judicial.get_Lista_Busqueda();}
    
    public static void initAll(){
        lista_cliente = Modelo.Cliente.get_Lista_Busqueda();
        lista_producto_facturado = Modelo.Producto.get_Lista_Busqueda_Facturados();
        lista_recepcion_voluntaria = Modelo.Recepcion_Voluntaria.get_Lista_Busqueda();
        lista_causa = Modelo.Causa.get_Lista_Busqueda();
        lista_factura = Modelo.Factura.get_Lista_Busqueda();
        lista_producto = Modelo.Producto.get_Lista_Busqueda();
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
                Object[] list = new Object[]{false,RUT,apellidoP,apellidoM,nombre,cliente.get(4),
                cliente.get(5),cliente.get(6)};
                tmodel_cliente.addRow(list);
                i++;
            }
        }
        
           
        
    }
    
    public static void busqueda_causa(String parametro,DefaultTableModel model){
        
        System.out.println(model.getRowCount());
        String ROL = "";
        String Caratulado_como = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_causa.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            ROL = arrayList.get(0).toString();
            Caratulado_como = arrayList.get(3).toString().toLowerCase();
           if(ROL.contains(parametro) || Caratulado_como.contains(parametro)
            ){
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
            i++;
            }
        
    }
    System.out.println("->"+model.getRowCount());
    
    }
    
    public static void busqueda_producto(String parametro,DefaultTableModel model){
        
        
        
        String lote = "";
        String ID_REMATE = "";
        String Descripcion = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_producto.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            lote = arrayList.get(1).toString();
            ID_REMATE = arrayList.get(2).toString();
            Descripcion = arrayList.get(3).toString();
            if((lote+" "+ID_REMATE).toLowerCase().contains(parametro) ||
                    (ID_REMATE+" "+lote).toLowerCase().contains(parametro)
                    || Descripcion.toLowerCase().contains(parametro)){
                
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.addRow(buffer.toArray());
                i++;
                
            }
               
            
        }
    }
    
    public static void busqueda_producto_facturado(String parametro,DefaultTableModel model){
        
        
        
        String RUT = "";
        String ID_FACTURA = "";
        String Descripcion = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_producto_facturado.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            RUT = arrayList.get(2).toString();
            ID_FACTURA = arrayList.get(1).toString();
            Descripcion = arrayList.get(6).toString();
            if(ID_FACTURA.toLowerCase().equalsIgnoreCase(parametro) ){
                 
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
                i++;
               
            }
            
            else if(ID_FACTURA.toLowerCase().contains(parametro) ||
               RUT.contains(parametro) ||
               Descripcion.toLowerCase().contains(parametro)){
                
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
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
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
                i++;
                break;
            }
        
            else if(nombre_c_d.toLowerCase().contains(parametro) || nombre_c_a.toLowerCase().contains(parametro)
                    || RUT.contains(parametro)) {
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
                i++;
            }
            
        }
    }
    
    public static void busqueda_remate(String parametro,DefaultTableModel model){
             
        lista_remate = Modelo.Remate.get_Lista_Busqueda(parametro.toUpperCase());
        int i=0;
        for (Iterator<ArrayList> it = lista_remate.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
            i++;
        }
    }
    
    public static void busqueda_remate_productos(String parametro,DefaultTableModel model){
             
        lista_remate_productos = Modelo.Remate.get_Lista_Productos(parametro.toUpperCase());
        int i=0;
        for (Iterator<ArrayList> it = lista_remate_productos.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
            i++;
        }
    }
    
     public static void busqueda_recepcion_judicial(String parametro,DefaultTableModel model){
        
        
        String ROL = "";
        int i=0;
        for (Iterator<ArrayList> it = lista_recepcion_judicial.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            ROL = arrayList.get(1).toString().toLowerCase();
            if(ROL.contains(parametro)){
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                model.insertRow(i, buffer.toArray());
            i++;
        }
        
    }}
     
     
      public static void busqueda_recepcion_voluntaria(String parametro,DefaultTableModel model){
        
  
        int i=0;
        for (Iterator<ArrayList> it = lista_recepcion_voluntaria.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            if(arrayList.get(0).toString().contains(parametro)){
                buffer.clear();
                buffer.add(false);
                buffer.addAll(arrayList);
                System.out.println(arrayList.add(0));
                model.insertRow(i, buffer.toArray());
            i++;
        }
        
    }}
    public static void cleanModel(DefaultTableModel model){
    int a =model.getRowCount()-1;

    for (int i = a; i >=0; i--) {
        model.removeRow(i);
        
    }

    
}
}
