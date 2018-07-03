/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zsteel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mahmoud
 */
public class a_login {
      protected int id_login;
    public static String name;
    static String pass;
 static   Connection conn;
    static PreparedStatement pst ;
    
    
     public static boolean geta_loginname(String name) throws SQLException, ClassNotFoundException{
        conn =con_dbembeded.con_embeded();
        
        
    
        pst = conn.prepareStatement("SELECT name FROM login where name = '"+name+"'" );
                         
                          //pst.setString(2, this.pass);

        ResultSet r =pst.executeQuery();
        while (pst.getResultSet().next())
        {
            return true;
         
          
                          

            
            
        }
        conn.close();
       return false ;
    }
    public static boolean getpass (String pass) throws SQLException, ClassNotFoundException
    {
        conn = con_dbembeded.con_embeded();
      //  String sql = "SELECT * FROM  where pass ='"+pass+"'";
        pst = conn.prepareStatement("SELECT pass FROM login where pass ='"+pass+"'");
      
        ResultSet r = pst.executeQuery();
        while (pst.getResultSet().next())
        {
           
          return  true ;
        }
        conn.close();
        
        return false;
    }
    public static boolean getlogin (String name  , String pass) throws SQLException, ClassNotFoundException{
        conn = con_dbembeded.con_embeded();
        pst = conn.prepareCall("select name , pass from login where name='"+name+"' and pass ='"+pass+"'");
   ResultSet r =pst.executeQuery();
        while (pst.getResultSet().next())
        {
            return true;
        }
        return false;
    }

  
    
}
