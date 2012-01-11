/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author bastian
 */
public class Panel_Producto extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Producto
     */
    public Panel_Producto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Producto = new javax.swing.JLabel();
        jLabel_Cantidad = new javax.swing.JLabel();
        jSpinner_Cantidad = new javax.swing.JSpinner();
        jButton_Buscar = new javax.swing.JButton();
        Label_ID = new javax.swing.JLabel();
        jButton_Modificar = new javax.swing.JButton();
        TextField_RUT = new javax.swing.JTextField();
        jLabel_PrecioU = new javax.swing.JLabel();
        jTextField_PrecioU = new javax.swing.JTextField();
        jLabel_PrecioT = new javax.swing.JLabel();
        jTextField_PrecioT = new javax.swing.JTextField();
        jLabel_Descripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Descripcion = new javax.swing.JTextArea();
        jLabel_Garantia = new javax.swing.JLabel();
        jTextField_Garantia = new javax.swing.JTextField();
        jLabel_NumLote = new javax.swing.JLabel();
        jSpinner_NumLote = new javax.swing.JSpinner();

        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel_Producto.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel_Producto.setText("Producto");

        jLabel_Cantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Cantidad.setText("Cantidad");

        jSpinner_Cantidad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jButton_Buscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Buscar.setText("Buscar");

        Label_ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Label_ID.setText("ID");

        jButton_Modificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Modificar.setText("Modificar");

        TextField_RUT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_PrecioU.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_PrecioU.setText("Precio Unitario");

        jTextField_PrecioU.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_PrecioT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_PrecioT.setText("Precio Total");

        jTextField_PrecioT.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_Descripcion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Descripcion.setText("Descripción (máximo 1000 caracteres)");

        jTextArea_Descripcion.setColumns(20);
        jTextArea_Descripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextArea_Descripcion.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Descripcion);

        jLabel_Garantia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Garantia.setText("Garantía");

        jTextField_Garantia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel_NumLote.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_NumLote.setText("Nº Lote");

        jSpinner_NumLote.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Producto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Cantidad)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel_PrecioU)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_PrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_PrecioT)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_PrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Label_ID)
                                .addGap(18, 18, 18)
                                .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton_Buscar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Modificar))
                            .addComponent(jLabel_Descripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Garantia)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Garantia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_NumLote)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner_NumLote, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Producto)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Label_ID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(TextField_RUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Buscar)
                    .addComponent(jButton_Modificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Cantidad)
                    .addComponent(jSpinner_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PrecioU)
                    .addComponent(jTextField_PrecioU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_PrecioT)
                    .addComponent(jTextField_PrecioT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Garantia)
                    .addComponent(jTextField_Garantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_NumLote)
                    .addComponent(jSpinner_NumLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel_Descripcion)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_ID;
    private javax.swing.JTextField TextField_RUT;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Modificar;
    private javax.swing.JLabel jLabel_Cantidad;
    private javax.swing.JLabel jLabel_Descripcion;
    private javax.swing.JLabel jLabel_Garantia;
    private javax.swing.JLabel jLabel_NumLote;
    private javax.swing.JLabel jLabel_PrecioT;
    private javax.swing.JLabel jLabel_PrecioU;
    private javax.swing.JLabel jLabel_Producto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner_Cantidad;
    private javax.swing.JSpinner jSpinner_NumLote;
    private javax.swing.JTextArea jTextArea_Descripcion;
    private javax.swing.JTextField jTextField_Garantia;
    private javax.swing.JTextField jTextField_PrecioT;
    private javax.swing.JTextField jTextField_PrecioU;
    // End of variables declaration//GEN-END:variables
}
