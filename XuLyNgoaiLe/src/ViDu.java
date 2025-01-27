import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try
        {
            System.out.print("Nhap vao n: ");
            n = sc.nextInt();
        }
        catch(Exception e)
        {
            System.out.println("Nhap du lieu khong dung");
        }
        // finally co the co hoac khong
        finally
        {
            System.out.println("Finally");
        }
        System.out.println("Gia tri vua nhap la: " +n);
        System.out.print("Ket thuc");
    }
}
