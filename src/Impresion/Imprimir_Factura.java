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

/**
 *
 * @author Boris
 */
public class Imprimir_Factura {
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"factura.pdf"));
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
            
            
            
            table.addCell(celda_normal("EDUARDO REYES TAPIA",Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal(" ",Element.ALIGN_UNDEFINED));
            
            table.addCell(celda_normal(" ",Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal(" ",Element.ALIGN_UNDEFINED));
            
            table.addCell(celda_normal("SALVADOR DALHI 1346",Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("CHIMBARONGO",Element.ALIGN_CENTER));
            
            table.addCell(celda_normal(" ",Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal(" ",Element.ALIGN_UNDEFINED));
            
            table.addCell(celda_normal("SAN FERNANDO",Element.ALIGN_UNDEFINED));
            table.addCell(celda_normal("12111333-3",Element.ALIGN_CENTER));
            
            return table;
        }
    
    public static PdfPCell celda_normal(String t,int alin)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 10)));
            // sin lineas en el borde de la tabla
            c.setBorder(Rectangle.NO_BORDER);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}
