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
public class Imprimir_Liquidacion_Remate {
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"liquidacion_remate.pdf"));
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
            PdfPTable table = new PdfPTable(30);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            table.addCell(celda_normal(" ",30,Element.ALIGN_CENTER,15,Font.NORMAL,0));
            
            table.addCell(celda_normal("EN LO PRINCIPAL : Rinde cuenta del remate. OTROSI : Acompaña documentación",30,Element.ALIGN_JUSTIFIED,15,Font.NORMAL,0));
            table.addCell(celda_normal("S.J.L.",30,Element.ALIGN_CENTER,15,Font.NORMAL,0));

            table.addCell(celda_normal(" ",30,Element.ALIGN_CENTER,15,Font.NORMAL,0));

            table.addCell(celda_normal("    JUAN ANTONIO CACERES CARRASCO, martillero publico designado para rematar las especies"
            + " embargadas en los Autos Rol N° 1017-97, del PRIMER JUZGADO CIVIL LA SERENA, caratulados FINANCIERA CONOSUR/RODRIGES.",30,Element.ALIGN_JUSTIFIED,12,Font.NORMAL,0));
            
            table.addCell(celda_normal(" ",30,Element.ALIGN_CENTER,15,Font.NORMAL,0));
            
            table.addCell(celda_normal("A Ud. respetuosamente digo:",30,Element.ALIGN_JUSTIFIED,12,Font.NORMAL,0));
            table.addCell(celda_normal("    Que vengo a rendir cuenta del producto del remate de las especies subastadas de conformidad"
            + " a lo que señalo a continuación:",30,Element.ALIGN_JUSTIFIED,12,Font.NORMAL,0));
            
            table.addCell(celda_normal(" ",30,Element.ALIGN_CENTER,15,Font.NORMAL,0));
            
            table.addCell(celda_normal("DETALLE DE LO SUBASTADO",30,Element.ALIGN_JUSTIFIED,10,Font.NORMAL,Rectangle.BOTTOM));
            
            for (int i = 0; i < 10; i++) {
                table.addCell(celda_normal("LOTE :"+i,3,Element.ALIGN_LEFT,10,Font.NORMAL,0));
                table.addCell(celda_normal("TV. COLOR CROWN 1"+(i*3)+"\", MODELO G-13"+i,22,Element.ALIGN_LEFT,10,Font.NORMAL,0));
                table.addCell(celda_normal("$12.33"+i,5,Element.ALIGN_RIGHT,10,Font.NORMAL,0));
            }
            
            
            table.addCell(celda_normal("TOTAL SUBASTADO",25,Element.ALIGN_RIGHT,10,Font.NORMAL,0));
            table.addCell(celda_normal("$233.232",5,Element.ALIGN_RIGHT,10,Font.NORMAL,Rectangle.TOP));
            
            table.addCell(celda_normal("RUBROS A DESCONTAR:",30,Element.ALIGN_LEFT,10,Font.NORMAL,Rectangle.BOTTOM));
            
            table.addCell(celda_normal("PUBLICACIONES PROPORCIONALES DIARIO LA ESTRELLA DE ARICA DE PAIS",22,Element.ALIGN_LEFT,10,Font.NORMAL,0));
            table.addCell(celda_normal("$50.550",25,Element.ALIGN_RIGHT,10,Font.NORMAL,0));
            
            //table.addCell(celda_normal("DETALLE DE LO SUBASTADO",30,Element.ALIGN_JUSTIFIED,12,Font.NORMAL));
            
            return table;
    }
    
    public static PdfPCell celda_normal(String t,int colspan,int alin,int tam, int font,int borde)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, tam, font)));
            // sin lineas en el borde de la tabla
            c.setBorder(borde);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}
