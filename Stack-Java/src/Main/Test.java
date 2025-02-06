package Main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<String> stackChuoi = new Stack<String>();
    // stackChuoi.push("giatri"); => đưa giá trị vào stack
    // stackChuoi.pop() => lấy giá trị ra
    // stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
    // stackChuoi.clear() => xóa tất cả phần tử trong stack
    // stackChuoi.contains("") => xác định giá trị có tồn tại trong stack hay không
    // Ví dụ đảo ngược chuỗi
    System.out.println("Nhập vào chuỗi: ");
    String s = sc.nextLine();
    // DUY
    for(int i=0; i<s.length(); i++){
      stackChuoi.push(s.charAt(i)+"");
    }
    System.out.println("Chuỗi đảo ngược: ");
    for (int i = 0; i < s.length(); i++) {
      System.out.print(stackChuoi.pop());
    }
    stackChuoi.size();
    // ví dụ chuyển từ hệ thập phân sang hệ nhị phân
    Stack<String> stackSoDu = new Stack<String>();
    System.out.println("\nNhập một số nguyên dương từ bàn phím: ");
    int x = sc.nextInt();
    while(x>0) {
      int sodu = x % 2;
      stackSoDu.push(sodu+"");
      x = x / 2;
    }
    System.out.println("Số nhị phân là: ");
    int n = stackSoDu.size();
    for (int i = 0; i<n; i++) {
      System.out.print(stackSoDu.pop());
    }
  }
}
