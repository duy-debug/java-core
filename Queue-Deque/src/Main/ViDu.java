package Main;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ViDu {
  public static void main(String[] args) {
    Queue<String> danhSach = new LinkedList<String>();
    danhSach.offer("TITV");
    danhSach.offer("Nguyen Van A");
    danhSach.offer("Nguyen Van B");
    danhSach.offer("Nguyen Van C");
    danhSach.offer("TITV 2");
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
