/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ha
 */
public class F_SanPham {
    int MaSP;
    String TenLoai;
    String TenSP;
    String Mau;
    int SoLuong;
    int DonGia;
    int MaNCC;

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void seTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMau() {
        return Mau;
    }

    public void setMau(String Mau) {
        this.Mau = Mau;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public int getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(int MaNCC) {
        this.MaNCC = MaNCC;
    }

    public F_SanPham() {
    }

    public F_SanPham(int MaSP, String TenLoai, String TenSP, String Mau, int SoLuong, int DonGia, int MaNCC) {
        this.MaSP = MaSP;
        this.TenLoai = TenLoai;
        this.TenSP = TenSP;
        this.Mau = Mau;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.MaNCC = MaNCC;
    }
    
    
}
