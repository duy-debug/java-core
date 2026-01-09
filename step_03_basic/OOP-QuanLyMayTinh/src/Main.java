public class Main {
  public static void main(String[] args) {
    NgaySanXuat ngay1 = new NgaySanXuat(30,12,2022);
    NgaySanXuat ngay2 = new NgaySanXuat(30,12,2023);
    QuocGia quocGia1 = new QuocGia(1,"Singapore");
    QuocGia quocGia2 = new QuocGia(2,"Japan");
    HangSanXuat hang1 = new HangSanXuat("Tokyo",quocGia1);
    HangSanXuat hang2 = new HangSanXuat("Hirosima",quocGia2);
    MayTinh mayTinh1 = new MayTinh(ngay1,hang1,412421.3,3.5);
    MayTinh mayTinh2 = new MayTinh(ngay2,hang2,412.3,3);
    System.out.println("So sanh gia ban máy 1 và máy 2: " + mayTinh1.KiemTraGiaThapHon(mayTinh2));
    System.out.println("Tên quốc gia: ");
    System.out.println("Máy 1: " + mayTinh1.LayTenQuocGia());
    System.out.println("Máy 2: " + mayTinh2.LayTenQuocGia());
  }
}