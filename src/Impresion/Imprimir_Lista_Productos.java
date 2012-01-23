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
public class Imprimir_Lista_Productos
{
  public static ArrayList lista;
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_productos.pdf"));
      
      lista = Modelo.Producto.get_Lista();
      
      /*
          0 = producto.add(rs.getInt("ID_PRODUCTO"));
          1 = producto.add(rs.getString("Descripcion"));
          2 = producto.add(rs.getInt("Cantidad"));
          3 = producto.add(rs.getInt("Precio_Unitario"));
          4 = producto.add(rs.getInt("Total"));
          5 = producto.add(rs.getInt("Garantia"));
          6 = producto.add(rs.getString("Descripcion_Larga"));
      */
      
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
            int i=0;
            // agregar titulo codigo
            table.addCell(formato.celda_titulo("Num"));
            // agregar titulo nombre
            table.addCell(formato.celda_titulo("Codigo de Producto",2));
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Valor Mínimo"));
            table.addCell(formato.celda_titulo("Fecha Ingreso"));
            table.addCell(formato.celda_titulo("Descripción",4));

            //
            for (Iterator it = lista.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                i++;
                //num
                table.addCell(formato.celda_normal(""+i));
                //ID_PRODUCTO
                table.addCell(formato.celda_normal((String)object.get(0)));
                //Cantidad
                table.addCell(formato.celda_normal((String)object.get(2)));
                //Precio Unitario
                table.addCell(formato.celda_normal((String)object.get(3)));
                //fecha ingreso (!)
                table.addCell(formato.celda_normal("#FECHA#"));
                //Descripción
                table.addCell(formato.celda_normal((String)object.get(1)));
            }
            return table;
        }
}