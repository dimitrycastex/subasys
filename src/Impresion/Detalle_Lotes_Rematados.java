/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.BaseColor;
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

/**
 *
 * @author Boris
 */
public class Detalle_Lotes_Rematados {
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"detalle_lotes_rematados.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("DETALLE LOTES REMATADOS"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("REMATE N°120 : JUDICIAL COQUIMBO"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comision : 10%"));
      document.add(new Phrase("\n\n"));//espacio
      
      //Paragraph pp = new Paragraph("Dirección/Lugar",new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD));
      
      document.add(formato.texto_normal("Ciudad/Lugar : ",Font.BOLD));
      document.add(formato.texto_normal("ANTUCO/BENAVENTE N°6"));
      document.add(new Phrase("\n"));//espacio
      
      document.add(formato.texto_normal("Fecha               : ",Font.BOLD));
      document.add(formato.texto_normal("12/10/2007"));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(33);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(celda_titulo("N°Lote",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Descripción Lote",8,Element.ALIGN_UNDEFINED));
            table.addCell(celda_titulo("Juzgado",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Rol/Causa",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Caratulado como",6,Element.ALIGN_UNDEFINED));
            table.addCell(celda_titulo("Cant.",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("N° Factura",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Garantia",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Exento",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Comisión",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("IVA",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Total",2,Element.ALIGN_CENTER));

            
            for(int i=1;i<=100;i++)
            {
                table.addCell(celda_normal(""+i,2,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("TV COLOR MARCA KOLIN"+i,8,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",2,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",2,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",6,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal("4",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("265",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$2.223.233",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$22333",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                
            }
            table.addCell(celda_normal("Totales:",23,Element.ALIGN_RIGHT,1));
            table.addCell(celda_normal("$12.123",2,Element.ALIGN_RIGHT,1));
            table.addCell(celda_normal("$2.323.232",2,Element.ALIGN_RIGHT,1));
            table.addCell(celda_normal("$234.343",2,Element.ALIGN_RIGHT,1));
            table.addCell(celda_normal("$5.455",2,Element.ALIGN_RIGHT,1));
            table.addCell(celda_normal("$23.345",2,Element.ALIGN_RIGHT,1));
            
            return table;
    }
    
    public static PdfPCell celda_titulo(String t,int colspan,int alin)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN,6)));
            c.setBackgroundColor(BaseColor.LIGHT_GRAY);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
    public static PdfPCell celda_normal(String t,int colspan,int alin,int borde)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN,6)));
            // sin lineas en el borde de la tabla
            if(borde!=0) c.setBorder(Rectangle.NO_BORDER);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}