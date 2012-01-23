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
public class Imprimir_Lista_RolesCausas
{
    
   public static ArrayList lista;
   
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_rolescausas.pdf"));
      
      lista = Modelo.Causa.get_Lista();
      
//          0 = causa.add(rs.getString("ROL"));
//          1 = causa.add(rs.getString("Receptor"));
//          2 = causa.add(rs.getString("Abogado"));
//          3 = causa.add(rs.getString("Caratulado_como"));
//          4 = causa.add(rs.getString("Juzgado"));
//          5 = causa.add(rs.getInt("ID_RJ"));
      
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
            for (Iterator it = lista.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                table.addCell(formato.celda_normal((String)object.get(0)));
                table.addCell(formato.celda_normal((String)object.get(4)));
                table.addCell(formato.celda_normal((String)object.get(3),3));
            }
            return table;
        }
}
