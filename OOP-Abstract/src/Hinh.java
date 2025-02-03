public abstract class Hinh {
  private ToaDo toaDo;

  public Hinh(ToaDo toaDo) {
    this.toaDo = toaDo;
  }

  public ToaDo getToaDo() {
    return toaDo;
  }

  public void setToaDo(ToaDo toaDo) {
    this.toaDo = toaDo;
  }
  public abstract double TinhDienTich();
}
