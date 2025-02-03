public class SapXepChen implements SapXepInterface{

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
