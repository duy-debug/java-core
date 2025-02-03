public class XeDap extends PhuongTienDiChuyen{
  public XeDap(HangSanXuat hangSanXuat) {
    super("Xe đạp", hangSanXuat);
  }

  @Override
  public double layVanToc() {
    return 30000;
  }
}
