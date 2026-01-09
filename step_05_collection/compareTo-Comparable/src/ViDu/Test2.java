package ViDu;

import java.util.Arrays;

public class Test2 {
  public static void main(String[] args) {
    SinhVien sv = new SinhVien(1,"TRẦN MAI NGỌC DUY","65.cntt-1",10);
    SinhVien sv1 = new SinhVien(2,"NGUYỄN VĂN ĐẠT","65.cntt-2",9);
    SinhVien sv2 = new SinhVien(3,"NGÔ VĂN LỰC", "65.cntt-3",8);

    SinhVien[] a_sv = new SinhVien[]{sv,sv1,sv2};
    System.out.println("Ban đầu: " + Arrays.toString(a_sv));
    // Hàm sắp xếp
    Arrays.sort(a_sv);
    System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));
    // Tìm kiếm
    System.out.println("Tìm kiếm Duy ở vị trí số: " +Arrays.binarySearch(a_sv, sv));
  }
}
