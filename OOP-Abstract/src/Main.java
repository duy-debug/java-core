public class Main {
  public static void main(String[] args) {
    ToaDo td1 = new ToaDo(5,4);
    ToaDo td2 = new ToaDo(2,7);
    ToaDo td3 = new ToaDo(3,6);
    // Hinh h = new Hinh(td1); => Lỗi biên dịch
    Hinh h1 = new Diem(td1);
    Hinh h2 = new HinhTron(td2,10);
    Hinh h3 = new HinhChuNhat(td3,10,7);
    System.out.println("DT1: " + h1.TinhDienTich());
    System.out.println("DT2: " + h2.TinhDienTich());
    System.out.println("DT3: " + h3.TinhDienTich());
  }
}