/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Panel_Busqueda;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Deico
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Busqueda.getDatos("Juan");
       
        //Busqueda.busca_cliente("juan geraldo");
        //Producto.get_Lista_Busqueda();
        //Cliente.get_Lista();
        Producto.get_Lista();
        Remate.get_Lista_Busqueda("162C");
    }
}
