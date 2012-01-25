/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Buscador.java
 *
 * Created on 20-ene-2012, 20:24:19
 */
package Vista;

import Modelo.Busqueda;
import Modelo.ExcelTableExporter;
import Modelo.Remate;
import Vista.Tablas.Modelos.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Deico
 */

public class Panel_Busqueda_Productos extends javax.swing.JPanel {


    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel tmodel_cliente = new Cliente_Busqueda();
    DefaultTableModel tmodel_factura = new Factura_Busqueda();
    DefaultTableModel tmodel_remate = new Remate_Busqueda();
    DefaultTableModel tmodel_producto = new Producto_Busqueda();
    DefaultTableModel tmodel_causa = new Causa_Busqueda();
    DefaultTableModel tmodel_recepcion_judicial = new Recepcion_Judicial_Busqueda();
    DefaultTableModel tmodel_recepcion_voluntaria = new Recepcion_Voluntaria_Busqueda();
    DefaultTableModel tmodel_producto_facturado = new Producto_Facturado_Busqueda();
    DefaultTableModel tmodel_remate_productos = new Remate_Productos_Busqueda();
    
    public static ArrayList<ArrayList> lista_seleccionados = new ArrayList();
    /** Creates new form Buscador */
    
    public Panel_Busqueda_Productos() {
        initComponents();
        model = tmodel_cliente;
        Tabla.setModel(model);
        Thread tread = new taskInitContents();
        tread.start();
       
       
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parametro_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable(){

            @Override
            public boolean getScrollableTracksViewportWidth() {

                if (autoResizeMode != AUTO_RESIZE_OFF) {
                    if (getParent() instanceof JViewport) {
                        return (((JViewport)getParent()).getWidth() > getPreferredSize().width);
                    }

                }return false;

            }
        };
        selectAll = new javax.swing.JCheckBox();
        barra = new javax.swing.JProgressBar();
        label_Buscar481 = new Vista.Imagenes_Label.buscar.Label_Buscar48();
        jLabel1 = new javax.swing.JLabel();
        label_Producto481 = new Vista.Imagenes_Label.producto.Label_Producto48();

        parametro_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parametro_busquedaActionPerformed(evt);
            }
        });
        parametro_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                parametro_busquedaKeyTyped(evt);
            }
        });

        Tabla.setModel(model);
        jScrollPane1.setViewportView(Tabla);

        selectAll.setText("Seleccionar Todos");
        selectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectAllActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(label_Producto481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_Buscar481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectAll)))
                    .addComponent(label_Buscar481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Producto481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void parametro_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyReleased
// TODO add your handling code here:

       if(!parametro_busqueda.getText().isEmpty()){
         cleanModel(model);
         if(Modelo.Remate.isRemate(parametro_busqueda.getText().toUpperCase())){
          Busqueda.busqueda_remate_productos(parametro_busqueda.getText().toLowerCase(),model);
           
         }
        
    
   }
   
}//GEN-LAST:event_parametro_busquedaKeyReleased

public static ArrayList getSelectedRowsID(DefaultTableModel model){
        ArrayList lista = new ArrayList();
        for (int i = 0; i < model.getRowCount(); i++) {
            boolean sel = (Boolean)model.getValueAt(i, 0);
            if(sel){
                 
                lista.add(model.getValueAt(i, 1));
            }
            
        }
        return lista;
    }
/*
 * HOLA
 */
private void parametro_busquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyPressed
// TODO add your handling code here: 
   
}//GEN-LAST:event_parametro_busquedaKeyPressed

private void parametro_busquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyTyped
// TODO add your handling code here:
     
}//GEN-LAST:event_parametro_busquedaKeyTyped

private void parametro_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametro_busquedaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_parametro_busquedaActionPerformed

private void selectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectAllActionPerformed
// TODO add your handling code here:
    if(selectAll.isSelected()){
        for (int i = 0; i < model.getRowCount(); i++) {
        model.setValueAt(true, i, 0);
        
    }
    }else{
        for (int i = 0; i < model.getRowCount(); i++) {
        model.setValueAt(false, i, 0);
        
    }
    }
}//GEN-LAST:event_selectAllActionPerformed

public void cleanModel(DefaultTableModel model){
    int a =model.getRowCount()-1;

    for (int i = a; i >=0; i--) {
        model.removeRow(i);
        
    }

    
}

class taskInitContents extends Thread{
        
      
      public void run() {
       
         
         // barra.setVisible(true);
        // Modelo.Busqueda.initAll();
           barra.setMaximum(7);
           Modelo.Busqueda.initClientes();
           //label.setText("Clientes Cargados..");
           barra.setValue(1);
           barra.setStringPainted(true);
           barra.setString("Clientes Cargados..15%");
           Modelo.Busqueda.initCausas();
           //label.setText("Causas Cargadas..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Causas Cargadas..30%");
           Modelo.Busqueda.initFacturas();
           //label.setText("Facturas Cargadas..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Facturas Cargadas..45%");
           Modelo.Busqueda.initProductos();
           //label.setText("Productos Cargados..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Productos Cargados..60%");
           Modelo.Busqueda.initProductosFac();
           //label.setText("Productos Facturados Cargados..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Productos Facturados Cargados..75%");
           Modelo.Busqueda.initRJ();
           //label.setText("Recepciones Judiciales Cargadas..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Recepciones Judiciales Cargadas..90%");
           Modelo.Busqueda.initRV();
           //label.setText("Recepciones Voluntarias Cargadas..");
           barra.setValue(barra.getValue()+1);
           barra.setString("Recepciones Voluntarias Cargadas..100%");
           barra.setVisible(false);
           //label.setText("Fuentes cargadas con exito!");
           
           
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.Imagenes_Label.buscar.Label_Buscar48 label_Buscar481;
    private Vista.Imagenes_Label.producto.Label_Producto48 label_Producto481;
    private javax.swing.JTextField parametro_busqueda;
    private javax.swing.JCheckBox selectAll;
    // End of variables declaration//GEN-END:variables
}
