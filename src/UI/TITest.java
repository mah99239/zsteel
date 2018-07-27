/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;
  
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
  
public class TITest extends JFrame {
     
    private JTable t1, t2;
    private int x, y;
    private int step = 30;
     
    public TITest() {
        super( "Table InternalFrame Test" );
        setContentPane( new JDesktopPane() );
         
        t1 = new JTable( new TITableModel() );
        t2 = new JTable( new TITableModel() );
        Dimension t1Size = new Dimension();
        t1Size.height = t1.getRowHeight() * 4;
        t1Size.width = t1.getColumnModel().getTotalColumnWidth();
        t1.setPreferredScrollableViewportSize( t1Size );
         
        JInternalFrame f1 = new JInternalFrame( "Table (ViewPortSize set)", true, true, true, true );
        JInternalFrame f2 = new JInternalFrame( "Table (No ViewPortSize)", true, true, true, true );
        f1.getContentPane().add( new JScrollPane( t1 ), BorderLayout.CENTER );
        f1.getContentPane().add( getButtonPanel(), BorderLayout.SOUTH );
        f2.getContentPane().add( new JScrollPane( t2 ), BorderLayout.CENTER );
        f2.getContentPane().add( getButtonPanel(), BorderLayout.SOUTH );
        addFrame( f1 );
        addFrame( f2 );
        f1.show();
        f2.show();
    }
     
    public JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.add( new JButton( "OK" ) );
        buttonPanel.add( new JButton( "Cancel" ) );
        return buttonPanel;
    }
     
    public void addFrame( JInternalFrame f ) {
        f.pack();
        if ( x + f.getWidth() > getWidth() ) {
            x -= getWidth();
        }
        if ( y + f.getHeight() > getHeight() ) {
            y -= getHeight();
        }
        f.setLocation( x, y );
        getContentPane().add( f );
        x += step;
        y += step;
    }
     
    public static void main(String[] args) {
        JFrame f = new TITest();
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int w = ( size.width / 8 ) * 7;
        int h = ( size.height / 8 ) * 7;
        int x = ( size.width - w ) / 2;
        int y = ( size.height - h ) / 2;
        f.setBounds( x, y, w, h );
        f.show();
    }
     
    private static class TITableModel extends DefaultTableModel {
         
        private Vector data, cols;
         
        public TITableModel() {
            super();
            cols = new Vector();
            cols.add( "Name" );
            cols.add( "Occupation" );
            cols.add( "Address" );
            cols.add( "City" );
            data = new Vector();
            Vector temp = new Vector();
            temp.add( "Knox, John" );
            temp.add( "Policeman" );
            temp.add( "234 North Oak Trail" );
            temp.add( "Center City, MO" );
            data.add( temp );
            temp = new Vector();
            temp.add( "Morgan, Patricia" );
            temp.add( "Doctor" );
            temp.add( "84 Culver Circle" );
            temp.add( "Paulson, CO" );
            data.add( temp );
            temp = new Vector();
            temp.add( "Oswald Fogerty" );
            temp.add( "Programmer" );
            temp.add( "55 Hull Way" );
            temp.add( "San Jose, CA" );
            data.add( temp );
            temp = new Vector();
            temp.add( "Osama bin Laden" );
            temp.add( "TERRORIST" );
            temp.add( "<UNKNOWN>" );
            temp.add( "<UNKNOWN>" );
            data.add( temp );
            this.setDataVector( data, cols );
        }
    }
}
