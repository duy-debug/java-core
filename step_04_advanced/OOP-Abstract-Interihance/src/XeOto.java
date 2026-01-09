public class XeOto extends PhuongTienDiChuyen{
  private String loaiNhienLieu;
  public XeOto(String loaiNhienLieu, HangSanXuat hangSanXuat) {
    super(loaiNhienLieu, hangSanXuat);
    this.loaiNhienLieu = loaiNhienLieu;
  }

  @Override
  public double layVanToc() {
    return 20010;
  }
}
