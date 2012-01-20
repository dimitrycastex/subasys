/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

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
        subasys_Logo1 = new Vista.Imagenes_Label.Subasys_Logo();
        jLabel_QueDesea = new javax.swing.JLabel();
        jButton_ReVoluntaria = new javax.swing.JButton();
        jButton_Remate = new javax.swing.JButton();
        jButton_NuevoCliente = new javax.swing.JButton();
        jButton_Configuracion = new javax.swing.JButton();
        jButton_Producto = new javax.swing.JButton();
        jButton_Salir = new javax.swing.JButton();
        jButton_ReJudicial = new javax.swing.JButton();
        jButton_Factura = new javax.swing.JButton();
        jButton_Causa = new javax.swing.JButton();

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

        jLabel_QueDesea.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_QueDesea.setText("¿Por donde comenzamos?");

        jButton_ReVoluntaria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_ReVoluntaria.setText("Recepción Voluntaria");
        jButton_ReVoluntaria.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_ReVoluntaria.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_ReVoluntaria.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_ReVoluntaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReVoluntariaActionPerformed(evt);
            }
        });

        jButton_Remate.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Remate.setText("Remate");
        jButton_Remate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RemateActionPerformed(evt);
            }
        });

        jButton_NuevoCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_NuevoCliente.setText("Cliente");
        jButton_NuevoCliente.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NuevoClienteActionPerformed(evt);
            }
        });

        jButton_Configuracion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Configuracion.setText("Configuracion");
        jButton_Configuracion.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_Configuracion.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_Configuracion.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_Configuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConfiguracionActionPerformed(evt);
            }
        });

        jButton_Producto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Producto.setText("Producto");
        jButton_Producto.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_Producto.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_Producto.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProductoActionPerformed(evt);
            }
        });

        jButton_Salir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Salir.setText("Salir");
        jButton_Salir.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_Salir.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_Salir.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalirActionPerformed(evt);
            }
        });

        jButton_ReJudicial.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_ReJudicial.setText("Recepción Judicial");
        jButton_ReJudicial.setMaximumSize(new java.awt.Dimension(107, 33));
        jButton_ReJudicial.setMinimumSize(new java.awt.Dimension(107, 33));
        jButton_ReJudicial.setPreferredSize(new java.awt.Dimension(107, 33));
        jButton_ReJudicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReJudicialActionPerformed(evt);
            }
        });

        jButton_Factura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Factura.setText("Factura");
        jButton_Factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FacturaActionPerformed(evt);
            }
        });

        jButton_Causa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Causa.setText("Causa");
        jButton_Causa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CausaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Remate, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Causa, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_ReJudicial, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton_ReVoluntaria, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)))
                        .addGap(0, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(subasys_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_QueDesea)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(subasys_Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel_QueDesea)))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Remate)
                    .addComponent(jButton_NuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ReJudicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ReVoluntaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Causa))
                .addGap(63, 63, 63)
                .addComponent(jButton_Factura)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Configuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton_ReVoluntariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReVoluntariaActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_ReVoluntaria,jPopupMenu_ReVoluntaria);
    }//GEN-LAST:event_jButton_ReVoluntariaActionPerformed

    private void jButton_ReJudicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReJudicialActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_ReJudicial,jPopupMenu_ReJudicial);
    }//GEN-LAST:event_jButton_ReJudicialActionPerformed

    private void jButton_ConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConfiguracionActionPerformed
        // TODO add your handling code here:
        this.Pronto();
    }//GEN-LAST:event_jButton_ConfiguracionActionPerformed

    private void jButton_RemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RemateActionPerformed
        // TODO add your handling code here:
        MostrarPopMenu(jButton_Remate,jPopupMenu_Remate);
    }//GEN-LAST:event_jButton_RemateActionPerformed

    private void jButton_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProductoActionPerformed
        // TODO add your handling code here:
         MostrarPopMenu(jButton_Producto,jPopupMenu_Producto);
    }//GEN-LAST:event_jButton_ProductoActionPerformed

    private void jButton_FacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FacturaActionPerformed
        // TODO add your handling code here:
         MostrarPopMenu(jButton_Factura,jPopupMenu_Factura);
    }//GEN-LAST:event_jButton_FacturaActionPerformed

    private void jMenuItem_ModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarClienteActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Cliente(false);
    }//GEN-LAST:event_jMenuItem_ModificarClienteActionPerformed

    private void jMenuItem_NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevoClienteActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Cliente(true);
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
        V_Principal.addPanel_Producto(true);
    }//GEN-LAST:event_jMenuItem_NuevoProductoActionPerformed

    private void jMenuItem_ModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarProductoActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Producto(false);
    }//GEN-LAST:event_jMenuItem_ModificarProductoActionPerformed

    private void jMenuItem_NuevaCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_NuevaCausaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Causa(true);
    }//GEN-LAST:event_jMenuItem_NuevaCausaActionPerformed

    private void jMenuItem_ModificarCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ModificarCausaActionPerformed
        // TODO add your handling code here:
        V_Principal.addPanel_Causa(false);
    }//GEN-LAST:event_jMenuItem_ModificarCausaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Causa;
    private javax.swing.JButton jButton_Configuracion;
    private javax.swing.JButton jButton_Factura;
    private javax.swing.JButton jButton_NuevoCliente;
    private javax.swing.JButton jButton_Producto;
    private javax.swing.JButton jButton_ReJudicial;
    private javax.swing.JButton jButton_ReVoluntaria;
    private javax.swing.JButton jButton_Remate;
    private javax.swing.JButton jButton_Salir;
    private javax.swing.JLabel jLabel_QueDesea;
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
    private Vista.Imagenes_Label.Subasys_Logo subasys_Logo1;
    // End of variables declaration//GEN-END:variables
    
}
