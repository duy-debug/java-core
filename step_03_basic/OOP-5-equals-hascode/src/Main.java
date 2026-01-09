public class Main {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(15, 5, 2025);
        MyDate m2 = new MyDate(11, 1, 2022);
        MyDate m3 = new MyDate(11, 1, 2022);
        System.out.println(m1); // 15/5/2025
        System.out.println(m2);
        System.out.println(m3);
        System.out.println("So sanh m2 voi m3: " +m2.equals(m3));
        System.out.println("So sanh m1 voi m3: " +m1.equals(m3));
        System.out.println("Hashcode: " +m1.hashCode());
        System.out.println("Hashcode: " +m2.hashCode());
        System.out.println("Hashcode: " +m3.hashCode());
    }
}