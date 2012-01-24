/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas.Modelos;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bastian
 */
public class ProductoModel extends DefaultTableModel{
    
    private ArrayList<ArrayList> Productos, Seleccionados;
    //Tabla Vacia
    public ProductoModel(){
        super();
        Object[] Titulos = {"SEL","ID","DESCRIPCIÓN","CANTIDAD","PRECIO","GARANTIA","TOTAL"};
        this.setColumnIdentifiers(Titulos);
        Productos = new ArrayList<ArrayList>();
        Seleccionados = new ArrayList<ArrayList>();
    }
    
    //Recibe ArrayList
    public void AgregarFila(ArrayList datos){
        
        Object[] Row = new Object[7];
        Row[0]=false;
        /*for (int i = 1; i < datos.size(); i++) {
            Row[i]=datos.get(i-1).toString();
            
        }*/
        
        Row[1]=datos.get(0).toString();
        Row[2]=datos.get(1).toString();
        Row[3]=datos.get(2).toString();
        Row[4]=datos.get(3).toString();
        Row[5]=datos.get(5).toString();
        Row[6]=datos.get(4).toString();
        
        this.addRow(Row);
    }
    
    public void AgregarProductos(){
        ArrayList temp;
        
        for (int i = 0; i < Productos.size(); i++) {
            temp = Productos.get(i);
            this.AgregarFila(temp);
            
        }
    
    }
    
    public void BorraProductosSeleccionados(){
        
        ArrayList<ArrayList> temp = new ArrayList<ArrayList>();
        boolean eliminar;
        
        for (int i = 0; i < Productos.size(); i++) {
            eliminar = (Boolean)this.getValueAt(i, 0);
            if(eliminar){
                temp.add(Productos.get(i));
            }
        }
        for (Iterator<ArrayList> it = temp.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            Productos.remove(arrayList);
        }
    }
    
    public ArrayList<ArrayList> getProductosSeleccionados(){
    
        Seleccionados.clear();
        for (int i = 0; i < Productos.size(); i++) {
            boolean sel = (Boolean)this.getValueAt(i, 0);
            if(sel){
                Seleccionados.add(Productos.get(i));
            }
        }
        
        return Seleccionados;
    
    }
    
    public void setProductos(ArrayList<ArrayList> ar){
        this.Productos = ar;
    }
    
    public ArrayList<ArrayList> getProductos(){
        return this.Productos;
    }
    
    
    @Override
    public Class getColumnClass(int columnIndex) {
        if (columnIndex == 0)
            return Boolean.class;
        else
            return super.getColumnClass(columnIndex);
    }

    @Override
    public boolean isCellEditable (int row, int column)
   {
       if (column == 0)
          return true;

       return false;
   }

}
