public class Main {
  public static void main(String[] args) {
    System.out.println("Test: ");
    MayTinhCasioFx500 casioFx500 = new MayTinhCasioFx500();
    MayTinhVinacal500 casioVinacal500 = new MayTinhVinacal500();
    System.out.println("5+3= " +casioFx500.cong(5,3));
    System.out.println("2-3= " +casioVinacal500.tru(2,3));
    System.out.println("4*3= " +casioVinacal500.tru(4,3));
    System.out.println("5/0= " +casioVinacal500.chia(5,0));
    System.out.println("6/3= " +casioVinacal500.chia(6,3));
    System.out.println("Test: ");
    double[] arr = new double[] {1,4,5,2,6,3,10};
    SapXepChen sxc = new SapXepChen();
    sxc.sapXepGiam(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(" " +arr[i]);
    }
    System.out.println("\n");
    sxc.sapXepTang(arr);
    for(int i=0;i<arr.length;i++){
      System.out.print(" " +arr[i]);
    }
    System.out.println("\n");
    PhanMemMayTinh pmmt = new PhanMemMayTinh();
    System.out.println("4+5= " +pmmt.cong(4,5));

  }
}