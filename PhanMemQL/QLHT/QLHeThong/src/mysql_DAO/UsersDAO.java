/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_DAO;
import java.io.File;
import java.io.FileInputStream;
import mysql_connection.mysql_connect;
import mysql_DTO.UsersDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI
 */
public class UsersDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    public UsersDAO(){
        try {
            con = new mysql_connect().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addUserDAO(UsersDTO userdto) {
        try{
            String query = "SELECT * FROM users WHERE username='"+userdto.getUsername()+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Same User has already been added!");
            }else{
                addFunction(userdto);
            }
        }catch(Exception e){
                e.printStackTrace();
        }   
    }
    public void addFunction(UsersDTO userdto){
        try{
            String query = "INSERT INTO users (username, password, fullname, gioi_tinh, email, sdt, dia_chi, chuc_vu) VALUES(?,?,?,?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, userdto.getUsername());
            pstmt.setString(2, userdto.getPassword());
            pstmt.setString(3, userdto.getFullname());
            pstmt.setString(4, userdto.getGioi_tinh());
            pstmt.setString(5, userdto.getEmail());
            pstmt.setString(6, userdto.getSdt());
            pstmt.setString(7, userdto.getDia_chi());
            pstmt.setString(8, userdto.getChuc_vu());
            pstmt.executeUpdate();          
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        }catch(Exception e){
            e.printStackTrace();
        }
                    
    }
    
    
    
    
    
}
