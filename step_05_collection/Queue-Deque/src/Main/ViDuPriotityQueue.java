package Main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriotityQueue {
  public static void main(String[] args) {
    Queue<String> danhSach = new PriorityQueue<String>();
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
