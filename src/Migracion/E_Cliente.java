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

public class E_Cliente { 

public static void leerArchivoExcel(String archivoDestino) { 

try { 
Workbook archivoExcel = Workbook.getWorkbook(new File( 
archivoDestino)); 
System.out.println("Número de Hojas\t" + archivoExcel.getNumberOfSheets()); 
for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++)                                                                                                                                                     
{ 
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numColumnas = hoja.getColumns(); 
int numFilas = hoja.getRows(); 
String data;

System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
for (int fila = 0; fila < numFilas; fila++) {
String ApeP = "";
String ApeM = "";
String Nombre = "";
String RUT = "";
String Direccion = "";
String Telefono = "";
String Ciudad = "";
String Comuna = "";
boolean flag = true;
System.out.println("FILA: "+fila);
for (int columna = 0; columna < numColumnas; columna++) {                                                                               
data = hoja.getCell(columna, fila).getContents(); 
if(columna==0){
    RUT = convert(data);
}
else if(columna==1){
    
       String[] cliente = convert(data).split(" ");
    
        
        if(cliente.length>2){
        for (int i = 2; i < cliente.length; i++) {
        String string = cliente[i];
        if(i!=cliente.length-1)Nombre+=string+" ";
        else Nombre+=string;
        }
        ApeP = cliente[0];
        ApeM = cliente[1];
       }
        else if(cliente.length==1)
        ApeP = cliente[0];
        else flag=false;
}
else if(columna==2){
    Direccion = convert(data);
}
else if(columna==3){
    Ciudad = convert(data);
}
else if(columna==4){
    Telefono = convert(data);
}
else if(columna==5){
    Comuna = convert(data);
}

}
if(flag)Excel_to_SQL.cliente(RUT, ApeP, ApeM, Nombre, Direccion, Ciudad, Telefono, Comuna);


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
        if(aux>=65 & aux<=90 || aux>=48 & aux<=59 || aux==' '){
        buffer+=unString.charAt(i);}
        
    }
    
    return buffer;
}

public static void main(String arg[]) {  
E_Cliente.leerArchivoExcel("clientes.xls"); 
} 

}
