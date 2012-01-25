/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.VentanaPrincipal;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.pushingpixels.substance.api.skin.*;

/**
 *
 * @author bastian
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.panel_Bienvenido1.setFrame(this);
        this.panel_Cliente1.setFrame(this);
        this.panel_Remate1.setFrame(this);
        this.panel_ReJudicial1.setFrame(this);
        this.panel_ReVoluntaria1.setFrame(this);
        this.panel_Producto1.setFrame(this);
        this.panel_Causa1.setFrame(this);
        this.panel_Factura1.setFrame(this);
        this.panel_Busqueda_Cliente1.setFrame(this);
        //this.panel_BuscaCliente1.setFrame(this);
        this.panel_BuscaProducto1.setFrame(this);
        this.panel_VisorPDF1.setFrame(this);
        this.panel_ResumenRecepcion1.setFrame(this);
        this.panel_Sel_Impresion1.setFrame(this);
        this.panel_Sel_Impresion1.setPanel_PDF(panel_VisorPDF1);
        
        this.panel_Producto1.setPanelResumen(panel_ResumenRecepcion1);
        this.panel_Causa1.setPanel_Rejudicial(this.panel_ReJudicial1);
        this.panel_ReJudicial1.setPanel_ResumenRecepcion(this.panel_ResumenRecepcion1);
        this.panel_ReVoluntaria1.setPanel_ResumenRecepcion(this.panel_ResumenRecepcion1);
        this.panel_Busqueda_Cliente1.setPaneles(panel_ReVoluntaria1, panel_Factura1);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Sel_Impresion(){
        jTabbedPane_Pestanas.addTab("Impresión Documentos", panel_Sel_Impresion1);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_Sel_Impresion(){
        jTabbedPane_Pestanas.remove(panel_Sel_Impresion1);
    }
    
    
    //--------------------------------------------------------------------------
    protected void bloquearPanel(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.jTabbedPane_Pestanas.setSelectedIndex(1);
    }
    
    protected void desbloquearPanel(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, true);
        //this.jTabbedPane_Pestanas.setSelectedIndex(0);
    }
    
    protected void bloquearPanel(int panel){
        this.jTabbedPane_Pestanas.setEnabledAt(panel, false);
        this.jTabbedPane_Pestanas.setSelectedIndex(panel+1);
    }
    
    protected void desbloquearPanel(int panel){
        this.jTabbedPane_Pestanas.setEnabledAt(panel, true);
        //this.jTabbedPane_Pestanas.setSelectedIndex(0);
    }
    
    protected void removePanel(JPanel p){
        jTabbedPane_Pestanas.remove(p);
    
    }
    //--------------------------------------------------------------------------
    protected void addPanel_Cliente(boolean nuevo, int caso){
        String nombre;
        panel_Cliente1.ClienteNuevo(nuevo);
        nombre = (nuevo==true)? "Nuevo Cliente" : "Modificar Cliente";
        jTabbedPane_Pestanas.addTab(nombre, panel_Cliente1);
        
        switch (caso) {
            case 1: //desde panel principal
                    panel_Cliente1.esPrincipal();
                    jTabbedPane_Pestanas.setEnabledAt(0, false);
                    this.removePanel_Bienvenido();
                    break;
            case 2: //desde panel factura
                    panel_Cliente1.esFactura();
                    this.bloquearPanel_Factura();
                    break;
        }
        
    }
    protected void removePanel_Cliente(){
        jTabbedPane_Pestanas.remove(panel_Cliente1);
    }
    
    //se supone que el Panel que llama va a esta la posicion 0 y el panel BuscaCliente en la 1
    protected void bloquearPanel_Cliente(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.jTabbedPane_Pestanas.setSelectedIndex(1);
    }
    
    protected void desbloquearPanel_Cliente(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, true);
        //this.jTabbedPane_Pestanas.setSelectedIndex(0);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Bienvenido(){
        jTabbedPane_Pestanas.addTab("Bienvenido a SUBASYS", panel_Bienvenido1);
    }
    
    protected void removePanel_Bienvenido(){
        jTabbedPane_Pestanas.remove(panel_Bienvenido1);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Remate(boolean nuevo){
        String nombre;
        panel_Remate1.RemateNuevo(nuevo);
        nombre = (nuevo==true)? "Nuevo Remate" : "Modificar Remate";
        jTabbedPane_Pestanas.addTab(nombre, panel_Remate1);
        jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_Remate(){
        jTabbedPane_Pestanas.remove(panel_Remate1);
        this.addPanel_Bienvenido();
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_ReJudicial(boolean nuevo){
        String nombre;
        this.panel_ReJudicial1.ReJudicialNueva(nuevo);
        nombre = (nuevo==true)? "Nueva Recepción Judicial" : "Modificar Recepción Judicial";
        jTabbedPane_Pestanas.addTab(nombre, panel_ReJudicial1);
        jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_ReJudicial(){
        jTabbedPane_Pestanas.remove(panel_ReJudicial1);
        this.addPanel_Bienvenido();
    }
    
    protected void bloquearPanel_ReJudicial(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.jTabbedPane_Pestanas.setSelectedIndex(1);
    }
    
    protected void desbloquearPanel_ReJudicial(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, true);
        //this.jTabbedPane_Pestanas.setSelectedIndex(0);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_ResumenRecepcion(boolean esJudicial){
        
        if(esJudicial) panel_ResumenRecepcion1.esJudicial();
        
        else panel_ResumenRecepcion1.esVoluntaria();
        
        jTabbedPane_Pestanas.addTab("Resumen Recepcion", panel_ResumenRecepcion1);
    }
    
    protected void removePanel_ResumenRecepcion(){
        jTabbedPane_Pestanas.remove(panel_ResumenRecepcion1);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Producto(boolean nuevo, int caso){
        String nombre;
        this.panel_Producto1.ProductoNuevo(nuevo);
        nombre = (nuevo==true)? "Nuevo Producto" : "Modificar Producto";
        jTabbedPane_Pestanas.addTab(nombre, panel_Producto1);
        
        
        if(caso ==1) panel_Producto1.esReJudicial();
        else if (caso == 2 ) panel_Producto1.esReVoluntaria();
        
        else panel_Producto1.esOtro();
        
    }
    
    protected void removePanel_Producto(){
        jTabbedPane_Pestanas.remove(panel_Producto1);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Causa(boolean nuevo){
        String nombre;
        this.panel_Causa1.CausaNueva(nuevo);
        nombre = (nuevo==true)? "Nueva Causa" : "Modificar Causa";
        jTabbedPane_Pestanas.addTab(nombre, panel_Causa1);
        jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_Causa(){
        jTabbedPane_Pestanas.remove(panel_Causa1);
        this.addPanel_Bienvenido();
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_ReVoluntaria(boolean nuevo){
        String nombre;
        this.panel_ReVoluntaria1.ReVoluntariaNueva(nuevo);
        nombre = (nuevo==true)? "Nueva Recepción Voluntaria" : "Modificar Recepción Voluntaria";
        jTabbedPane_Pestanas.addTab(nombre, panel_ReVoluntaria1);
        //jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_ReVoluntaria(){
        jTabbedPane_Pestanas.remove(panel_ReVoluntaria1);
        this.addPanel_Bienvenido();
    }
    
     //--------------------------------------------------------------------------
    protected void addPanel_Factura(boolean nuevo){
        String nombre;
        this.panel_Factura1.FacturaNueva(nuevo);
        nombre = (nuevo==true)? "Nueva Factura" : "Anular Factura";
        jTabbedPane_Pestanas.addTab(nombre, panel_Factura1);
        jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.removePanel_Bienvenido();
    }
    
    protected void removePanel_Factura(){
        jTabbedPane_Pestanas.remove(panel_Factura1);
        this.addPanel_Bienvenido();
    }
    
    //se supone que el Panel que llama va a esta la posicion 0 y el panel BuscaCliente en la 1
    protected void bloquearPanel_Factura(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, false);
        this.jTabbedPane_Pestanas.setSelectedIndex(1);
    }
    
    protected void desbloquearPanel_Factura(){
        this.jTabbedPane_Pestanas.setEnabledAt(0, true);
        //this.jTabbedPane_Pestanas.setSelectedIndex(0);
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_Busqueda_Cliente(int tipo){
        String nombre = "Buscar Cliente";
        jTabbedPane_Pestanas.addTab(nombre, panel_Busqueda_Cliente1);
        //this.removePanel_Cliente();
        
        panel_Busqueda_Cliente1.Hilo(true);
        switch (tipo) {
            case 1: panel_Busqueda_Cliente1.esReVoluntaria();
                    break;
            case 2: panel_Busqueda_Cliente1.esFactura();
                break;
        }
        
    }
    
    protected void removePanel_Busqueda_Cliente(int tipo){
        switch (tipo) {
            case 1: //Panel Cliente
                    this.desbloquearPanel_Cliente();
                    break;
            case 2: //panel factura
                    this.desbloquearPanel_Factura();
                    break;
                
        }
        //jTabbedPane_Pestanas.remove(panel_BuscaCliente1);        
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_BuscaProducto(int tipo){
        String nombre = "Buscar Producto";
        jTabbedPane_Pestanas.addTab(nombre, panel_BuscaProducto1);
        
        switch (tipo) {
            case 1: //Panel Cliente
                    this.bloquearPanel_Factura();
                    this.panel_BuscaProducto1.esFactura();
                    break;
                
            case 2: //Panel Cliente
                    this.bloquearPanel_ReJudicial();
                    this.panel_BuscaProducto1.esRecepcion();
                    break;
        }
        
    }
    
    protected void removePanel_BuscaProducto(int tipo){
        switch (tipo) {
            case 1: //panel factura
                    this.desbloquearPanel_Factura();
                    break;
            case 2: //panel factura
                    this.desbloquearPanel_ReJudicial();
                    break;
                
        }
        jTabbedPane_Pestanas.remove(panel_BuscaProducto1);        
    }
    
    //--------------------------------------------------------------------------
    protected void addPanel_VisorPDF(){
        jTabbedPane_Pestanas.addTab("PDF", panel_VisorPDF1);
    }
    
    protected void removePanel_VisorPDF(){
        jTabbedPane_Pestanas.remove(panel_VisorPDF1);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane_Pestanas = new javax.swing.JTabbedPane();
        panel_Bienvenido1 = new Vista.Panel_Bienvenido();
        panel_Cliente1 = new Vista.Panel_Cliente();
        panel_Remate1 = new Vista.Panel_Remate();
        panel_Causa1 = new Vista.Panel_Causa();
        panel_ReVoluntaria1 = new Vista.Panel_ReVoluntaria();
        panel_ReJudicial1 = new Vista.Panel_ReJudicial();
        panel_Producto1 = new Vista.Panel_Producto();
        panel_Factura1 = new Vista.Panel_Factura();
        panel_VisorPDF1 = new Vista.Panel_VisorPDF();
        panel_BuscaProducto1 = new Vista.Panel_BuscaProducto1();
        panel_ResumenRecepcion1 = new Vista.Panel_ResumenRecepcion();
        panel_Busqueda_Cliente1 = new Vista.Panel_Busqueda_Cliente();
        panel_Sel_Impresion1 = new Vista.Panel_Sel_Impresion();
        jToolBar1 = new javax.swing.JToolBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SUBASYS - Ventana Principal");
        setIconImage(new ImageIcon(this.getClass().getResource("/Vista/Imagenes_Files/martillo/128.png")).getImage());
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setName("Ventana Principal"); // NOI18N
        setResizable(false);

        jTabbedPane_Pestanas.setMaximumSize(new java.awt.Dimension(1000, 560));
        jTabbedPane_Pestanas.setMinimumSize(new java.awt.Dimension(1000, 560));
        jTabbedPane_Pestanas.setPreferredSize(new java.awt.Dimension(1000, 650));
        jTabbedPane_Pestanas.addTab("Bienvenido a SUBASYS", panel_Bienvenido1);

        /*
        jTabbedPane_Pestanas.addTab("Cliente", panel_Cliente1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Remate", panel_Remate1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Causa", panel_Causa1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Recepcion Voluntaria", panel_ReVoluntaria1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Recepcion Judicial", panel_ReJudicial1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Producto", panel_Producto1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Factura", panel_Factura1);
        */
        jTabbedPane_Pestanas.addTab("Visor PDF", panel_VisorPDF1);

        /*
        jTabbedPane_Pestanas.addTab("Buscar Producto", panel_BuscaProducto1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Resumen Recepción", panel_ResumenRecepcion1);
        */

        /*
        jTabbedPane_Pestanas.addTab("Buscar Clientes", panel_Busqueda_Cliente1);
        */
        jTabbedPane_Pestanas.addTab("Impresión Documentos", panel_Sel_Impresion1);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane_Pestanas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane_Pestanas, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /*
         * Set the Nimbus look and feel
         */
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            
            public void run() {
                /*try {
                    UIManager.setLookAndFeel(new org.pushingpixels.substance.api.skin.SubstanceOfficeSilver2007LookAndFeel());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Substance Graphite failed to initialize");
                }*/
                Login dialog = new Login(new javax.swing.JFrame(), true);
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.setVisible(true);
                dialog.setVisible(true);
               
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane_Pestanas;
    private javax.swing.JToolBar jToolBar1;
    private Vista.Panel_Bienvenido panel_Bienvenido1;
    private Vista.Panel_BuscaProducto1 panel_BuscaProducto1;
    private Vista.Panel_Busqueda_Cliente panel_Busqueda_Cliente1;
    private Vista.Panel_Causa panel_Causa1;
    private Vista.Panel_Cliente panel_Cliente1;
    private Vista.Panel_Factura panel_Factura1;
    private Vista.Panel_Producto panel_Producto1;
    private Vista.Panel_ReJudicial panel_ReJudicial1;
    private Vista.Panel_ReVoluntaria panel_ReVoluntaria1;
    private Vista.Panel_Remate panel_Remate1;
    private Vista.Panel_ResumenRecepcion panel_ResumenRecepcion1;
    private Vista.Panel_Sel_Impresion panel_Sel_Impresion1;
    private Vista.Panel_VisorPDF panel_VisorPDF1;
    // End of variables declaration//GEN-END:variables
}
