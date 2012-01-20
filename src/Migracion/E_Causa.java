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
String[] causa = new String[]{"","","",""};
System.out.println("FILA: "+fila);
for (int columna = 0; columna < numColumnas; columna++) { // Recorre                                                                                

data = hoja.getCell(columna, fila).getContents(); 
//System.out.println(data + " "+data.length()+" "+convert(data)+" "+convert(data).length()+" "+convert(data).equals("NE-0401-11")); 

System.out.println("Columna "+columna+":"+data);
causa[columna]=convert(data);

}

Excel_to_SQL.causa(causa[2],causa[1],causa[3]);
Excel_to_SQL.remate_has_causa(causa[0], causa[2]);

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
        if(aux>=65 & aux<=90 || aux>=48 & aux<=59 || aux==' ' || aux=='-' || aux=='/'){
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
    
    return Integer.parseInt(buffer);
}

public static void main(String arg[]) { 
E_Causa excelDGA = new E_Causa(); 
ArrayList<String> ListaDGA = excelDGA.leerArchivoExcel("Causas_Rol.xls"); 
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
