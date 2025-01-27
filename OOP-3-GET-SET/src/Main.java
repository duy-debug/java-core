public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(31,1,2021);
        System.out.println("Day = " + md.getDay());
        md.setDay(35);
        System.out.println("Day = " + md.getDay());
        md.setDay(28);
        System.out.println("Day = " + md.getDay());
        md.setMonth(29);
        System.out.println("Month = " + md.getMonth());
        md.setMonth(12);
        System.out.println("Month = " + md.getMonth());
        md.setYear(0);
        System.out.println("Year = " + md.getYear());
        md.setYear(2022);
        System.out.println("Year = " + md.getYear());
    }
}