package Main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

    /*
    Một người chơi sẽ có tài khoản.
    Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng số tiền
    họ đang có
    Luật chơi:
    Có 3 viên xúc xắc. Mỗi viên xúc có 6 mặt có giá trị từ 1 đến 6.
    Mỗi lần lắc sẽ ra một kết quả. Kết quả  = giá trị xx1 + giá trị xx2 + giá trị xx3
    1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua
    2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng,
    ngược lại thua
    3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt xỉu thì người chơi thua,
    ngược lại thắng
     */
public class TaiXiu {
  public static void main(String[] args) {
    double taiKhoanNguoiChoi = 500000;
    Scanner sc = new Scanner(System.in);
    Locale lc = new Locale("vi", "VN");
    NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
    int luachon = 1;
    do {
      System.out.println("--------MỜI BẠN LỰA CHỌN--------");
      System.out.println("Chọn (1) để tiếp tục chơi. ");
      System.out.println("Chọn (phím bất kỳ) để tiếp tục thoát.");
      luachon = sc.nextInt();
      if (luachon == 1) {
        System.out.println("*** BẮT ĐẦU CHƠI: ");
        System.out.println("*** Tài khoản của bạn: " +numf.format(taiKhoanNguoiChoi)+ ", bạn muốn cược bao nhiêu?");
        // đặt cược
        double datcuoc = 0;
        do {
          System.out.println("*** Đặt cược (0<số tiền cược<=)" +numf.format(taiKhoanNguoiChoi)+":");
          datcuoc = sc.nextDouble();

        }while(datcuoc < 0 || datcuoc > taiKhoanNguoiChoi);
        // chọn tài xỉu
        int luachonTaiXiu = 0;
        do{
          System.out.println("*** Chọn: 1 <-> Tài hoặc  2 <-> Xỉu");
          luachonTaiXiu = sc.nextInt();
        }while(luachonTaiXiu != 1 && luachonTaiXiu != 2);
        // Tung xung xắc
        Random xucXac1 = new Random();
        Random xucXac2 = new Random();
        Random xucXac3 = new Random();
        int giatri1 = xucXac1.nextInt(5)+1;
        int giatri2 = xucXac2.nextInt(5)+1;
        int giatri3 = xucXac3.nextInt(5)+1;
        int tong = giatri1+giatri2+giatri3;
        // Tính toán kết quả:
        System.out.println("***Kết quả: " +giatri1+ "-" + giatri2+ "-" + giatri3);
        if(giatri1==giatri2 && giatri1==giatri3){
          System.out.println("***Tổng là: " +tong+" BÃO Nhà cái ăn hết, bạn đã thua!");
          taiKhoanNguoiChoi = taiKhoanNguoiChoi - datcuoc;
          System.out.println("***Tài khoản của bạn là: " +numf.format(taiKhoanNguoiChoi));
        }
        else if(tong>=4 && tong<=10){
          System.out.println("***Tổng là: " +tong+ " Xỉu");
          if(luachonTaiXiu==2){
            System.out.println("***Bạn đã thắng cược: ");
            taiKhoanNguoiChoi += datcuoc;
            System.out.println("***Tài khoản của bạn là: " +numf.format(taiKhoanNguoiChoi));
          }
          else{
            System.out.println("***Bạn đã thua cược: ");
            taiKhoanNguoiChoi -= datcuoc;
            System.out.println("***Tài khoản của bạn là: " +numf.format(taiKhoanNguoiChoi));
          }
        }
        else{
          System.out.println("***Tổng là: " +tong+ " Tài");
          if(luachonTaiXiu==1){
            System.out.println("***Bạn đã thắng cược: ");
            taiKhoanNguoiChoi += datcuoc;
            System.out.println("***Tài khoản của bạn là: " +numf.format(taiKhoanNguoiChoi));
          }
          else{
            System.out.println("***Bạn đã thua cược: ");
            taiKhoanNguoiChoi -= datcuoc;
            System.out.println("***Tài khoản của bạn là: " +numf.format(taiKhoanNguoiChoi));
          }
        }
      }
      if (taiKhoanNguoiChoi <= 0) {
        System.out.println("Bạn đã hết tiền! Trò chơi kết thúc.");
        break;
      }
    }while(luachon == 1);
  }
}
