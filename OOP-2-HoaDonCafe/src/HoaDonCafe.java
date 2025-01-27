public class HoaDonCafe {
    // Thuoc tinh
    private String TenLoaiCafe;
    private double GiaTien;
    private double KhoiLuong;
    // Phuong thuc constructor
    public HoaDonCafe(String TenLoaiCafe, double GiaTien, double KhoiLuong) {
        this.TenLoaiCafe = TenLoaiCafe;
        this.GiaTien = GiaTien;
        this.KhoiLuong = KhoiLuong;
    }
    public double TinhTongTien(){
        return this.GiaTien * this.KhoiLuong;
    }
    public boolean KiemTraKhoiLuong(double KhoiLuong){
//        if(this.KhoiLuong > KhoiLuong){
//            return true;
//        }
//        else {
//            return false;
//        }
        return this.KhoiLuong > KhoiLuong;
    }
    public boolean KiemTraTongTienLonHon500k(){
        return this.TinhTongTien() > 500000;
    }
    public double GiamGiaTien(double x){
        if (this.TinhTongTien() > 500000){
            return this.TinhTongTien() * (x/100);
        }
        else {
            return 0;
        }
    }
    public double GiaSauKhiGiam(double x){
        return this.TinhTongTien() - this.GiamGiaTien(x);
    }
}
