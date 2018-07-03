/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
 
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
 
 
@SuppressWarnings("unchecked")
public class MainUI extends JInternalFrame {
    private List<String> topNodesList = new ArrayList<String>();
 
    // Swing Components 
    JSplitPane mainSplitPane;
    JTabbedPane bottomTabbedPane;
    JPanel taxonomyGeneralPropertiesPanel;
    JPanel taxonomyActivePropertiesPanel;
    JPanel documentGeneralPropertiesPanel;
    JPanel documentActivePropertiesPanel;
    JPanel documentClassificationPropertiesPanel;
    JPanel docGroupGeneralPropertiesPanel;
    JPanel docGroupNavigatorPropertiesPanel;
    JPanel docGroupSortPropertiesPanel;
    JScrollPane topTopicsScrollPane;
    JTable topTopicsTable;
    JScrollPane hierarchyScrollPane;
    JTree hierarchyTree;
 
    public void initializeRelateEditorScreen() throws Exception{
        try {
             
            topNodesList.add("ESTATE TAX");
            topNodesList.add("TAXPAYER TYPES ********************************************************************************************");
 
            // Set Look & Feel to PlasticXPLookAndFeel
            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticXPLookAndFeel");
         
 
            // Relate Editor internal frame specifications
            setClosable(true);
            setIconifiable(true);
            setMaximizable(true);
            setResizable(true);
            setTitle("Relate Editor");
            setName("Relate Editor"); 
            setLocation(50, 50);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setPreferredSize(new Dimension(900,700));
            setSize(900, 700);
            // Set the Border for the Internal Frame.
            setBorder(new LineBorder(Color.DARK_GRAY,2));
             
            initializeTopTopicsTable();
 
            initializeTopTopicsScrollPane();
 
            hierarchyScrollPane = new JScrollPane();
            hierarchyTree = new JTree();
 
            mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, topTopicsScrollPane, hierarchyScrollPane);
            mainSplitPane.setDividerSize(15);
            mainSplitPane.setResizeWeight(0.35);
            mainSplitPane.setDividerLocation(300);
 
 
            bottomTabbedPane = new JTabbedPane();
            taxonomyGeneralPropertiesPanel = new JPanel();
            taxonomyActivePropertiesPanel= new JPanel();
            documentGeneralPropertiesPanel= new JPanel();
            documentActivePropertiesPanel= new JPanel();
            documentClassificationPropertiesPanel= new JPanel();
            docGroupGeneralPropertiesPanel= new JPanel();
            docGroupNavigatorPropertiesPanel= new JPanel();
            docGroupSortPropertiesPanel= new JPanel();
 
            GroupLayout mainGroupLayout = new GroupLayout(getContentPane());
            getContentPane().setLayout(mainGroupLayout);
            mainGroupLayout.setHorizontalGroup(
                    mainGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(bottomTabbedPane, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addComponent(mainSplitPane, GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
            )
            ;
            mainGroupLayout.setVerticalGroup(
                    mainGroupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(mainGroupLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mainSplitPane, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bottomTabbedPane, GroupLayout.DEFAULT_SIZE, 150, 200)
                    ));
 
 
            // Set Application Background color to White Smoke
 
            pack();
 
            setVisible(true);  
 
        } catch(Exception e){
            e.printStackTrace();
        }
    }
 
    private void initializeTopTopicsTable(){
        topTopicsTable = new JTable();
        topTopicsTable.setTableHeader(null);
        Font topTopicsFont = new Font("Verdana",Font.PLAIN,12);
        topTopicsTable.setFont(topTopicsFont);
        topTopicsTable.setRowHeight(30);
        topTopicsTable.setShowHorizontalLines(false);
        topTopicsTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);               
        topTopicsTable.getColumnModel().getColumn(0).setMinWidth(300);
        topTopicsTable.getColumnModel().getColumn(0).setPreferredWidth(500);
        topTopicsTable.getColumnModel().getColumn(0).setMaxWidth(500);
        topTopicsTable.setPreferredScrollableViewportSize(topTopicsTable.getPreferredSize());       
    }
 
    private void initializeTopTopicsScrollPane(){
        topTopicsScrollPane = new JScrollPane(topTopicsTable);
        topTopicsScrollPane.setBorder(BorderFactory.createTitledBorder("Product Topics"));
        topTopicsScrollPane.setViewportView(topTopicsTable);
        topTopicsScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        topTopicsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);       
    }   
 
    public static void main(String...args)throws Exception {
        JFrame frame = new JFrame();
        JDesktopPane jdPane = new JDesktopPane();
        frame.setContentPane(jdPane);
        frame.setVisible(true);
      // frame.setSize(,Integer.MAX_VALUE-100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        MainUI ui = new MainUI();
        ui.initializeRelateEditorScreen();
        jdPane.add(ui);
        ui.setVisible(true);
 
    }
}
