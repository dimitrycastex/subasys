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
 * @author DimitryCastex
 */
public class Imprimir_Recepcion_Judicial
{
    
  public static ArrayList lista_recepcion;
  public static ArrayList lista_productos;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta,String rol_causa) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"recepcion_judicial.pdf"));
      
      lista_recepcion = Modelo.Recepcion_Judicial.get_Lista_Causa_Recepcion_Judicial(rol_causa);
      lista_productos = Modelo.Recepcion_Judicial.get_Lista_Productos(rol_causa);
      
//      recepcion:
//          0 = ReJudicial.add(rs.getString("ROL"));
//          1 = ReJudicial.add(rs.getString("Juzgado"));
//          2 = ReJudicial.add(rs.getDate("Fecha_Ingreso"));    
//          3 = ReJudicial.add(rs.getString("Demandante"));
//          4 = ReJudicial.add(rs.getString("Demandado"));
//          5 = ReJudicial.add(rs.getString("Abogado"));   
//          6 = ReJudicial.add(rs.getString("Receptor"));
//          7 = ReJudicial.add(rs.getDate("Fecha_Devolucion"));
//          8 = ReJudicial.add(rs.getInt("Bodegaje_Pagado")); 
//          
//      productos:
//          0 = ReJudicial.add(rs.getInt("ID_RJ"));
//          1 = ReJudicial.add(rs.getInt("ID_PRODUCTO"));    
//          2 = ReJudicial.add(rs.getString("Descripcion"));
//          3 = ReJudicial.add(rs.getInt("Garantia"));
//          4 = ReJudicial.add(rs.getInt("Total"));     
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Recepción Judicial");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ACTA DE RECEPCION DE ESPECIES"));
      document.add(new Phrase(""));//espacio

      document.add(formato.texto_normal("Numero de Rol/Causa : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(0)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Juzgado : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(1)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Fecha Ingreso : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(2)));
      //document.add(formato.texto_normal("#fecha#"));
      document.add(new Phrase("\n"));

      document.add(formato.texto_normal("Demandante : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(3)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Demandado : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(4)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Abogado : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(5)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Receptor : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(6)));
      document.add(new Phrase("\n"));
      
      document.add(CrearTabla());

      document.add(formato.texto_normal("Fecha de Devolución o Remate : ",Font.BOLD));
      document.add(formato.texto_normal((String)lista_recepcion.get(7)));
      document.add(new Phrase("\n"));
      
      document.add(formato.texto_normal("Bodegaje Pagado : $",Font.BOLD));
      document.add(formato.texto_normal(lista_recepcion.get(8).toString()));
      
      //cerrar el pdf
      document.close();
    }
    
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(5);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(20);
            // largo de las filas
            table.setWidthPercentage(80);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
                     
            // 
            table.addCell(formato.celda_titulo("Id Producto"));            
            table.addCell(formato.celda_titulo("Garantía"));
            table.addCell(formato.celda_titulo("Descripción producto",3));
            
            for (Iterator it = lista_productos.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                
                table.addCell(formato.celda_normal(object.get(1).toString()));
                table.addCell(formato.celda_normal(object.get(3).toString()));
                table.addCell(formato.celda_normal(object.get(2).toString(),3));
            }
            
            return table;
        }
}