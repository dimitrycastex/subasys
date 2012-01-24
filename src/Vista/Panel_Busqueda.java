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

public class Panel_Busqueda extends javax.swing.JPanel {


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
    
    public Panel_Busqueda() {
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
        Campo = new javax.swing.JComboBox();
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        selectAll = new javax.swing.JCheckBox();
        barra = new javax.swing.JProgressBar();
        label_Buscar481 = new Vista.Imagenes_Label.buscar.Label_Buscar48();

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

        Campo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cliente",
            "Factura", "Remate", "Causa" ,"Producto", "Recepcion Judicial", "Recepcion Voluntaria","Productos Facturados","Remate Productos"}));
Campo.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        CampoActionPerformed(evt);
    }
    });

    Tabla.setModel(model);
    jScrollPane1.setViewportView(Tabla);

    jLabel2.setText("Campo a buscar");

    jButton2.setText("to Excel");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    selectAll.setText("Seleccionar Todos");
    selectAll.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selectAllActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)))
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(selectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
            .addComponent(label_Buscar481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
        .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, 847, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(parametro_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectAll))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Buscar481, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );
    }// </editor-fold>//GEN-END:initComponents

private void parametro_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_parametro_busquedaKeyReleased
// TODO add your handling code here:

  int campo = this.Campo.getSelectedIndex();
   if(campo==0){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busca_cliente(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==1){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_factura(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==2){
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
         if(Modelo.Remate.isRemate(parametro_busqueda.getText().toUpperCase()))
          Busqueda.busqueda_remate(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
   else if(campo==3){
       
       if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);  
          Busqueda.busqueda_causa(parametro_busqueda.getText().toLowerCase(),model);
           
    }
       
   }
   else if(campo==4){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_producto(parametro_busqueda.getText().toLowerCase(),model);
    }
   }
    else if(campo==5){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_recepcion_judicial(parametro_busqueda.getText().toLowerCase(),model);
    }
    
   }
   
    else if(campo==6){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_recepcion_voluntaria(parametro_busqueda.getText().toLowerCase(),model);
    }
    
   }
   
   else if(campo==7){
      
        if(!parametro_busqueda.getText().isEmpty()){
          cleanModel(model);
          Busqueda.busqueda_producto_facturado(parametro_busqueda.getText().toLowerCase(),model);
    }
    
   }
   
   else if(campo==8){
       if(!parametro_busqueda.getText().isEmpty()){
         cleanModel(model);
         if(Modelo.Remate.isRemate(parametro_busqueda.getText().toUpperCase())){
          Busqueda.busqueda_remate_productos(parametro_busqueda.getText().toLowerCase(),model);
           
         }
        
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

private void CampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoActionPerformed
// TODO add your handling code here:
   int campo = this.Campo.getSelectedIndex();
   if(campo==0){
       model = tmodel_cliente;
       Tabla.setModel(model);
      // Modelo.Busqueda.initClientes();
   }
   else if(campo==1){
       model = tmodel_factura;
       Tabla.setModel(model);
      // Modelo.Busqueda.initFacturas();
   }
   else if(campo==2){
       model = tmodel_remate;
       Tabla.setModel(model);
      
   }
   else if(campo==3){
       model = tmodel_causa;
       Tabla.setModel(model);
      // Modelo.Busqueda.initCausas();
   }
   else if(campo==4){
       model = tmodel_producto;
       Tabla.setModel(model);
      // Modelo.Busqueda.initProductos();
   }
   else if(campo==5){
       model = tmodel_recepcion_judicial;
       Tabla.setModel(model);
      // Modelo.Busqueda.initRJ();
   }
   
   else if(campo==6){
       model = tmodel_recepcion_voluntaria;
       Tabla.setModel(model);
      // Modelo.Busqueda.initRV();
   }
   
   else if(campo==7){
       model = tmodel_producto_facturado;
       Tabla.setModel(model);
      // Modelo.Busqueda.initProductosFac();

   }
   
   else if(campo==8){
       model = tmodel_remate_productos;
       Tabla.setModel(model);

   }
   
}//GEN-LAST:event_CampoActionPerformed

private void parametro_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parametro_busquedaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_parametro_busquedaActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
   try {
            List<JTable> tables = new ArrayList<JTable>();
            List<String> sheetsName = new ArrayList<String>();
            tables.add(Tabla);
            sheetsName.add("Planilla");
            ExcelTableExporter excelExporter = new ExcelTableExporter(tables, new File("exportar.xls"), sheetsName);
            if (excelExporter.export()) {
                JOptionPane.showMessageDialog(null, "Exportado con exito!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
}//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JComboBox Campo;
    private javax.swing.JTable Tabla;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.Imagenes_Label.buscar.Label_Buscar48 label_Buscar481;
    private javax.swing.JTextField parametro_busqueda;
    private javax.swing.JCheckBox selectAll;
    // End of variables declaration//GEN-END:variables
}
