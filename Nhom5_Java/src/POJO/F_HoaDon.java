/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pojo;

/**
 *
 * @author Nguyen Bach Long
 */
public class F_HoaDon {
    
    int maHD;
    int maKH;
    int maNV;
    int thanhTien;
    String ngayThang;
    String trangThai;

    public F_HoaDon(int maHD, int maKH, int maNV, int thanhTien, String ngayThang, String trangThai) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.thanhTien = thanhTien;
        this.ngayThang = ngayThang;
        this.trangThai = trangThai;
    }

    public F_HoaDon() {
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(String ngayThang) {
        this.ngayThang = ngayThang;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    
    
}
