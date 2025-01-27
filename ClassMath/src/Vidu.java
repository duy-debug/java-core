import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        System.out.print("Nhap b: ");
        b = sc.nextDouble();
        // Ham tri tuyet doi
        // Khai bao bien Math
        System.out.println("|a| = " + Math.abs(a));
        //Ham tim min
        System.out.println("Min(a,b) = " + Math.min(a,b));
        //Ham tim max
        System.out.println("Max(a,b) = " + Math.max(a,b));
        //Ham ceil
        System.out.println("ceil(a) = " + Math.ceil(a));
        //Ham floor
        System.out.println("floor(a) = " + Math.floor(a));
        //Ham can bac hai sqrt
        System.out.println("sqrt(a) = " + Math.sqrt(a));
        //Ham tinh a^b
        System.out.println("a^b = " + Math.pow(a,b));
    }
}
