/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlthisathach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI
 */
public class KiemTraCTT extends javax.swing.JPanel {

    /**
     * Creates new form KiemTraCTT
     */
    public KiemTraCTT() {
        initComponents();
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/open-file-icon.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
        jLabel2.setText("Chi tiết bài kiểm tra của thí sinh");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Tìm kiếm theo số CMND:");

        jTextField1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Chứng minh nhân dân", "Họ và tên","Tên câu hỏi", "Câu thí sinh chọn", "Đáp án đúng", "Kết quả"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    PreparedStatement query;
    private void table_update(){
        int c;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
                query = conn.prepareStatement("select sinhvien.cmnd, sinhvien.fullname, chitietthi.ten_cau_hoi, chitietthi.cau_chon, chitietthi.dap_an_dung, chitietthi.ket_qua\n" +
                                                "from chitietthi\n" +
                                                "left join sinhvien on chitietthi.sv_id = sinhvien.sinh_vien_id;");
                ResultSet rs = query.executeQuery();
                ResultSetMetaData rss = rs.getMetaData();
                c = rss.getColumnCount();
                DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                df.setRowCount(0);
                    while(rs.next()){
                        Vector v2 = new Vector();
                        for (int a = 1; a <=c; a++) {
                            v2.add(rs.getString("cmnd"));
                            v2.add(rs.getString("fullname"));
                            v2.add(rs.getString("ten_cau_hoi"));
                            v2.add(rs.getString("cau_chon"));
                            v2.add(rs.getString("dap_an_dung"));
                            v2.add(rs.getString("ket_qua"));   
                        }
                        df.addRow(v2);
                    }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }        
    }
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        int cmnd;
            if(jTextField1.getText().equals("")){
                table_update();
            }else{
            cmnd=Integer.parseInt(jTextField1.getText());
            int c;
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_qlthilaixe", "root", "09022000");
                    query = conn.prepareStatement("select sinhvien.cmnd, sinhvien.fullname, chitietthi.ten_cau_hoi, chitietthi.cau_chon, chitietthi.dap_an_dung, chitietthi.ket_qua\n" +
                                                    "from chitietthi\n" +
                                                    "left join sinhvien on chitietthi.sv_id = sinhvien.sinh_vien_id where sinhvien.cmnd="+cmnd+"");       
                    ResultSet rs = query.executeQuery();
                    ResultSetMetaData rss = rs.getMetaData();
                    c = rss.getColumnCount();
                    DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
                    df.setRowCount(0);
                        while(rs.next()){
                            Vector v2 = new Vector();
                            for (int a = 1; a <=c; a++) {
                                v2.add(rs.getString("cmnd"));
                                v2.add(rs.getString("fullname"));
                                v2.add(rs.getString("ten_cau_hoi"));
                                v2.add(rs.getString("cau_chon"));
                                v2.add(rs.getString("dap_an_dung"));
                                v2.add(rs.getString("ket_qua")); 
                            }
                            df.addRow(v2);
                        }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
    }//GEN-LAST:event_jTextField1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
