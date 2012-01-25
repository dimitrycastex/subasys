/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Boris
 */
public class Imprimir_Gastos_Remate {
    
    public static ArrayList remate;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"gastos_remate.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("GASTOS DEL REMATE"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo(remate.get(4).toString()));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comision : "+remate.get(5).toString()+"%"));
      document.add(new Phrase("\n\n"));//espacio
      
      //Paragraph pp = new Paragraph("Dirección/Lugar",new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD));
      
      document.add(formato.texto_normal("Ciudad/Lugar : ",Font.BOLD));
      document.add(formato.texto_normal(remate.get(6).toString()+"/"+remate.get(1)));
      document.add(new Phrase("\n"));//espacio
      
      document.add(formato.texto_normal("Fecha               : ",Font.BOLD));
      document.add(formato.texto_normal(remate.get(3).toString()));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(13);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(20);
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(formato.celda_titulo("N°",1,Element.ALIGN_CENTER));
            
            // agregar titulo Código
            table.addCell(formato.celda_titulo("Item Gasto",10));
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(formato.celda_titulo("Items Gasto",2,Element.ALIGN_RIGHT));

            //
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal(""+i,1,Element.ALIGN_CENTER));
                table.addCell(formato.celda_normal("PUBLICACIONES PROPORCIONALES DIARIO LA ESTRELLA DE ARICA DE PAIS"+i,10));
                table.addCell(formato.celda_normal("$2"+i,2,Element.ALIGN_RIGHT));
            }
            table.addCell(celda_normal("Total",11,Element.ALIGN_RIGHT));
            table.addCell(celda_normal("$223.233",2,Element.ALIGN_RIGHT));
            
            return table;
    }
    
    public static PdfPCell celda_normal(String t,int colspan,int alin)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 10)));
            // sin lineas en el borde de la tabla
            c.setBorder(Rectangle.NO_BORDER);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}
