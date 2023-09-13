package DAO;


import POJO.F_SanPham;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnNguyen
 */
public class DAO_SanPham{
     public static ArrayList<F_SanPham> layDanhSachSanPham()
        {
            ArrayList<F_SanPham> dssp = new ArrayList<>();
            try{
            String sql = "select MaSP,TenSP,TenLoai,SoLuong,DonGia from SANPHAM, LOAISANPHAM where SANPHAM.MaLoai = LOAISANPHAM.MaLoai ";
            SQLSeverDataProvider provider = new SQLSeverDataProvider();
            provider.open();
            ResultSet resultSet = provider.executeQuery(sql);
            while(resultSet.next())
            {
                F_SanPham sp = new F_SanPham();
                sp.setMaSP(resultSet.getInt("MaSP"));
                sp.setTenSP(resultSet.getString("TenSP"));
                sp.seTenLoai(resultSet.getString("TenLoai"));
                sp.setDonGia(resultSet.getInt("DonGia"));
                sp.setSoLuong(resultSet.getInt("SoLuong"));
                dssp.add(sp);
            }
            }catch(SQLException e){
               e.getMessage();
            }
            return dssp;
        }
     
     
     //ha
     
     
}
