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
public class Imprimir_Listado_Planilla_Remate
{
   
  public static ArrayList lista_rm;
  public static ArrayList lista_remate;
  public static ArrayList lista_productos;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"listado_planilla_remate.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Listado de Planilla de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("Listado de Planilla de Remates"));
      document.add(new Phrase(""));//espacio
      
      lista_rm = Modelo.Remate.get_Lista();
      
      int j=0;
      
      for (Iterator it = lista_rm.iterator(); it.hasNext();)//for para crear cada tabla
      {
       ArrayList object = (ArrayList) it.next();
       String code_remate = (String)object.get(0); // obtengo ID_Remate
       
       lista_remate = Modelo.Remate.getDatos(code_remate);
       lista_productos = Modelo.Remate.get_Lista_Productos(code_remate);
       j++;
       document.add(CrearTablaCodigo(code_remate,j));
       document.add(new Phrase("\n"));//espacio
      }
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTablaCodigo(String code,int j)
    {
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(10);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            table.addCell(formato.celda_titulo("Planilla Nº"));
            table.addCell(formato.celda_titulo("ID Remate"));           
            table.addCell(formato.celda_titulo("Descripción",7));
            table.addCell(formato.celda_titulo("Fecha ingreso"));
            
            //recibir datos
            table.addCell(formato.celda_normal(""+j));
            table.addCell(formato.celda_normal(""+code));           
            table.addCell(formato.celda_normal((String)lista_remate.get(4),7));           
            table.addCell(formato.celda_normal(lista_remate.get(3).toString()));                       

            //celda vacia
            PdfPCell cell = new PdfPCell();
            cell.setBorder(Rectangle.NO_BORDER);
            table.addCell(cell);
            //
            table.addCell(formato.celda_titulo("Núm. Lote"));
            table.addCell(formato.celda_titulo("Descripción",8));
                
                
            for (Iterator it = lista_productos.iterator(); it.hasNext();) // for para los productos de cada tabla
            {
                ArrayList object2 = (ArrayList) it.next(); // castea
                
                //celda vacia
                cell = new PdfPCell();
                cell.setBorder(Rectangle.NO_BORDER);
                table.addCell(cell);
                //
                table.addCell(formato.celda_normal(object2.get(1).toString()));
                table.addCell(formato.celda_normal((String)object2.get(2),8));

            }
            return table;
        }
}