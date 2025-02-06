package Main;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
  private ArrayList<SinhVien> DanhSach;
  public DanhSachSinhVien() {
    this.DanhSach = new ArrayList<SinhVien>();
  }
  public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
    DanhSach = danhSach;
  }
  // 1. Thêm sinh viên vào danh sách.
  public void ThemSinhVien(SinhVien sinhVien) {
    DanhSach.add(sinhVien);
  }
  // 2. In danh sách sinh viên ra màn hình.
  public void inDanhSach() {
    for (SinhVien sinhVien : DanhSach) {
      System.out.println(sinhVien);
    }
  }
  // 3. Kiểm tra danh sách có rỗng hay không.
  public boolean KiemTraDanhSachRong() {
    return this.DanhSach.isEmpty();
  }
  // 4. Lấy ra số lượng sinh viên trong danh sách.
  public int LayRaSoLuong() {
    return this.DanhSach.size();
  }
  // 5. Làm rỗng danh sách sinh viên.
  public void LamRong() {
    this.DanhSach.removeAll(DanhSach);
  }
  // 6. Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
  public boolean KiemTraTonTai(SinhVien sinhVien) {
    return this.DanhSach.contains(sinhVien);
  }
  // 7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
  public boolean XoaSinhVien(SinhVien sinhVien) {
    return this.DanhSach.remove(sinhVien);
  }
  // 8. Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
  public void TimSinhVien(String Ten) {
    for (SinhVien sinhVien : DanhSach) {
      if(sinhVien.getHoTen().indexOf(Ten)>=0) {
        System.out.println(sinhVien);
      }
    }
  }
  // 9. Xuât ra danh sách sinh viên có điểm từ cao đến thấp.
  public void SapXepSinhVienGiamDanTheoDiem() {
    Collections.sort(this.DanhSach, new Comparator<SinhVien>(){
      @Override
      public int compare(SinhVien o1, SinhVien o2) {
          if(o1.getDiemTrungBinh()<o2.getDiemTrungBinh()) {
            return 1;
          } else if(o1.getDiemTrungBinh()>o2.getDiemTrungBinh()) {
            return -1;
          }
          else {
            return 0;
          }
        }
      }
    );
  }
}
