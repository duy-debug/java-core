import java.util.Scanner;

public class PTB2 {
    public static void main(String[] args) {
        // Phuong trinh bac 2: ax^2 + bx + c =0
        //Cac bien can co: a, b, c, x1, x2, delta
        /*
        B1: Delta = b^2 - 4ac
        B2: Kiem tra delta
        delta < 0 => PT vo nghiem
        delta == 0 => PT co nghiem kep x1=x2=-b/2a
        delta > 0 => PT co hai nghiem
        x1 = (-b-sqrt(delta))/2a
        x2 = (-b+sqrt(delta))/2a
         */
        Scanner sc = new Scanner(System.in);
        double a,b,c,x1,x2,delta;
        System.out.println("Nhap a: ");
        a = sc.nextDouble();
        System.out.println("Nhap b: ");
        b = sc.nextDouble();
        System.out.println("Nhap c: ");
        c = sc.nextDouble();
        delta = Math.pow(b,2) - 4 * a * c;
        if(a == 0)
            System.out.println("Nhap du lieu sai");
        else
        {
            if (delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if(delta == 0)
            {
                x1 = - b / a;
                x2 = x1;
                System.out.println("Phuong trinh co nghiem kep x1=x2=" +x1);
            }
            else
            {
                x1 = (-b-Math.sqrt(delta)) / (2 * a);
                x2 = (-b+Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}