import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        // Khai bao bien
        int a, b;

        // Nhap du lieu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        int nhan = a * b;
        System.out.println(a + " * " + b + " = " + nhan);
        float thuong = (float) a / b;
        System.out.println(a + " / " + b + " = " + thuong);
        int SoDu = a % b;
        System.out.println(a + " % " + b + " = " + SoDu);

    }

}
