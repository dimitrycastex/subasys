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
public class Remate_Busqueda extends DefaultTableModel{

    //Tabla Vacia
    public Remate_Busqueda(){
        super();
        this.addColumn("SEL");
        this.addColumn("RUT");
        this.addColumn("NOMBRE");
        this.addColumn("TELEFONO");
        this.addColumn("DIRECCION");
        this.addColumn("ID FACTURA");
        this.addColumn("TOTAL FACTURA");
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
