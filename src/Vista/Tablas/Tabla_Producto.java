/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Vista.Tablas.Modelos.ProductoModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JViewport;

/**
 *
 * @author Bastian
 */
public class Tabla_Producto extends JTable{
    
    private ArrayList<ArrayList> Productos;
    private ArrayList<ArrayList> Seleccionados;
    private ArrayList temp;
    private ProductoModel Modelo;
    
    
    public Tabla_Producto(){
        super(new ProductoModel());    
        Modelo = new ProductoModel();
        Productos = new ArrayList<ArrayList>();
        Seleccionados = new ArrayList<ArrayList>();
        this.getTableHeader().setReorderingAllowed(false) ;
        temp = new ArrayList();
    }
    
    public void setProductos(ArrayList<ArrayList> p){
        this.Productos=p;
    }
    
    public int getCantidadProductos(){
        return this.Productos.size();
    }
    
    
    public void AgregaProductos(){
        
        
        temp.add("0000000000");
        temp.add("qwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxvqwertyuiopasdfghjklñzxcvbnmqwertyuiopasdfghjklñzxv");
        temp.add("1000");
        temp.add("0000000000");
        temp.add("0000000000");
        temp.add("0000000000");
        
        for (int i = 0; i < 10; i++) {
            Productos.add(temp);
        }
        Modelo.setProductos(Productos);
        Modelo.AgregarProductos();
        this.setModel(Modelo);
        this.AsignaColumn();
    }
    
    public void BorraProductos(){
        
        Modelo.BorraProductos();
        this.Productos = Modelo.getProductos();
        Modelo = new ProductoModel();
        Modelo.setProductos(Productos);
        Modelo.AgregarProductos();
        this.setModel(Modelo);
        this.AsignaColumn();
    
    
    }
    
    public void AsignaColumn(){

        //Checkbox
        this.getColumnModel().getColumn(0).setMaxWidth(30);
        this.getColumnModel().getColumn(0).setMinWidth(30);
        this.getColumnModel().getColumn(0).setPreferredWidth(30);
        
        //ID
        this.getColumnModel().getColumn(1).setMaxWidth(100);
        this.getColumnModel().getColumn(1).setMinWidth(100);
        this.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        //Descripcion
        this.getColumnModel().getColumn(2).setMaxWidth(800);
        this.getColumnModel().getColumn(2).setMinWidth(800);
        this.getColumnModel().getColumn(2).setPreferredWidth(800);
        
        //Cantidad
        this.getColumnModel().getColumn(3).setMaxWidth(80);
        this.getColumnModel().getColumn(3).setMinWidth(80);
        this.getColumnModel().getColumn(3).setPreferredWidth(80);
        
        //Precio
        this.getColumnModel().getColumn(4).setMaxWidth(100);
        this.getColumnModel().getColumn(4).setMinWidth(100);
        this.getColumnModel().getColumn(4).setPreferredWidth(100);
        
        //Garantia
        this.getColumnModel().getColumn(5).setMaxWidth(100);
        this.getColumnModel().getColumn(5).setMinWidth(100);
        this.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        //Total
        this.getColumnModel().getColumn(6).setMaxWidth(100);
        this.getColumnModel().getColumn(6).setMinWidth(100);
        this.getColumnModel().getColumn(6).setPreferredWidth(100);
        
        this.setColumnSelectionAllowed(false);
        this.setAutoscrolls(false);
    }
    
    @Override
    public boolean getScrollableTracksViewportWidth() {

        if (autoResizeMode != AUTO_RESIZE_OFF) {
            if (getParent() instanceof JViewport) {
                return (((JViewport)getParent()).getWidth() > getPreferredSize().width);
            }

        }return false;

    } 
    
    
}
