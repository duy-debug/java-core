package code;

public class SubInFor extends InFor {
  public void method() {
    // super.a => không truy cập được
    // super.b => truy cập được => vì chung gói
    super.c = 3; // truy cập được vì lớp con kế thừa lớp cha(protected)
    super.d = 4;
  }
}
