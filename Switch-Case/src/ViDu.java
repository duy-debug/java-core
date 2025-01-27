import java.util.Scanner;

public class ViDu {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        switch (n) {
            case 2:
                System.out.println("Thứ hai");
                break;
            case 3:
                System.out.println("Thứ ba");
                break;
            case 4:
                System.out.println("Thứ tư");
                break;
            case 5:
                System.out.println("Thứ năm");
                break;
            case 6:
                System.out.println("Thứ sáu");
                break;
            case 7:
                System.out.println("Thứ bảy");
            case 8:
                System.out.println("Chủ nhật");
            default:
                System.out.println("Nhập dữ liệu sai!");
        }
    }
}
