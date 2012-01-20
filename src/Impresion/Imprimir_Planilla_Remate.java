/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *
 * @author Dimitry
 */
public class Imprimir_Planilla_Remate
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"planilla_remate.pdf"));
      //abrir el pdf
      document.open();
      
      //ir escribiendo en el pdf
      document.addTitle("Planilla de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("PLANILLA DE REMATES"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Remate Nº : "+"890"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comisión : "+"890"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.texto_normal("Ciudad/Lugar : "+"ciudad"));
      document.add(new Phrase("\n"));//espacio
      document.add(formato.texto_normal("Fecha : "+"xx/xx/xx"));
      document.add(new Phrase("\n"));//espacio
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            PdfPTable table = new PdfPTable(12);
            table.setWidthPercentage(100);
            
            for(int ee=0;ee<=8;ee++)
            {
             PdfPCell cell = new PdfPCell();
             cell.setBorder(Rectangle.NO_BORDER);
             table.addCell(cell);
            }
            
            table.addCell(formato.celda_titulo("Adjudicano\n",4));
            
            //12
            table.addCell(formato.celda_titulo("Num. Lote"));
            table.addCell(formato.celda_titulo("Descripción Lote",5));
            table.addCell(formato.celda_titulo("Juzgado"));
            table.addCell(formato.celda_titulo("Rol/Causa"));
            table.addCell(formato.celda_titulo("Valor Mínimo"));
            table.addCell(formato.celda_titulo("Valor"));
            table.addCell(formato.celda_titulo("Nombre",2));

            //
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal(""+i));
                table.addCell(formato.celda_normal("Descripción Lote",5));
                table.addCell(formato.celda_normal("Juzgado"));
                table.addCell(formato.celda_normal("Rol/Causa"));
                table.addCell(formato.celda_normal("Valor Mínimo"));
                table.addCell(formato.celda_normal("Valor"));
                table.addCell(formato.celda_normal("Nombre",2));
            }
            return table;
        }
}