package ViDu;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    String s = "Xin chào các bạn, tui là Peter!";
    String[] a = s.split(" ");
    System.out.println(Arrays.toString(a));

    String[] b = s.split(",");
    System.out.println(Arrays.toString(b));
    String s1 = "Xin chào, mình là Peter. Mình là lập trình viên!";
    String[] s2 = s1.split("\\.|\\,");
    System.out.println(Arrays.toString(s2));
    String s3 = "Nguyen Van A";
    String[] s4 = s3.split(" ");
    System.out.println(Arrays.toString(s4));
    System.out.println("Tên: " +s4[s4.length-1]);
  }
}
