/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class GiangVien implements Serializable{
    private int ma_giang_vien;
    private String ho_ten;
    private String so_dien_thoai;
    private String dia_chi;
    private Date ngay_sinh;
    private boolean gioi_tinh;
    private int luong;

    public GiangVien() {
    }

    public GiangVien(int ma_giang_vien, String ho_ten, String so_dien_thoai, String dia_chi, Date ngay_sinh, boolean gioi_tinh, int luong) {
        this.ma_giang_vien = ma_giang_vien;
        this.ho_ten = ho_ten;
        this.so_dien_thoai = so_dien_thoai;
        this.dia_chi = dia_chi;
        this.ngay_sinh = ngay_sinh;
        this.gioi_tinh = gioi_tinh;
        this.luong = luong;
    }

    public int getMa_giang_vien() {
        return ma_giang_vien;
    }

    public void setMa_giang_vien(int ma_giang_vien) {
        this.ma_giang_vien = ma_giang_vien;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public Date getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(Date ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public boolean isGioi_tinh() {
        return gioi_tinh;
    }

    public void setGioi_tinh(boolean gioi_tinh) {
        this.gioi_tinh = gioi_tinh;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }
    
}
