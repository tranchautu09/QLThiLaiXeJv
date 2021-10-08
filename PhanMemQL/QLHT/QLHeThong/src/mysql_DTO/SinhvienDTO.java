/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql_DTO;
import java.util.Date;
/**
 *
 * @author MSI
 */
public class SinhvienDTO {
    private int sinh_vien_id;
    private String users_id;
    private int lbl_id;
    private String fullname;
    private Date ngay_sinh;
    private String gioi_tinh;
    private String email;
    private String sdt;
    private String dia_chi;
    private String que_quan;
    private String cmnd;

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    private int diem;
    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }
    

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public int getSinh_vien_id() {
        return sinh_vien_id;
    }

    public void setSinh_vien_id(int sinh_vien_id) {
        this.sinh_vien_id = sinh_vien_id;
    }

    public String getUsers_id() {
        return users_id;
    }

    public void setUsers_id(String users_id) {
        this.users_id = users_id;
    }

    public int getLbl_id() {
        return lbl_id;
    }

    public void setLbl_id(int lbl_id) {
        this.lbl_id = lbl_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getGioi_tinh() {
        return gioi_tinh;
    }

    

    public void setGioi_tinh(String gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getQue_quan() {
        return que_quan;
    }

    public void setQue_quan(String que_quan) {
        this.que_quan = que_quan;
    }
    
}
