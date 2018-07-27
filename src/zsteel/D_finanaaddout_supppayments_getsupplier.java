/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsteel;

import UI.scrollbar;
import UI.tableheader;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author mahmoud
 */
public class D_finanaaddout_supppayments_getsupplier extends javax.swing.JDialog {

    DefaultTableModel m;
    
    public D_finanaaddout_supppayments_getsupplier(D_finanaaddout_supppayments  parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dtable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpaddsupp = new javax.swing.JPanel();
        jbadd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrolltable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("اختر احد الموردين");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 0, 110, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 290, 30));

        jpaddsupp.setBackground(new java.awt.Color(255, 255, 255));
        jpaddsupp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.darkGray, null));
        jpaddsupp.setAutoscrolls(true);
        jpaddsupp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpaddsupp.setFocusCycleRoot(true);
        jpaddsupp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbadd.setBackground(new java.awt.Color(0, 212, 149));
        jbadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus Math_32px.png"))); // NOI18N
        jbadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbadd.setBorderPainted(false);
        jbadd.setContentAreaFilled(false);
        jbadd.setOpaque(true);
        jbadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbaddMouseEntered(evt);
            }
        });
        jbadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaddActionPerformed(evt);
            }
        });
        jpaddsupp.add(jbadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Search.png"))); // NOI18N
        jpaddsupp.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 30, 40));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jpaddsupp.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, 20));

        jPanel1.add(jpaddsupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الموردين"
            }
        ));
        jScrolltable.getVerticalScrollBar().setUI(new scrollbar());
        jScrolltable.setViewportView(table);

        jPanel1.add(jScrolltable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 240, 380));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("تاكيد");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 63, 26));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 63, 26));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 230, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 570));

        setSize(new java.awt.Dimension(305, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setBackground(Color.CYAN);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBackground(new java.awt.Color(0, 51, 255));

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void jbaddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbaddMouseEntered
        // TODO add your handling codeere:
        jbadd.setBackground(new Color(109,216,221));
    }//GEN-LAST:event_jbaddMouseEntered

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jbaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaddActionPerformed
        new D_cusaddclient(new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_jbaddActionPerformed

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
            java.util.logging.Logger.getLogger(D_finanaaddout_supppayments_getsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_supppayments_getsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_supppayments_getsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D_finanaaddout_supppayments_getsupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                D_finanaaddout_supppayments_getsupplier dialog = new D_finanaaddout_supppayments_getsupplier(new D_finanaaddout_supppayments(), true);
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
     public  void dtable ()
    {
        String [] columnx ={"الموردين"};

       
       m = new DefaultTableModel(columnx,0)
       {
            Class[] types = { Integer.class, String.class, String.class, String.class, String.class, String.class };
        
            public boolean iscelleditable(int row , int column)
         {
             return true;
         }
        
         
       };
       table.setModel(m);
        
        
        
          
           
           
        
        table.setModel(m);
        Object []a={"1","سيليبليبل","sdf","sfd","fsd","fds","dfs"};       
        
        m.addRow(a);
      
        
      
    
     
        
          JTableHeader header = table.getTableHeader();
       header.setPreferredSize(new Dimension(0, 30));
       header.setEnabled(false);
       table.getTableHeader().setDefaultRenderer(new tableheader());
    table.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);

       
        jScrolltable.getViewport().setBackground(Color.white);
        Panel p =new Panel();
        p.setBackground(Color.BLACK);
        jScrolltable.setCorner("UPPER_RIGHT_CORNER", p);
        jScrolltable. setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        table.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        
        
   
        
        
        
        //start customize  size column range 60:200
        TableColumnModel column = table.getColumnModel();
        
       /* if(address){
        column.getColumn(0).setPreferredWidth(60);
        column.getColumn(0).setMaxWidth(60);
        column.getColumn(1).setPreferredWidth(100);
        column.getColumn(1).setMaxWidth(100);
        column.getColumn(2).setPreferredWidth(150);
        column.getColumn(2).setMaxWidth(150);
        column.getColumn(3).setPreferredWidth(150);
        column.getColumn(3).setMaxWidth(150);
        column.getColumn(4).setPreferredWidth(150);
        column.getColumn(4).setMaxWidth(150);
        column.getColumn(5).setPreferredWidth(150);
        column.getColumn(5).setMaxWidth(150);
        column.getColumn(6).setPreferredWidth(150);
        column.getColumn(6).setMaxWidth(150);
//        column.getColumn(7).setPreferredWidth(150);
  //      column.getColumn(7).setMaxWidth(150);
       // column.getColumn(8).setPreferredWidth(150);
       // column.getColumn(8).setMaxWidth(150);
        }
        else 
        {
            address= false;
            
        }
        table.setColumnModel(column);
        //end size column
        */
      
        table.setDefaultEditor(Object.class, null);
        
        //start customize row in table
       /* DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(0);
    table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);    
    table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(6).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(7).setCellRenderer(rightRenderer);
    table.getColumnModel().getColumn(8).setCellRenderer(rightRenderer);
  // end customize row
  */
       DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
     
        
        
      
    
   // renderer.setHorizontalAlignment(WIDTH);
  //  renderer.setVerticalAlignment(renderer.CENTER);
    for (int i = 0; i < table.getColumnCount(); i++)
    {
      table.getColumn(table.getColumnName(i)).setCellRenderer(renderer);

    }
       
        
        table.setModel(m);
       
    }
    private void selectclient()
    {
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrolltable;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbadd;
    private javax.swing.JPanel jpaddsupp;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
