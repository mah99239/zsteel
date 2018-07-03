package UI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class scrollbar extends BasicScrollBarUI
{

    public scrollbar() {
    }
    private JButton b = new JButton() {
        
 
        @Override 
        public Dimension getPreferredSize() { 
            return new Dimension(0, 0); 
        } 
       
 
    }; 
 
    @Override 
    protected void paintTrack(Graphics g, JComponent c,
            Rectangle trackBounds) {
    	g.setColor(Color.white);
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width,
                trackBounds.height);
          g.drawOval(2, 0, 14, 14);
        g.setColor(this.thumbColor);
        g.fillOval(2, 0, 14, 14);
         if (this.trackHighlight == BasicScrollBarUI.DECREASE_HIGHLIGHT) {
            this.paintDecreaseHighlight(g);
        } else if (this.trackHighlight == BasicScrollBarUI.INCREASE_HIGHLIGHT) {
            this.paintIncreaseHighlight(g);
        } 
    } 
 
   /* @Override 
    protected void paintThumb(Graphics g, JComponent c,
            Rectangle thumbBounds) {
        
        
          if (thumbBounds.isEmpty() || !this.scrollbar.isEnabled()) {
            return; 
        }
          g.translate(thumbBounds.x, thumbBounds.y);
    	g.setColor(Color.LIGHT_GRAY);
        g.fillRect(thumbBounds.x + 1, thumbBounds.y + 5, thumbBounds.width - 2,
                thumbBounds.height - 2);
        
    } */
     @Override
  protected void paintThumb(Graphics g, JComponent c, Rectangle r) {
    Graphics2D g2 = (Graphics2D) g.create();
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
        RenderingHints.VALUE_ANTIALIAS_ON);
    Color color = null;
    JScrollBar sb = (JScrollBar) c;
    if (!sb.isEnabled() || r.width > r.height) {
      return;
    } else if (isDragging) {
      color = Color.DARK_GRAY;
    } else if (isThumbRollover()) {
      color = Color.LIGHT_GRAY;
    } else {
      color = Color.GRAY;
    }
    g2.setPaint(color);
    g2.fillRoundRect(r.x, r.y, r.width, r.height, 10, 10);
    g2.setPaint(Color.WHITE);
    g2.drawRoundRect(r.x, r.y, r.width, r.height, 10, 10);
    g2.dispose();
  }
 
    @Override 
    protected JButton createDecreaseButton(int orientation) {
        orientation=0;
        return b;
    } 
  
    @Override 
    protected JButton createIncreaseButton(int orientation) {
                orientation=0;

        return b;
    } 
    
}
