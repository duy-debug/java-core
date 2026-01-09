public class BoPhim {
  private String TenPhim;
  private int NamSanXuat;
  private HangSanXuat HangSanXuat;
  private double GiaVe;
  private Day NgayChieu;

  public BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Day ngayChieu) {
    TenPhim = tenPhim;
    NamSanXuat = namSanXuat;
    HangSanXuat = hangSanXuat;
    GiaVe = giaVe;
    NgayChieu = ngayChieu;
  }

  public String getTenPhim() {
    return TenPhim;
  }

  public void setTenPhim(String tenPhim) {
    TenPhim = tenPhim;
  }

  public int getNamSanXuat() {
    return NamSanXuat;
  }

  public void setNamSanXuat(int namSanXuat) {
    NamSanXuat = namSanXuat;
  }

  public HangSanXuat getHangSanXuat() {
    return HangSanXuat;
  }

  public void setHangSanXuat(HangSanXuat hangSanXuat) {
    HangSanXuat = hangSanXuat;
  }

  public Day getNgayChieu() {
    return NgayChieu;
  }

  public void setNgayChieu(Day ngayChieu) {
    NgayChieu = ngayChieu;
  }

  public double getGiaVe() {
    return GiaVe;
  }

  public void setGiaVe(double giaVe) {
    GiaVe = giaVe;
  }

  public boolean KiemTraGiaVeReHon(BoPhim boPhim) {
    return this.GiaVe < boPhim.GiaVe;
  }
  public String LayTenHangSanXuat(){
    return this.HangSanXuat.getTenHangSanXuat();
  }
  public double GiaSauKhiKhuyenMai(double x){
    return this.GiaVe * (1-x/100);
  }
}
