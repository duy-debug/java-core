public class Main {
  public static void main(String[] args) {
    ConNguoi cn = new ConNguoi("Mai Ngọc Duy",2022);
    cn.an();
    cn.uong();
    cn.ngu();
    HocSinh hs = new HocSinh("Nguyên" ,2021, "Lớp 1", "Trường 1");
    hs.an();
    hs.uong();
    hs.ngu();
    hs.LamBaiTap();
  }
}