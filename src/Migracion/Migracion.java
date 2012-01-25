/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Migracion;

import Modelo.Excel_to_SQL;

/**
 *
 * @author Deico
 */
public class Migracion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       E_Causa.leerArchivoExcel("Causas_Rol.xls");
       E_Cliente.leerArchivoExcel("clientes.xls");
       E_Producto.leerArchivoExcel("Causa_has_Producto.xls"); 
       E_Factura.leerArchivoExcel("Cliente_has_Factura.xls");
       E_Remate.leerArchivoExcel("Remates.xls");
       E_Factura_has_Producto.leerArchivoExcel("Factura_has_Producto.xls"); 
       Excel_to_SQL.get_Recepcion_Judicial_Table();
       E_Recepcion_judicial_has_producto.leerArchivoExcel("Causa_has_Producto.xls"); 
       E_Producto_Update.leerArchivoExcel("UPDATE_PRODUCTOS.xls");  
    }
}
