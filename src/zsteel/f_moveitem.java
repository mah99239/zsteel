
package zsteel;



import UI.scrollbar;
import UI.tableheader;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Panel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import static javax.swing.SwingConstants.RIGHT;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;



public class f_moveitem extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
       DefaultTableModel m ;
     
     
    private static boolean address = false ;
  
    
   
    public f_moveitem() {
        
       
        initComponents();
         address =true ;
       jldata2.setVisible(true);
            jpdata.setVisible(true);
             jpdata1.setVisible(true);
            jcbmonth.setVisible(false);
            jcbyear.setVisible(false);
            
            jldata.setText("التاريخ من");

         dtable();
        jrb_data2. setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jrb_data1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jrb_data.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);   
    selectclient();
       
        setIconImage(new ImageIcon(getClass().getResource("/icon/steel1.png")).getImage());
        setExtendedState(MAXIMIZED_BOTH);
        table.getTableHeader().setDefaultRenderer(new tableheader());
      /* JTableHeader header = table.getTableHeader();
       header.setPreferredSize(new Dimension(0, 30));
       header.setEnabled(false);
       table.getTableHeader().setDefaultRenderer(new tableheader());
    table.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       */
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

        dateChooser1 = new cambodia.raven.DateChooser();
        dateChooser2 = new cambodia.raven.DateChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jpgroub = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jldata = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrolltable = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jBexit = new javax.swing.JButton();
        jBmain = new javax.swing.JButton();
        jBprint = new javax.swing.JButton();
        jlb_userlogin = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jcbmonth = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpdata = new javax.swing.JPanel();
        jtfdata = new javax.swing.JTextField();
        jbdata = new javax.swing.JButton();
        jpdata1 = new javax.swing.JPanel();
        jtfdata1 = new javax.swing.JTextField();
        jbdata1 = new javax.swing.JButton();
        jcbyear = new javax.swing.JComboBox<>();
        jldata2 = new javax.swing.JLabel();
        jrb_data2 = new javax.swing.JRadioButton();
        jrb_data1 = new javax.swing.JRadioButton();
        jrb_data = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        dateChooser1.setButton(jbdata);
        dateChooser1.setTextRefernce(jtfdata);

        dateChooser2.setButton(jbdata1);
        dateChooser2.setTextRefernce(jtfdata1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("zsteel");
        setIconImages(null);
        setSize(new java.awt.Dimension(1340, 750));

        jpgroub.setBackground(new java.awt.Color(255, 255, 255));
        jpgroub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("zsteel");

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("المعاملات الماليه");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpgroub.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jldata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jldata.setText("التاريخ");
        jpgroub.add(jldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 50, 80, -1));

        jLabel4.setText("F+");

        jLabel5.setText("F-");

        jLabel7.setText("H-");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setText("H+");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        jpgroub.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jScrolltable.getVerticalScrollBar().setUI(new scrollbar());
        jScrolltable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrolltable.setHorizontalScrollBarPolicy(31);
        jScrolltable.setOpaque(false);
        jScrolltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jScrolltableMouseEntered(evt);
            }
        });

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new DefaultTableModel(new Object[0][], new String []{"مسلسل","نوع الفاتوره","رقم الفاتوره","حاله الدفع","بيان","الاصناف","اجمالى الوزن","السعر","مشال","خصم","الاجمالى","المسئول","تاريخ الاضافه"}));
        table.setRowHeight(30);
        table.setSurrendersFocusOnKeystroke(true);
        jScrolltable.setViewportView(table);

        jpgroub.add(jScrolltable, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 154, 1210, 470));

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
        jpgroub.add(jBexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 50, 30));

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
        jpgroub.add(jBmain, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 50, 30));

        jBprint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Print11_32px.png"))); // NOI18N
        jBprint.setToolTipText("طباعه الجدول");
        jBprint.setBorderPainted(false);
        jBprint.setContentAreaFilled(false);
        jBprint.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBprint.setFocusPainted(false);
        jBprint.setFocusable(false);
        jBprint.setIconTextGap(0);
        jBprint.setPreferredSize(new java.awt.Dimension(77, 45));
        jBprint.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete_32px.png"))); // NOI18N
        jBprint.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Print1_32px.png"))); // NOI18N
        jBprint.setVerifyInputWhenFocusTarget(false);
        jBprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBprintMouseEntered(evt);
            }
        });
        jBprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprintActionPerformed(evt);
            }
        });
        jpgroub.add(jBprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 50, 30));

        jlb_userlogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlb_userlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpgroub.add(jlb_userlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 700, 87, 17));

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
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpgroub.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 700, -1, -1));

        jComboBox4.setBackground(new java.awt.Color(250, 250, 250));
        jComboBox4.setMaximumRowCount(10);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"عرض كل الفواتير","فواتير الشراء","فواتير البيع","فواتير مرتجع_عميل","فواتير مرتجع_مورد" })
        );
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jpgroub.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 28, 160, -1));

        jcbmonth.setBackground(new java.awt.Color(250, 250, 250));
        jcbmonth.setMaximumRowCount(12);
        jcbmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"يناير","فبراير","مارس","ابريل","مايو","يونيو","يوليو","اغسطس","سبتمبر","اكتوبر" ,"نوفمبر","ديسمبر"})
        );
        jcbmonth.setOpaque(false);
        jcbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbmonthActionPerformed(evt);
            }
        });
        jpgroub.add(jcbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 93, -1));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("يبليبلسسسسسسسسس");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jpgroub.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 1200, -1));

        jpdata.setAlignmentX(0.0F);
        jpdata.setAlignmentY(0.0F);
        jpdata.setAutoscrolls(true);
        jpdata.setOpaque(false);
        jpdata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfdata.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jpdata.add(jtfdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jbdata.setBorder(null);
        jbdata.setContentAreaFilled(false);
        jpdata.add(jbdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 30, 30));

        jpgroub.add(jpdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, 150, 30));

        jpdata1.setAlignmentX(0.0F);
        jpdata1.setAlignmentY(0.0F);
        jpdata1.setAutoscrolls(true);
        jpdata1.setOpaque(false);
        jpdata1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfdata1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 14)); // NOI18N
        jpdata1.add(jtfdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        jbdata1.setBorder(null);
        jbdata1.setContentAreaFilled(false);
        jpdata1.add(jbdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 30, 30));

        jpgroub.add(jpdata1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 40, 150, 30));

        jcbyear.setBackground(new java.awt.Color(250, 250, 250));
        jcbyear.setMaximumRowCount(12);
        jcbyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"2017","2018"})
        );
        jcbyear.setOpaque(false);
        jcbyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbyearActionPerformed(evt);
            }
        });
        jpgroub.add(jcbyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 93, -1));

        jldata2.setText("الى");
        jpgroub.add(jldata2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 50, -1, -1));

        jrb_data2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_data2);
        jrb_data2.setText("عرض بالسنه");
        jrb_data2.setBorder(null);
        jrb_data2.setContentAreaFilled(false);
        jrb_data2.setFocusPainted(false);
        jrb_data2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Radio 0_50px.png"))); // NOI18N
        jrb_data2.setIconTextGap(5);
        jrb_data2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Checked Radio1_50px.jpg"))); // NOI18N
        jrb_data2.setVerifyInputWhenFocusTarget(false);
        jrb_data2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_data2ActionPerformed(evt);
            }
        });
        jpgroub.add(jrb_data2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 80, -1, -1));

        jrb_data1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_data1);
        jrb_data1.setText("عرض بالشهر");
        jrb_data1.setBorder(null);
        jrb_data1.setContentAreaFilled(false);
        jrb_data1.setFocusPainted(false);
        jrb_data1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Radio 0_50px.png"))); // NOI18N
        jrb_data1.setIconTextGap(5);
        jrb_data1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Checked Radio1_50px.jpg"))); // NOI18N
        jrb_data1.setVerifyInputWhenFocusTarget(false);
        jrb_data1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_data1ActionPerformed(evt);
            }
        });
        jpgroub.add(jrb_data1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 50, -1, -1));

        jrb_data.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrb_data);
        jrb_data.setSelected(true);
        jrb_data.setText("عرض بالمده");
        jrb_data.setBorder(null);
        jrb_data.setContentAreaFilled(false);
        jrb_data.setFocusPainted(false);
        jrb_data.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Radio 0_50px.png"))); // NOI18N
        jrb_data.setIconTextGap(5);
        jrb_data.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Checked Radio1_50px.jpg"))); // NOI18N
        jrb_data.setVerifyInputWhenFocusTarget(false);
        jrb_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_dataActionPerformed(evt);
            }
        });
        jpgroub.add(jrb_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, -1, -1));
        jpgroub.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 230, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jpgroub.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 230, 30));

        getContentPane().add(jpgroub, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zsteelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zsteelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zsteelActionPerformed

    private void jtfdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfdataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfdataActionPerformed

    private void jcbyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbyearActionPerformed

    private void jcbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbmonthActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jBprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBprintActionPerformed

    private void jBprintMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBprintMouseEntered
        jBexit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBprintMouseEntered

    private void jBmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmainActionPerformed

    private void jBmainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBmainMouseEntered
        jBexit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBmainMouseEntered

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexitActionPerformed

    private void jBexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBexitMouseEntered
        jBexit.setBackground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jBexitMouseEntered

    private void jScrolltableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrolltableMouseEntered
        jScrolltable.getVerticalScrollBar().setForeground(Color.red);
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrolltableMouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        table.setRowHeight(table.getRowHeight()+1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        table.setRowHeight(table.getRowHeight()-1);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jrb_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_dataActionPerformed

        dtable();
    }//GEN-LAST:event_jrb_dataActionPerformed

    private void jrb_data1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_data1ActionPerformed
           dtable();
    }//GEN-LAST:event_jrb_data1ActionPerformed

    private void jrb_data2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_data2ActionPerformed
 dtable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jrb_data2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
 
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
            java.util.logging.Logger.getLogger(f_moveitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f_moveitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f_moveitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f_moveitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f_moveitem().setVisible(true);
            }
        });
    }
  

    public  void dtable ()
    {
        String [] columnx ={"مسلسل","نوع الفاتوره","رقم الفاتوره","حاله الدفع","بيان","الاصناف","اجمالى الوزن","السعر","مشال","خصم","الاجمالى","المسئول","تاريخ الاضافه"};
        
       
       m = new DefaultTableModel(columnx,0)
       {
            Class[] types = { Integer.class, String.class, String.class, String.class, String.class, String.class };
        
            public boolean iscelleditable(int row , int column)
         {
             return true;
         }
        
         
       };
       table.setModel(m);
        
        
         if(jrb_data1.isSelected()){
                 jldata.setText("التاريخ");
            jldata2.setVisible(false);
            jpdata.setVisible(false);
             jpdata1.setVisible(false);
            jcbmonth.setVisible(true);
            jcbyear.setVisible(true);
                    jpgroub.add(jcbmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 93, -1));
                    jpgroub.add(jcbyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 93, -1));

            }else if(jrb_data.isSelected()){
    jldata2.setVisible(true);
            jpdata.setVisible(true);
             jpdata1.setVisible(true);
            jcbmonth.setVisible(false);
            jcbyear.setVisible(false);
            
            jldata.setText("التاريخ من");
}else if(jrb_data2.isSelected()){
   jldata.setText("التاريخ");
                     jpdata.setVisible(false);jldata2.setVisible(false);
             jpdata1.setVisible(false);
            jcbmonth.setVisible(false);
                        jcbyear.setVisible(true);
                        jpgroub.add(jcbyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 93, -1));
}
          
           
           
        
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
    private javax.swing.ButtonGroup buttonGroup1;
    private cambodia.raven.DateChooser dateChooser1;
    private cambodia.raven.DateChooser dateChooser2;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBmain;
    private javax.swing.JButton jBprint;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrolltable;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jbdata;
    private javax.swing.JButton jbdata1;
    private javax.swing.JComboBox<String> jcbmonth;
    private javax.swing.JComboBox<String> jcbyear;
    public javax.swing.JLabel jlb_userlogin;
    private javax.swing.JLabel jldata;
    private javax.swing.JLabel jldata2;
    private javax.swing.JPanel jpdata;
    private javax.swing.JPanel jpdata1;
    private javax.swing.JPanel jpgroub;
    private javax.swing.JRadioButton jrb_data;
    private javax.swing.JRadioButton jrb_data1;
    private javax.swing.JRadioButton jrb_data2;
    private javax.swing.JTextField jtfdata;
    private javax.swing.JTextField jtfdata1;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}