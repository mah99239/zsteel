/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsteel;

import java.awt.Color;

/**
 *
 * @author mahmoud
 */
public class D_finanaaddout_custodiscount extends javax.swing.JDialog {

    /**
     * Creates new form D_finanaaddout_closemoney
     */
    public D_finanaaddout_custodiscount(D_finanaddout parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public D_finanaaddout_custodiscount ()
    {
        super();
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

        jpgroub = new javax.swing.JPanel();
        jpdata1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jldata = new javax.swing.JLabel();
        jpdata2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlgetsuppl = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jpgroub.setBackground(new java.awt.Color(255, 255, 255));
        jpgroub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpdata1.setBackground(new java.awt.Color(0, 0, 0));
        jpdata1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("التاريخ");
        jpdata1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 40, 20));

        jldata.setBackground(new java.awt.Color(102, 153, 255));
        jldata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jldata.setForeground(new java.awt.Color(255, 255, 255));
        jldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jldata.setOpaque(true);
        jldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jldataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jldataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jldataMouseExited(evt);
            }
        });
        jpdata1.add(jldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 20));

        jpgroub.add(jpdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 180, 20));

        jpdata2.setBackground(new java.awt.Color(0, 0, 0));
        jpdata2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("المورد");
        jpdata2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 0, 40, 20));

        jlgetsuppl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlgetsuppl.setOpaque(true);
        jlgetsuppl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlgetsupplMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlgetsupplMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlgetsupplMouseExited(evt);
            }
        });
        jpdata2.add(jlgetsuppl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 20));

        jpgroub.add(jpdata2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 280, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpgroub.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, 80));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_32px.png"))); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("خصم لحساب عميل");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 120, 30));

        jpgroub.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 158, 30));

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("المبلغ المخصوم");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 30));

        jpgroub.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 160, 60));

        jButton1.setBackground(new java.awt.Color(255, 0, 51));
        jButton1.setText("الغاء");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpgroub.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 220, 80, -1));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("تاكيد");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jpgroub.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ملاحظات");
        jpgroub.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 90, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpgroub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpgroub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(539, 258));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jldataMouseClicked
            new D_finanaddout_data(this,true).setVisible(true);
      
        //d.setVisible(true);

        

    }//GEN-LAST:event_jldataMouseClicked

    private void jldataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jldataMouseEntered
        jldata.setBackground(Color.orange);
    }//GEN-LAST:event_jldataMouseEntered

    private void jldataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jldataMouseExited
        // TODO add your handling code here:
        jldata.setBackground(new java.awt.Color(102, 153, 255));
    }//GEN-LAST:event_jldataMouseExited

    private void jlgetsupplMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlgetsupplMouseClicked
new D_finanaaddout_custodiscount_getcu(this, true).setVisible(true);
        
    }//GEN-LAST:event_jlgetsupplMouseClicked

    private void jlgetsupplMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlgetsupplMouseEntered
        // TODO add your handling code here:
        jlgetsuppl.setBackground(Color.orange);
    }//GEN-LAST:event_jlgetsupplMouseEntered

    private void jlgetsupplMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlgetsupplMouseExited
        // TODO add your handling code here:
        jlgetsuppl.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jlgetsupplMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(Color.CYAN);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new java.awt.Color(0, 51, 255));

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_custodiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_custodiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_custodiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_custodiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_finanaaddout_custodiscount dialog = new D_finanaaddout_custodiscount(new D_finanaddout(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel jldata;
    private javax.swing.JLabel jlgetsuppl;
    private javax.swing.JPanel jpdata1;
    private javax.swing.JPanel jpdata2;
    private javax.swing.JPanel jpgroub;
    // End of variables declaration//GEN-END:variables
}
