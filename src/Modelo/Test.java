/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
