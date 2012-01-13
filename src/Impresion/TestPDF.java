/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;



/**
 *
 * @author Dimitry
 */
public class TestPDF {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws DocumentException, FileNotFoundException
    {
        String path="C:/";
        //Imprimir_Lista_Remates.imprimir(path);
        //Imprimir_Lista_Clientes.imprimir(path);
        Imprimir_Caja_Remate.imprimir(path);
    }

}
