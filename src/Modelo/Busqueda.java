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
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Busqueda {
    
    static ArrayList<ArrayList> lista_cliente = new ArrayList();
    static ArrayList<ArrayList> lista_factura = new ArrayList();
    static ArrayList<ArrayList> lista_remate = new ArrayList();
    static ArrayList<ArrayList> lista_producto = new ArrayList();
    static ArrayList<ArrayList> lista_causa = new ArrayList();
    
   
    public static void initClientes(){
    lista_cliente = Modelo.Cliente.get_Lista_Busqueda();
    lista_factura = Modelo.Factura.get_Lista_Busqueda();
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
    
    public static void busqueda_causa(String parametro){
        
        lista_causa = Modelo.Causa.get_Lista();
        String ROL = "";
        String Caratulado_como = "";
        
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            ROL = arrayList.get(0).toString();
            Caratulado_como = arrayList.get(3).toString();
            if(ROL.toLowerCase().contains(parametro) || 
                    Caratulado_como.toLowerCase().contains(parametro))
                System.out.println(ROL);
        }
        
    }
    
    public static void busqueda_producto(String parametro){
        
        lista_producto = Modelo.Producto.get_Lista_Busqueda();
        
        String lote = "";
        String ID_REMATE = "";
        String Descripcion = "";
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            lote = arrayList.get(0).toString();
            ID_REMATE = arrayList.get(1).toString();
            Descripcion = arrayList.get(2).toString();
            if((lote+" "+ID_REMATE).toLowerCase().contains(parametro) ||
                    (ID_REMATE+" "+lote).toLowerCase().contains(parametro)
                    || Descripcion.toLowerCase().contains(parametro))
                System.out.println(arrayList.get(3));
            
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
                model.insertRow(i, new Object[]{arrayList.get(0),arrayList.get(1),
                arrayList.get(2)+" "+arrayList.get(3)+" "+arrayList.get(4),arrayList.get(5),
                arrayList.get(6),arrayList.get(7),arrayList.get(8),arrayList.get(9),
                arrayList.get(10),arrayList.get(11),arrayList.get(12),arrayList.get(13)});
                i++;
            }
        
            else if(nombre_c_d.toLowerCase().contains(parametro) || nombre_c_a.toLowerCase().contains(parametro)
                    || RUT.contains(parametro)) {
                 model.insertRow(i, new Object[]{arrayList.get(0),arrayList.get(1),
                arrayList.get(2)+" "+arrayList.get(3)+" "+arrayList.get(4),arrayList.get(5),
                arrayList.get(6),arrayList.get(7),arrayList.get(8),arrayList.get(9),
                arrayList.get(10),arrayList.get(11),arrayList.get(12),arrayList.get(13)});
                i++;
            }
            
        }
    }
    
    public static void remate(String parametro){
        
        lista_remate = Modelo.Remate.get_Lista_Busqueda(parametro);
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            System.out.println(arrayList.get(0));
            if(arrayList.get(0).toString().equalsIgnoreCase(parametro)){
                System.out.println(arrayList.get(0));
            }
        }
    }
    
}
