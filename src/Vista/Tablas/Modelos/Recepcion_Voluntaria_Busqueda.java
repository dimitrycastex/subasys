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
public class Recepcion_Voluntaria_Busqueda extends DefaultTableModel{

    //Tabla Vacia
    public Recepcion_Voluntaria_Busqueda(){
        super();
        this.addColumn("SEL");
        this.addColumn("ID_RV");
        this.addColumn("ID PRODUCTO");
        this.addColumn("DESCRIPCION PRODUCTO");
        this.addColumn("GARANTIA");
        this.addColumn("TOTAL");
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
