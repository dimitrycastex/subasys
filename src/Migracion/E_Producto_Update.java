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

public class E_Producto_Update { 

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
int l=0;
//System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
for (int fila = 1; fila < numFilas; fila++) { 
String[] producto = new String[]{"","","","","","","","",""};
ArrayList list = new ArrayList();
for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                

data = hoja.getCell(columna, fila).getContents(); 
producto[columna]=convert(data);

}
int x = Producto.getID_Producto(producto[0], convertNumber(producto[1]));
if(x==0){
    System.out.println(l);
    l++;
}
list.add(x);
list.add(producto[2]);
list.add(producto[3]);
list.add(producto[4]);
list.add(producto[5]);
Producto.setUpdateMigracion(list);
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
E_Producto_Update.leerArchivoExcel("UPDATE_PRODUCTOS.xls"); 
} 


}
