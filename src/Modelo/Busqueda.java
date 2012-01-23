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
    lista_cliente = Modelo.Cliente.get_Lista();
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
                System.out.println(RUT+" "+nombre+ " "+ apellidoM);
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
    
    public static void busqueda_factura(String parametro){
        
        lista_factura = Modelo.Factura.get_Lista();
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            if(arrayList.get(0).toString().equalsIgnoreCase(parametro)){
                System.out.println(arrayList.get(0));
            }
        }
    }
    
    public static void remate(String parametro){
        
        lista_remate = Modelo.Remate.get_Lista();
        for (Iterator<ArrayList> it = lista_cliente.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            if(arrayList.get(0).toString().equalsIgnoreCase(parametro)){
                System.out.println(arrayList.get(0));
            }
        }
    }
    
}
