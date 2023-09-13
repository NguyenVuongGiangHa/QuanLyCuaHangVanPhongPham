
package GUI;

import DAO.DAO_TaiKhoan;
import POJO.F_TaiKhoan;
import raven.panel1;
import raven.panelLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;


public class GUI_DangNhap extends javax.swing.JFrame {
    private MigLayout layout;
    private panel1 p;
    private panelLogin login;
    private boolean isLogin;
    private final double addSize =30;
    private final double pSize = 40;
    private final double loginSize = 60;
    private final DecimalFormat df= new DecimalFormat("##0.###");
    DefaultTableModel dtb = new DefaultTableModel();
    public GUI_DangNhap() {
        initComponents();
        init();
       
        
    }
    private void  init()
    {
        layout = new MigLayout("fill,insets 0");
        p = new panel1();
        //login = new panelLogin();
        ActionListener eventLogin = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                login();
            }
        };
        login = new panelLogin(eventLogin) ;
        TimingTarget target= new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                double fp;
                double flogin;
                double size= pSize;
                if(fraction<=0.5f){
                    size+=fraction *addSize;
                }
                else
                {
                    size +=addSize- fraction*addSize;
                }
                if(isLogin)
                {
                    fp =1f- fraction ;
                    flogin = fraction;
                }else
                {
                    fp =fraction ;
                    flogin = 1f- fraction ;
                }
                if(fraction>=0.5f)
                {
                    login.showDetail(isLogin);
                }
                fp=Double.valueOf(df.format(fp));
                flogin=Double.valueOf(df.format(flogin));
                layout.setComponentConstraints(p, "width "+size+"%,pos" +fp+"al 0 n 100%");
                 layout.setComponentConstraints(login, "width "+loginSize+"%,pos" +flogin+"al 0 n 100%");
                bg.revalidate();
            }

            @Override
            public void end() {
                isLogin=!isLogin; 
            }
            
        };
        Animator animator = new Animator(1000,target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
        bg.setLayout(layout);
        bg.add(p,"width "+pSize+"%,pos 0al 0 n 100%");
        bg.add(login,"width "+loginSize+"%,pos 1al 0 n 100%");
        p.addEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!animator.isRunning())
                {
                    animator.start();
                }
            }
        });
    }
    private void login()
    {
        F_TaiKhoan tkDN = login.getkDN();
        
        //if(1==DAO.DAO_TaiKhoan.timKiemTaiKhoanTheoTenDN(tkDN.getTaiKhoan(),tkDN.getMatKhau()).size())
        if(DAO_TaiKhoan.timTK(tkDN.getTaiKhoan(),tkDN.getMatKhau()))
       {
            System.out.println("Tim thay");
            GUI_Main a = new GUI_Main();
            this.setVisible(false);
            a.setVisible(true);
        }
        else
        {
            System.out.println("Khong thay");
            JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_DangNhap().setVisible(true);
            }
        });
    }

 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
