public class MayTinh {
  private HangSanXuat hangSanXuat;
  private NgaySanXuat ngaySanXuat;
  private double giaBan;
  private double thoiGianBaoHanh;

  public MayTinh(NgaySanXuat ngaySanXuat, HangSanXuat hangSanXuat, double giaBan, double thoiGianBaoHanh) {
    this.ngaySanXuat = ngaySanXuat;
    this.hangSanXuat = hangSanXuat;
    this.giaBan = giaBan;
    this.thoiGianBaoHanh = thoiGianBaoHanh;
  }

  public HangSanXuat getHangSanXuat() {
    return hangSanXuat;
  }

  public void setHangSanXuat(HangSanXuat hangSanXuat) {
    this.hangSanXuat = hangSanXuat;
  }

  public NgaySanXuat getNgaySanXuat() {
    return ngaySanXuat;
  }

  public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
    this.ngaySanXuat = ngaySanXuat;
  }

  public double getGiaBan() {
    return giaBan;
  }

  public void setGiaBan(double giaBan) {
    this.giaBan = giaBan;
  }

  public double getThoiGianBaoHanh() {
    return thoiGianBaoHanh;
  }

  public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
    this.thoiGianBaoHanh = thoiGianBaoHanh;
  }
  public boolean KiemTraGiaThapHon(MayTinh mayTinh) {
    return this.giaBan < mayTinh.getGiaBan();
  }
  public String LayTenQuocGia(){
    return this.hangSanXuat.LayTenQuocGia();
  }
}
