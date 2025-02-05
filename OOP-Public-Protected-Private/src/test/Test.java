package test;

import code.InFor;

import java.security.PublicKey;

public class Test {
  private InFor infor;
  public void test() {
    // this.infor.a => không truy cập được
    //this.infor.b = 2;=? không truy cập được
    // this.infor.c không truy cập được
    this.infor.d = 4;
  }
}
