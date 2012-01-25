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
 * @author Boris
 */
public class Imprimir_Caja_Remate
{
    public static ArrayList remate;
    public static ArrayList<ArrayList> factura;
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta,String ID_Remate) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"caja_de_remates.pdf"));
      
      remate = Modelo.Remate.getDatos(ID_Remate);
      factura = Modelo.Remate.get_Lista_Caja_Remate(ID_Remate);
      
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("CAJA DEL REMATE"));
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
            // crear tabla con 2 columnas
            PdfPTable table = new PdfPTable(2);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(20);
            // largo de las filas
            table.setWidthPercentage(60);
            // alineación de la tabla entera centrada
            table.setHorizontalAlignment(1);
            
            /*
              remate.add(rs.getInt("ID_FACTURA"));x
              remate.add(rs.getLong("Total"));-
              remate.add(rs.getLong("Garantia"));-
              remate.add(rs.getDate("Fecha_Emision"));x
              remate.add(rs.getString("Estado"));x
              remate.add(rs.getString("Exento"));-
              remate.add(rs.getLong("Neto"));x
              remate.add(rs.getInt("Impuestos"));-
              remate.add(rs.getInt("Comision"));  -
              remate.add(rs.getInt("IVA"));-
              remate.add(rs.getInt("comision_Factura"));-
             */
            
            int TotalGarantias = 0;
            int Impuesto = 0;
            int FacturaIva = 0;
            int TotalComision = 0;
            int Total = 0;
            
            
            for (Iterator it = factura.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                
                //System.out.println("ID_FACTURA : "+object.get(0).toString());
                //System.out.println("Fecha_Emision : "+object.get(3).toString());
                //System.out.println("Estado : "+object.get(4));
                
                
                //System.out.println("Impuestos : "+object.get(7).toString());
                
                
                //System.out.println("Exento : "+object.get(5));
                //System.out.println("Neto : "+Integer.parseInt(object.get(6).toString()));
                //System.out.println("IVA : "+object.get(9).toString());
                if (object.get(5).toString().equals("N")) {
                    Impuesto = (int)(Float.parseFloat(object.get(6).toString())*(Float.parseFloat(object.get(9).toString())/100));
                    //System.out.println("comision_Factura : "+object.get(10).toString());
                    FacturaIva = FacturaIva + (int)(Impuesto*Float.parseFloat(object.get(10).toString()));
                }
                //System.out.println("comision_Factura : "+object.get(10).toString());
                else FacturaIva = FacturaIva + (int)(Float.parseFloat(object.get(10).toString())*(Float.parseFloat(object.get(9).toString())/100));
                
                //System.out.println("comision_Factura : "+object.get(10).toString());
                TotalComision = TotalComision + Integer.parseInt(object.get(10).toString());
                
                //System.out.println("Garantia :"+Integer.parseInt(object.get(2).toString()));
                TotalGarantias = TotalGarantias + Integer.parseInt(object.get(2).toString());
                //System.out.println("Total : "+Integer.parseInt(object.get(1).toString()));
                Total = Total + Integer.parseInt(object.get(1).toString());
            }
            
            // 
            table.addCell(formato.celda_normal("Total Garantias"));
            table.addCell(formato.celda_normal("$"+Integer.toString(TotalGarantias),2,Element.ALIGN_RIGHT));
            
            //table.addCell(formato.celda_normal("Total Exento"));
            //table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            //table.addCell(formato.celda_normal("Comision"));
            //table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            //table.addCell(formato.celda_normal("Gastos"));
            //table.addCell(formato.celda_normal("$234.465",2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total Comision"));
            table.addCell(formato.celda_normal("$"+Integer.toString(TotalComision),2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total IVA"));
            table.addCell(formato.celda_normal("$"+Integer.toString(FacturaIva),2,Element.ALIGN_RIGHT));
            
            table.addCell(formato.celda_normal("Total"));
            table.addCell(formato.celda_normal("$"+Integer.toString(Total),2,Element.ALIGN_RIGHT));
            
            return table;
        }
}