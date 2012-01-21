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

public class E_Causa { 


public static void leerArchivoExcel(String archivoDestino) { 


try { 
Workbook archivoExcel = Workbook.getWorkbook(new File( 
archivoDestino)); 
System.out.println("Número de Hojas\t"+archivoExcel.getNumberOfSheets()); 
for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre                                                                                                                                                     
{ 
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numColumnas = hoja.getColumns(); 
int numFilas = hoja.getRows(); 
String data;

System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
for (int fila = 0; fila < numFilas; fila++) { 
    
String[] causa = new String[]{"","","",""};
System.out.println("FILA: "+fila);
for (int columna = 0; columna < numColumnas; columna++) {                                                                                

data = hoja.getCell(columna, fila).getContents(); 
causa[columna]=convert(data);

}

Excel_to_SQL.causa(causa[2],causa[1],causa[3]);
Excel_to_SQL.remate_has_causa(causa[0], causa[2]);

} 
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
        if(aux>=65 & aux<=90 || aux>=48 & aux<=59 || aux==' ' || aux=='-' || aux=='/'){
        buffer+=unString.charAt(i);}
        
    }
    
    return buffer;
}


public static void main(String arg[]) { 
E_Causa.leerArchivoExcel("Causas_Rol.xls"); 
} 


}
