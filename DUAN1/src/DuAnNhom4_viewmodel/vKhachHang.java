/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vKhachHang {
    String Ten;
    String SDT;
    String DiaChi;

    public vKhachHang() {
    }

    public vKhachHang(String Ten, String SDT, String DiaChi) {
        this.Ten = Ten;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return "vKhachHang{" + "Ten=" + Ten + ", SDT=" + SDT + ", DiaChi=" + DiaChi + '}';
    }
    
    
}
