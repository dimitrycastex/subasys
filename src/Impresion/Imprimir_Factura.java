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
public class Imprimir_Factura {
    
    public static ArrayList remate;
    public static ArrayList<ArrayList> factura;
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"factura.pdf"));
      
      remate = Modelo.Remate.getDatos("162C");
      factura = Modelo.Remate.get_Lista_Caja_Remate("162C");
      
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      
      document.add(formato.parrafo("N° 8005",Element.ALIGN_RIGHT));
      document.add(new Phrase("\n\n"));//espacio
      
      document.add(formato.parrafo("Coquimbo  16  Novienbre  2009",Element.ALIGN_RIGHT));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(12);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(50);
            // largo de las filas
            table.setWidthPercentage(100);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(Element.ALIGN_CENTER);
            
            
            table.addCell(celda_normal(" ",1,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("EDUARDO REYES TAPIA",11,Element.ALIGN_LEFT));
            
            table.addCell(celda_normal(" ",1,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("PARADERO 44 GRAN PASADA",11,Element.ALIGN_LEFT));
            
            table.addCell(celda_normal(" ",1,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("ANTOFAGASTA",5,Element.ALIGN_LEFT));
            table.addCell(celda_normal("SIERRA GORDA",6,Element.ALIGN_LEFT));
            
            table.addCell(celda_normal(" ",1,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("3456781-6",11,Element.ALIGN_LEFT));
            
            table.addCell(celda_normal(" ",12,Element.ALIGN_UNDEFINED));
            
            table.addCell(celda_normal(" ",2,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("Garantia : 0",5,Element.ALIGN_LEFT));
            table.addCell(celda_normal("Saldo : 6.987",5,Element.ALIGN_UNDEFINED));
            
            table.addCell(celda_normal(" ",12,Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal(" ",12,Element.ALIGN_UNDEFINED));
            
            for (int i = 0; i < 10; i++) {
                table.addCell(celda_normal(""+(i+1),1,Element.ALIGN_LEFT));
                table.addCell(celda_normal(""+(i*3),1,Element.ALIGN_LEFT));
                table.addCell(celda_normal("FAX BROTHER INTELLIFAX 77"+i,6,Element.ALIGN_LEFT));
                table.addCell(celda_normal("5.600",2,Element.ALIGN_LEFT));
                table.addCell(celda_normal("5.600",2,Element.ALIGN_LEFT));
            }
            
            return table;
        }
    
    public static PdfPCell celda_normal(String t,int colspan,int alin)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
            // sin lineas en el borde de la tabla
            c.setBorder(Rectangle.NO_BORDER);
            // unir celdas
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}
