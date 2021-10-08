/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlthisathach;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author MSI
 */
public class MainFormAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainFormAdmin(String abc) {
        initComponents();
        MenuHide.setVisible(false);
        user_id.setText(abc);
        user_id.setEnabled(false);
        user_id.setVisible(false);
        Setting.setVisible(false);
        LineSetting.setVisible(false);
    }

    private MainFormAdmin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    
    

    
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    
    public void clickmenu(JPanel h1, JPanel h2, int numberbool){
        if(numberbool == 1){
            h1.setBackground(new Color(21,25,28));
            h2.setBackground(new Color(21,25,28));
        }
        else{
            h1.setBackground(new Color(21,25,28));
            h2.setBackground(new Color(21,25,28));
        }
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    public void hideshow(JPanel menushowhide, boolean dashboard, JLabel button){
        if(dashboard == true){
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
            changeimage(button, "/qlthisathach/icons/menu_32px.png");
        }
        else{
            menushowhide.setPreferredSize(new Dimension(270, menushowhide.getHeight()));
            changeimage(button, "/qlthisathach/icons/back_32px.png");
        }
    }
    
    boolean a = false;
    private StaffPanel mStaffPanel;
    private QuestionPanel mQuestionPanel;
    private StudentPanel mStudentPanel;
    private ThongKe mThongKe;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        iconFProgram = new javax.swing.JPanel();
        MaxiumIcon = new javax.swing.JPanel();
        ButtonMiniMax = new javax.swing.JLabel();
        CloseIcon = new javax.swing.JPanel();
        ButtonClose = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        MenuIcon = new javax.swing.JPanel();
        LineHideMenu = new javax.swing.JPanel();
        HideMenu = new javax.swing.JPanel();
        ButtonHideMenu = new javax.swing.JLabel();
        Setting = new javax.swing.JPanel();
        ButtonSetting = new javax.swing.JLabel();
        LineSetting = new javax.swing.JPanel();
        LineLogOut = new javax.swing.JPanel();
        LogOut = new javax.swing.JPanel();
        ButtonLogOut = new javax.swing.JLabel();
        MenuHide = new javax.swing.JPanel();
        LineQLTS = new javax.swing.JPanel();
        QLTS = new javax.swing.JPanel();
        txtQLTS = new javax.swing.JLabel();
        LineQLNV = new javax.swing.JPanel();
        QLNV = new javax.swing.JPanel();
        txtQLNV = new javax.swing.JLabel();
        LineQLDT = new javax.swing.JPanel();
        QLDT = new javax.swing.JPanel();
        txtQLDT = new javax.swing.JLabel();
        QLDT1 = new javax.swing.JPanel();
        txtQLDT1 = new javax.swing.JLabel();
        LineQLDT1 = new javax.swing.JPanel();
        DashBoardMain = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Header.setBackground(new java.awt.Color(21, 25, 28));
        Header.setPreferredSize(new java.awt.Dimension(800, 50));
        Header.setLayout(new java.awt.BorderLayout());

        iconFProgram.setBackground(new java.awt.Color(21, 25, 28));
        iconFProgram.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MaxiumIcon.setBackground(new java.awt.Color(21, 25, 28));
        MaxiumIcon.setLayout(new java.awt.BorderLayout());

        ButtonMiniMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonMiniMax.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/full_screen_32px.png"))); // NOI18N
        ButtonMiniMax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonMiniMaxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonMiniMaxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonMiniMaxMouseExited(evt);
            }
        });
        MaxiumIcon.add(ButtonMiniMax, java.awt.BorderLayout.CENTER);

        iconFProgram.add(MaxiumIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        CloseIcon.setBackground(new java.awt.Color(21, 25, 28));
        CloseIcon.setLayout(new java.awt.BorderLayout());

        ButtonClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/delete_32px.png"))); // NOI18N
        ButtonClose.setPreferredSize(new java.awt.Dimension(50, 50));
        ButtonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonCloseMouseExited(evt);
            }
        });
        CloseIcon.add(ButtonClose, java.awt.BorderLayout.CENTER);

        iconFProgram.add(CloseIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 50));

        Header.add(iconFProgram, java.awt.BorderLayout.LINE_END);
        Header.add(user_id, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Menu.setBackground(new java.awt.Color(21, 25, 28));
        Menu.setLayout(new java.awt.BorderLayout());

        MenuIcon.setBackground(new java.awt.Color(21, 25, 28));
        MenuIcon.setPreferredSize(new java.awt.Dimension(50, 450));
        MenuIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineHideMenu.setBackground(new java.awt.Color(21, 25, 28));

        javax.swing.GroupLayout LineHideMenuLayout = new javax.swing.GroupLayout(LineHideMenu);
        LineHideMenu.setLayout(LineHideMenuLayout);
        LineHideMenuLayout.setHorizontalGroup(
            LineHideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineHideMenuLayout.setVerticalGroup(
            LineHideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(LineHideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 5));

        HideMenu.setBackground(new java.awt.Color(21, 25, 28));
        HideMenu.setLayout(new java.awt.BorderLayout());

        ButtonHideMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonHideMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/menu_32px.png"))); // NOI18N
        ButtonHideMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonHideMenuMouseExited(evt);
            }
        });
        HideMenu.add(ButtonHideMenu, java.awt.BorderLayout.CENTER);

        MenuIcon.add(HideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 50, 50));

        Setting.setBackground(new java.awt.Color(21, 25, 28));
        Setting.setLayout(new java.awt.BorderLayout());

        ButtonSetting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/settings_32px.png"))); // NOI18N
        ButtonSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonSettingMouseExited(evt);
            }
        });
        Setting.add(ButtonSetting, java.awt.BorderLayout.CENTER);

        MenuIcon.add(Setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 50));

        LineSetting.setBackground(new java.awt.Color(21, 25, 28));

        javax.swing.GroupLayout LineSettingLayout = new javax.swing.GroupLayout(LineSetting);
        LineSetting.setLayout(LineSettingLayout);
        LineSettingLayout.setHorizontalGroup(
            LineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineSettingLayout.setVerticalGroup(
            LineSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(LineSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 50, 5));

        LineLogOut.setBackground(new java.awt.Color(21, 25, 28));

        javax.swing.GroupLayout LineLogOutLayout = new javax.swing.GroupLayout(LineLogOut);
        LineLogOut.setLayout(LineLogOutLayout);
        LineLogOutLayout.setHorizontalGroup(
            LineLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        LineLogOutLayout.setVerticalGroup(
            LineLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuIcon.add(LineLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 695, 50, 5));

        LogOut.setBackground(new java.awt.Color(21, 25, 28));
        LogOut.setLayout(new java.awt.BorderLayout());

        ButtonLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ButtonLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/logout-icon-32.png"))); // NOI18N
        ButtonLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonLogOutMouseExited(evt);
            }
        });
        LogOut.add(ButtonLogOut, java.awt.BorderLayout.CENTER);

        MenuIcon.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 50, 50));

        Menu.add(MenuIcon, java.awt.BorderLayout.LINE_START);

        MenuHide.setBackground(new java.awt.Color(34, 40, 44));
        MenuHide.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LineQLTS.setBackground(new java.awt.Color(34, 40, 44));

        javax.swing.GroupLayout LineQLTSLayout = new javax.swing.GroupLayout(LineQLTS);
        LineQLTS.setLayout(LineQLTSLayout);
        LineQLTSLayout.setHorizontalGroup(
            LineQLTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        LineQLTSLayout.setVerticalGroup(
            LineQLTSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuHide.add(LineQLTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 5));

        QLTS.setBackground(new java.awt.Color(34, 40, 44));
        QLTS.setLayout(new java.awt.BorderLayout());

        txtQLTS.setBackground(new java.awt.Color(98, 99, 101));
        txtQLTS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQLTS.setForeground(new java.awt.Color(240, 240, 240));
        txtQLTS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQLTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        txtQLTS.setText("Quản lý thí sinh");
        txtQLTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQLTSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQLTSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQLTSMouseExited(evt);
            }
        });
        QLTS.add(txtQLTS, java.awt.BorderLayout.CENTER);

        MenuHide.add(QLTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 220, 40));

        LineQLNV.setBackground(new java.awt.Color(34, 40, 44));

        javax.swing.GroupLayout LineQLNVLayout = new javax.swing.GroupLayout(LineQLNV);
        LineQLNV.setLayout(LineQLNVLayout);
        LineQLNVLayout.setHorizontalGroup(
            LineQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        LineQLNVLayout.setVerticalGroup(
            LineQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuHide.add(LineQLNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 220, 5));

        QLNV.setBackground(new java.awt.Color(34, 40, 44));
        QLNV.setLayout(new java.awt.BorderLayout());

        txtQLNV.setBackground(new java.awt.Color(98, 99, 101));
        txtQLNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQLNV.setForeground(new java.awt.Color(240, 240, 240));
        txtQLNV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/gpa-icon-32.png"))); // NOI18N
        txtQLNV.setText("Quản lý nhân viên");
        txtQLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQLNVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQLNVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQLNVMouseExited(evt);
            }
        });
        QLNV.add(txtQLNV, java.awt.BorderLayout.CENTER);

        MenuHide.add(QLNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 220, 40));

        LineQLDT.setBackground(new java.awt.Color(34, 40, 44));
        LineQLDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineQLDTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LineQLDTLayout = new javax.swing.GroupLayout(LineQLDT);
        LineQLDT.setLayout(LineQLDTLayout);
        LineQLDTLayout.setHorizontalGroup(
            LineQLDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        LineQLDTLayout.setVerticalGroup(
            LineQLDTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuHide.add(LineQLDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 220, 5));

        QLDT.setBackground(new java.awt.Color(34, 40, 44));
        QLDT.setLayout(new java.awt.BorderLayout());

        txtQLDT.setBackground(new java.awt.Color(98, 99, 101));
        txtQLDT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQLDT.setForeground(new java.awt.Color(240, 240, 240));
        txtQLDT.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQLDT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/Actions-document-edit-icon-32.png"))); // NOI18N
        txtQLDT.setText("Quản lý đề thi");
        txtQLDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQLDTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQLDTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQLDTMouseExited(evt);
            }
        });
        QLDT.add(txtQLDT, java.awt.BorderLayout.CENTER);

        MenuHide.add(QLDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 95, 220, 40));

        QLDT1.setBackground(new java.awt.Color(34, 40, 44));
        QLDT1.setLayout(new java.awt.BorderLayout());

        txtQLDT1.setBackground(new java.awt.Color(98, 99, 101));
        txtQLDT1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQLDT1.setForeground(new java.awt.Color(240, 240, 240));
        txtQLDT1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtQLDT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlthisathach/icons/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        txtQLDT1.setText("Thống kê thí sinh");
        txtQLDT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtQLDT1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtQLDT1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtQLDT1MouseExited(evt);
            }
        });
        QLDT1.add(txtQLDT1, java.awt.BorderLayout.CENTER);

        MenuHide.add(QLDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 40));

        LineQLDT1.setBackground(new java.awt.Color(34, 40, 44));
        LineQLDT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LineQLDT1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LineQLDT1Layout = new javax.swing.GroupLayout(LineQLDT1);
        LineQLDT1.setLayout(LineQLDT1Layout);
        LineQLDT1Layout.setHorizontalGroup(
            LineQLDT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        LineQLDT1Layout.setVerticalGroup(
            LineQLDT1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        MenuHide.add(LineQLDT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 220, 5));

        Menu.add(MenuHide, java.awt.BorderLayout.CENTER);

        getContentPane().add(Menu, java.awt.BorderLayout.LINE_START);
        getContentPane().add(DashBoardMain, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1200, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonMiniMaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMiniMaxMouseClicked
        if(this.getExtendedState()!= MainFormAdmin.MAXIMIZED_BOTH){
            this.setExtendedState(MainFormAdmin.MAXIMIZED_BOTH);
        }
        else{
            this.setExtendedState(MainFormAdmin.NORMAL);
        }
    }//GEN-LAST:event_ButtonMiniMaxMouseClicked

    private void ButtonMiniMaxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMiniMaxMouseEntered
        changecolor(MaxiumIcon, new Color(224, 47, 47));
    }//GEN-LAST:event_ButtonMiniMaxMouseEntered

    private void ButtonMiniMaxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonMiniMaxMouseExited
        changecolor(MaxiumIcon, new Color(21,25,28));
    }//GEN-LAST:event_ButtonMiniMaxMouseExited

    private void ButtonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ButtonCloseMouseClicked

    private void ButtonCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCloseMouseEntered
        changecolor(CloseIcon, new Color(224, 47, 47));
    }//GEN-LAST:event_ButtonCloseMouseEntered

    private void ButtonCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCloseMouseExited
        changecolor(CloseIcon, new Color(21,25,28));
    }//GEN-LAST:event_ButtonCloseMouseExited

    private void ButtonHideMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseClicked
        clickmenu(HideMenu, Setting, 1);
        if(a==true){
            hideshow(Menu, a, ButtonHideMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=false;

        }
        else{
            hideshow(Menu, a, ButtonHideMenu);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
            MenuHide.setVisible(true);
        }
    }//GEN-LAST:event_ButtonHideMenuMouseClicked

    private void ButtonHideMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseEntered
        changecolor(LineHideMenu, new Color(224, 47, 47));
    }//GEN-LAST:event_ButtonHideMenuMouseEntered

    private void ButtonHideMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonHideMenuMouseExited
        changecolor(LineHideMenu, new Color(21,25,28));
    }//GEN-LAST:event_ButtonHideMenuMouseExited

    private void txtQLTSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLTSMouseClicked
        if(mStudentPanel == null){
            mStudentPanel = new StudentPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/qlthisathach/icons/10207-man-student-light-skin-tone-icon-32.png"));
            DashBoardMain.addTab("Quản lý thí sinh", icon, mStudentPanel, "Quản lý thí sinh");
        }
        DashBoardMain.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_txtQLTSMouseClicked

    private void txtQLTSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLTSMouseEntered
        changecolor(LineQLTS, new Color(224, 47, 47));
    }//GEN-LAST:event_txtQLTSMouseEntered

    private void txtQLTSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLTSMouseExited
        changecolor(LineQLTS, new Color(34,40,44));
    }//GEN-LAST:event_txtQLTSMouseExited

    private void txtQLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLNVMouseClicked
        if(mStaffPanel == null){
            mStaffPanel = new StaffPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/qlthisathach/icons/gpa-icon-32.png"));
            DashBoardMain.addTab("Quản lý nhân viên", icon, mStaffPanel, "Quản lý nhân viên");
        }
        DashBoardMain.setSelectedComponent(mStaffPanel);
    }//GEN-LAST:event_txtQLNVMouseClicked

    private void txtQLNVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLNVMouseEntered
        changecolor(LineQLNV, new Color(224, 47, 47));
    }//GEN-LAST:event_txtQLNVMouseEntered

    private void txtQLNVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLNVMouseExited
        changecolor(LineQLNV, new Color(34,40,44));
    }//GEN-LAST:event_txtQLNVMouseExited

    private void LineQLDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineQLDTMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LineQLDTMouseClicked

    private void txtQLDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDTMouseClicked
        if(mQuestionPanel == null){
            mQuestionPanel = new QuestionPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/qlthisathach/icons/Actions-document-edit-icon-32.png"));
            DashBoardMain.addTab("Quản lý đề thi", icon, mQuestionPanel, "Quản lý đề thi");
        }
        DashBoardMain.setSelectedComponent(mQuestionPanel);
    }//GEN-LAST:event_txtQLDTMouseClicked

    private void txtQLDTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDTMouseEntered
        changecolor(LineQLDT, new Color(224, 47, 47));
    }//GEN-LAST:event_txtQLDTMouseEntered

    private void txtQLDTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDTMouseExited
        changecolor(LineQLDT, new Color(34,40,44));
    }//GEN-LAST:event_txtQLDTMouseExited

    private void txtQLDT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDT1MouseClicked
        if(mThongKe == null){
            mThongKe = new ThongKe();
            ImageIcon icon = new ImageIcon(getClass().getResource("/qlthisathach/icons/10207-man-student-light-skin-tone-icon-32.png"));
            DashBoardMain.addTab("Thống kê sinh viên", icon, mThongKe, "Thống kê sinh viên");
        }
        DashBoardMain.setSelectedComponent(mThongKe);
    }//GEN-LAST:event_txtQLDT1MouseClicked

    private void txtQLDT1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDT1MouseEntered
        changecolor(LineQLDT1, new Color(224, 47, 47));
    }//GEN-LAST:event_txtQLDT1MouseEntered

    private void txtQLDT1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtQLDT1MouseExited
        changecolor(LineQLDT1, new Color(34,40,44));
    }//GEN-LAST:event_txtQLDT1MouseExited

    private void LineQLDT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LineQLDT1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LineQLDT1MouseClicked

    private void ButtonSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSettingMouseExited
        changecolor(LineSetting, new Color(21,25,28));
    }//GEN-LAST:event_ButtonSettingMouseExited

    private void ButtonSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSettingMouseEntered
        changecolor(LineSetting, new Color(224, 47, 47));
    }//GEN-LAST:event_ButtonSettingMouseEntered

    private void ButtonSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonSettingMouseClicked
        clickmenu(Setting, HideMenu, 1);
    }//GEN-LAST:event_ButtonSettingMouseClicked

    private void ButtonLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // yes option
            dispose();
            newLogin nl = new newLogin();
            nl.setVisible(true);
        } else {
            // no option
        }
    }//GEN-LAST:event_ButtonLogOutMouseClicked

    private void ButtonLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseEntered
        changecolor(LineLogOut, new Color(224, 47, 47));
    }//GEN-LAST:event_ButtonLogOutMouseEntered

    private void ButtonLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonLogOutMouseExited
        changecolor(LineLogOut, new Color(21,25,28));
    }//GEN-LAST:event_ButtonLogOutMouseExited

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
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormAdmin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ButtonClose;
    private javax.swing.JLabel ButtonHideMenu;
    private javax.swing.JLabel ButtonLogOut;
    private javax.swing.JLabel ButtonMiniMax;
    private javax.swing.JLabel ButtonSetting;
    private javax.swing.JPanel CloseIcon;
    private javax.swing.JTabbedPane DashBoardMain;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel HideMenu;
    private javax.swing.JPanel LineHideMenu;
    private javax.swing.JPanel LineLogOut;
    private javax.swing.JPanel LineQLDT;
    private javax.swing.JPanel LineQLDT1;
    private javax.swing.JPanel LineQLNV;
    private javax.swing.JPanel LineQLTS;
    private javax.swing.JPanel LineSetting;
    private javax.swing.JPanel LogOut;
    private javax.swing.JPanel MaxiumIcon;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuHide;
    private javax.swing.JPanel MenuIcon;
    private javax.swing.JPanel QLDT;
    private javax.swing.JPanel QLDT1;
    private javax.swing.JPanel QLNV;
    private javax.swing.JPanel QLTS;
    private javax.swing.JPanel Setting;
    private javax.swing.JPanel iconFProgram;
    private javax.swing.JLabel txtQLDT;
    private javax.swing.JLabel txtQLDT1;
    private javax.swing.JLabel txtQLNV;
    private javax.swing.JLabel txtQLTS;
    public static javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}
