package model;

import java.util.ArrayList;
import java.util.List;

public class CaFe {
    private String tenQuan;
    private String diaChi;
    private String soDienThoai;


    public CaFe(String tenQuan, String diaChi, String soDienThoai) {
        this.tenQuan = tenQuan;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }
    //gắn get và set cho các thuộc tính
    public String getTenQuan() {
        return tenQuan;
    }
    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
