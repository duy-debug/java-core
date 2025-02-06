package Test;

public class Test {
  public static void main(String[] args) {
    ThoiKhoaBieu tkb = new ThoiKhoaBieu(Day.Monday,"Toán Lý Hóa");
    ThoiKhoaBieu tkb1 = new ThoiKhoaBieu(Day.Tuesday,"Văn Sử Địa");
    ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Wednesday,"Lý Hóa Sinh");
    ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Thursday,"Tin học - GDCD - Thể Dục");
    System.out.println(tkb);
    int x = Thang.tháng_ba.Songay();
    System.out.println(x);
    


  }
}
