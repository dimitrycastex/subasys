/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Boris
 */
public class Imprimir_Planilla_Remate_Lote {
    
    public static ArrayList remate;
    public static ArrayList<ArrayList> producto;
    public static ArrayList<ArrayList> clientes;
    public static String[] JusgadoRolCausa;
    
    public static String id_remate;
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta, String id_remt) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"anexo_plantilla_remate.pdf"));
      id_remate = id_remt;
      
      remate = Modelo.Remate.getDatos(id_remate);
      
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("ANEXO PLANTILLA DE REMATES"));
      document.add(new Phrase(""));//espacio
      
      
      document.add(formato.subtitulo(remate.get(4).toString()));
      document.add(new Phrase(""));//espacio
      
      document.add(formato.subtitulo("Comision : "+remate.get(5).toString()+"%"));
      document.add(new Phrase("\n\n"));//espacio
      
      //Paragraph pp = new Paragraph("Dirección/Lugar",new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD));
      
      document.add(formato.texto_normal("Ciudad/Lugar : ",Font.BOLD));
      document.add(formato.texto_normal(remate.get(6).toString()+"/"+remate.get(1)));
      document.add(new Phrase("\n"));//espacio
      
      document.add(formato.texto_normal("Fecha               : ",Font.BOLD));
      document.add(formato.texto_normal(remate.get(3).toString()));
      
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
    
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 17 columnas
            PdfPTable table = new PdfPTable(17);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            producto = Modelo.Remate.get_Lista_Productos(id_remate);
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(celda_normal(" ",13,Element.ALIGN_UNDEFINED,1));
            table.addCell(celda_titulo("Adjudicano",4,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Num. Lote",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Descripción Lote",8,Element.ALIGN_LEFT));
            table.addCell(celda_titulo("Juzgado",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Rol/Causa",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Valor Minimo",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Valor",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Nombre",4,Element.ALIGN_CENTER));
            
            
            
            for (Iterator it = producto.iterator(); it.hasNext();) // itera
                /*remate.add(rs.getInt("ID_PRODUCTO"));
          remate.add(rs.getInt("Lote"));
          remate.add(rs.getString("Descripcion"));
          remate.add(rs.getInt("Cantidad"));
          remate.add(rs.getInt("Precio_unitario"));  
          remate.add(rs.getInt("Garantia"));     
          remate.add(rs.getInt("Total"));*/
            {
                ArrayList object = (ArrayList) it.next(); // castea
                
                table.addCell(celda_normal(object.get(1).toString(),1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(object.get(2).toString(),8,Element.ALIGN_LEFT,0));
                
                JusgadoRolCausa = Modelo.Producto.getJuzgado_Causa(object.get(0).toString());
                
                table.addCell(celda_normal(JusgadoRolCausa[0],1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(JusgadoRolCausa[1],1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(" ",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(object.get(6).toString(),1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal(" ",4,Element.ALIGN_CENTER,0));
                
                //System.out.println("ID_PRODUCTO :"+object.get(0).toString());
                //System.out.println(Modelo.Producto.get_Adjudicario(object.get(0).toString()));
                
                //System.out.println("ID_PRODUCTO :"+object.get(0).toString());
                //System.out.println("Lote :"+object.get(1).toString());
                //System.out.println("Descripcion :"+object.get(2).toString());
                //System.out.println("Cantidad :"+object.get(3).toString());
                //System.out.println("Precio_unitario :"+object.get(4).toString());
                //System.out.println("Garantia :"+object.get(5).toString());
                //System.out.println("Total :"+object.get(6).toString());
               // System.out.println("");
                //System.out.println("");
                
            }
            
            
            return table;
    }
    
    public static PdfPCell celda_titulo(String t,int colspan,int alin)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN,6)));
            c.setBackgroundColor(BaseColor.LIGHT_GRAY);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
    public static PdfPCell celda_normal(String t,int colspan,int alin,int borde)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN,6)));
            // sin lineas en el borde de la tabla
            if(borde!=0) c.setBorder(Rectangle.NO_BORDER);
            c.setColspan(colspan);
            // aliniación del texto en la celda
            c.setHorizontalAlignment(alin);
            return(c);
    }
    
}
