public class HangSanXuat {
  private String TenHang;
  private QuocGia quocGia;

  public HangSanXuat(String tenHang, QuocGia quocGia) {
    this.TenHang = tenHang;
    this.quocGia = quocGia;
  }
  public String getTenHang() {
    return TenHang;
  }
  public QuocGia getQuocGia() {
    return quocGia;
  }
  public void setQuocGia(QuocGia quocGia) {
    this.quocGia = quocGia;
  }
  public void setTenHang(String tenHang) {
    this.TenHang = tenHang;
  }
  public String LayTenQuocGia(){
    return this.quocGia.getQuocGia();
  }
}
