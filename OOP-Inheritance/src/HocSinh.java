public class HocSinh extends ConNguoi{
  private  String TenLop, TenTruong;

  public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
    super(hoVaTen, namSinh);
    TenLop = tenLop;
    TenTruong = tenTruong;
  }

  public String getTenLop() {
    return TenLop;
  }

  public void setTenLop(String tenLop) {
    this.TenLop = tenLop;
  }

  public String getTenTruong() {
    return TenTruong;
  }

  public void setTenTruong(String tenTruong) {
    this.TenTruong = tenTruong;
  }
  public void LamBaiTap(){
    System.out.println("... ... ... ");
  }
}