package Main;

public class TestBox2 {
  public static void main(String[] args) {
    Box1 b1 = new Box1<Integer>(15);
    System.out.println("GÍA TRỊ: " + b1.getValue());
    Box1 b2 = new Box1<String>("hello");
    System.out.println("Gía trị: " + b2.getValue());
    Box1 b3 = new Box1<Double>(14.4);
    System.out.println("Gía trị: " + b3.getValue());

  }
}
