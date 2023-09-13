/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.F_TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ha
 */
public class DAO_TaiKhoan {
    public static ArrayList<F_TaiKhoan> layDanhSachTaiKhoan(){
        ArrayList<F_TaiKhoan> dsTK = new ArrayList<F_TaiKhoan>();
       try {
           String sql="select * from PhongBan";
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           provider.open();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_TaiKhoan tk = new F_TaiKhoan();
               tk.setTaiKhoan(resultSet.getString("TaiKhoan"));
               tk.setMatKhau(resultSet.getString("MatKhau"));
               tk.setMaNV(resultSet.getInt("MaNV"));
               tk.setQuyen(resultSet.getInt("Quyen"));
               dsTK.add(tk);
             
            }
           provider.close();
       } catch (SQLException ex) {
           Logger.getLogger(F_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
       }
       return dsTK;
        
        
    }
    public static ArrayList<F_TaiKhoan>timKiemTaiKhoanTheoTenDN(String tentk, String mk){
        ArrayList<F_TaiKhoan> dsTK = new ArrayList<F_TaiKhoan>();
       try {
           String sql="select * from TAIKHOAN where TaiKhoan ='"+tentk+"' and MatKhau='"+mk+"'";
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_TaiKhoan tk = new F_TaiKhoan();
               tk.setTaiKhoan(resultSet.getString("TaiKhoan"));
               tk.setMatKhau(resultSet.getString("MatKhau"));
               tk.setMaNV(resultSet.getInt("MaNV"));
               tk.setQuyen(resultSet.getInt("Quyen"));
               dsTK.add(tk);
             
            }
           provider.close();
       } catch (Exception e) {
           Logger.getLogger(F_TaiKhoan.class.getName()).log(Level.SEVERE, null, e);
       }
       return dsTK;
    }

    public static boolean timTK(String tentk, String mk){
       boolean kq = false;
       String sql =String.format("select * from TAIKHOAN where TaiKhoan ='"+tentk+"' and MatKhau='"+mk+"'");
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
       provider.open();
       ResultSet resultSet = provider.executeQuery(sql);
       try {
            if(resultSet.next())
            {
                kq= true;
               
            }} 
        catch (SQLException ex) {
            Logger.getLogger(DAO_TaiKhoan.class.getName()).log(Level.SEVERE, null, ex);
        }
       provider.close();
       return kq;
    }
    
    
    
    public static boolean themTaiKhoan(F_TaiKhoan tk){
       boolean kq = false;
       String sql =String.format("insert into TAIKHOAN(TaiKhoan,MatKhau,MaNV,Quyen) values ('%s','%s','%s',0)",tk.getTaiKhoan(),tk.getMatKhau(),tk.getMaNV());
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
       provider.open();
       int n = provider.executeUpdate(sql);
       if(n==1){
           kq= true;
       }
       provider.close();
       return kq;
    }
    
    public static boolean xoaTaiKhoan(String tk){
        boolean kq = false;
       String sql =String.format("delete from TAIKHOAN where TaiKhoan='abc'",tk);
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
       provider.open();
       int n = provider.executeUpdate(sql);
       if(n==1){
           kq= true;
       }
       provider.close();
       return kq;
    }
    public static boolean capNhatTaiKhoan(F_TaiKhoan tk,String mk){
       boolean kq = false;
       String sql =String.format("update TAIKHOAN set MatKhau ='%s' where MatKhau='%s' and TaiKhoan ='%s'",mk,tk.getMatKhau(),tk.getTaiKhoan());
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
       provider.open();
       int n = provider.executeUpdate(sql);
       if(n==1){
           kq= true;
       }
       provider.close();
       return kq;
    }
    public static F_TaiKhoan layTaiKhoan (int taikhoan){
        F_TaiKhoan tk = null;
       try {
           String sql ="Select * from PhongBan where MaPHG="+taikhoan;
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
           ResultSet resultSet = provider.executeQuery(sql);
           if(resultSet.next())
           {
               tk = new F_TaiKhoan();
               tk.setTaiKhoan(resultSet.getString("TaiKhoan"));
               tk.setMatKhau(resultSet.getString("MatKhau"));
               tk.setMaNV(resultSet.getInt("MaNV"));
               tk.setQuyen(resultSet.getInt("Quyen"));
               
             
            }
           provider.close();
       } catch (Exception e) {
           Logger.getLogger(F_TaiKhoan.class.getName()).log(Level.SEVERE, null, e);
       }
       return tk;
    }
}
