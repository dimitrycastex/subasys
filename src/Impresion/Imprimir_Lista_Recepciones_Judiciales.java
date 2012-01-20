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

/*RESOLVER PROBLEMAS CON FOR DE FOR*/


/**
 *
 * @author Dimitry
 */
public class Imprimir_Lista_Recepciones_Judiciales
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_recepciones_judiciales.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Recepciones Judiciales");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Recepciones Judiciales"));
      document.add(new Phrase(""));//espacio
      
      for(int j=0;j<=3;j++)//for para crear cada tabla
      {
       document.add(CrearTablaCodigo(j));
       document.add(new Phrase("\n"));//espacio
      }
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTablaCodigo(int j)
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(9);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            table.addCell(formato.celda_titulo("Código"));
            table.addCell(formato.celda_titulo("Rol Causa"));           
            table.addCell(formato.celda_titulo("Demandante",2));           
            table.addCell(formato.celda_titulo("Demandado",2));           
            table.addCell(formato.celda_titulo("Fecha Ingreso"));           
            table.addCell(formato.celda_titulo("Fecha Devolución"));           
            table.addCell(formato.celda_titulo("Monto Bodegaje"));
            
            //recibir datos
            
            table.addCell(formato.celda_normal(""+j));
            table.addCell(formato.celda_normal("1017-97"));           
            table.addCell(formato.celda_normal("DEMANDANTE PEREZ",2));           
            table.addCell(formato.celda_normal("DEMANDADO DAVID",2));           
            table.addCell(formato.celda_normal("xx/xx/xx"));           
            table.addCell(formato.celda_normal("yy/yy/yy"));           
            table.addCell(formato.celda_normal("$9000"));            

            //celda vacia
            PdfPCell cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_titulo("Núm. Lote"));
            table.addCell(formato.celda_titulo("Descripción",7));
                
                
            for(int i=1;i<=13;i++) // for para los productos de cada tabla
            {
                //celda vacia
                cell = new PdfPCell();
                cell.setBorder(Rectangle.NO_BORDER);
                table.addCell(cell);
                //
                table.addCell(formato.celda_normal("numlote"));
                table.addCell(formato.celda_normal("Descripcosudhjags",7));

            }
            return table;
        }
}