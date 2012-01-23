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
public class Imprimir_Lista_Clientes
{
 public static ArrayList lista;
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_clientes.pdf"));
      //abrir el pdf
        
      
        lista = Modelo.Cliente.get_Lista(); // obtiene la lista de clientes de la BD
        
        /*
          0 = cliente.add(rs.getString("RUT"));
          1 = cliente.add(rs.getString("ApellidoP"));
          2 = cliente.add(rs.getString("ApellidoM"));
          3 = cliente.add(rs.getString("Nombre"));
          4 = cliente.add(rs.getString("Email"));
          5 = cliente.add(rs.getString("Web"));
          6 = cliente.add(rs.getString("Telefono"));         
          7 = cliente.add(rs.getInt("CodigoPostal"));
          8 = cliente.add(rs.getString("Direccion")); 
          9 = cliente.add(rs.getString("Ciudad"));
          10 = cliente.add(rs.getString("Comuna"));
        */
         
        
      
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
            table.addCell(formato.celda_titulo("Ciudad"));
            
            // agregar titulo Telefono
            table.addCell(formato.celda_titulo("Comuna"));

            //
            for (Iterator it = lista.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                //rut
                table.addCell(formato.celda_normal((String)object.get(0)));
                //nombre
                table.addCell(formato.celda_normal((String)object.get(1)+" "+(String)object.get(2)+" "+(String)object.get(3),2));
                //direccion
                table.addCell(formato.celda_normal((String)object.get(8)));
                //ciudad
                table.addCell(formato.celda_normal((String)object.get(9)));
                //comuna
                table.addCell(formato.celda_normal((String)object.get(10)));
            }
            return table;
        }
}