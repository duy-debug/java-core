public class Lop {
  private String TenLop;
  private String TenKhoa;

  public Lop(String tenLop, String tenKhoa) {
    TenLop = tenLop;
    TenKhoa = tenKhoa;
  }
  public String getTenLop() {
    return TenLop;
  }
  public String getTenKhoa() {
    return TenKhoa;
  }
  public void setTenLop(String tenLop) {
    this.TenLop = tenLop;
  }
  public void setTenKhoa(String tenKhoa) {
    this.TenKhoa = tenKhoa;
  }
}
