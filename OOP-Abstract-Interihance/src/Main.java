public class Main {
  public static void main(String[] args) {
    HangSanXuat h1 = new HangSanXuat("Hang1","VietNam");
    HangSanXuat h2 = new HangSanXuat("Hang2","USA");
    MayBay p1 = new MayBay(h1,"Xăng");
    PhuongTienDiChuyen p2 = new XeOto("Điện",h2);
    PhuongTienDiChuyen p3 = new XeDap(h2);
    System.out.println("Lấy hãng sx : ");
    System.out.println("P1: " +p1.layTenHangSanXuat());
    System.out.println("Bắt đầu: ");
    p2.batDau();
    System.out.println("Lấy vận tốc: ");
    System.out.println("p1: " +p1.layVanToc());
    System.out.println("p2: " +p2.layVanToc());
    System.out.println("p3: " +p3.layVanToc());
    p1.catCanh();
    p1.haCanh();
  }
}