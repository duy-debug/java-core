import java.util.Scanner;

public class BaiTapHinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, DienTich, ChuVi;
        System.out.println("Nhap ban kinh r: ");
        r = sc.nextDouble();
        // Tinh chu vi
        ChuVi = 2 * Math.PI*r;
        System.out.println("Chu Vi = " + ChuVi);
        System.out.println("Chu vi = " + Math.round(ChuVi));
        DienTich = r*r*Math.PI;
        System.out.println("Dien Tich = " + DienTich);
        System.out.println("Dien tich = " + Math.round(DienTich));
    }
}
