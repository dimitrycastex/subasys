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

public class E_Remate { 


public static void leerArchivoExcel(String archivoDestino) { 

try { 
Workbook archivoExcel = Workbook.getWorkbook(new File( 
archivoDestino)); 
for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) 
                                                                                                                                                  
{ 
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numColumnas = hoja.getColumns(); 
int numFilas = hoja.getRows(); 
String data;
 
for (int fila = 1; fila < numFilas; fila++) { 
String[] remate = new String[]{"","","","","","","","",""};
for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                

data = hoja.getCell(columna, fila).getContents(); 

remate[columna]=convert(data);

}
Excel_to_SQL.remate(remate);


}
System.out.println("REMATE DONE");
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
E_Remate.leerArchivoExcel("Remates.xls"); 
} 

}
