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
public class Imprimir_Recepcion_Judicial
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"recepcion_judicial.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Recepción Judicial");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ACTA DE RECEPCION DE ESPECIES"));
      document.add(new Phrase(""));//espacio
      
      /*
      //tabla creada para alinear bien el texto
      PdfPTable t = new PdfPTable(7);
      t.setWidthPercentage(101);
      t.getDefaultCell().setBorder(Rectangle.NO_BORDER);
      
      
      //numero rol causa
      PdfPCell cell = new PdfPCell(new Phrase("Número de Rol/Causa : ",new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
      cell.setColspan(2);
      cell.setBorder(Rectangle.NO_BORDER);
      t.addCell(cell);

      cell = new PdfPCell(new Phrase("nrorolcausa",new Font(FontFamily.TIMES_ROMAN, 10)));
      cell.setBorder(Rectangle.NO_BORDER);
      cell.setHorizontalAlignment(Element.ALIGN_LEFT);
      t.addCell(cell);

      document.add(new Phrase("\n"));      
      
      //Juzgado
      cell = new PdfPCell(new Phrase("Juzgado : ",new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
      cell.setBorder(Rectangle.NO_BORDER);
      t.addCell(cell);

      cell = new PdfPCell(new Phrase("jzgado",new Font(FontFamily.TIMES_ROMAN, 10)));
      cell.setBorder(Rectangle.NO_BORDER);
      cell.setHorizontalAlignment(Element.ALIGN_LEFT);
      t.addCell(cell);
      
      document.add(new Phrase("\n"));
      
      //Fecha Ingreso
      cell = new PdfPCell(new Phrase("Fecha Ingreso : ",new Font(FontFamily.TIMES_ROMAN, 10, Font.BOLD)));
      cell.setBorder(Rectangle.NO_BORDER);
      t.addCell(cell);

      cell = new PdfPCell(new Phrase("xx/xx/xx",new Font(FontFamily.TIMES_ROMAN, 10)));
      cell.setBorder(Rectangle.NO_BORDER);
      t.addCell(cell);

      document.add(new Phrase("\n"));      
      */

      document.add(formato.texto_normal("Numero de Rol/Causa : ",Font.BOLD));
      document.add(formato.texto_normal("nrolcausa"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Juzgado : ",Font.BOLD));
      document.add(formato.texto_normal("jzgdo"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Fecha Ingreso : ",Font.BOLD));
      document.add(formato.texto_normal("nrolcausa"));
      document.add(new Phrase("\n"));

      document.add(formato.texto_normal("Demandante : ",Font.BOLD));
      document.add(formato.texto_normal("ddte"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Demandado : ",Font.BOLD));
      document.add(formato.texto_normal("ddo"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Abogado : ",Font.BOLD));
      document.add(formato.texto_normal("abogado"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Receptor : ",Font.BOLD));
      document.add(formato.texto_normal("receptor"));
      document.add(new Phrase("\n"));
      
      document.add(CrearTabla());

      document.add(formato.texto_normal("Fecha de Devolución o Remate : ",Font.BOLD));
      document.add(formato.texto_normal("xx/xx/xx"));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Bodegaje Pagado : $",Font.BOLD));
      document.add(formato.texto_normal("9.000"));
      
      //cerrar el pdf
      document.close();
    }
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(5);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(20);
            // largo de las filas
            table.setWidthPercentage(80);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
                     
            // 
            table.addCell(formato.celda_titulo("Numero lote"));            
            table.addCell(formato.celda_titulo("Recibido"));
            table.addCell(formato.celda_titulo("Descripción lote",3));
            
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal("nrolote"+i));
                table.addCell(formato.celda_normal("recibido"+i));
                table.addCell(formato.celda_normal("desclote"+i,3));
            }
            
            return table;
        }
}