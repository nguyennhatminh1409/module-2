public class NhanVienFullTime extends NhanVien{
    public NhanVienFullTime(String MaNhanVien, String HoTen, int Tuoi, String SoDienThoai, String Email) {
        super(MaNhanVien, HoTen, Tuoi, SoDienThoai, Email);
    }
    private String MaNhanVien;
    private String HoTen;
    private int Tuoi;
    private String SoDienThoai;
    private String Email;
    // Các thuộc tính và phương thức khác của lớp NhanVien

    // Constructors, getters và setters
}

class NhanVienFulltime extends NhanVien {
    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;

    public NhanVienFulltime(String MaNhanVien, String HoTen, int Tuoi, String SoDienThoai, String Email, double soTienThuong, double soTienPhat, double luongCung) {
        super(MaNhanVien, HoTen, Tuoi, SoDienThoai, Email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }
    //Gán getter vad setter cho các tuộc tính
    public double getSoTienThuong(){
        return soTienThuong;
    }
    public void setSoTienThuong(){
        this.soTienThuong = soTienThuong;
    }
    public double getSoTienPhat(){
        return soTienPhat;
    }
    public void setSoTienPhat(){
        this.soTienPhat = soTienPhat;
    }
    public double getLuongCung(){
        return luongCung;
    }
    public void setLuongCung(){
        this.luongCung = luongCung;
    }
}

