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

public class E_Factura { 

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
String[] factura = new String[]{"","","","","","","","","","","","","","",""};

for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                

data = hoja.getCell(columna, fila).getContents(); 
factura[columna]=convert(data);

}
Excel_to_SQL.factura(factura);
Excel_to_SQL.cliente_has_factura(filtraRut(factura[3]), convertNumber(factura[0]));
Excel_to_SQL.remate_has_factura(factura[2], convertNumber(factura[0]));
} 
System.out.println("FACTURAS DONE");
}

} catch (Exception ioe) { 
ioe.printStackTrace(); 

} 

} 

public static String filtraRut(String rut){
        
        String rut_aux = "";
        boolean flag = true;
        for (int i = 0; i < rut.length(); i++) {
           
            if(rut.charAt(i)=='0' && flag){
               
            }else{
                flag=false;
            }
             if(!flag){
                  rut_aux+=rut.charAt(i);
             }
        }
        return rut_aux;
        
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

E_Factura.leerArchivoExcel("Cliente_has_Factura.xls"); 
} 

}
