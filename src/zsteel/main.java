
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package zsteel;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JOptionPane;

/**
 *
 * @author mahmoud
 */
public class main {
    public static void main(String[] args) throws Exception {
        try {
            new f_login().setVisible(true);
        } catch (NullPointerException e) {
            JOptionPane.showInputDialog("" + e + "aaaaa");

//          D_eror d = new D_eror(f);
//          d.eror.setText("e"+e);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
