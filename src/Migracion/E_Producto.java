/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Migracion;

/**
 *
 * @author Deico
 */
import Modelo.*;
import jxl.*; 
import java.io.*; 
import java.util.ArrayList;
import java.util.Iterator;

public class E_Producto { 

public static void leerArchivoExcel(String archivoDestino) { 

try { 
Workbook archivoExcel = Workbook.getWorkbook(new File( 
archivoDestino)); 
//System.out.println("Número de Hojas\t" + archivoExcel.getNumberOfSheets()); 
for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++)                                                                                                                                                     
{ 
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numColumnas = hoja.getColumns(); 
int numFilas = hoja.getRows(); 
String data;

//System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
for (int fila = 1; fila < numFilas; fila++) { 
String[] producto = new String[]{"","","","","","","","",""};
for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                

data = hoja.getCell(columna, fila).getContents(); 
producto[columna]=convert(data);

}
Excel_to_SQL.producto(producto);
Excel_to_SQL.remate_has_producto(producto[0], fila, convertNumber(producto[1]));


} 
System.out.println("PRODUCTO DONE");
}

} catch (Exception ioe) { 
  ioe.printStackTrace(); 

} 

} 

public static String convert(String unString){
    
    String buffer="";
    
    int aux = 0;
    for (int i = 0; i < unString.length(); i++) {
        aux = unString.charAt(i);
        if(aux>=65 & aux<=90 || aux>=48 & aux<=59 || aux==' ' || aux=='-'){
        buffer+=unString.charAt(i);}
        
    }
    
    return buffer;
}

public static int convertNumber(String unString){
    
    String buffer="";
    
    int aux = 0;
    for (int i = 0; i < unString.length(); i++) {
        aux = unString.charAt(i);
        if(aux>=48 & aux<=59){
        buffer+=unString.charAt(i);}
        
    }
    if(!buffer.isEmpty())
    return Integer.parseInt(buffer);
    else return 0;
}

public static void main(String arg[]) { 
E_Producto.leerArchivoExcel("Causa_has_Producto.xls"); 
} 


}
