public class SinhVien {
  private int MSSV;
  private String HoTen;
  private NgaySinh ngaySinh;
  private double DiemTb;
  private Lop lop;

  public SinhVien(int MSSV, String hoTen, NgaySinh ngaySinh, double diemTb, Lop lop) {
    this.MSSV = MSSV;
    HoTen = hoTen;
    this.ngaySinh = ngaySinh;
    DiemTb = diemTb;
    this.lop = lop;
  }

  public int getMSSV() {
    return MSSV;
  }

  public void setMSSV(int MSSV) {
    this.MSSV = MSSV;
  }

  public String getHoTen() {
    return HoTen;
  }

  public void setHoTen(String hoTen) {
    HoTen = hoTen;
  }

  public NgaySinh getNgaySinh() {
    return ngaySinh;
  }

  public void setNgaySinh(NgaySinh ngaySinh) {
    this.ngaySinh = ngaySinh;
  }

  public double getDiemTb() {
    return DiemTb;
  }

  public void setDiemTb(double diemTb) {
    DiemTb = diemTb;
  }

  public Lop getLop() {
    return lop;
  }

  public void setLop(Lop lop) {
    this.lop = lop;
  }
  public String LayTenKhoa(){
    return this.lop.getTenKhoa();
  }
  public boolean KiemTraThiDat(){
    return this.DiemTb >= 5;
  }
  public boolean KiemTraNgaySinh(SinhVien sinhvien){
    return this.ngaySinh.equals(sinhvien.ngaySinh);
  }
}
