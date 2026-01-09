package ViDu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
  // Hàm đảo ngược mảng
  public static int[] reverse(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[arr.length - 1 - i] = arr[i];
    }
    return result;
  }
  public static void main(String[] args) {
    int[] a = new int[] {1,3,4,10,5,2,6};
    int[] b = new int[15];
    //
    System.out.println("a: " +Arrays.toString(a));
    // Hàm sắp xếp tăng dần
    Arrays.sort(a);
    System.out.println("a: " +Arrays.toString(a));
    // Hàm tìm kiếm
    System.out.println(Arrays.binarySearch(a, 4));
    System.out.println(Arrays.binarySearch(a, 14));
    // - vị trí chèn - 1 = -8 vì nó chèn 14 sau số 10 => output: -8
    // Hàm điền giá trị
    Arrays.fill(b, 8);
    System.out.println("b: " +Arrays.toString(b));
    // Hàm sắp xếp giảm dần
    a = Test.reverse(a);
    System.out.println("a: " +Arrays.toString(a));
  }
}
