/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Vista.Tablas.Modelos.ClienteModel;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JViewport;

/**
 *
 * @author bastian
 */
public class Tabla_Cliente extends JTable{
    
    private ArrayList<ArrayList> Clientes;
    private ArrayList temp;
    private ClienteModel Modelo;
    
    public Tabla_Cliente(){
        super(new ClienteModel());    
        Modelo = new ClienteModel();
        Clientes = new ArrayList<ArrayList>();
        this.getTableHeader().setReorderingAllowed(false) ;
        temp = new ArrayList();
    }
    
    public void setClientes(ArrayList<ArrayList> p){
        this.Clientes=p;
    }
    
    public int getCantidadClientes(){
        return Clientes.size();
    }
    
    public void AgregaClientes(){
        
        
        /*temp.add("17715401-6");
        temp.add("Sebastian del rosario de los floripondios");
        temp.add("de La Carrera");
        temp.add("Von Smith");
        temp.add("024563985");
        temp.add("esteesmisupercorreo@notengoqueinvenyar.com");
        
        for (int i = 0; i < 10; i++) {
            Clientes.add(temp);
        }*/
        Modelo.setClientes(Clientes);
        Modelo.AgregarClientes();
        this.setModel(Modelo);
        this.AsignaColumn();
    }
    
    public void BorraClientesSeleccionados(){
        
        Modelo.BorraClientes();
        this.Clientes = Modelo.getClientes();
        Modelo = new ClienteModel();
        Modelo.setClientes(Clientes);
        Modelo.AgregarClientes();
        this.setModel(Modelo);
        this.AsignaColumn();
    
    
    }
    
    public void BorraClientes(){
        
        Modelo = new ClienteModel();
        this.setModel(Modelo);
        this.AsignaColumn();
    
    
    }
    
    public void AsignaColumn(){

        //Checkbox
        this.getColumnModel().getColumn(0).setMaxWidth(30);
        this.getColumnModel().getColumn(0).setMinWidth(30);
        this.getColumnModel().getColumn(0).setPreferredWidth(30);
        
        //RUT
        this.getColumnModel().getColumn(1).setMaxWidth(100);
        this.getColumnModel().getColumn(1).setMinWidth(100);
        this.getColumnModel().getColumn(1).setPreferredWidth(100);
        
        //Nombres
        this.getColumnModel().getColumn(2).setMaxWidth(400);
        this.getColumnModel().getColumn(2).setMinWidth(400);
        this.getColumnModel().getColumn(2).setPreferredWidth(400);
        
        //Apellido Paterno
        this.getColumnModel().getColumn(3).setMaxWidth(200);
        this.getColumnModel().getColumn(3).setMinWidth(200);
        this.getColumnModel().getColumn(3).setPreferredWidth(200);
        
        //Apellido Materno
        this.getColumnModel().getColumn(4).setMaxWidth(200);
        this.getColumnModel().getColumn(4).setMinWidth(200);
        this.getColumnModel().getColumn(4).setPreferredWidth(200);
        
        //Telefono/Movil
        this.getColumnModel().getColumn(5).setMaxWidth(100);
        this.getColumnModel().getColumn(5).setMinWidth(100);
        this.getColumnModel().getColumn(5).setPreferredWidth(100);
        
        //Email
        this.getColumnModel().getColumn(6).setMaxWidth(400);
        this.getColumnModel().getColumn(6).setMinWidth(400);
        this.getColumnModel().getColumn(6).setPreferredWidth(400);
        
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
