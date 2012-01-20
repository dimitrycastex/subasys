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
 * @author Dimitry
 */
public class Imprimir_Lista_Productos
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_productos.pdf"));
      //abrir el pdf
      document.open();
      
      //ir escribiendo en el pdf
      document.addTitle("Listado de Productos");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Productos"));
      document.add(new Phrase(""));//espacio
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 3 columnas
            PdfPTable table = new PdfPTable(10);
            table.setWidthPercentage(100);
            
            // agregar titulo codigo
            table.addCell(formato.celda_titulo("Num"));
            // agregar titulo nombre
            table.addCell(formato.celda_titulo("Codigo de Producto",2));
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Valor Mínimo"));
            table.addCell(formato.celda_titulo("Fecha Ingreso"));
            table.addCell(formato.celda_titulo("Descripción",4));

            //
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal("num"+i));
                table.addCell(formato.celda_normal("codprod"+i,2));
                table.addCell(formato.celda_normal("cantidad"+i));
                table.addCell(formato.celda_normal("vminimo"+i));
                table.addCell(formato.celda_normal("fechaingreso"+i));
                table.addCell(formato.celda_normal("descripcion"+i,4));
            }
            return table;
        }
}