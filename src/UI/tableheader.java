/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author mahmoud
 */
public class tableheader  extends DefaultTableCellRenderer{
    
    public tableheader()
    {
      
          setBackground(Color.black);
        setForeground(Color.white);
       
        setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
       
        
        
    }
    public Component gettablecellrenderer(JTable table , Object value , boolean selected, boolean foused, int row ,int column )
    {selected =false;
        foused =false;
        column = 20;
        
        super.getTableCellRendererComponent(table, value, selected, foused, row, column);
        setOpaque(true);
        
        return this;
    }
    
}
