public class PhanMemMayTinh implements MayTinhBoTui, SapXepInterface{
// interface kế thừa interface
  // trong cùng một class thì có thể implement nhiều interface cùng một lúc
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


  @Override
  public void sapXepTang(double[] arr) {
    for(int i=0; i<arr.length; i++){
      double x = arr[i];
      int pos = i-1;
      while(pos>=0 && arr[pos]<x){
        arr[pos+1] = arr[pos];
        pos--;
      }
      arr[pos+1] = x;
    }
  }

  @Override
  public void sapXepGiam(double[] arr) {
    for(int i=0; i<arr.length; i++){
      double x = arr[i];
      int pos = i-1;
      while(pos>=0 && arr[pos]>x){
        arr[pos+1] = arr[pos];
        pos--;
      }
      arr[pos+1] = x;
    }
  }
}
