/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.*;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *
 * @author Boris
 */
public class Imprimir_Caja_Remate
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"caja_de_remates.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("CAJA DEL REMATE"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("REMATE N° : JUDICIAL COQUIMBO"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comision : 10%"));
      document.add(new Phrase("\n\n"));//espacio
      
      //Paragraph pp = new Paragraph("Dirección/Lugar",new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD));
      
      document.add(formato.texto_normal("Ciudad/Lugar : ",Font.BOLD));
      document.add(formato.texto_normal("Municipalidad La Serena"));
      document.add(new Phrase("\n"));//espacio
      
      document.add(formato.texto_normal("Fecha               : ",Font.BOLD));
      document.add(formato.texto_normal("21/10/2005"));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(2);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(20);
            // largo de las filas
            table.setWidthPercentage(60);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
            
            
            // 
            table.addCell(formato.celda_normal("Total"));
            
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Comision"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Gastos"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total Comision"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total IVA"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total"));
            table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            return table;
        }
}