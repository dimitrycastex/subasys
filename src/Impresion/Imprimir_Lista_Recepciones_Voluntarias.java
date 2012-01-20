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
public class Imprimir_Lista_Recepciones_Voluntarias
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_recepciones_voluntarias.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Recepciones Voluntarias");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Recepciones Voluntarias"));
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
            // crear tabla con 7 columnas
            PdfPTable table = new PdfPTable(7);
            table.setWidthPercentage(100);
            table.addCell(formato.celda_titulo("Código"));
            table.addCell(formato.celda_titulo("Rut"));           
            table.addCell(formato.celda_titulo("Nombre",2));           
            table.addCell(formato.celda_titulo("Dirección",2));           
            table.addCell(formato.celda_titulo("Fecha Ingreso"));
            
            //recibir datos
            table.addCell(formato.celda_normal(""+j));
            table.addCell(formato.celda_normal("17017187"));           
            table.addCell(formato.celda_normal("VOLUNTARIO UNO",2));           
            table.addCell(formato.celda_normal("CASA VOLUNTARIA",2));           
            table.addCell(formato.celda_normal("xx/xx/xx"));                     

            //celda vacia
            PdfPCell cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_titulo("Núm. Lote"));
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Descripción",3));
            table.addCell(formato.celda_titulo("Monto Mínimo"));
                
                
            for(int i=1;i<=13;i++) // for para los productos de cada tabla
            {
                //celda vacia
            //celda vacia
            cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_normal("numlote"));
            table.addCell(formato.celda_normal("cantidad"));
            table.addCell(formato.celda_normal("descripcióasdasdasdn",3));
            table.addCell(formato.celda_normal("$9000"));

            }
            return table;
        }
}