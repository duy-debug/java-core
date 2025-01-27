import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        System.out.println("sum = " + sum);
    }
}
