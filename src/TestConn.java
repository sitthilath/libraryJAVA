/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;


/**
 *
 * @author Bie
 */
public class TestConn {
    public static void main(String[] args) {
        try {
            Connection c = MyConnection.getConnection();
          
            if (c!=null) {
                System.out.println("pass");
                
            }else{
                System.out.println("fail");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
