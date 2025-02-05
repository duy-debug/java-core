import java.util.Scanner;

public class ViDu {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s;
    System.out.print("Nhập vào chuỗi: ");
    s = sc.nextLine();
    System.out.println("-----------");
    // Hàm length()
    System.out.println(s.length()); // độ dài của chuỗi
    int doDai = s.length();
    // Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
    for(int i=0; i<doDai; i++) {
      System.out.println("Vị trí " +i+ " là: " +s.charAt(i));
    }
    // getChars(vị trí bắt đầu, vị trí kết thúc)
    // mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng
    char[] arrayChar = new char[100];
    s.getChars(2,4,arrayChar,0);
    for(int i=0; i<arrayChar.length; i++) {
      System.out.println("Giá trị của mảng tại" +i+ " là " +arrayChar[i]);
      byte[] arrayByte = s.getBytes();
      for(byte b : arrayByte) {
        System.out.println(b);
      }
    }
  }
}
