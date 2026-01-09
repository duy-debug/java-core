package Test;

import Main.DanhSachSinhVien;
import Main.SinhVien;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DanhSachSinhVien dssv = new DanhSachSinhVien();
    int luachon = 0;
    do {
      System.out.println("MENU-----------------");
      System.out.println("1. Thêm sinh viên vào danh sách.\n" +
              "2. In danh sách sinh viên ra màn hình.\n" +
              "3. Kiểm tra danh sách có rỗng hay không.\n" +
              "4. Lấy ra số lượng sinh viên trong danh sách.\n" +
              "5. Làm rỗng danh sách sinh viên.\n" +
              "6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n" +
              "7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n" +
              "8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n" +
              "9. Xuât ra danh sách sinh viên có điểm từ cao đến thấp.\n"+"" +
              "0. Thoát khỏi chương trình.");
      luachon = sc.nextInt();
      sc.nextLine();
      if(luachon == 1) {
        System.out.println("Nhập mã sinh viên: ");
        String maNhanVien = sc.nextLine();
        System.out.println("Nhập họ và tên: ");
        String HoTen = sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        int NamSinh = sc.nextInt();
        System.out.println("Nhập điểm trung bình: ");
        double DiemTrungBinh = sc.nextDouble();
        SinhVien sv = new SinhVien(maNhanVien, HoTen, NamSinh, DiemTrungBinh);
        dssv.ThemSinhVien(sv);
      }else if(luachon == 2) {
        dssv.inDanhSach();
      }else if(luachon == 3) {
        System.out.println("Danh sách rỗng: " +dssv.KiemTraDanhSachRong());
      }else if(luachon == 4) {
        System.out.println("Số lượng sinh viên: " +dssv.LayRaSoLuong());
      }else if(luachon == 5) {
        dssv.LamRong();
      }else if(luachon == 6) {
        System.out.println("Nhập mã sinh viên: ");
        String MaNhanVien = sc.nextLine();
        SinhVien sv = new SinhVien(MaNhanVien);
        System.out.println("Kiểm tra sinh viên có trong danh sách: " +dssv.KiemTraTonTai(sv));
      }else if(luachon == 7) {
        System.out.println("Nhập mã sinh viên: ");
        String MaNhanVien = sc.nextLine();
        SinhVien sv = new SinhVien(MaNhanVien);
        System.out.println("Xóa sinh viên trong danh sách: " +dssv.XoaSinhVien(sv));
      }else if(luachon == 8) {
        System.out.println("Nhập họ và tên: ");
        String HoTen = sc.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        dssv.TimSinhVien(HoTen);
      }else if(luachon == 9) {
        dssv.SapXepSinhVienGiamDanTheoDiem();
        dssv.inDanhSach();
      }
    }while(luachon != 0);
  }
}
