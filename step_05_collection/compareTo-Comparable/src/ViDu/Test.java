package ViDu;

public class Test {
  public static void main(String[] args) {
    SinhVien sv = new SinhVien(1,"TRẦN MAI NGỌC DUY","65.cntt-1",10);
    SinhVien sv1 = new SinhVien(2,"NGUYỄN VĂN ĐẠT","65.cntt-2",9);
    SinhVien sv2 = new SinhVien(3,"NGÔ VĂN LỰC", "65.cntt-3",8);
    System.out.println(sv.compareTo(sv1));
    System.out.println(sv2.compareTo(sv));
  }
}
