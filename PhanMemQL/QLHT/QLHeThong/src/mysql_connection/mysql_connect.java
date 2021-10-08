/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 *
 * @author MSI
 */
public class mysql_connect {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public mysql_connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            stmt=con.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }

    public boolean checkLoginAdmin(String username,String password){
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"' AND chuc_vu='ADMINISTRATOR' LIMIT 1";
        try{
            rs=stmt.executeQuery(query);
            if(rs.next()){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
        return false;
    }
    public boolean checkLoginStaff(String username,String password){
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"' AND chuc_vu='STAFF' LIMIT 1";
        try{
            rs=stmt.executeQuery(query);
            if(rs.next()){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
        return false;
    }
}
