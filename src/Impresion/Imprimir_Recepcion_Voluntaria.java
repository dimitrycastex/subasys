/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *
 * @author Boris
 */
public class Imprimir_Recepcion_Voluntaria
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"recepcion_voluntaria.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Recepción Voluntaria");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ACTA DE RECEPCION DE ESPECIES"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.texto_normal("Por este acto don(ña) "+"nombre"));
      document.add(new Phrase("\n"));
      document.add(formato.texto_normal("Rut "+"rut"));
      document.add(new Phrase("\n"));
      document.add(formato.texto_normal("Domicilio "+"domicilio"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Declara ser dueño único y exclusivo de las especies que se detallan, otorgando poder amplio al Martillero Público don Juan Antonio Cáceres Carrasco para que las venda en subasta pública o en forma directa:"));
      document.add(new Phrase("\n"));
           
      document.add(CrearTabla());
      
      document.add(formato.texto_normal("Recibí conforme con ésta fecha : "+"xx/xx/xx"));      
      //cerrar el pdf
      document.close();
    }
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(8);
            // largo de las filas
            table.setWidthPercentage(60);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
            
            
            // 
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Descripción",6));
            table.addCell(formato.celda_titulo("Monto Mínimo"));
            
            for(int i=1;i<=5;i++)
            {
                table.addCell(formato.celda_normal("cant"));
                table.addCell(formato.celda_normal("descr del producto",6));
                table.addCell(formato.celda_normal("$9000"));
            }
            
            return table;
        }
}