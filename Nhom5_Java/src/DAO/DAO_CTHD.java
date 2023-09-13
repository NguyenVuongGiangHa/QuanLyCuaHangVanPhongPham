/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.F_CTHD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ha
 */
public class DAO_CTHD {
     public static ArrayList<F_CTHD> layDanhSachCTHDTheoHD(int maHD){
        ArrayList<F_CTHD> dsHD = new ArrayList<F_CTHD>();
       try {
           String sql="select * from CTHOADON where MaHD='"+maHD+"'";
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           provider.open();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_CTHD hd = new F_CTHD();
               hd.setMACTHD(resultSet.getInt("MaHD"));
               hd.setMaHD(resultSet.getInt("MaKH"));
               hd.setMaSP(resultSet.getInt("MaNV"));
               hd.setSoluong(resultSet.getInt("ThanhTien"));
               hd.setThanhTien(resultSet.getInt("NgayBan"));
               dsHD.add(hd);
            }
           provider.close();
       } catch (SQLException ex) {
           Logger.getLogger(F_CTHD.class.getName()).log(Level.SEVERE, null, ex);
       }
       return dsHD;
    }
     
     
     public static ArrayList<F_CTHD>timKiemCTHDTheoMahd(int MaHD){
        ArrayList<F_CTHD> dsHD = new ArrayList<F_CTHD>();
        
       try {
           String sql="select * from CTHOADON ";
           
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_CTHD hd = new F_CTHD();
               hd.setMACTHD(resultSet.getInt("MACTHD("));
               hd.setMaHD(resultSet.getInt("MaHD"));
               hd.setMaSP(resultSet.getInt("MaSP"));
               hd.setSoluong(resultSet.getInt("Soluong"));
               hd.setThanhTien(resultSet.getInt("ThanhTien"));
               dsHD.add(hd);
             
            }
           provider.close();
       } catch (Exception e) {
           Logger.getLogger(F_CTHD.class.getName()).log(Level.SEVERE, null, e);
       }
       return dsHD;
    }
     
}

