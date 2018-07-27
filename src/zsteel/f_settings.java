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
public class f_settings extends javax.swing.JFrame {
    DefaultTableModel m;
    /**
     * Creates new form f_settings
     */
    public f_settings() {
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
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrolltable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jBmain = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();
        jBadd3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jlb_userlogin = new javax.swing.JLabel();
        jBadd4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("اداره قاعده البيانات");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(446, 446, 446)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrolltable.getVerticalScrollBar().setUI(new scrollbar());
        jScrolltable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrolltable.setHorizontalScrollBarPolicy(31);
        jScrolltable.setAutoscrolls(true);
        jScrolltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrolltableMouseEntered(evt);
            }
        });

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new DefaultTableModel(new Object[0][], new String []{"مسلسل","قواعد البيانات المحفوظه"}));
        table.setRowHeight(30);
        table.setSurrendersFocusOnKeystroke(true);
        jScrolltable.setViewportView(table);

        jBmain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Home1_32px.jpg"))); // NOI18N
        jBmain.setBorderPainted(false);
        jBmain.setContentAreaFilled(false);
        jBmain.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBmain.setFocusPainted(false);
        jBmain.setFocusable(false);
        jBmain.setIconTextGap(0);
        jBmain.setPreferredSize(new java.awt.Dimension(77, 45));
        jBmain.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_32px.png"))); // NOI18N
        jBmain.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Homeblue_32px.png"))); // NOI18N
        jBmain.setVerifyInputWhenFocusTarget(false);
        jBmain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBmainMouseEntered(evt);
            }
        });
        jBmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmainActionPerformed(evt);
            }
        });

        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exitaa1.jpg"))); // NOI18N
        jBexit.setBorderPainted(false);
        jBexit.setContentAreaFilled(false);
        jBexit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBexit.setFocusPainted(false);
        jBexit.setFocusable(false);
        jBexit.setIconTextGap(0);
        jBexit.setPreferredSize(new java.awt.Dimension(77, 45));
        jBexit.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_32px.png"))); // NOI18N
        jBexit.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit_32px.png"))); // NOI18N
        jBexit.setVerifyInputWhenFocusTarget(false);
        jBexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBexitMouseEntered(evt);
            }
        });
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        jBadd3.setBackground(new java.awt.Color(250, 250, 250));
        jBadd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus Math_32px.png"))); // NOI18N
        jBadd3.setText("استعاده قاعده البيانات");
        jBadd3.setToolTipText("");
        jBadd3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBadd3.setContentAreaFilled(false);
        jBadd3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBadd3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBadd3.setIconTextGap(3);
        jBadd3.setInheritsPopupMenu(true);
        jBadd3.setOpaque(true);
        jBadd3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBadd3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBadd3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBadd3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBadd3MouseExited(evt);
            }
        });
        jBadd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadd3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("zsteel");

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("اعدادات النظام");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));

        jLabel6.setBackground(new java.awt.Color(51, 102, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("logged in");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jlb_userlogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBadd4.setBackground(new java.awt.Color(250, 250, 250));
        jBadd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Plus Math_32px.png"))); // NOI18N
        jBadd4.setText("حفظ قاعده البيانات الحاليه");
        jBadd4.setToolTipText("");
        jBadd4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBadd4.setContentAreaFilled(false);
        jBadd4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBadd4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBadd4.setIconTextGap(3);
        jBadd4.setInheritsPopupMenu(true);
        jBadd4.setOpaque(true);
        jBadd4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBadd4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBadd4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBadd4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBadd4MouseExited(evt);
            }
        });
        jBadd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBadd4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBadd3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jBadd4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jBmain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(207, 207, 207)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jlb_userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrolltable, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBadd4, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jBadd3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(626, 626, 626)
                    .addComponent(jBmain, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlb_userlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jScrolltableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrolltableMouseEntered
        jScrolltable.getVerticalScrollBar().setForeground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrolltableMouseEntered

    private void jBmainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBmainMouseEntered
        jBexit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmainMouseEntered

    private void jBmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmainActionPerformed

    private void jBexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexitMouseEntered
        jBexit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexitMouseEntered

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBadd3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBadd3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd3MouseEntered

    private void jBadd3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBadd3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd3MouseExited

    private void jBadd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd3ActionPerformed

    private void jBadd4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBadd4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd4MouseEntered

    private void jBadd4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBadd4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd4MouseExited

    private void jBadd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBadd4ActionPerformed

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
            java.util.logging.Logger.getLogger(f_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f_settings().setVisible(true);
            }
        });
    }

     public  void dtable ()
    {
        String [] columnx ={"مسلسل","قواعد البيانات المحفوظه"};
        
       
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
     
        
        
      
    
    renderer.setHorizontalAlignment(RIGHT);
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
    private javax.swing.JButton jBadd3;
    private javax.swing.JButton jBadd4;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBmain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrolltable;
    public javax.swing.JLabel jlb_userlogin;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
