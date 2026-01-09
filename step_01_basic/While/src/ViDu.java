import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);

        while (x != 0)
        {
            System.out.print("Nhap x = 0 de thoat: ");
            x = sc.nextInt();
        }
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        String nhiphan = "";
        /*
        Chia lien tuc cho 2 va lay phan du
        Sau do dao nguoc chuoi => Ket Qua
         */
        while (n>0)
        {
            nhiphan = (n % 2) + nhiphan;
            n = n / 2;
        }
        System.out.print("Doi sang he nhi phan la: " + nhiphan);
    }
}
