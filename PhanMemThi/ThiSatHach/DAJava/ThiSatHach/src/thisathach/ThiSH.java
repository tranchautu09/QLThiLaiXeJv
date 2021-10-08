/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thisathach;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author MSI
 */
public class ThiSH extends javax.swing.JFrame {

    /**
     * Creates new form ThiSH
     */
    Timer time;
    public String answer;
    public int min = 0;
    public int sec = 0;
    public int marks = 0;
    PreparedStatement query;
    public String kq_dung="Đúng";
    public String kq_sai="Sai";
    public String questionID="1";
    public ThiSH() {
        initComponents();
        
    }
    
    /*public void ts_chon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = con.prepareStatement("INSERT INTO chitietthi (sv_id,ten_cau_hoi,cau_chon,dap_an_dung) VALUES(?,?,?,?,?,?,?)");
            query.setString(2,jLabel4.getText());
            query.setString(3,jLabel13.getText());
            query.setString(4,studentAnswer);
            query.setString(5,test.getText());  
            query.executeUpdate();   
            
            JOptionPane.showMessageDialog(null,"Thêm thành công!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }*/
    public void answerCheck(){
        String studentAnswer="";
        if(jRadioButton1.isSelected()){
            studentAnswer = jRadioButton1.getText();
            String cc1 = cc1_ct.getText();
            String dad = dad_ct.getText();
            String sbd_pm = jLabel4.getText();
            int sbd_sv = Integer.parseInt(sbd_pm);
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = con.prepareStatement("INSERT INTO chitietthi (sv_id,ten_cau_hoi,cau_chon,dap_an_dung,ket_qua) VALUES(?,?,?,?,?)");
            query.setInt(1,sbd_sv);
            query.setString(2,ch_ct.getText());
            query.setString(3,cc1_ct.getText());
            query.setString(4,dad_ct.getText());
            if(cc1.equals(dad)){
                query.setString(5,kq_dung);  
            }
            else{
                query.setString(5,kq_sai);  
            }
            query.executeUpdate();   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if(jRadioButton2.isSelected()){
            studentAnswer = jRadioButton2.getText();
            String cc2 = cc2_ct.getText();
            String dad = dad_ct.getText();
            String sbd_pm = jLabel4.getText();
            int sbd_sv = Integer.parseInt(sbd_pm);
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = con.prepareStatement("INSERT INTO chitietthi (sv_id,ten_cau_hoi,cau_chon,dap_an_dung,ket_qua) VALUES(?,?,?,?,?)");
            query.setInt(1,sbd_sv);
            query.setString(2,ch_ct.getText());
            query.setString(3,cc2_ct.getText());
            query.setString(4,dad_ct.getText());
            if(cc2.equals(dad)){
                query.setString(5,kq_dung);  
            }
            else{
                query.setString(5,kq_sai);  
            }  
            query.executeUpdate();   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if(jRadioButton3.isSelected()){
            studentAnswer = jRadioButton3.getText();
            String cc3 = cc3_ct.getText();
            String dad = dad_ct.getText();
            String sbd_pm = jLabel4.getText();
            int sbd_sv = Integer.parseInt(sbd_pm);
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = con.prepareStatement("INSERT INTO chitietthi (sv_id,ten_cau_hoi,cau_chon,dap_an_dung,ket_qua) VALUES(?,?,?,?,?)");
            query.setInt(1,sbd_sv);
            query.setString(2,ch_ct.getText());
            query.setString(3,cc3_ct.getText());
            query.setString(4,dad_ct.getText());
            if(cc3.equals(dad)){
                query.setString(5,kq_dung);  
            }
            else{
                query.setString(5,kq_sai);  
            }
            query.executeUpdate();   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        else if(jRadioButton4.isSelected()){
            studentAnswer = jRadioButton4.getText();
            String cc4 = cc4_ct.getText();
            String dad = dad_ct.getText();
            String sbd_pm = jLabel4.getText();
            int sbd_sv = Integer.parseInt(sbd_pm);
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = con.prepareStatement("INSERT INTO chitietthi (sv_id,ten_cau_hoi,cau_chon,dap_an_dung,ket_qua) VALUES(?,?,?,?,?)");
            query.setInt(1,sbd_sv);
            query.setString(2,ch_ct.getText());
            query.setString(3,cc4_ct.getText());
            query.setString(4,dad_ct.getText());
            if(cc4.equals(dad)){
                query.setString(5,kq_dung);  
            }
            else{
                query.setString(5,kq_sai);  
            } 
            query.executeUpdate();   
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
        if(studentAnswer.equals(answer)){
            marks = marks + 1;
            String marks1 = String.valueOf(marks);
            jLabel12.setText(marks1);
            
        }
        else{
            studentAnswer="";
        }
        
        
        //cau tiep theo
        
        
        
        //clear radio button
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);

        
        //cau cuoi hide button cau tiep theo
        
        
    }
    public void question(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = conn.prepareStatement("SELECT *\n" +
                                            "FROM cauhoi\n" +
                                            "where lbl_id=?\n" +
                                            "ORDER BY RAND()\n" +
                                            "LIMIT 1");
            String something = jLabel16.getText();
                if(something.equals("Hạng A1")){
                   query.setInt(1, 1);
                }
                if(something.equals("Hạng A2")){
                   query.setInt(1, 2);
                } 
                if(something.equals("Hạng A3")){
                   query.setInt(1, 3);
                } 
                if(something.equals("Hạng A4")){
                   query.setInt(1, 4);
                } 
                if(something.equals("Hạng B1")){
                   query.setInt(1, 5);
                } 
                if(something.equals("Hạng B2")){
                   query.setInt(1, 6);
                } 
                if(something.equals("Hạng C")){
                   query.setInt(1, 7);
                } 
                if(something.equals("Hạng D")){
                   query.setInt(1, 8);
                } 
                if(something.equals("Hạng E")){
                   query.setInt(1, 9);
                } 
                if(something.equals("Hạng F")){
                   query.setInt(1, 10);
                } 
                if(something.equals("Hạng FB2")){
                   query.setInt(1, 11);
                } 
                if(something.equals("Hạng FC")){
                   query.setInt(1, 12);
                } 
                if(something.equals("Hạng FD")){
                   query.setInt(1, 13);
                } 
                if(something.equals("Hạng FD")){
                   query.setInt(1, 14);
                } 
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                if(rs.getString(6).equals("")){
                    jRadioButton3.setVisible(false);
                }
                else{
                    jRadioButton3.setVisible(true);
                }
                if(rs.getString(7).equals("")){
                    jRadioButton4.setVisible(false);
                }
                else{
                    jRadioButton4.setVisible(true);
                }
                jLabel13.setText("<html>"+rs.getString(3)+"</html>");
                jRadioButton1.setText("<html>"+rs.getString(4)+"</html>");
                jRadioButton2.setText("<html>"+rs.getString(5)+"</html>");
                jRadioButton3.setText("<html>"+rs.getString(6)+"</html>");
                jRadioButton4.setText("<html>"+rs.getString(7)+"</html>");
                ch_ct.setText(rs.getString(3));
                dad_ct.setText(rs.getString(8));
                cc1_ct.setText(rs.getString(4));
                cc2_ct.setText(rs.getString(5));
                cc3_ct.setText(rs.getString(6));
                cc4_ct.setText(rs.getString(7));
                test.setText("<html>"+rs.getString(8)+"</html>");
                answer = ("<html>"+rs.getString(8)+"</html>");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void nopbai(){
        answerCheck();
        try{
            String sbd = jLabel4.getText();
            String a = jLabel12.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = conn.prepareStatement("update sinhvien set diem=? where sinh_vien_id=? ");
            query.setInt(1, marks);
            query.setString(2, sbd);
            query.executeUpdate();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public ThiSH(String a, String b, String c) {
        initComponents();
        dad_ct.setVisible(false);
        ch_ct.setVisible(false);
        cc1_ct.setVisible(false);
        cc2_ct.setVisible(false);
        cc3_ct.setVisible(false);
        cc4_ct.setVisible(false);
        jLabel16.setText(a);
        jLabel6.setText(c);
        jLabel4.setText(b);
        gplx.setVisible(false);
        //ngày
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel18.setText(dFormat.format(date));
        java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
        try{
            String sbd_id = jLabel4.getText();
            int sbd = Integer.parseInt(sbd_id);
            String ngaythi = jLabel18.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            query = conn.prepareStatement("INSERT INTO ngaythi (sinh_vien_id,ngay_thi) VALUES(?,?)");
            query.setInt(1,sbd);
            query.setDate(2, sqlStartDate);
            query.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        String ktsbd = jLabel4.getText();
        //câu đầu tiên
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
            Statement st = conn.createStatement();
            ResultSet rs1 = st.executeQuery("select * from sinhvien where sinh_vien_id='"+ktsbd+"'");
            while(rs1.next()){
                gplx.setText(rs1.getString(3));
            }
            query = conn.prepareStatement("SELECT *\n" +
                                            "FROM cauhoi\n" +
                                            "where lbl_id=?\n" +
                                            "ORDER BY RAND()\n" +
                                            "LIMIT 1");
            String something = jLabel16.getText();
                if(something.equals("Hạng A1")){
                   query.setInt(1, 1);
                }
                if(something.equals("Hạng A2")){
                   query.setInt(1, 2);
                } 
                if(something.equals("Hạng A3")){
                   query.setInt(1, 3);
                } 
                if(something.equals("Hạng A4")){
                   query.setInt(1, 4);
                } 
                if(something.equals("Hạng B1")){
                   query.setInt(1, 5);
                } 
                if(something.equals("Hạng B2")){
                   query.setInt(1, 6);
                } 
                if(something.equals("Hạng C")){
                   query.setInt(1, 7);
                } 
                if(something.equals("Hạng D")){
                   query.setInt(1, 8);
                } 
                if(something.equals("Hạng E")){
                   query.setInt(1, 9);
                } 
                if(something.equals("Hạng F")){
                   query.setInt(1, 10);
                } 
                if(something.equals("Hạng FB2")){
                   query.setInt(1, 11);
                } 
                if(something.equals("Hạng FC")){
                   query.setInt(1, 12);
                } 
                if(something.equals("Hạng FD")){
                   query.setInt(1, 13);
                } 
                if(something.equals("Hạng FD")){
                   query.setInt(1, 14);
                } 
            ResultSet rs = query.executeQuery();
            while(rs.next()){
                if(rs.getString(6).equals("")){
                    jRadioButton3.setVisible(false);
                }
                else{
                    jRadioButton3.setVisible(true);
                }
                if(rs.getString(7).equals("")){
                    jRadioButton4.setVisible(false);
                }
                else{
                    jRadioButton4.setVisible(true);
                }
                jLabel13.setText("<html>"+rs.getString(3)+"</html>");
                jRadioButton1.setText("<html>"+rs.getString(4)+"</html>");
                jRadioButton2.setText("<html>"+rs.getString(5)+"</html>");
                jRadioButton3.setText("<html>"+rs.getString(6)+"</html>");
                jRadioButton4.setText("<html>"+rs.getString(7)+"</html>");
                ch_ct.setText(rs.getString(3));
                dad_ct.setText(rs.getString(8));
                cc1_ct.setText(rs.getString(4));
                cc2_ct.setText(rs.getString(5));
                cc3_ct.setText(rs.getString(6));
                cc4_ct.setText(rs.getString(7));
                test.setText("<html>"+rs.getString(8)+"</html>");
                answer = ("<html>"+rs.getString(8)+"</html>");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        //thoiwf gian
        setLocationRelativeTo(this);
        time = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                jLabel23.setText(String.valueOf(sec));
                jLabel22.setText(String.valueOf(min));
                if(sec==60){
                    sec =0;
                    min++;
                    if(min == 22){
                        time.stop();
                        answerCheck();
                        nopbai();
                    }
                }
                sec++;
            }
        });
        time.start();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        gplx = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        test = new javax.swing.JLabel();
        ch_ct = new javax.swing.JLabel();
        cc1_ct = new javax.swing.JLabel();
        dad_ct = new javax.swing.JLabel();
        cc2_ct = new javax.swing.JLabel();
        cc3_ct = new javax.swing.JLabel();
        cc4_ct = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(105, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Student-3-icon.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel1.setText("Welcome");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setText("Ngày:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setText("jLabel18");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel19.setText("Tổng thời gian:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel20.setText("22 phút");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setText("Thời gian làm bài:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setText("00");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(112, 112, 112)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        jPanel2.setBackground(new java.awt.Color(105, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Số báo danh:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("00");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Họ và tên:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("NGUYEN CHINH THI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Số câu hỏi:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("25");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Câu hỏi thứ:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("1");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Điểm:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("0");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Loại GPLX:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setText("Hạng A1");

        gplx.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gplx.setText("0");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel24.setText("/   25");

        test.setText("Đáp án");

        ch_ct.setText("-");

        cc1_ct.setText("-");

        dad_ct.setText("-");

        cc2_ct.setText("-");

        cc3_ct.setText("-");

        cc4_ct.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(test, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel24))
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)))
                    .addComponent(gplx))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ch_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc1_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dad_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc2_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc3_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc4_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel24))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(test, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(gplx))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ch_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc1_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dad_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc2_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc3_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(cc4_ct)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 450, 630));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("<html> Câu hỏi</html>");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 900, 100));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton1.setText("<html>jRadioButton2</html>");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 840, 100));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton2.setText("<html>jRadioButton2</html>");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 840, 100));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton3.setText("<html>jRadioButton3</html>");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, 840, 100));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jRadioButton4.setText("<html>jRadioButton4</html>");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 600, 840, 100));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setText("Câu tiếp theo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 730, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setText("Nộp bài");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 730, 167, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xxxzxz.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 1000, 720));

        setSize(new java.awt.Dimension(1366, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        answerCheck();
        question();
        int questionID1 = Integer.parseInt(questionID);
        questionID1 = questionID1+1;
        questionID=String.valueOf(questionID1);
        jLabel10.setText(questionID);
        if(questionID.equals("25")){
            jButton1.setVisible(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn nộp bài?", "Select", JOptionPane.YES_NO_OPTION);
        if(a==0){
            answerCheck();
            nopbai();
            dispose();
            String chuyen_a = jLabel4.getText();
            String chuyen_b = jLabel12.getText();
            KetQua kq = new KetQua(chuyen_a, chuyen_b);
            kq.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        if(jRadioButton3.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        if(jRadioButton4.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThiSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThiSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThiSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThiSH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThiSH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cc1_ct;
    private javax.swing.JLabel cc2_ct;
    private javax.swing.JLabel cc3_ct;
    private javax.swing.JLabel cc4_ct;
    private javax.swing.JLabel ch_ct;
    private javax.swing.JLabel dad_ct;
    private javax.swing.JLabel gplx;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel test;
    // End of variables declaration//GEN-END:variables
}
