/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Pojo.F_HoaDon;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nguyen Bach Long
 */
public class HoaDon {
    
    
    
    
    public static boolean Them1HD(F_HoaDon hd)
    {
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        
        String query  = String.format("Insert into HoaDon (MaNV, NgayBan, TrangThai)"
                + " values ("+hd.getMaNV()+",'"+hd.getNgayThang()+"', '"+hd.getTrangThai()+"' )");
        
        if(provider.executeUpdate(query) >= 1)
        {
            return true;
        }
        else
        {
            return false;
        } 
    }
    
    public static F_HoaDon layHdVuaTao()
    {
       SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        ResultSet rs = provider.executeQuery("Select TOP 1 * from HoaDon Order BY MaHD DeSC");
        F_HoaDon hd = new F_HoaDon();
        try {
            while (rs.next())
            {
                
                hd.setMaHD(rs.getInt("MaHd"));
                hd.setMaKH(rs.getInt("MaKh"));
                hd.setMaNV(rs.getInt("MaNV"));
                hd.setNgayThang(rs.getString("NgayBan"));
                hd.setThanhTien(rs.getInt("ThanhTien"));
                hd.setTrangThai(rs.getString("TrangThai"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hd;
        
     
    }
    
    public static boolean capNhapHoaDon(int maHD, F_HoaDon hd)
    {
        SQLSeverDataProvider provider = new SQLSeverDataProvider();
        provider.open();
        
        String query = String.format("Update HoaDon set MaKH = "+hd.getMaKH()+", MaNV = "+hd.getMaNV()+", ThanhTien = "+hd.getThanhTien()+
                ", NgayBan = '"+hd.getNgayThang()+"', TrangThai = '"+hd.getTrangThai()+"' where MaHD = "+maHD+"");
        provider.executeUpdate(query);
        return true;
    }
    
}
