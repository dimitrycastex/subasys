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
import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author Dimitry
 */
public class Imprimir_Lista_Remates
{
    public static ArrayList lista;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_remates.pdf"));
 
      lista = Modelo.Remate.get_Lista();
      
//          0 remate.add(rs.getInt("ID_REMATE"));
//          1 remate.add(rs.getString("Lugar"));
//          2 remate.add(rs.getInt("Diario"));
//          3 remate.add(rs.getDate("Fecha"));
//          4 remate.add(rs.getString("Descripcion"));
//          5 remate.add(rs.getInt("Comision"));
//          6 remate.add(rs.getString("Ciudad"));
      
      //abrir el pdf
      document.open();
      
      //ir escribiendo en el pdf
      document.addTitle("Listado de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Remates"));
      document.add(new Phrase(""));//espacio
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 3 columnas
            PdfPTable table = new PdfPTable(5);
            table.setWidthPercentage(100);
            
            // agregar titulo codigo
            table.addCell(formato.celda_titulo("Código"));
            // agregar titulo nombre
            table.addCell(formato.celda_titulo("Nombre",4));

            //
            for (Iterator it = lista.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                //id_remate
                table.addCell(formato.celda_normal((String)object.get(0)));
                //
                table.addCell(formato.celda_normal((String)object.get(4),4));
            }
            return table;
        }
}