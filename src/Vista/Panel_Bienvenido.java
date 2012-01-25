/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bastian
 */
public class Panel_Bienvenido extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Bienvenido
     */
    private VentanaPrincipal V_Principal;
    
    public Panel_Bienvenido() {
        initComponents();
    }
    
    public void setFrame(JFrame f){
        this.V_Principal= (VentanaPrincipal) f;
    }
    
    private void Pronto(){
        JOptionPane.showMessageDialog(V_Principal, "Pronto será implementado\n¡Gracias!","SUBASYS" , JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu_Cliente = new javax.swing.JPopupMenu();
        jMenuItem_NuevoCliente = new javax.swing.JMenuItem();
        jMenuItem_ModificarCliente = new javax.swing.JMenuItem();
        jPopupMenu_ReVoluntaria = new javax.swing.JPopupMenu();
        jMenuItem_NuevaReVoluntaria = new javax.swing.JMenuItem();
        jMenuItem_ModificarReVoluntaria = new javax.swing.JMenuItem();
        jPopupMenu_ReJudicial = new javax.swing.JPopupMenu();
        jMenuItem_NuevaReJudicial = new javax.swing.JMenuItem();
        jMenuItem_ModificarReJudicial = new javax.swing.JMenuItem();
        jPopupMenu_Remate = new javax.swing.JPopupMenu();
        jMenuItem_NuevoRemate = new javax.swing.JMenuItem();
        jMenuItem_ModificarRemate = new javax.swing.JMenuItem();
        jPopupMenu_Producto = new javax.swing.JPopupMenu();
        jMenuItem_NuevoProducto = new javax.swing.JMenuItem();
        jMenuItem_ModificarProducto = new javax.swing.JMenuItem();
        jPopupMenu_Factura = new javax.swing.JPopupMenu();
        jMenuItem_NuevaFactura = new javax.swing.JMenuItem();
        jMenuItem_AnularFactura = new javax.swing.JMenuItem();
        jPopupMenu_Causa = new javax.swing.JPopupMenu();
        jMenuItem_NuevaCausa = new javax.swing.JMenuItem();
        jMenuItem_ModificarCausa = new javax.swing.JMenuItem();
        jButton_Remate = new javax.swing.JButton();
        jButton_NuevoCliente = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_Factura = new javax.swing.JButton();
        jButton_Causa = new javax.swing.JButton();
        subasys2_Logo1 = new Vista.Imagenes_Label.Subasys2_Logo();
        jButton_ReVoluntaria = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jMenuItem_NuevoCliente.setText("Nuevo Cliente");
        jMenuItem_NuevoCliente.setToolTipText("Agrega un nuevo cliente");
        jMenuItem_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevoClienteActionPerformed(evt);
            }
        });
        jPopupMenu_Cliente.add(jMenuItem_NuevoCliente);

        jMenuItem_ModificarCliente.setText("Modificar Cliente");
        jMenuItem_ModificarCliente.setToolTipText("Modifica un cliente ya creado");
        jMenuItem_ModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarClienteActionPerformed(evt);
            }
        });
        jPopupMenu_Cliente.add(jMenuItem_ModificarCliente);

        jMenuItem_NuevaReVoluntaria.setText("Nueva Recepción Voluntaria");
        jMenuItem_NuevaReVoluntaria.setToolTipText("Agrega una nueva recepción");
        jMenuItem_NuevaReVoluntaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaReVoluntariaActionPerformed(evt);
            }
        });
        jPopupMenu_ReVoluntaria.add(jMenuItem_NuevaReVoluntaria);

        jMenuItem_ModificarReVoluntaria.setText("Modificar Recepción Voluntaria");
        jMenuItem_ModificarReVoluntaria.setToolTipText("Modifica una recepción voluntaria existente");
        jMenuItem_ModificarReVoluntaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarReVoluntariaActionPerformed(evt);
            }
        });
        jPopupMenu_ReVoluntaria.add(jMenuItem_ModificarReVoluntaria);

        jMenuItem_NuevaReJudicial.setText("Nueva Recepción Judicial");
        jMenuItem_NuevaReJudicial.setToolTipText("Agrega una nueva recepción judicial");
        jMenuItem_NuevaReJudicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaReJudicialActionPerformed(evt);
            }
        });
        jPopupMenu_ReJudicial.add(jMenuItem_NuevaReJudicial);

        jMenuItem_ModificarReJudicial.setText("Modificar Recepción Judicial");
        jMenuItem_ModificarReJudicial.setToolTipText("Modifica una recepción judicial existente");
        jMenuItem_ModificarReJudicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarReJudicialActionPerformed(evt);
            }
        });
        jPopupMenu_ReJudicial.add(jMenuItem_ModificarReJudicial);

        jMenuItem_NuevoRemate.setText("Nuevo Remate");
        jMenuItem_NuevoRemate.setToolTipText("Agrega un nuevo remate");
        jMenuItem_NuevoRemate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevoRemateActionPerformed(evt);
            }
        });
        jPopupMenu_Remate.add(jMenuItem_NuevoRemate);

        jMenuItem_ModificarRemate.setText("Modificar Remate");
        jMenuItem_ModificarRemate.setToolTipText("Modifica un remate existente");
        jMenuItem_ModificarRemate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarRemateActionPerformed(evt);
            }
        });
        jPopupMenu_Remate.add(jMenuItem_ModificarRemate);

        jMenuItem_NuevoProducto.setText("Nuevo Producto");
        jMenuItem_NuevoProducto.setToolTipText("Agrega un nuevo producto");
        jMenuItem_NuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevoProductoActionPerformed(evt);
            }
        });
        jPopupMenu_Producto.add(jMenuItem_NuevoProducto);

        jMenuItem_ModificarProducto.setText("Modificar Producto");
        jMenuItem_ModificarProducto.setToolTipText("Modifica un producto existente");
        jMenuItem_ModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarProductoActionPerformed(evt);
            }
        });
        jPopupMenu_Producto.add(jMenuItem_ModificarProducto);

        jMenuItem_NuevaFactura.setText("Nueva Factura");
        jMenuItem_NuevaFactura.setToolTipText("Agrega un nueva factura");
        jMenuItem_NuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaFacturaActionPerformed(evt);
            }
        });
        jPopupMenu_Factura.add(jMenuItem_NuevaFactura);

        jMenuItem_AnularFactura.setText("Modificar Factura");
        jMenuItem_AnularFactura.setToolTipText("Modifica una factura existente");
        jMenuItem_AnularFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AnularFacturaActionPerformed(evt);
            }
        });
        jPopupMenu_Factura.add(jMenuItem_AnularFactura);

        jMenuItem_NuevaCausa.setText("Nueva Causa");
        jMenuItem_NuevaCausa.setToolTipText("Agrega una nueva causa");
        jMenuItem_NuevaCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_NuevaCausaActionPerformed(evt);
            }
        });
        jPopupMenu_Causa.add(jMenuItem_NuevaCausa);

        jMenuItem_ModificarCausa.setText("Modificar Causa");
        jMenuItem_ModificarCausa.setToolTipText("Modifica una causa ya creada");
        jMenuItem_ModificarCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ModificarCausaActionPerformed(evt);
            }
        });
        jPopupMenu_Causa.add(jMenuItem_ModificarCausa);

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));

        jButton_Remate.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_Remate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/martillo/64.png"))); // NOI18N
        jButton_Remate.setText("Remate");
        jButton_Remate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemateActionPerformed(evt);
            }
        });

        jButton_NuevoCliente.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_NuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/agregar_cliente/64.png"))); // NOI18N
        jButton_NuevoCliente.setText("Cliente");
        jButton_NuevoCliente.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NuevoClienteActionPerformed(evt);
            }
        });

        jButton_Salir.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/salir/32.png"))); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_Salir.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_Salir.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_Factura.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_Factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/factura/64.png"))); // NOI18N
        jButton_Factura.setText("Factura");
        jButton_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturaActionPerformed(evt);
            }
        });

        jButton_Causa.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_Causa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/justicia/64.png"))); // NOI18N
        jButton_Causa.setText("Causa");
        jButton_Causa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CausaActionPerformed(evt);
            }
        });

        jButton_ReVoluntaria.setFont(new java.awt.Font("Arial", 0, 18));
        jButton_ReVoluntaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/producto/64.png"))); // NOI18N
        jButton_ReVoluntaria.setText("Recepcion Voluntaria");
        jButton_ReVoluntaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReVoluntariaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes_Files/buscar/48.png"))); // NOI18N
        jButton1.setText("Busqueda");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_Causa, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(jButton_ReVoluntaria)
                        .addGap(165, 165, 165))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(subasys2_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton_Remate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(248, 248, 248)
                                .addComponent(jButton_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Factura, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(subasys2_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Factura)
                            .addComponent(jButton_Causa)
                            .addComponent(jButton_ReVoluntaria))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Remate)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarPopMenu(javax.swing.JButton b, javax.swing.JPopupMenu menu){
        menu.show(b, -1, b.getHeight());
    }
    private void jButton_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NuevoClienteActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_NuevoCliente,jPopupMenu_Cliente);
        
    }//GEN-LAST:event_jButton_NuevoClienteActionPerformed

    private void jButton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton_SalirActionPerformed

    private void jButton_RemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemateActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_Remate,jPopupMenu_Remate);
    }//GEN-LAST:event_jButton_RemateActionPerformed

    private void jButton_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturaActionPerformed
        // TODO add your handling code here:
         MostrarPopMenu(jButton_Factura,jPopupMenu_Factura);
    }//GEN-LAST:event_jButton_FacturaActionPerformed

    private void jMenuItem_ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarClienteActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Cliente(false,1);
    }//GEN-LAST:event_jMenuItem_ModificarClienteActionPerformed

    private void jMenuItem_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoClienteActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Cliente(true,1);
    }//GEN-LAST:event_jMenuItem_NuevoClienteActionPerformed

    private void jMenuItem_NuevoRemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoRemateActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Remate(true);
    }//GEN-LAST:event_jMenuItem_NuevoRemateActionPerformed

    private void jMenuItem_ModificarRemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarRemateActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Remate(false);
    }//GEN-LAST:event_jMenuItem_ModificarRemateActionPerformed

    private void jMenuItem_NuevaReJudicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaReJudicialActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_ReJudicial(true);
    }//GEN-LAST:event_jMenuItem_NuevaReJudicialActionPerformed

    private void jMenuItem_ModificarReJudicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarReJudicialActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_ReJudicial(false);
    }//GEN-LAST:event_jMenuItem_ModificarReJudicialActionPerformed

    private void jMenuItem_NuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaFacturaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Factura(true);
        //this.Pronto();
    }//GEN-LAST:event_jMenuItem_NuevaFacturaActionPerformed

    private void jMenuItem_AnularFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AnularFacturaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Factura(true);
        //this.Pronto();
    }//GEN-LAST:event_jMenuItem_AnularFacturaActionPerformed

    private void jButton_CausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CausaActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_Causa,jPopupMenu_Causa);
    }//GEN-LAST:event_jButton_CausaActionPerformed

    private void jMenuItem_NuevaReVoluntariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaReVoluntariaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_ReVoluntaria(true);
    }//GEN-LAST:event_jMenuItem_NuevaReVoluntariaActionPerformed

    private void jMenuItem_ModificarReVoluntariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarReVoluntariaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_ReVoluntaria(false);
    }//GEN-LAST:event_jMenuItem_ModificarReVoluntariaActionPerformed

    private void jMenuItem_NuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoProductoActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Producto(true,0);
    }//GEN-LAST:event_jMenuItem_NuevoProductoActionPerformed

    private void jMenuItem_ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarProductoActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Producto(false,0);
    }//GEN-LAST:event_jMenuItem_ModificarProductoActionPerformed

    private void jMenuItem_NuevaCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaCausaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Causa(true);
    }//GEN-LAST:event_jMenuItem_NuevaCausaActionPerformed

    private void jMenuItem_ModificarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarCausaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Causa(false);
    }//GEN-LAST:event_jMenuItem_ModificarCausaActionPerformed

    private void jButton_ReVoluntariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReVoluntariaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_ReVoluntaria(true);
    }//GEN-LAST:event_jButton_ReVoluntariaActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         JDialog frame = new Busqueda(new JFrame(),true);
         frame.setVisible(true);
}//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Causa;
    private javax.swing.JButton jButton_Factura;
    private javax.swing.JButton jButton_NuevoCliente;
    private javax.swing.JButton jButton_ReVoluntaria;
    private javax.swing.JButton jButton_Remate;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JMenuItem jMenuItem_AnularFactura;
    private javax.swing.JMenuItem jMenuItem_ModificarCausa;
    private javax.swing.JMenuItem jMenuItem_ModificarCliente;
    private javax.swing.JMenuItem jMenuItem_ModificarProducto;
    private javax.swing.JMenuItem jMenuItem_ModificarReJudicial;
    private javax.swing.JMenuItem jMenuItem_ModificarReVoluntaria;
    private javax.swing.JMenuItem jMenuItem_ModificarRemate;
    private javax.swing.JMenuItem jMenuItem_NuevaCausa;
    private javax.swing.JMenuItem jMenuItem_NuevaFactura;
    private javax.swing.JMenuItem jMenuItem_NuevaReJudicial;
    private javax.swing.JMenuItem jMenuItem_NuevaReVoluntaria;
    private javax.swing.JMenuItem jMenuItem_NuevoCliente;
    private javax.swing.JMenuItem jMenuItem_NuevoProducto;
    private javax.swing.JMenuItem jMenuItem_NuevoRemate;
    private javax.swing.JPopupMenu jPopupMenu_Causa;
    private javax.swing.JPopupMenu jPopupMenu_Cliente;
    private javax.swing.JPopupMenu jPopupMenu_Factura;
    private javax.swing.JPopupMenu jPopupMenu_Producto;
    private javax.swing.JPopupMenu jPopupMenu_ReJudicial;
    private javax.swing.JPopupMenu jPopupMenu_ReVoluntaria;
    private javax.swing.JPopupMenu jPopupMenu_Remate;
    private Vista.Imagenes_Label.Subasys2_Logo subasys2_Logo1;
    // End of variables declaration//GEN-END:variables
    
}
