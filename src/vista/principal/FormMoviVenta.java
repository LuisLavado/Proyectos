/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.principal;

/**
 *
 * @author Luis Lavado
 */
public class FormMoviVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormMoviVenta
     */
    public FormMoviVenta() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        jPanel1 = new javax.swing.JPanel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric8 = new org.edisoncor.gui.label.LabelMetric();
        jTextField2 = new javax.swing.JTextField();
        labelMetric9 = new org.edisoncor.gui.label.LabelMetric();
        labelMetric10 = new org.edisoncor.gui.label.LabelMetric();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        comboBoxRect1 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboBoxRect2 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboBoxRect3 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        comboBoxRect4 = new org.edisoncor.gui.comboBox.ComboBoxRect();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setClosable(true);
        setForeground(new java.awt.Color(0, 0, 0));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("     MOVIMIENTO VENTA");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/venta.PNG"))); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSCAR LIBROS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 16))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 196;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 71, 0, 0);
        jPanel2.add(jTextField1, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 18, 0, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Stock", "Precio", "Libro", "Presentación"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 375;
        gridBagConstraints.ipady = 302;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(71, 16, 0, 0);
        jPanel2.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.ipady = -14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 19, 18, 0);
        jPanel2.add(clockDigital1, gridBagConstraints);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 0, -1, 530));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRO DE VENTAS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Vani", 1, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMetric1.setBackground(new java.awt.Color(255, 255, 255));
        labelMetric1.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric1.setText("Subtotal:");
        labelMetric1.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 410, 55, -1));

        labelMetric2.setBackground(new java.awt.Color(0, 0, 0));
        labelMetric2.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric2.setText("Forma de Pago:");
        labelMetric2.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 200, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Libro", "Precio", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 438, 110));

        labelMetric3.setBackground(new java.awt.Color(255, 255, 255));
        labelMetric3.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric3.setText("Cliente:");
        labelMetric3.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelMetric3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(labelMetric3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 44, -1, -1));

        labelMetric4.setBackground(new java.awt.Color(255, 255, 255));
        labelMetric4.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric4.setText("Descuento:");
        labelMetric4.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 441, -1, -1));

        labelMetric5.setBackground(new java.awt.Color(255, 255, 255));
        labelMetric5.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric5.setText("I.G.V.:");
        labelMetric5.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric5, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 472, -1, -1));

        labelMetric6.setBackground(new java.awt.Color(255, 255, 255));
        labelMetric6.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric6.setText("Total:");
        labelMetric6.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric6, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 503, -1, -1));

        labelMetric7.setBackground(new java.awt.Color(0, 0, 0));
        labelMetric7.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric7.setText("Tipo de comprobante:");
        labelMetric7.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric7, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 75, -1, -1));

        labelMetric8.setBackground(new java.awt.Color(0, 0, 0));
        labelMetric8.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric8.setText("Nro. de comprobante:");
        labelMetric8.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 102, -1, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 101, 202, -1));

        labelMetric9.setBackground(new java.awt.Color(0, 0, 0));
        labelMetric9.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric9.setText("Fecha y hora:");
        labelMetric9.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric9, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 168, -1, -1));

        labelMetric10.setBackground(new java.awt.Color(0, 0, 0));
        labelMetric10.setForeground(new java.awt.Color(0, 0, 0));
        labelMetric10.setText("Usuario Venta:");
        labelMetric10.setColorDeSombra(new java.awt.Color(240, 240, 240));
        labelMetric10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(labelMetric10, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 134, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 165, 155, -1));

        comboBoxRect1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boleta", "Factura" }));
        comboBoxRect1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(comboBoxRect1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 73, 204, -1));

        comboBoxRect2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBoxRect2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Contado", "Crédito" }));
        comboBoxRect2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(comboBoxRect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 198, 155, -1));
        jPanel1.add(comboBoxRect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 42, 204, -1));
        jPanel1.add(comboBoxRect4, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 132, 202, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 409, 105, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 440, 105, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 471, 105, -1));
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 502, 105, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Eliminar todo");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 238, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 238, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Editar");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 238, -1, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Cancelar");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 238, -1, -1));

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setText("Agregar");
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 196, -1, -1));

        jButton6.setText("jButton6");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jButton8.setText("jButton8");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jButton9.setText("jButton9");
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect1;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect2;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect3;
    private org.edisoncor.gui.comboBox.ComboBoxRect comboBoxRect4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric10;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private org.edisoncor.gui.label.LabelMetric labelMetric8;
    private org.edisoncor.gui.label.LabelMetric labelMetric9;
    // End of variables declaration//GEN-END:variables
}
