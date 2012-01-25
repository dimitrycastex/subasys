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
public class Imprimir_Detalle_Lotes_Rematados {
    
    public static ArrayList remate;
    public static ArrayList factura;
    public static ArrayList<ArrayList> producto;
    public static ArrayList causa;
    public static String[] JusgadoRolCausa;
    
    public static String id_remate;
    
    
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta, String id_remt) throws DocumentException, FileNotFoundException
    {
      Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"detalle_lotes_rematados.pdf"));
      id_remate = id_remt;
      
      remate = Modelo.Remate.getDatos(id_remate);
      
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.addTitle("Caja de Remates");
      document.addAuthor("Subasys");
      //
      document.add(formato.titulo("DETALLE LOTES REMATADOS"));
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
            // crear tabla con 5 columnas
            PdfPTable table = new PdfPTable(33);
            //table.setSpacingBefore(2);
            table.setWidthPercentage(100);
            // separación del parrafo de texto con la tabla
            table.setSpacingBefore(10);
            
            //factura  = Modelo.Factura//("162C");
            
            producto = Modelo.Remate.get_Lista_Productos(id_remate);
            
            
            
            //ramate_has_producto = Modelo.Relacion.remate_has_producto(int ID_REMATE,int ID_PRODUCTO);
            
            // agregar titulo Nombre [ necesita mas espacio ]
            table.addCell(celda_titulo("N°Lote",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Descripción Lote",8,Element.ALIGN_UNDEFINED));
            table.addCell(celda_titulo("Juzgado",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Rol/Causa",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Caratulado como",6,Element.ALIGN_UNDEFINED));
            table.addCell(celda_titulo("Cant.",1,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("N° Factura",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Garantia",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Exento",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Comisión",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("IVA",2,Element.ALIGN_CENTER));
            table.addCell(celda_titulo("Total",2,Element.ALIGN_CENTER));

            
          /*  for(int i=1;i<=100;i++)
            {
                table.addCell(celda_normal(""+i,2,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("TV COLOR MARCA KOLIN"+i,8,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",2,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",2,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal(" ",6,Element.ALIGN_LEFT,0));
                table.addCell(celda_normal("4",1,Element.ALIGN_CENTER,0));
                table.addCell(celda_normal("265",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$2.223.233",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$22333",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                table.addCell(celda_normal("$223",2,Element.ALIGN_RIGHT,0));
                
            }*/
            int ID_Factura;
            int garantias=0;
            int comision=0;
            int iva=0;
            int total=0;
            for (Iterator it = producto.iterator(); it.hasNext();) // itera
            {
                ArrayList object = (ArrayList) it.next(); // castea
                                
                JusgadoRolCausa = Modelo.Producto.getJuzgado_Causa(object.get(0).toString());
                
                //System.out.println(JusgadoRolCausa[0]+":"+JusgadoRolCausa[1]);
                if(Modelo.Causa.isExist(JusgadoRolCausa[1])){ 
                    causa = Modelo.Causa.getDatos(JusgadoRolCausa[1]);
                
                    ID_Factura = Modelo.Producto.get_ID_Factura(object.get(0).toString());

                    //System.out.println(ID_Factura);
                    if (ID_Factura!=0) {
                        //System.out.println("error");
                        factura = Modelo.Factura.getDatos(Integer.toString(ID_Factura));

                        /*factura.add(rs.getInt("ID_FACTURA"));
                          factura.add(rs.getLong("Total"));
                          factura.add(rs.getLong("Garantia"));
                          factura.add(rs.getDate("Fecha_Emision"));
                          factura.add(rs.getString("Estado"));
                          factura.add(rs.getString("Exento"));
                          factura.add(rs.getLong("Neto"));
                          factura.add(rs.getInt("Impuestos"));
                          factura.add(rs.getInt("Comision"));  
                          factura.add(rs.getInt("IVA"));     
                          factura.add(rs.getInt("comision_Factura"));*/



                        /*causa.add(rs.getString("ROL"));
                          causa.add(rs.getString("Receptor"));
                          causa.add(rs.getString("Abogado"));
                          causa.add(rs.getString("Caratulado_como"));
                          causa.add(rs.getString("Juzgado"));
                          causa.add(rs.getInt("ID_RJ"));
                         */


                        //table.addCell(celda_normal(" ",1,Element.ALIGN_CENTER,0));
                        //table.addCell(celda_normal(object.get(6).toString(),1,Element.ALIGN_CENTER,0));
                        //table.addCell(celda_normal(" ",4,Element.ALIGN_CENTER,0));

                        table.addCell(celda_normal(object.get(1).toString(),2,Element.ALIGN_CENTER,0));
                        table.addCell(celda_normal(object.get(2).toString(),8,Element.ALIGN_LEFT,0));
                        table.addCell(celda_normal(JusgadoRolCausa[0],2,Element.ALIGN_CENTER,0));
                        table.addCell(celda_normal(JusgadoRolCausa[1],2,Element.ALIGN_CENTER,0));
                        table.addCell(celda_normal(causa.get(3).toString(),6,Element.ALIGN_LEFT,0));
                        table.addCell(celda_normal(object.get(3).toString(),1,Element.ALIGN_CENTER,0));
                        table.addCell(celda_normal(factura.get(0).toString(),2,Element.ALIGN_CENTER,0));
                        table.addCell(celda_normal("$"+factura.get(2).toString(),2,Element.ALIGN_RIGHT,0));
                        garantias = garantias + Integer.parseInt(factura.get(2).toString());
                        table.addCell(celda_normal(factura.get(5).toString(),2,Element.ALIGN_CENTER,0));//exento
                        table.addCell(celda_normal("$"+factura.get(10).toString(),2,Element.ALIGN_RIGHT,0));//comision
                        comision = comision + Integer.parseInt(factura.get(10).toString());
                        
                        int Impuesto = 0;
                        int FacturaIva = 0;

                        if (factura.get(5).toString().equals("N")) {
                            Impuesto = (int)(Float.parseFloat(factura.get(6).toString())*(Float.parseFloat(factura.get(9).toString())/100));
                            //System.out.println("comision_Factura : "+object.get(10).toString());
                            FacturaIva = (int)(Impuesto*Float.parseFloat(factura.get(10).toString()));
                        }
                        //System.out.println("comision_Factura : "+object.get(10).toString());
                        else FacturaIva = (int)(Float.parseFloat(factura.get(10).toString())*(Float.parseFloat(factura.get(9).toString())/100));


                        table.addCell(celda_normal("$"+Integer.toString(FacturaIva),2,Element.ALIGN_RIGHT,0));//iva
                        iva = iva + FacturaIva;
                        table.addCell(celda_normal("$"+factura.get(1).toString(),2,Element.ALIGN_RIGHT,0));//toal
                        total = total + Integer.parseInt(factura.get(1).toString());
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


                }}
            
                table.addCell(celda_normal("Totales:",23,Element.ALIGN_RIGHT,1));
                table.addCell(celda_normal("$"+Integer.toString(garantias),2,Element.ALIGN_RIGHT,1));
                table.addCell(celda_normal(" ",2,Element.ALIGN_RIGHT,1));
                table.addCell(celda_normal("$"+Integer.toString(comision),2,Element.ALIGN_RIGHT,1));
                table.addCell(celda_normal("$"+Integer.toString(iva),2,Element.ALIGN_RIGHT,1));
                table.addCell(celda_normal("$"+Integer.toString(total),2,Element.ALIGN_RIGHT,1));
             
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