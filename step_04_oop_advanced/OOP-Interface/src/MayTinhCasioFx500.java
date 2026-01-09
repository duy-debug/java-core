public class MayTinhCasioFx500 implements MayTinhBoTui {
  @Override
  public double cong(double a, double b) {
    return a+b;
  }

  @Override
  public double tru(double a, double b) {
    return a-b;
  }

  @Override
  public double nhan(double a, double b) {
    return a*b;
  }

  @Override
  public double chia(double a, double b) {
    if(b!=0)
      return a/b;
    else
      throw new ArithmeticException("Không thể chia cho 0");
  }
}
