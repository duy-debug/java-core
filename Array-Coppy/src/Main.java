import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    // kiểu nguyên thủy
    int[] arr = {1,2,3,4};
    // coppy mảng cách 1
    int[] arr1 = arr;
    arr1[0] = 100;
    System.out.println("Mảng arr: "+ Arrays.toString(arr1));
    System.out.println("Mảng arr1: "+ Arrays.toString(arr1));
    // int[] arr1 = Arrays.copyOf(arr, arr.length);
    // Với cách này, arr1 sẽ có vùng nhớ riêng và thay đổi arr1 sẽ không ảnh hưởng đến arr.
    // coppy mảng cách 2 - dùng hàm clone
    int[] arr2 = arr.clone();
    arr1[0] = 10;
    System.out.println("Mảng arr2: "+ Arrays.toString(arr1));
    // coppy mảng cách 3 - dùng System.arraycopy
    int[] arr3 = new int[arr.length];
    System.arraycopy(arr,0,arr3,0,arr.length);
    arr3[0] = 20;
    System.out.println("Mảng arr3: "+ Arrays.toString(arr3));
    // Kiểu nguyên thủy
    String[] mangdoituong = {"Duy","Pro"};
    System.out.println("In ra: " +mangdoituong);
  }
}