public class Main {
  public static void main(String[] args) {
    String s1 = "Duy";
    String s2 = "pro";
    String s3 = s1 + s2;
    // Hàm concat => nối chuỗi
    String s4 = s1.concat(s2);
    System.out.println("s3= "+s3);
    System.out.println("s4= "+s4);
    // Hàm replace => thay thế
    String s5 = "Duy.vn";
    String s6 = s5.replaceAll("Duy","win");
    System.out.println("s6= "+s6);
    // toLowerCase => chuyển về viết thường
    // toUpperCase => chuyển về viết hoa
    String s7 = s3.toUpperCase();
    String s8 = s3.toLowerCase();
    System.out.println("s7= "+s7);
    System.out.println("s8= "+s8);
    // Hàm trim => xóa bỏ khoảng trắng dư thừa ở đầu chuỗi
    String s9 = "Xin chào các bạn, mình là TITV.vn    ";
    System.out.println("s9= "+s9.trim());
    // Hàm subString => cắt chuỗi con
    String s10 = s9.substring(10);
    String s11 = s9.substring(10,15);
    System.out.println("s10= "+s10.trim());
    System.out.println("s11= "+s11.trim());
  }
}