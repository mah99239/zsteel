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
public class D_managaddbill extends javax.swing.JDialog {

    
    public D_managaddbill(f_management parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public D_managaddbill()
    {initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jlexit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpBut_supllier2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpBut_supllier4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jpBut_supllier7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jpBut_supllier8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpgroub.setBackground(new java.awt.Color(255, 255, 255));
        jpgroub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlexit.setBackground(new java.awt.Color(0, 51, 255));
        jlexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_32px.png"))); // NOI18N
        jlexit.setOpaque(true);
        jlexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlexitMouseExited(evt);
            }
        });
        jPanel2.add(jlexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("اختر نوع العمليه");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 90, 30));

        jpgroub.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 30));

        jpBut_supllier2.setBackground(new java.awt.Color(255, 255, 255));
        jpBut_supllier2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpBut_supllier2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBut_supllier2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBut_supllier2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBut_supllier2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBut_supllier2MousePressed(evt);
            }
        });
        jpBut_supllier2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Renew Subscription_64px.png"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpBut_supllier2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 70));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("فاتوره مرتجع لعميل");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jpBut_supllier2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, -1));

        jpgroub.add(jpBut_supllier2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 120, 90));

        jpBut_supllier4.setBackground(new java.awt.Color(255, 255, 255));
        jpBut_supllier4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpBut_supllier4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBut_supllier4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBut_supllier4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBut_supllier4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBut_supllier4MousePressed(evt);
            }
        });
        jpBut_supllier4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Paycheque_64px.png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpBut_supllier4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 60));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("فاتوره بيع");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jpBut_supllier4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, -1));

        jpgroub.add(jpBut_supllier4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 120, 90));

        jpBut_supllier7.setBackground(new java.awt.Color(255, 255, 255));
        jpBut_supllier7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpBut_supllier7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBut_supllier7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBut_supllier7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBut_supllier7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBut_supllier7MousePressed(evt);
            }
        });
        jpBut_supllier7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Renew Subscription_64px.png"))); // NOI18N
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpBut_supllier7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 70));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("فاتوره مرتجع لمورد");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jpBut_supllier7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, -1));

        jpgroub.add(jpBut_supllier7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 90));

        jpBut_supllier8.setBackground(new java.awt.Color(255, 255, 255));
        jpBut_supllier8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jpBut_supllier8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpBut_supllier8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpBut_supllier8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpBut_supllier8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBut_supllier8MousePressed(evt);
            }
        });
        jpBut_supllier8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Paycheque_64px.png"))); // NOI18N
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpBut_supllier8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 60, 60));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("فاتوره شراء");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jpBut_supllier8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jpgroub.add(jpBut_supllier8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 120, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpgroub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpgroub, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlexitMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jlexitMouseClicked

    private void jlexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlexitMouseEntered
        jlexit.setBackground(Color.CYAN);
        // TODO add your handling code here:
    }//GEN-LAST:event_jlexitMouseEntered

    private void jlexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlexitMouseExited
        jlexit.setBackground(new java.awt.Color(0, 51, 255));

    }//GEN-LAST:event_jlexitMouseExited

    private void jpBut_supllier2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier2MouseClicked
        // TODO add your handling code here:
         setVisible(false);
       new D_finanaaddout_receiptcust(this, true).setVisible(true);
    }//GEN-LAST:event_jpBut_supllier2MouseClicked

    private void jpBut_supllier2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier2MouseEntered

    private void jpBut_supllier2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier2MouseExited

    private void jpBut_supllier2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier2MousePressed

    private void jpBut_supllier4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier4MouseClicked
        setVisible(false);
        new D_finaninside_sale(this, true).setVisible(true);
    }//GEN-LAST:event_jpBut_supllier4MouseClicked

    private void jpBut_supllier4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier4MouseEntered
         // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier4MouseEntered

    private void jpBut_supllier4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier4MouseExited

    private void jpBut_supllier4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier4MousePressed

    private void jpBut_supllier7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier7MouseClicked

        setVisible(false);
        new D_finaninside_billrecall(this, true).setVisible(true);
    }//GEN-LAST:event_jpBut_supllier7MouseClicked

    private void jpBut_supllier7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier7MouseEntered

    private void jpBut_supllier7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier7MouseExited

    private void jpBut_supllier7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier7MousePressed

    private void jpBut_supllier8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier8MouseClicked
        // TODO add your handling code here:
        setVisible(false);
                new D_finanaaddout_receipt(this, true).setVisible(true);

        
    }//GEN-LAST:event_jpBut_supllier8MouseClicked

    private void jpBut_supllier8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier8MouseEntered

    private void jpBut_supllier8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier8MouseExited

    private void jpBut_supllier8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBut_supllier8MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpBut_supllier8MousePressed

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
            java.util.logging.Logger.getLogger(D_managaddbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_managaddbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_managaddbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_managaddbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_managaddbill dialog = new D_managaddbill(new f_management(), true);
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlexit;
    private javax.swing.JPanel jpBut_supllier2;
    private javax.swing.JPanel jpBut_supllier4;
    private javax.swing.JPanel jpBut_supllier7;
    private javax.swing.JPanel jpBut_supllier8;
    private javax.swing.JPanel jpgroub;
    // End of variables declaration//GEN-END:variables
}
