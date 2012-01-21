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
public class Imprimir_Colillas_Lotes_Remates {
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"colillas_lotes_remates.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(6);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            
            for (int j = 0; j < 3; j++) {
                table.addCell(celda_normal("JUAN ANTONIO CACERES CARRASCO",6,Element.ALIGN_LEFT,Font.BOLD));
                table.addCell(celda_normal("REMATE N°100 JUDICIAL COQUIMBO",6,Element.ALIGN_LEFT,Font.BOLD));

                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));
                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));

                // agregar titulo Nombre [ necesita mas espacio ]
                table.addCell(celda_normal("SEÑOR(ES) :      ____________________________________________________________________________",6,Element.ALIGN_LEFT));

                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));

                // agregar titulo Nombre [ necesita mas espacio ]
                table.addCell(celda_normal("Lote N°: 1",1,Element.ALIGN_LEFT));

                // agregar titulo Código
                table.addCell(celda_normal("FECHA :",1,Element.ALIGN_RIGHT));
                table.addCell(celda_normal("16/11/2009",1,Element.ALIGN_CENTER));
                table.addCell(celda_normal(" ",3,Element.ALIGN_CENTER));

                table.addCell(celda_normal(" ",6,Element.ALIGN_UNDEFINED));
                // agregar titulo Nombre [ necesita mas espacio ]
                table.addCell(formato.celda_titulo("CANTIDAD",1,Element.ALIGN_CENTER));
                table.addCell(formato.celda_titulo("DETALLE",4,Element.ALIGN_CENTER));
                table.addCell(formato.celda_titulo("ADJUDICADO",1,Element.ALIGN_CENTER));

                for(int i=1;i<=10;i++)
                {
                    table.addCell(formato.celda_normal(""+i,1,Element.ALIGN_CENTER));
                    table.addCell(formato.celda_normal("TV COLOR CROWN 12\",MODELO G-1390"+i,4));
                    table.addCell(formato.celda_normal("$2"+i,2,Element.ALIGN_RIGHT));
                }
                table.addCell(celda_normal("Garantia($):",5,Element.ALIGN_RIGHT));
                table.addCell(formato.celda_normal("$223.233",1,Element.ALIGN_RIGHT));

                table.addCell(celda_normal(" ",6,Element.ALIGN_UNDEFINED));

                table.addCell(celda_normal("Retiro de especies 72 horas. Vencido este tiempo la garantia queda en beneficio de la casa de remate, reservandose el derecho a materializar, o no la transacción.",6,Element.ALIGN_JUSTIFIED));
                
                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));
                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));
                table.addCell(celda_normal(" ",6,Element.ALIGN_CENTER));
            }
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
    
    public static PdfPCell celda_normal(String t,int colspan,int alin,int font)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 10, font)));
            // sin lineas en el borde de la tabla
            c.setBorder(Rectangle.NO_BORDER);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
}
