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
        Imprimir_Lista_Remates.imprimir(path);
        Imprimir_Lista_Clientes.imprimir(path);
        Imprimir_Lista_Juzgados.imprimir(path);
        Imprimir_Lista_RolesCausas.imprimir(path);
        Imprimir_Caja_Remate.imprimir(path);
        Imprimir_Caja_Remate.imprimir(path);
        Imprimir_Lista_Productos.imprimir(path);
        Imprimir_Recepcion_Judicial.imprimir(path);
        Imprimir_Lista_Recepciones_Judiciales.imprimir(path);
        Imprimir_Recepcion_Voluntaria.imprimir(path);
        Imprimir_Lista_Recepciones_Voluntarias.imprimir(path);
        Imprimir_Planilla_Remate.imprimir(path);
        Imprimir_Listado_Planilla_Remate.imprimir(path);
        
        Imprimir_Planilla_Remate_Lote.imprimir(path);
    }

}
