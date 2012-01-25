/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

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
        //System.out.println(Producto.get_ID_Factura("234"));
        Modelo.Recepcion_Judicial.get_Lista_Productos("23-97");
        ArrayList<ArrayList> _Lista_Busqueda = Modelo.Recepcion_Voluntaria.get_Lista_Busqueda();
        for (Iterator<ArrayList> it = _Lista_Busqueda.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            for (Iterator it1 = arrayList.iterator(); it1.hasNext();) {
                Object object = it1.next();
                 System.out.println(object);
            }
            
        }
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
