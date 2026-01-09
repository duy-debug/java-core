public class HinhChuNhat extends Hinh{
  private double chieuRong, chieuCao;

  public HinhChuNhat(ToaDo toaDo,double chieuRong, double chieuCao) {
    super(toaDo);
    this.chieuRong = chieuRong;
    this.chieuCao = chieuCao;
  }

  @Override
  public double TinhDienTich() {
    return this.chieuRong * this.chieuCao;
  }
}
