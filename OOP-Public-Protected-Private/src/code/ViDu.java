package code;

public class ViDu {
  private InFor infor;
  public void method() {
    // this.infor.a => không truy xuất được
    this.infor.b = 2; // truy cập được
    this.infor.c = 3; // truy cập được
    this.infor.d = 4;
  }
}
