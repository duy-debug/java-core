package Main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ViDuDeque {
  public static void main(String[] args) {
    Deque<String> danhSach = new ArrayDeque<String>();
    danhSach.offer("TITV");
    danhSach.offer("Nguyen Van A");
    danhSach.offer("Nguyen Van B");
    danhSach.offer("Nguyen Van C");
    danhSach.offer("TITV 2");
    danhSach.offerLast("TITV 3");
    danhSach.offerFirst("TITV 0");
    // TITV 3 > TITV 2 > Nguyen Van B > Nguyen Van A > TITV 0
    while(true) {
      String ten = danhSach.poll(); // peek => lấy ra nhưng không xóa.
      if(ten==null){
        break;
      }
      // peek => lấy ra nhưng không xóa
      System.out.println(ten);
    }
  }
}
