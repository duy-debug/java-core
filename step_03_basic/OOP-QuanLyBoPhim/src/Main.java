public class Main {
  public static void main(String[] args) {
    Day day1 = new Day(15,5,2021);
    Day day2 = new Day(15,5,2023);
    HangSanXuat hangSanXuat = new HangSanXuat("Hang Poster", "USA");
    HangSanXuat hangSanXuat1 = new HangSanXuat("Hang Tokyo", "Japan");
    BoPhim boPhim = new BoPhim("Bố Gia", 2022, hangSanXuat,100000 , day1);
    BoPhim boPhim1 = new BoPhim("Nhà Bà Nữ", 2023, hangSanXuat, 2000000, day2);
    System.out.println("So sanh gia 1 re hon 2: " + boPhim.KiemTraGiaVeReHon(boPhim1));
    System.out.println("Tên hãng sản xuất bộ phim 1: " + boPhim.LayTenHangSanXuat());
    System.out.println("Bộ phim 1 giam 10%: " +boPhim.GiaSauKhiKhuyenMai(10));
  }
}