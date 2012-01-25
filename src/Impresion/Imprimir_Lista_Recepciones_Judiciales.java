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
public class Imprimir_Lista_Recepciones_Judiciales
{
    
    public static ArrayList lista_causa_rj;
    public static ArrayList lista_recepcion;
    public static ArrayList lista_productos;
    public static ArrayList causa_rj;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_de_recepciones_judiciales.pdf"));
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Recepciones Judiciales");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Recepciones Judiciales"));
      document.add(new Phrase(""));//espacio
      
      lista_causa_rj = Modelo.Causa.get_Lista(); // obtengo el arraylist de arraylist con las recepciones judiciales
      
      for (Iterator it = lista_causa_rj.iterator(); it.hasNext();) //for para crear cada tabla
      {
       ArrayList object = (ArrayList) it.next(); // castea
       //
       String code_rol_causa = (String)object.get(0); // obtiene ROL de la lista
      
       //tomo los valores de arraylist y los vuelco en lista_recepcion y lista_productos
       lista_recepcion = Modelo.Recepcion_Judicial.get_Lista_Causa_Recepcion_Judicial(code_rol_causa);
       lista_productos = Modelo.Recepcion_Judicial.get_Lista_Productos(code_rol_causa);
       causa_rj = Modelo.Causa.getDatos(code_rol_causa);
       
       document.add(CrearTablaCodigo(code_rol_causa));
       document.add(new Phrase("\n"));//espacio
      }
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTablaCodigo(String j)
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(9);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            table.addCell(formato.celda_titulo("Código"));
            table.addCell(formato.celda_titulo("Rol Causa"));           
            table.addCell(formato.celda_titulo("Demandante",2));           
            table.addCell(formato.celda_titulo("Demandado",2));           
            table.addCell(formato.celda_titulo("Fecha Ingreso"));           
            table.addCell(formato.celda_titulo("Fecha Devolución"));           
            table.addCell(formato.celda_titulo("Monto Bodegaje"));
            
            //recibir datos
            
            table.addCell(formato.celda_normal(causa_rj.get(5).toString())); //codigo ID_RJ
            //table.addCell(formato.celda_normal("asd"));
            table.addCell(formato.celda_normal(j)); // codigo rol - causa
            System.out.println(j);
            table.addCell(formato.celda_normal((String)lista_recepcion.get(3),2));
            System.out.println((String)lista_recepcion.get(3));
            table.addCell(formato.celda_normal((String)lista_recepcion.get(4),2));
            System.out.println((String)lista_recepcion.get(4));
            table.addCell(formato.celda_normal((String)lista_recepcion.get(2)));
            System.out.println((String)lista_recepcion.get(2));
            table.addCell(formato.celda_normal((String)lista_recepcion.get(7)));
            System.out.println((String)lista_recepcion.get(7));
            table.addCell(formato.celda_normal(lista_recepcion.get(8).toString()));
            System.out.println(lista_recepcion.get(8).toString());
            System.out.println("------------------------------------------");

            //celda vacia
            PdfPCell cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_titulo("Id producto"));
            table.addCell(formato.celda_titulo("Descripción",7));
                
                
            for (Iterator it = lista_productos.iterator(); it.hasNext();) // for para los productos de cada tabla
            {
                ArrayList object2 = (ArrayList) it.next(); // castea
                //celda vacia
                cell = new PdfPCell();
                cell.setBorder(Rectangle.NO_BORDER);
                table.addCell(cell);
                //
                table.addCell(formato.celda_normal(object2.get(1).toString()));
                table.addCell(formato.celda_normal((String)object2.get(2),7));

            }
            return table;
        }
}