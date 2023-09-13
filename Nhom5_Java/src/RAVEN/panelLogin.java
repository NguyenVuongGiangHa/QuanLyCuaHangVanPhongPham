
package raven;

import POJO.F_TaiKhoan;
import com.sun.source.tree.ForLoopTree;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import net.miginfocom.swing.MigLayout;
import swing.Button;
import swing.edt_Pass;
import swing.edt_TextFied;

/**
 *
 * @author Ha
 */
public class panelLogin extends javax.swing.JLayeredPane {
    public F_TaiKhoan getkDN() {
        return tkDN;
    }
    private F_TaiKhoan tkDN;
    public panelLogin(ActionListener eventLogin) {
        initComponents();
        initDetail();
        initLogin( eventLogin);
        login.setVisible(false);
        detail.setVisible(true);
        
    }

    private void initDetail(){
        detail.setLayout(new MigLayout("wrap","push[center]push","push[]25[]10[]10[]10[]10[]push"));
        JLabel label = new JLabel("THÀNH VIÊN");
        label.setFont(new Font("sansserif",1,20));
        label.setForeground(new Color(128, 0, 0));
        detail.add(label);
        //1
        edt_TextFied txtHoTen1 = new edt_TextFied();
        txtHoTen1.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/g.png")));
        txtHoTen1.setHint("Name");
        txtHoTen1.setEditable(false);
        txtHoTen1.setText("Nguyễn Vương Giáng Hạ");
        detail.add(txtHoTen1, "w 60%");
        //2
        edt_TextFied txtHoTen2 = new edt_TextFied();
        txtHoTen2.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/b.png")));
        txtHoTen2.setHint("Name");
        txtHoTen2.setEditable(false);
        txtHoTen2.setText("Nguyễn Bạch Long");
        detail.add(txtHoTen2, "w 60%");
        //3
        edt_TextFied txtHoTen3 = new edt_TextFied();
        txtHoTen3.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/b.png")));
        txtHoTen3.setHint("Name");
        txtHoTen3.setEditable(false);
        txtHoTen3.setText("Nguyễn Thanh Phước");
        detail.add(txtHoTen3, "w 60%");
        //4
        edt_TextFied txtHoTen4 = new edt_TextFied();
        txtHoTen4.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/b.png")));
        txtHoTen4.setHint("Name");
        txtHoTen4.setEditable(false);
        txtHoTen4.setText("Nguyễn Đức An");
        detail.add(txtHoTen4, "w 60%");
        
    }
    
    private void initLogin(ActionListener eventLogin){
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Đăng nhập");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(128, 0, 0));
        login.add(label);
        //tk
        edt_TextFied txtTk = new edt_TextFied();
        txtTk.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/acc.png")));
        txtTk.setHint("Tài Khoản");
        login.add(txtTk, "w 60%");
        
        //mk
        edt_Pass txtMK = new edt_Pass();
        txtMK.setPrefixIcon(new ImageIcon(getClass().getResource("/IMAGE/pass.png")));
        txtMK.setHint("Mật Khẩu");
        login.add(txtMK, "w 60%");
        
        //quen mk
        JButton cmdQuenMK = new JButton("Bạn quên mật khẩu?");
        cmdQuenMK.setForeground(new Color(100, 100, 100));
        cmdQuenMK.setFont(new Font("sansserif", 1, 12));
        cmdQuenMK.setContentAreaFilled(false);
        cmdQuenMK.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdQuenMK);
        
        //btn log
        Button btnDangNhap = new Button();
        btnDangNhap.setBackground(new Color(128, 0, 0));
        btnDangNhap.setForeground(new Color(250, 250, 250));
        btnDangNhap.addActionListener(eventLogin);
        btnDangNhap.setText("ĐĂNG NHẬP");
        login.add(btnDangNhap, "w 40%, h 40");
        btnDangNhap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String taikhoan = txtTk.getText().trim();
                String matkhau = String.valueOf(txtMK.getPassword());
                tkDN = new F_TaiKhoan(taikhoan, matkhau,1,0);
            }
        });
        
    }
    
      public void showDetail(boolean show) {
        if (show) {
            detail.setVisible(true);
            login.setVisible(false);
        } else {
            detail.setVisible(false);
            login.setVisible(true);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        detail = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        detail.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        detailLayout.setVerticalGroup(
            detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(detail, "card2");
    }// </editor-fold>//GEN-END:initComponents

 

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel detail;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
