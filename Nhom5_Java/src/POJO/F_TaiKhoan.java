/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

/**
 *
 * @author Ha
 */
public class F_TaiKhoan {
    String taiKhoan;
    String matKhau;
    int maNV;
    int quyen;

    public F_TaiKhoan() {
    }

    public F_TaiKhoan(String taiKhoan, String matKhau, int maNV, int quyen) {
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.maNV = maNV;
        this.quyen = quyen;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }
    
    
    
}
