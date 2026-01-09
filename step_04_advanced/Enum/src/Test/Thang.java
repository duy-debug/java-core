package Test;

public enum Thang {
  Tháng_một(31),
  tháng_hai(29),
  tháng_ba(31),
  tháng_tư(30),
  tháng_năm(31),
  tháng_sáu(30),
  tháng_bảy(31),
  tháng_tám(31),
  tháng_chín(30),
  tháng_mười(31),
  tháng_mười_một(30),
  tháng_mười_hai(31);
  private final int Songay;
  Thang(int Songay) {
    this.Songay = Songay;
  }
  public int Songay() {
    return this.Songay;
  }

}
