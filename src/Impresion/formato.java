/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfPCell;
/**
 *
 * @author Dimitry
 */
public class formato
{
    
    public static Phrase texto_normal(String t)
    {
            Phrase p = new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 10));
            return(p);
    }
    
    //formato de titulo @param t: texto a mostrar
    public static Paragraph titulo(String t)
    {
            Paragraph pp = new Paragraph(t,new Font(FontFamily.TIMES_ROMAN, 20, Font.BOLD));
            pp.setAlignment(Element.ALIGN_MIDDLE);
            return(pp);
    }
    
    //formato de celda_titulo @param t: texto a mostrar
    public static PdfPCell celda_titulo(String t)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD)));
            c.setBackgroundColor(BaseColor.LIGHT_GRAY);
            return(c);
    }
    
    //formato de celda_titulo @param t: texto a mostrar ; colspan: espaciado 
    public static PdfPCell celda_titulo(String t,int colspan)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 8, Font.BOLD)));
            c.setBackgroundColor(BaseColor.LIGHT_GRAY);
            c.setColspan(colspan);
            return(c);
    }
    
    //formato de celda_normal @param t: texto a mostrar
    public static PdfPCell celda_normal(String t)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 8)));
            return(c);
    }
    
    //formato de celda_normal @param t: texto a mostrar ; colspan: espaciado 
    public static PdfPCell celda_normal(String t,int colspan)
    {
            PdfPCell c = new PdfPCell(new Phrase(t,new Font(FontFamily.TIMES_ROMAN, 8)));
            c.setColspan(colspan);
            return(c);
    }
    
}
