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
import javax.swing.table.DefaultTableModel;

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
        // Modelo.Producto.get_Lista_Busqueda_Facturados();
        ArrayList<ArrayList> _Lista_Busqueda = Modelo.Causa.get_Lista_Busqueda();
        int i=0;
        for (Iterator<ArrayList> it = _Lista_Busqueda.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            if(arrayList.get(0).toString().equalsIgnoreCase("1275-97")){
                i++;
                System.out.println(arrayList.get(5));
            }
        }
        System.out.println("I: "+i+" "+_Lista_Busqueda.size());
    }
    
    public static String filtraRut(String rut){
        
        String rut_aux = "";
        boolean flag = true;
        for (int i = 0; i < rut.length(); i++) {
           
            if(rut.charAt(i)=='0' && flag){
               
            }else{
                flag=false;
            }
             if(!flag){
                  rut_aux+=rut.charAt(i);
             }
        }
        return rut_aux;
        
    }
}
