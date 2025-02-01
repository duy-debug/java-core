public class Main {
  public static void main(String[] args) {
    NgaySinh ngay1 = new NgaySinh(30,10,2005);
    NgaySinh ngay2 = new NgaySinh(30,10,2004);
    Lop lop1 = new Lop("65.CNNT-1","CNTT");
    Lop lop2 = new Lop("65.CNNT-2","An Ninh Mạng");
    SinhVien sinhvien1 = new SinhVien(6513650,"Trần Mai Ngọc Duy",ngay1,10,lop1);
    SinhVien sinhvien2 = new SinhVien(6513054,"Nguyễn Văn A",ngay2,4.9,lop2);
    System.out.println("Sinh Vien 1: " + sinhvien1.LayTenKhoa());
    System.out.println("Sinh vien 2: " + sinhvien2.LayTenKhoa());
    System.out.println("Kiểm tra thi đạt: ");
    System.out.println("Sinh viên 1 thi: " + sinhvien1.KiemTraThiDat());
    System.out.println("Sinh viên 2 thi: " + sinhvien2.KiemTraThiDat());
    System.out.println("Kiểm tra cùng ngày sinh:: " + sinhvien1.KiemTraNgaySinh(sinhvien2));
  }
}