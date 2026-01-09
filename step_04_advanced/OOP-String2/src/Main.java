public class Main {
  public static void main(String[] args) {
    String s1 = "Xin chào mọi người";
    String s2 = "chào";
    String s3 = "123";
    // Hàm indexOf
    System.out.println("Vị trí của s2 trong s1 là: " +s1.indexOf(s2));
    System.out.println("Vị trí của s3 trong s1 là: " +s1.indexOf(s3));
    // Hàm lastIndexof => tìm kiếm từ phải sang trái
  }
}