
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package zsteel;

//~--- JDK imports ------------------------------------------------------------

import java.io.File;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class con_dbembeded {
    public static String DB_NAME  = "steel_db";
    public static String DB_URL   = "DB" + File.separator + DB_NAME;
    public static String conn_URL = "jdbc:derby:" +DB_URL;

    public static Connection con_embeded() throws SQLException, ClassNotFoundException {
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";

        Class.forName(driver);

        Connection c = DriverManager.getConnection("jdbc:derby:" +DB_URL, DB_NAME, "q123q123q");

        return c;
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     

      System.out.println(con_embeded());
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
