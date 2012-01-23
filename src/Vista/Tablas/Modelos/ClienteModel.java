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
 * @author bastian
 */
public class ClienteModel extends DefaultTableModel{
    
    private ArrayList<ArrayList> Clientes;
    
    
    public ClienteModel(){
        super();
        Object[] Titulos = {"SEL","RUT","NOMBRES","APELLIDO PATERNO","APELLIDO MATERNO","TELÉFONO/MOVIL","EMAIL"};
        this.setColumnIdentifiers(Titulos);
    }
    
    public void AgregarFila(ArrayList UnCliente){
        
        
        //Caso base
        
        //Caso Real
        Object[] Row = new Object[7];
        Row[0]=false;
        
        /*for (int i = 1; i < UnCliente.size(); i++) {
            Row[i]=UnCliente.get(i-1).toString();
            
        }*/
        
        Row[1]=UnCliente.get(0);
        Row[2]=UnCliente.get(3);
        Row[3]=UnCliente.get(1);
        Row[4]=UnCliente.get(2);
        Row[5]=UnCliente.get(6);
        Row[6]=UnCliente.get(4);
        
        this.addRow(Row);
    }
    
    public void AgregarClientes(){
        ArrayList temp;
        
        for (int i = 0; i < Clientes.size(); i++) {
            temp = Clientes.get(i);
            this.AgregarFila(temp);
            
        }
    
    }
    
    public void BorraClientes(){
        
        ArrayList<ArrayList> temp = new ArrayList<ArrayList>();
        boolean eliminar;
        
        for (int i = 0; i < Clientes.size(); i++) {
            eliminar = (Boolean)this.getValueAt(i, 0);
            if(eliminar){
                temp.add(Clientes.get(i));
            }
        }
        for (Iterator<ArrayList> it = temp.iterator(); it.hasNext();) {
            ArrayList arrayList = it.next();
            Clientes.remove(arrayList);
        }
    }
    
    public void setClientes(ArrayList<ArrayList> ar){
        this.Clientes = ar;
    }
    
    public ArrayList<ArrayList> getClientes(){
        return this.Clientes;
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
