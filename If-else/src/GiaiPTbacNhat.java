import java.util.Scanner;

public class GiaiPTbacNhat {
    public static void main(String[] args) {
        // Phuong trinh bac nhat: ax + b= 0
        /*
        Neu a = 0
            neu b = 0 => pt vo so nghiem
            neu b != 0 => pt vo nghiem
        Neu a != 0
            Co nghiem x =-b/a;
         */
        Scanner sc = new Scanner(System.in);
        double a,b,x;
        a = sc.nextDouble();
        b = sc.nextDouble();
        if(a == 0)
        {
            if(b == 0)
                System.out.println("Phuong trinh vo so nghiem");
            else
                System.out.println("Phuong trinh vo nghiem");
        }
        else
        {
            x = - b / a;
            System.out.println("x = " + x);
        }
    }
}
