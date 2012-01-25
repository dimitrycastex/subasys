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
 * @author DimitryCastex
 */
public class Imprimir_Recepcion_Voluntaria
{
    
    public static ArrayList lista_recepcion;
    public static ArrayList lista_productos;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta,int idrv) throws DocumentException, FileNotFoundException
    {
      
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"recepcion_voluntaria.pdf"));
      
      lista_recepcion = Modelo.Recepcion_Voluntaria.getDatos(idrv);
      lista_productos = Modelo.Recepcion_Voluntaria.get_Lista_Productos(idrv);
      
      //S FTA
      ArrayList lr = (ArrayList)lista_productos.get(0); // obtiene el primer arraylist
      //E FTA
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Recepción Voluntaria");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ACTA DE RECEPCION DE ESPECIES"));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.texto_normal("Por este acto don(ña) "+(String)lr.get(1)+""+(String)lr.get(2)));
      document.add(new Phrase("\n"));
      document.add(formato.texto_normal("Rut "+(String)lista_recepcion.get(3)));
      document.add(new Phrase("\n"));
      document.add(formato.texto_normal("Domicilio "+(String)lr.get(3)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Declara ser dueño único y exclusivo de las especies que se detallan, otorgando poder amplio al Martillero Público don Juan Antonio Cáceres Carrasco para que las venda en subasta pública o en forma directa:"));
      document.add(new Phrase("\n"));
           
      document.add(CrearTabla());
      
      document.add(formato.texto_normal("Recibí conforme con ésta fecha : "+(String)lista_recepcion.get(1)));
      document.add(new Phrase("\n\n\n\n\n\n\n\n"));
      
      PdfPTable t = new PdfPTable(2);
      t.setWidthPercentage(101);
      
      PdfPCell celda; // celda para modificar
      
      celda = formato.celda_normal("______________________________",1,Element.ALIGN_CENTER);
      celda.setBorder(Rectangle.NO_BORDER);
      t.addCell(celda);
      
      celda = formato.celda_normal("______________________________",1,Element.ALIGN_CENTER);
      celda.setBorder(Rectangle.NO_BORDER);
      t.addCell(celda);
      
      celda = formato.celda_normal("consignante",1,Element.ALIGN_CENTER);
      celda.setBorder(Rectangle.NO_BORDER);
      t.addCell(celda);
      
      celda = formato.celda_normal("p.p. Juan Cáceres Carrasco",1,Element.ALIGN_CENTER);
      celda.setBorder(Rectangle.NO_BORDER);
      t.addCell(celda);
      
      document.add(t);
      

      
      //cerrar el pdf
      document.close();
    }
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(8);
            // largo de las filas
            table.setWidthPercentage(60);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
            
            
            // 
            table.addCell(formato.celda_titulo("Cantidad"));
            table.addCell(formato.celda_titulo("Descripción",6));
            table.addCell(formato.celda_titulo("Monto Mínimo"));
            
            for (Iterator it = lista_productos.iterator(); it.hasNext();)
            {
                ArrayList object = (ArrayList) it.next(); // castea
                
                table.addCell(formato.celda_normal(object.get(4).toString()));
                table.addCell(formato.celda_normal((String)object.get(5),6));
                table.addCell(formato.celda_normal("$"+object.get(6).toString()));
            }
            
            return table;
        }
}