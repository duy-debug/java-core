public abstract class PhuongTienDiChuyen {
  protected String TenLoaiPhuongTien;
  protected HangSanXuat hangSanXuat;

  public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
    this.TenLoaiPhuongTien = tenLoaiPhuongTien;
    this.hangSanXuat = hangSanXuat;
  }

  public String getTenLoaiPhuongTien() {
    return this.TenLoaiPhuongTien;
  }
  public void setTenLoaiPhuongTien(String TenLoaiPhuongTien) {
    this.TenLoaiPhuongTien = TenLoaiPhuongTien;
  }
  public String layTenHangSanXuat() {
    return this.hangSanXuat.getTenHangSanXuat();
  }
  public void batDau(){
    System.out.println("Bắt đầu");
  }
  public void tangToc(){
    System.out.println("Tăng tốc");
  }
  public void dungLai(){
    System.out.println("Dừng lại");
  }
  public abstract double layVanToc();
}
