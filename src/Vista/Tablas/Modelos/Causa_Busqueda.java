/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas.Modelos;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Deico
 */
public class Causa_Busqueda extends DefaultTableModel{

    static ArrayList<Object[]> seleccionados = new ArrayList();
    
    public Causa_Busqueda(){
        super();
        this.addColumn("SEL");
        this.addColumn("ROL");
        this.addColumn("RECEPTOR");
        this.addColumn("ABOGADO");
        this.addColumn("CARATULADO COMO");
        this.addColumn("JUZGADO");
        this.addColumn("REMATE");
        this.addColumn("ID RJ");
        
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
