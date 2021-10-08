/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import mysql_DTO.SinhvienDTO;
import mysql_connection.mysql_connect;

/**
 *
 * @author MSI
 */
public class SinhvienDAO {
    Connection con = null;
    PreparedStatement pstmt = null;
    Statement stmt = null;
    ResultSet rs = null;
    public SinhvienDAO(){
        try {
            con = new mysql_connect().getConnection();
            stmt = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void addSVDAO(SinhvienDTO svdto) {
        try{
            String query = "SELECT * FROM sinhvien WHERE cmnd='"+svdto.getCmnd()+"'";
            rs=stmt.executeQuery(query);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Đã có sinh viên này!");
            }else{
                addFunction(svdto);
            }
        }catch(Exception e){
                e.printStackTrace();
        }   
    }
    public void addFunction(SinhvienDTO svdto){
        try{
            String query = "INSERT INTO sinhvien (users_id, lbl_id, fullname, ngay_sinh, gioi_tinh, email, sdt, dia_chi, que_quan, cmnd, diem) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = (PreparedStatement) con.prepareStatement(query);
            pstmt.setString(1, svdto.getUsers_id());
            pstmt.setInt(2, svdto.getLbl_id());
            pstmt.setString(3, svdto.getFullname());
            pstmt.setDate(4, (Date)svdto.getNgay_sinh());
            pstmt.setString(5, svdto.getGioi_tinh());
            pstmt.setString(6, svdto.getEmail());
            pstmt.setString(7, svdto.getSdt());
            pstmt.setString(8, svdto.getDia_chi());
            pstmt.setString(9, svdto.getQue_quan());
            pstmt.setString(10, svdto.getCmnd());
            pstmt.setInt(11, svdto.getDiem());
            pstmt.executeUpdate();          
            JOptionPane.showMessageDialog(null, "Thêm thành công!");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
