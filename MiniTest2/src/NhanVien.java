public class NhanVien {
    private String MaNhanVien;
    private String HoTen;
    private int Tuoi;
    private String SoDienThoai;
    private String Email;
    //Contructer
    public NhanVien(String MaNhanVien, String HoTen, int Tuoi,String SoDienThoai, String Email){
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.SoDienThoai = SoDienThoai;
        this.Email = Email;
    }
    //Gán Getter và Setter cho các thuộc tính
    public String getMaNhanVien(){
        return MaNhanVien;
    }
    public void setMaNhanVien(String MaNhanVien){
        this.MaNhanVien = MaNhanVien;
    }
    public String getHoTen(){
        return HoTen;
    }
    public void setHoTen(String HoTen){
        this.HoTen = HoTen;
    }
    public int getTuoi(){
        return Tuoi;
    }
    public void setTuoi(int Tuoi){
        this.Tuoi = Tuoi;
    }
    public String getSoDienThoai(){
        return SoDienThoai;
    }
    public void setSoDienThoai(String SoDienThoai){
        this.SoDienThoai = SoDienThoai;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
}
