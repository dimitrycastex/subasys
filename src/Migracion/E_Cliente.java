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
ArrayList<String> Lista = new ArrayList();


private ArrayList<String> leerArchivoExcel(String archivoDestino) { 

Lista.clear();
try { 
Workbook archivoExcel = Workbook.getWorkbook(new File( 
archivoDestino)); 
System.out.println("Número de Hojas\t" 
+ archivoExcel.getNumberOfSheets()); 
for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre 
// cada    
// hoja                                                                                                                                                       
{ 
Sheet hoja = archivoExcel.getSheet(sheetNo); 
int numColumnas = hoja.getColumns(); 
int numFilas = hoja.getRows(); 
String data;



System.out.println("Nombre de la Hoja\t" 
+ archivoExcel.getSheet(sheetNo).getName()); 
for (int fila = 0; fila < numFilas; fila++) { // Recorre cada 
// fila de la 
// hoja
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
for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                
// cada                                                                                
// columna                                                                            
// de                                                                                
// la                                                                                
// fila 
data = hoja.getCell(columna, fila).getContents(); 
//System.out.println(data + " "+data.length()+" "+convert(data)+" "+convert(data).length()+" "+convert(data).equals("NE-0401-11")); 
if(columna==0){
    RUT = convert(data);
}
else if(columna==1){
    
    String[] cliente = convert(data).split(" ");
    if(cliente.length==4){
        ApeP = cliente[0];
        ApeM = cliente[1];
        Nombre = cliente[2]+" "+cliente[3];
    }
    else if(cliente.length==3){
         ApeP = cliente[0];
        ApeM = cliente[1];
        Nombre = cliente[2];
    }
    else if(cliente.length==2){
        ApeP = cliente[0];
        ApeM = cliente[1];
        Nombre = "-";
    }
    
    if(cliente.length==0) flag=false;
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
System.out.println("Columna "+columna+":"+data);

}
if(flag)Excel_to_SQL.cliente(RUT, ApeP, ApeM, Nombre, Direccion, Ciudad, Telefono, Comuna);


} 
}
return Lista;
} catch (Exception ioe) { 
ioe.printStackTrace(); 
return null;
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
E_Cliente excelDGA = new E_Cliente(); 
ArrayList<String> ListaDGA = excelDGA.leerArchivoExcel("clientes.xls"); 
} 

public static String corrijeString(String unString){
    
    String aux = unString.toUpperCase();
    String arrAux[] = aux.split("-");
    if(arrAux.length==3){
    String aux2="";
    
    aux2+=arrAux[0]+"-";
    aux2+=arrAux[1]+"-";
    aux2+=String.valueOf(Integer.valueOf(arrAux[2]));
     return aux2;
    }
    
   return null;
    
}

public static boolean contiene(ArrayList<String> unaLista,String unString){
    for (Iterator<String> it = unaLista.iterator(); it.hasNext();) {
        String string = it.next();
        if(string.equalsIgnoreCase(unString)) return true;
    }
    return false;
}


}
