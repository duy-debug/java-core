package Main;

import java.util.*;

public class RutThamTrungThuong_HashSet {
  Set<String> tapHopPhieuDuThuong = new HashSet<String>();

  public RutThamTrungThuong_HashSet() {
  }
  public boolean themPhieu(String giatri) {
    return this.tapHopPhieuDuThuong.add(giatri);
  }
  public boolean xoaPhieu(String giatri) {
    return this.tapHopPhieuDuThuong.remove(giatri);
  }
  public boolean KiemTraPhieuTonTai(String giatri) {
    return this.tapHopPhieuDuThuong.contains(giatri);
  }
  public void xoaPhieuDuThuong() {
    this.tapHopPhieuDuThuong.clear();
  }
  public int laySoLuong() {
    return this.tapHopPhieuDuThuong.size();
  }
  public String rutMotPhieu() {
    String ketQua = "";
    Random rd = new Random();
    int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size()-1);
    ketQua =  (String) this.tapHopPhieuDuThuong.toArray()[viTri];
    return ketQua;
  }
  public void inTatCa() {
    System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
  }
  public static void main(String[] args) {
    int luachon = 0;
    Scanner sc = new Scanner(System.in);
    RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
    do {
      System.out.println("----------------------");
      System.out.println("MENU: ");
      System.out.println("1. Thêm mã số dự thưởng.");
      System.out.println("2. Xóa mã số dự thương.");
      System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không? ");
      System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
      System.out.println("5. Số lượng phiếu dự phòng.");
      System.out.println("6. Rút thăm trúng thưởng.");
      System.out.println("7. In ra tất cả các phiếu.");
      System.out.println("0. Thoát khỏi chương trình");
      luachon = sc.nextInt();
      sc.nextLine();
      if(luachon == 1 || luachon == 2 || luachon == 3) {
        System.out.println("Nhập vào mã phiếu dự thưởng: ");
        String giatri = sc.nextLine();
        if(luachon==1) {
          rt.themPhieu(giatri);
        }else if(luachon==2) {
          rt.xoaPhieu(giatri);
        }
        else{
          System.out.println("Kết quả kiểm tra: " +rt.KiemTraPhieuTonTai(giatri));
        }
      }else if(luachon == 4) {
        rt.xoaPhieuDuThuong();
      }else if(luachon == 5) {
        System.out.println("Số lượng phiếu là: " +rt.laySoLuong());
      }else if(luachon == 6) {
        System.out.println("Mã số trúng thương là: " +rt.rutMotPhieu());
      }else if(luachon == 7) {
        System.out.println("Các mã phiếu dự thưởng là: ");
        rt.inTatCa();
      }
    }while(luachon!=0);



  }
}
