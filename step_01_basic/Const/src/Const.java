import java.util.Scanner;
public class Const {
    public static void main(String[] args) {
        int x = 100;
        System.out.println("x = " +x);
        // x=50 sẽ báo lỗi
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ho va ten: ");
        String HoTen = sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        long MaSinhVien = sc.nextLong();
        System.out.println("Nhap diem thi: ");
        float DiemThi = sc.nextFloat();
        System.out.println("Ho va ten : " + HoTen);
        System.out.println("Ma sinh vien : " + MaSinhVien);
        System.out.println("Diem thi : " + DiemThi);
    }
}
