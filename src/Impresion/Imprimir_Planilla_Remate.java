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
import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author Dimitry
 */
public class Imprimir_Planilla_Remate
{
    
    public static ArrayList lista_productos;
    public static ArrayList datos_remate;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta,String nro_id_remate) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"planilla_remate.pdf"));
      
      lista_productos = Modelo.Remate.get_Lista_Productos(nro_id_remate);
      datos_remate = Modelo.Remate.getDatos(nro_id_remate);
      
      //abrir el pdf
      document.open();
      
      //ir escribiendo en el pdf
      document.addTitle("Planilla de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("PLANILLA DE REMATES"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("ID Remate : "+nro_id_remate));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comisión : "+datos_remate.get(5)+"%"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.texto_normal("Ciudad/Lugar : "+datos_remate.get(6)));
      document.add(new Phrase("\n"));//espacio
      document.add(formato.texto_normal("Fecha : "+datos_remate.get(3)));
      document.add(new Phrase("\n"));//espacio
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            PdfPTable table = new PdfPTable(10);
            table.setWidthPercentage(100);
            
            //10
            table.addCell(formato.celda_titulo("ID Producto"));
            table.addCell(formato.celda_titulo("Lote"));
            table.addCell(formato.celda_titulo("Descripción Producto",4));
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Precio Unitario"));
            table.addCell(formato.celda_titulo("Garantía"));
            table.addCell(formato.celda_titulo("Total"));

            //
            for (Iterator it = lista_productos.iterator(); it.hasNext();)
            {
                ArrayList object = (ArrayList) it.next(); // castea
                table.addCell(formato.celda_normal(object.get(0).toString()));
                table.addCell(formato.celda_normal(object.get(1).toString()));
                table.addCell(formato.celda_normal((String)object.get(2),4));
                table.addCell(formato.celda_normal(object.get(3).toString()));
                table.addCell(formato.celda_normal("$"+object.get(4).toString()));
                table.addCell(formato.celda_normal("$"+object.get(5).toString()));
                table.addCell(formato.celda_normal("$"+object.get(6).toString()));
            }
            return table;
        }
}