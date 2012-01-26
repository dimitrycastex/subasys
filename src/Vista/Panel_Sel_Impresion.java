/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Panel_Sel_Impresion.java
 *
 * Created on 25-ene-2012, 11:48:18
 */
package Vista;

import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import Impresion.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dimitry
 */
public class Panel_Sel_Impresion extends javax.swing.JPanel {
    private String path="imp/";

    /** Creates new form Panel_Sel_Impresion */
    public Panel_Sel_Impresion() {
        initComponents();
    }
    
    private VentanaPrincipal V_Principal;
    private Panel_VisorPDF P_PDF;

    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
    }
    
     public void setPanel_PDF(JPanel p){
        this.P_PDF= (Panel_VisorPDF) p;
    }
     
     public void addPDF(){
         V_Principal.addPanel_VisorPDF();
         V_Principal.bloquearPanel();
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_ListaClientes = new javax.swing.JButton();
        jButton_listadeproductos = new javax.swing.JButton();
        jButton_listarecepcionesjudiciales = new javax.swing.JButton();
        jButton_listaderecepcionesvoluntarias = new javax.swing.JButton();
        jButton_listaderemates = new javax.swing.JButton();
        jButton_listaderolescausas = new javax.swing.JButton();
        jButton_listadeplanillaremates = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton_cajaremate = new javax.swing.JButton();
        jButton_detalledelotesrematados = new javax.swing.JButton();
        jButton_plantilladeremate = new javax.swing.JButton();
        jButton_planilladeremate = new javax.swing.JButton();
        jButton_recepcionjudicial = new javax.swing.JButton();
        jButton_recepcionvoluntaria = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imprimir Listas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jButton_ListaClientes.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_ListaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/cliente/48.png"))); // NOI18N
        jButton_ListaClientes.setText("Imprimir Lista de Clientes");
        jButton_ListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListaClientesActionPerformed(evt);
            }
        });

        jButton_listadeproductos.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_listadeproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/canasto/48.png"))); // NOI18N
        jButton_listadeproductos.setText("Imprimir Lista de Productos");
        jButton_listadeproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listadeproductosActionPerformed(evt);
            }
        });

        jButton_listarecepcionesjudiciales.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_listarecepcionesjudiciales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/justicia/48.png"))); // NOI18N
        jButton_listarecepcionesjudiciales.setText("Imprimir Lista de Recepciones Judiciales");
        jButton_listarecepcionesjudiciales.setEnabled(false);
        jButton_listarecepcionesjudiciales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listarecepcionesjudicialesActionPerformed(evt);
            }
        });

        jButton_listaderecepcionesvoluntarias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton_listaderecepcionesvoluntarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/justicia/48.png"))); // NOI18N
        jButton_listaderecepcionesvoluntarias.setText("Imprimir Lista de Recepciones Voluntarias");
        jButton_listaderecepcionesvoluntarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listaderecepcionesvoluntariasActionPerformed(evt);
            }
        });

        jButton_listaderemates.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_listaderemates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/modificar/documentos/48.png"))); // NOI18N
        jButton_listaderemates.setText("Imprimir Lista de Remates");
        jButton_listaderemates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listaderematesActionPerformed(evt);
            }
        });

        jButton_listaderolescausas.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_listaderolescausas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/modificar/documentos/48.png"))); // NOI18N
        jButton_listaderolescausas.setText("Imprimir Lista de Roles/Causas");
        jButton_listaderolescausas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listaderolescausasActionPerformed(evt);
            }
        });

        jButton_listadeplanillaremates.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_listadeplanillaremates.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/modificar/documentos/48.png"))); // NOI18N
        jButton_listadeplanillaremates.setText("Imprimir Lista de Planilla de Remates");
        jButton_listadeplanillaremates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listadeplanillarematesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_ListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jButton_listadeproductos, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jButton_listarecepcionesjudiciales, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jButton_listaderecepcionesvoluntarias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_listaderemates, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jButton_listaderolescausas, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addComponent(jButton_listadeplanillaremates, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton_ListaClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listadeproductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listarecepcionesjudiciales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listaderecepcionesvoluntarias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listaderemates)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listaderolescausas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_listadeplanillaremates)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imprimir Documentos Individuales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jButton_cajaremate.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_cajaremate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/imprimir/48.png"))); // NOI18N
        jButton_cajaremate.setText("Imprimir Caja Remate");
        jButton_cajaremate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cajaremateActionPerformed(evt);
            }
        });

        jButton_detalledelotesrematados.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_detalledelotesrematados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/imprimir/48.png"))); // NOI18N
        jButton_detalledelotesrematados.setText("Imprimir Detalle de Lotes Rematados");
        jButton_detalledelotesrematados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_detalledelotesrematadosActionPerformed(evt);
            }
        });

        jButton_plantilladeremate.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_plantilladeremate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/modificar/documentos/48.png"))); // NOI18N
        jButton_plantilladeremate.setText("Imprimir Planilla de Remate");

        jButton_planilladeremate.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_planilladeremate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/modificar/documentos/48.png"))); // NOI18N
        jButton_planilladeremate.setText("Imprimir Planilla de Remate (Lote)");
        jButton_planilladeremate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_planilladeremateActionPerformed(evt);
            }
        });

        jButton_recepcionjudicial.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_recepcionjudicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/justicia/48.png"))); // NOI18N
        jButton_recepcionjudicial.setText("Imprimir Recepción Judicial");
        jButton_recepcionjudicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recepcionjudicialActionPerformed(evt);
            }
        });

        jButton_recepcionvoluntaria.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_recepcionvoluntaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/justicia/48.png"))); // NOI18N
        jButton_recepcionvoluntaria.setText("Imprimir Recepción Voluntaria");
        jButton_recepcionvoluntaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_recepcionvoluntariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_plantilladeremate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(jButton_cajaremate, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_recepcionjudicial, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_recepcionvoluntaria, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                    .addComponent(jButton_planilladeremate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addComponent(jButton_detalledelotesrematados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton_cajaremate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_plantilladeremate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_recepcionjudicial)
                    .addComponent(jButton_recepcionvoluntaria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_planilladeremate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_detalledelotesrematados)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jButton_Volver.setFont(new java.awt.Font("Arial", 0, 14));
        jButton_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/flechas/atras/24.png"))); // NOI18N
        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Volver)
                        .addGap(5, 5, 5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListaClientesActionPerformed
        
        try
        {      
            Imprimir_Lista_Clientes.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_clientes.pdf");
        this.addPDF();
        
        
    }//GEN-LAST:event_jButton_ListaClientesActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // TODO add your handling code here:
        V_Principal.removePanel_Sel_Impresion();
        V_Principal.addPanel_Bienvenido();
    }//GEN-LAST:event_jButton_VolverActionPerformed

    private void jButton_listadeproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listadeproductosActionPerformed
                try
        {      
            Imprimir_Lista_Productos.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_productos.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_listadeproductosActionPerformed

    private void jButton_listarecepcionesjudicialesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listarecepcionesjudicialesActionPerformed
                        try
        {      
            Imprimir_Lista_Recepciones_Judiciales.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_recepciones_judiciales.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_listarecepcionesjudicialesActionPerformed

    private void jButton_listaderecepcionesvoluntariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listaderecepcionesvoluntariasActionPerformed
        try
        {      
            Imprimir_Lista_Recepciones_Voluntarias.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_recepciones_voluntarias.pdf");
        this.addPDF();// TODO add your handling code here:
    }//GEN-LAST:event_jButton_listaderecepcionesvoluntariasActionPerformed

    private void jButton_listaderematesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listaderematesActionPerformed
        try
        {      
            Imprimir_Lista_Remates.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_remates.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_listaderematesActionPerformed

    private void jButton_listaderolescausasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listaderolescausasActionPerformed
            try
        {      
            Imprimir_Lista_RolesCausas.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_de_rolescausas.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_listaderolescausasActionPerformed

    private void jButton_listadeplanillarematesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listadeplanillarematesActionPerformed
        try
        {      
            Imprimir_Listado_Planilla_Remate.imprimir(path);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"listado_planilla_remate.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_listadeplanillarematesActionPerformed

    private void jButton_cajaremateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cajaremateActionPerformed
        
        String st = JOptionPane.showInputDialog("Ingrese ID del Remate a Imprimir");
        try
        {      
            Imprimir_Caja_Remate.imprimir(path,st);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"caja_de_remates.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_cajaremateActionPerformed

    private void jButton_recepcionjudicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recepcionjudicialActionPerformed
        
        String st = JOptionPane.showInputDialog("Ingrese ID de la recepción judicial");
        try
        {      
            Imprimir_Recepcion_Judicial.imprimir(path,st);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"recepcion_judicial.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_recepcionjudicialActionPerformed

    private void jButton_recepcionvoluntariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_recepcionvoluntariaActionPerformed
        
        int st = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de la recepción voluntaria"));
        
        try
        {      
            Imprimir_Recepcion_Voluntaria.imprimir(path,st);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"recepcion_voluntaria.pdf");
        this.addPDF();
    
    }//GEN-LAST:event_jButton_recepcionvoluntariaActionPerformed

    private void jButton_planilladeremateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_planilladeremateActionPerformed
        
        String st = JOptionPane.showInputDialog("Ingrese ID del remate");
        
        try
        {      
            Imprimir_Planilla_Remate_Lote.imprimir(path,st);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"anexo_plantilla_remate.pdf");
        this.addPDF();
        
    }//GEN-LAST:event_jButton_planilladeremateActionPerformed

    private void jButton_detalledelotesrematadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_detalledelotesrematadosActionPerformed
        
        String st = JOptionPane.showInputDialog("Ingrese ID del remate");
        
        try
        {      
            Imprimir_Detalle_Lotes_Rematados.imprimir(path,st);
        }
        catch(DocumentException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
        
        P_PDF.setRutaArchivo(path+"detalle_lotes_rematados.pdf");
        this.addPDF();
    }//GEN-LAST:event_jButton_detalledelotesrematadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ListaClientes;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JButton jButton_cajaremate;
    private javax.swing.JButton jButton_detalledelotesrematados;
    private javax.swing.JButton jButton_listadeplanillaremates;
    private javax.swing.JButton jButton_listadeproductos;
    private javax.swing.JButton jButton_listaderecepcionesvoluntarias;
    private javax.swing.JButton jButton_listaderemates;
    private javax.swing.JButton jButton_listaderolescausas;
    private javax.swing.JButton jButton_listarecepcionesjudiciales;
    private javax.swing.JButton jButton_planilladeremate;
    private javax.swing.JButton jButton_plantilladeremate;
    private javax.swing.JButton jButton_recepcionjudicial;
    private javax.swing.JButton jButton_recepcionvoluntaria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
