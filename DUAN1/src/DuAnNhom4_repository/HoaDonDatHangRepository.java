/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_viewmodel.vHoaDonDatHang;
import DuAnNhom4_viewmodel.vKhachHang;
import DuAnNhom4_viewmodel.vSanPham1;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author TRAN VAN DUONG
 */
public class HoaDonDatHangRepository {

    public static List<vHoaDonDatHang> getAll() {
        String query = "select HOADONDATHANG.ID, SANPHAM.TENSP, HOADONDATHANG.SOLUONG, SANPHAM.GIABAN, SANPHAM.MAUSAC, SANPHAM.SIZE, KHACHHANG.HOTEN,KhachHang.SDT,KhachHang.DAICHI,SANPHAM.HINHANH, HOADONDATHANG.TRANGTHAI "
                + "from HOADONDATHANG "
                + "join SANPHAM ON HOADONDATHANG.IDSP = SANPHAM.Id "
                + "join KHACHHANG ON HOADONDATHANG.IDKH = KHACHHANG.ID";
        try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            List<vHoaDonDatHang> listHoaDon = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vSanPham1 sanPham = new vSanPham1(rs.getString(2), rs.getString(6), rs.getString(5), rs.getBigDecimal(4), rs.getString(10));
                vKhachHang khachHang = new vKhachHang(rs.getString(7), rs.getString(8), rs.getString(9));
                vHoaDonDatHang hoaDonDatHang = new vHoaDonDatHang(khachHang, sanPham, rs.getString(1), rs.getInt(3), rs.getInt(11));
                listHoaDon.add(hoaDonDatHang);
            }
            return listHoaDon;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean delete(String ID) {
        String query = "DELETE FROM [dbo].[HOADONDATHANG]"
                + "      WHERE ID = ?";
        int check = 0;
        try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, ID);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public vHoaDonDatHang timKiem(int TrangThai) {
        String query = "select HOADONDATHANG.ID, SANPHAM.TENSP, HOADONDATHANG.SOLUONG, SANPHAM.GIABAN, SANPHAM.MAUSAC, SANPHAM.SIZE, KHACHHANG.HOTEN,KhachHang.SDT,KhachHang.DAICHI,SANPHAM.HINHANH, HOADONDATHANG.TRANGTHAI"
                + "from HOADONDATHANG "
                + "join SANPHAM ON HOADONDATHANG.IDSP = SANPHAM.Id "
                + "join KHACHHANG ON HOADONDATHANG.IDKH = KHACHHANG.ID "
                + "where HOADONDATHANG.TRANGTHAI = ?";
        try (Connection con = DBContext1.getConnection(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, TrangThai);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                vSanPham1 sanPham = new vSanPham1(rs.getString(2), rs.getString(6), rs.getString(5), rs.getBigDecimal(4), rs.getString(10));
                vKhachHang khachHang = new vKhachHang(rs.getString(7), rs.getString(8), rs.getString(9));
                return new vHoaDonDatHang(khachHang, sanPham, rs.getString(1), rs.getInt(3), rs.getInt(11));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public static void main(String[] args) {
        HoaDonDatHangRepository hd = new HoaDonDatHangRepository();
        hd.getAll();
    }
}
