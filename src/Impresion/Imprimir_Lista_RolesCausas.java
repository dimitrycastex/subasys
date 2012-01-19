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
public class Imprimir_Lista_RolesCausas
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_rolescausas.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Roles Causas");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Roles/Causas"));
      document.add(new Phrase(""));//espacio
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(5);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);

            // agregar titulo Código
            table.addCell(formato.celda_titulo("Código"));
            
            // agregar titulo Juzgado
            table.addCell(formato.celda_titulo("Juzgado"));
            
            // agregar titulo Caratulado como
            table.addCell(formato.celda_titulo("Caratulado como",3));
            

            //
            for(int i=1;i<=100;i++)
            {
                table.addCell(formato.celda_normal("Código"+i));
                table.addCell(formato.celda_normal("Juzgado"+i));
                table.addCell(formato.celda_normal("caratuladocomo"+i,3));
            }
            return table;
        }
}
