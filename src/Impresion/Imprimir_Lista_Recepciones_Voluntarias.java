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

/*RESOLVER PROBLEMAS CON FOR DE FOR*/


/**
 *
 * @author Dimitry
 */
public class Imprimir_Lista_Recepciones_Voluntarias
{
    
    public static ArrayList lista_rv;
    public static ArrayList lista_recepcion;
    public static ArrayList lista_productos;
    
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
      
      lista_rv = Modelo.Recepcion_Voluntaria.get_Lista();
      
      for (Iterator it = lista_rv.iterator(); it.hasNext();)//for para crear cada tabla
      {
       ArrayList object = (ArrayList) it.next();
       
       int id_rv = (Integer)object.get(0); // obtengo el id de una recepcion voluntaria (casteando a entero)
       
       //tomo los valores de arraylist y los vuelco en lista_recepcion y lista_productos
       lista_recepcion = Modelo.Recepcion_Voluntaria.getDatos(id_rv);
       lista_productos = Modelo.Recepcion_Voluntaria.get_Lista_Productos(id_rv);
       
       document.add(CrearTablaCodigo(id_rv));
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
            
            ArrayList lr = (ArrayList)lista_productos.get(j); // obtiene el primer arraylist
            
            //recibir datos
            table.addCell(formato.celda_normal(""+j));
            table.addCell(formato.celda_normal((String)lista_recepcion.get(3)));           
            table.addCell(formato.celda_normal((String)lr.get(1)+" "+(String)lr.get(2),2));           
            table.addCell(formato.celda_normal((String)lr.get(3),2));           
            table.addCell(formato.celda_normal((String)lista_recepcion.get(1)));                     

            //celda vacia
            PdfPCell cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Descripción",4));
            table.addCell(formato.celda_titulo("Monto Mínimo"));
                
                
            for (Iterator it = lista_productos.iterator(); it.hasNext();) // for para los productos de cada tabla
            {
              ArrayList object2 = (ArrayList) it.next(); // castea
            
              //celda vacia
                cell = new PdfPCell();
                cell.setBorder(Rectangle.NO_BORDER);
                table.addCell(cell);
                //
                table.addCell(formato.celda_normal(object2.get(4).toString()));
                table.addCell(formato.celda_normal((String)object2.get(5),4));
                table.addCell(formato.celda_normal("$"+object2.get(6).toString()));

            }
            return table;
        }
}