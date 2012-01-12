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
public class Imprimir_Lista_Clientes
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_clientes.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Clientes");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Clientes"));
      document.add(new Phrase(""));//espacio
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

            // agregar titulo RUT
            table.addCell(formato.celda_titulo("Rut"));
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(formato.celda_titulo("Nombre",2));
            
            // agregar titulo Direccion
            table.addCell(formato.celda_titulo("Dirección"));
            
            // agregar titulo Localidad
            table.addCell(formato.celda_titulo("Localidad"));
            
            // agregar titulo Telefono
            table.addCell(formato.celda_titulo("Teléfono"));

            //
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal("RUT"+i));
                table.addCell(formato.celda_normal("Nombre ApellidoM ApellidoP"+i,2));
                table.addCell(formato.celda_normal("Dirección"+i));
                table.addCell(formato.celda_normal("Localidad"+i));
                table.addCell(formato.celda_normal("Telefono"+i));
            }
            return table;
        }
}