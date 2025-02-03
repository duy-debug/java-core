public class Main {
  public static void main(String[] args) {
    MyMath myMath = new MyMath();
    System.out.println("Tim min: " +myMath.timMin(5,4.5));
    System.out.println("Tim min: " +myMath.timMin(5,6));
    System.out.println("Tinh tong: " +myMath.tinhTong(5,7));
    double[] arr = new double[] {1,2,3,4,5};
    System.out.println("Tinh tong: " +myMath.tinhTong(arr));

  }
}