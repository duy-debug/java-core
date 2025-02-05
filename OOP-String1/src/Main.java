import java.awt.*;

public class Main {
  public static void main(String[] args) {
    String s1 = "Xin chao";
    String s2 = "XIN CHAO";
    String s3 = "Xin chao";
    //Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
    System.out.println("S1 equals s2: " +s1.equals(s2));
    System.out.println("S1 equals s3: " +s1.equals(s3));
    // Hàm equalsIgnoreCase  so sánh 2 chuỗi giống nhau, không phân biệt hoa thường
    System.out.println("S1 equalsIgnoreCase s2: " +s1.equalsIgnoreCase(s2));
    System.out.println("S1 equalsIgnoreCase s3: " +s1.equalsIgnoreCase(s3));
    // compareTo => so sánh > < =
    String sv1 = "Nguyễn Văn A";
    String sv2 = "Nguyễn Văn B";
    String sv3 = "Nguyễn Văn A";
    System.out.println("sv1 compareTo sv2: " +sv1.compareTo(sv2));
    System.out.println("sv1 compareTo sv3: " +sv1.compareTo(sv3));
    // Hàm compareToIgnoreCase => Tường tự hàm compareTo, không phân biệt chữ Hoa chữ thường
    // Hàm regionMatches => so sánh một đoạn
    String r1 = "TITV.vb";
    String r2 = "TV.v";
    boolean check = r1.regionMatches(2,r2,0,4);
    System.out.println("r1 regionMatches: " +check);
    // vd so sánh bảng số xe có cùng tỉnh
    // vd so sánh sđt kiểm tra nhà mạng nào
    // Hàm starWith => Hàm kiểm tra chuỗi bắt đầu bằng ...
    String sdt = "0773652131";
    System.out.println(sdt.startsWith("077"));
    System.out.println(sdt.startsWith("078"));

    // Hàm endWith => Hàm kiểm tra chuỗi kết thúc bằng ...
    String tenFile = "I love you.JPG";
    String tenFile2 = "Hoc Java.PDF";
    if(tenFile2.endsWith(".JPG")) {
      System.out.println("File 1 là hình ảnh!");
    }
    else {
      System.out.println("File 1 là file PDF!");
    }
  }
}