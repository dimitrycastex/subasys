/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.*;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *
 * @author Dimitry
 */
public class Crear_CajaRemate
{
    //@param ruta: ruta absoluta o relativa en donde crear el archivos
    public static void imprimir(String ruta) throws DocumentException, FileNotFoundException
    {
    Document document = new Document();
      PdfWriter.getInstance(document,new FileOutputStream(ruta+"/Caja_Remate.pdf"));
      //abrir el pdf
      document.open();
      //ir escribiendo en el pdf
      document.add(new Phrase("Caja Remate",new Font(FontFamily.COURIER, 20, Font.BOLD)));
      document.add(CrearTabla());
      //cerrar el pdf
      document.close();
    }
        
    public static PdfPTable CrearTabla()
    {
            // crear tabla con 3 columnas
            PdfPTable table = new PdfPTable(3);
            // the cell object
            PdfPCell cell;
            // agregar celda con colspan 3
            cell = new PdfPCell(new Phrase("Celda con colspan 3"));
            cell.setColspan(3);
            table.addCell(cell);
            // agregar celda con rowspan 2
            cell = new PdfPCell(new Phrase("Celda con rowspan 2"));
            cell.setRowspan(2);
            table.addCell(cell);
            // agregar 4 celdas con addCell
            table.addCell("columna 1; celda 1");
            table.addCell("columna 1; celda 2");
            table.addCell("columna 2; celda 1");
            table.addCell("columna 2; celda 2");
            return table;
        }
}
