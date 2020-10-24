package Layouts;

import Clases.Start;
import Desvanecimiento.Desvanecimiento;

public class Abono extends javax.swing.JFrame {

    public Abono() {
        initComponents();
        setLocationRelativeTo(null);
    }
    Desvanecimiento animacion;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelNombreCliente = new javax.swing.JLabel();
        LabelDeuda = new javax.swing.JLabel();
        LabelDeduaCant = new javax.swing.JLabel();
        LabelCantidadAbonar = new javax.swing.JLabel();
        TextFieldAbono = new javax.swing.JTextField();
        ButFinAbono = new javax.swing.JButton();
        LabelReturn = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(350, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelTitulo.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("ABONO");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 350, 40));

        LabelNombreCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreCliente.setText("Nombre del cliente");
        getContentPane().add(LabelNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, -1));

        LabelDeuda.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelDeuda.setForeground(new java.awt.Color(255, 255, 255));
        LabelDeuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDeuda.setText("Deuda");
        getContentPane().add(LabelDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, -1));

        LabelDeduaCant.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelDeduaCant.setForeground(new java.awt.Color(200, 200, 200));
        LabelDeduaCant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDeduaCant.setText("5000$");
        getContentPane().add(LabelDeduaCant, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 350, -1));

        LabelCantidadAbonar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LabelCantidadAbonar.setForeground(new java.awt.Color(255, 255, 255));
        LabelCantidadAbonar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCantidadAbonar.setText("Cantidad para abonar");
        getContentPane().add(LabelCantidadAbonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 270, 360, -1));

        TextFieldAbono.setBackground(new java.awt.Color(41, 41, 41));
        TextFieldAbono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TextFieldAbono.setForeground(new java.awt.Color(200, 200, 200));
        TextFieldAbono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextFieldAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAbonoActionPerformed(evt);
            }
        });
        getContentPane().add(TextFieldAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 190, -1));

        ButFinAbono.setBackground(new java.awt.Color(41, 41, 41));
        ButFinAbono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ButFinAbono.setForeground(new java.awt.Color(255, 255, 255));
        ButFinAbono.setText("Realizar abono");
        ButFinAbono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButFinAbono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButFinAbonoMouseClicked(evt);
            }
        });
        getContentPane().add(ButFinAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 150, -1));

        LabelReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Return.png"))); // NOI18N
        LabelReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelReturnMouseClicked(evt);
            }
        });
        getContentPane().add(LabelReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo log&Reg.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAbonoActionPerformed

    private void ButFinAbonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButFinAbonoMouseClicked
        this.dispose();
    }//GEN-LAST:event_ButFinAbonoMouseClicked

    private void LabelReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelReturnMouseClicked

        this.dispose();
    }//GEN-LAST:event_LabelReturnMouseClicked






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButFinAbono;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LabelCantidadAbonar;
    private javax.swing.JLabel LabelDeduaCant;
    private javax.swing.JLabel LabelDeuda;
    private javax.swing.JLabel LabelNombreCliente;
    private javax.swing.JLabel LabelReturn;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextFieldAbono;
    // End of variables declaration//GEN-END:variables
}
