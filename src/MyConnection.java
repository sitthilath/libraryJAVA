
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bie
 */
public class MyConnection {
    public static Connection getConnection(){
     try {
            String url,user,pass,driver;
              url ="jdbc:mysql://localhost/dbloginandregister?charactorEncoding=utf-8";
              user="root";
              pass="";
             driver="com.mysql.jdbc.Driver";
            
           
              
              
              //load driver to memory
              Class.forName(driver);
              
              //connect to database and return
              return (Connection) DriverManager.getConnection(url,user,pass);
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
