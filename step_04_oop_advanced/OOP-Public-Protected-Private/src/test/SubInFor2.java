package test;

import code.InFor;
import code.SubInFor;

public class SubInFor2 extends InFor {
  public InFor infor;
  public void method() {
    // super.b => không truy cập được vì khác gói
    super.c = 3; // truy cập được
    super.d = 4;
  }
}
