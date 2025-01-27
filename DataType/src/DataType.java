public class DataType {
    public static void main(String[] args) {
        // Ep kieu
        int a = 100;
        int b = 200;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        // Ep kieu ngam dinh
        float c = (float)a;
        float d = (float)b;
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        // Ep kieu tuong minh
        float e = 3.5f;
        float f = 9.5f;
        System.out.println("e = " +e);
        System.out.println("f = " +f);
        int g = (int)e;
        int h = (int)f;
        System.out.println("g = " +g);
        System.out.println("h = " +h);
        //Ep kieu giua bien nguyen thuy va doi tuong
        int x = new Integer(32);
        System.out.println("x = " +x);
    }
}
