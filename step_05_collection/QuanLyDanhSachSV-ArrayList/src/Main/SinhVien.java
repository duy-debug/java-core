package Main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
  private String MaNhanVien;
  private String HoTen;
  private int NamSinh;
  private double DiemTrungBinh;

  public SinhVien(String maNhanVien) {
    MaNhanVien = maNhanVien;
  }

  public SinhVien(String maNhanVien, String hoTen, int namSinh, double diemTrungBinh) {
    MaNhanVien = maNhanVien;
    HoTen = hoTen;
    NamSinh = namSinh;
    DiemTrungBinh = diemTrungBinh;
  }

  public String getMaNhanVien() {
    return MaNhanVien;
  }

  public void setMaNhanVien(String maNhanVien) {
    MaNhanVien = maNhanVien;
  }

  public String getHoTen() {
    return HoTen;
  }

  public void setHoTen(String hoTen) {
    HoTen = hoTen;
  }

  public int getNamSinh() {
    return NamSinh;
  }

  public void setNamSinh(int namSinh) {
    NamSinh = namSinh;
  }

  public double getDiemTrungBinh() {
    return DiemTrungBinh;
  }

  public void setDiemTrungBinh(double diemTrungBinh) {
    DiemTrungBinh = diemTrungBinh;
  }

  @Override
  public String toString() {
    return "SinhVien{" +
            "MaNhanVien='" + MaNhanVien + '\'' +
            ", HoTen='" + HoTen + '\'' +
            ", NamSinh=" + NamSinh +
            ", DiemTrungBinh=" + DiemTrungBinh +
            '}';

  }
  @Override
  public int compareTo(SinhVien o) {
    return this.MaNhanVien.compareTo(o.MaNhanVien);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    SinhVien sinhVien = (SinhVien) o;
    return  Objects.equals(MaNhanVien, sinhVien.MaNhanVien);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MaNhanVien);
  }
}
