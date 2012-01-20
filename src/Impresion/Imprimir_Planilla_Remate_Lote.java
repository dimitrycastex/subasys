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
public class Imprimir_Planilla_Remate_Lote {
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"anexo_plantilla_remate.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ANEXO PLANTILLA DE REMATES"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("REMATE N°100 : JUDICIAL COQUIMBO"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comision : 10%"));
      document.add(new Phrase("\n\n"));//espacio
      
      //Paragraph pp = new Paragraph("Dirección/Lugar",new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD));
      
      document.add(formato.texto_normal("Ciudad/Lugar : ",Font.BOLD));
      document.add(formato.texto_normal("BUIN/BENAVENTE N°6"));
      document.add(new Phrase("\n"));//espacio
      
      document.add(formato.texto_normal("Fecha               : ",Font.BOLD));
      document.add(formato.texto_normal("21/10/2005"));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 17 columnas
            PdfPTable table = new PdfPTable(17);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(celda_normal(" ",13,Element.ALIGN_UNDEFINED,1));
            table.addCell(celda_titulo("Adjudicario",4,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Num. Lote",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Descripción Lote",8,Element.ALIGN_LEFT));
            table.addCell(celda_titulo("Juzgado",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Rol/Causa",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Valor Minimo",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Valor",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Nombre",4,Element.ALIGN_CENTER));
            
            for(int i=1;i<=10;i++)
            {
                table.addCell(celda_normal("4"+i,1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("AUTOMOVIL MARCA LADA MODELO 32"+i,8,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal("1PLSL",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("105233-2",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(" ",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(" ",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(" ",4,Element.ALIGN_CENTER,0));
            }
            
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
