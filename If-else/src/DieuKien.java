import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        int a = sc.nextInt();
        String KetQua = (a%2==0)?"Số chẵn":"Số lẻ";
        System.out.println(a + " là " + KetQua);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        // Kiem tra tinh chan le
        if(n % 2 == 0)
        {
            System.out.println(n + " La so chan");
        }
        else
        {
            System.out.println(n + " La so le");
        }
    }
}
