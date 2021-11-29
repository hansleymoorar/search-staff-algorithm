/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaffAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Acer
 */
public class javaConnect {
    public static Connection connectdb(){
        try{
        Connection con=null;
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/dsaTwo", "nbuser", "nbuser");
        System.out.println("connected");
        return con;
        }
        catch(SQLException sqe){
            Logger.getLogger(javaConnect.class.getName()).log(Level.SEVERE,null,sqe);
        }
        return null;
    }
}

