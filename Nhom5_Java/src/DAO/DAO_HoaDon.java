/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Pojo.F_HoaDon;
import java.util.ArrayList;
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
public class DAO_HoaDon {
    public static ArrayList<F_HoaDon> layDanhSachHoaDon(){
        ArrayList<F_HoaDon> dsHD = new ArrayList<F_HoaDon>();
       try {
           String sql="select * from HOADON where TrangThai=N'Đang tạo'";
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           provider.open();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_HoaDon hd = new F_HoaDon();
               hd.setMaHD(resultSet.getInt("MaHD"));
               hd.setMaKH(resultSet.getInt("MaKH"));
               hd.setMaNV(resultSet.getInt("MaNV"));
               hd.setThanhTien(resultSet.getInt("ThanhTien"));
               hd.setNgayThang(resultSet.getString("NgayBan"));
               hd.setTrangThai(resultSet.getString("TrangThai"));
               dsHD.add(hd);
             
            }
           provider.close();
       } catch (SQLException ex) {
           Logger.getLogger(F_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
       }
       return dsHD;
    }
    public static ArrayList<F_HoaDon>timKiemHdTheoMahd(int MaHD, int MaNV, int MaKH ){
        ArrayList<F_HoaDon> dsHD = new ArrayList<F_HoaDon>();
       try {
           String sql="select * from HOADON where 1=1";
           if(MaHD !=0)
                sql +=String.format("and MaHD ='"+MaHD+"'");
           if(MaNV!=0)
                sql +=String.format("and MaNV ='"+MaNV+"'");
           if(MaKH!=0)
                sql +=String.format("and MaKH ='"+MaKH+"'");
           SQLSeverDataProvider provider = new SQLSeverDataProvider();
           ResultSet resultSet = provider.executeQuery(sql);
           while(resultSet.next())
           { 
               F_HoaDon hd = new F_HoaDon();
               hd.setMaHD(resultSet.getInt("MaHD"));
               hd.setMaKH(resultSet.getInt("MaKH"));
               hd.setMaNV(resultSet.getInt("MaNV"));
               hd.setThanhTien(resultSet.getInt("ThanhTien"));
               hd.setNgayThang(resultSet.getString("NgayBan"));
               hd.setTrangThai(resultSet.getString("TrangThai"));
               dsHD.add(hd);
             
            }
           provider.close();
       } catch (Exception e) {
           Logger.getLogger(F_HoaDon.class.getName()).log(Level.SEVERE, null, e);
       }
       return dsHD;
    }
    
    public static boolean timHD(int MaHD, int MaNV, int MaKH ){
       boolean kq = false;
       String sql =String.format("select * from HOADON where 1=1");
       if(MaHD !=0)
            sql +=String.format("and MaHD ='"+MaHD+"'");
       if(MaNV!=0)
          sql +=String.format("and MaNV ='"+MaNV+"'");
       if(MaKH!=0)
          sql +=String.format("and MaKH ='"+MaKH+"'");
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
    
    
    
    public static boolean themHoaDon(String MaNV){
       boolean kq = false;
      String sql =String.format("Insert into HoaDon (MaNV, NgayBan, TrangThai)"
                + " values ("+MaNV+",'"+java.time.LocalDate.now()+"', N'Đang tạo' )");
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
       provider.open();
       int n = provider.executeUpdate(sql);
       if(n>=1){
           kq= true;
       }
       provider.close();
       return kq;
    }
    
//    public static boolean xoaHD(String tk){
//        boolean kq = false;
//       String sql =String.format("delete from TAIKHOAN where TaiKhoan='abc'",tk);
//       SQLSeverDataProvider provider = new SQLSeverDataProvider();
//       provider.open();
//       int n = provider.executeUpdate(sql);
//       if(n==1){
//           kq= true;
//       }
//       provider.close();
//       return kq;
//    }

    
    

}
