public class Main {
  public static void main(String[] args) {
    Dog d = new Dog("Dog");
    d.eat();
    d.bark();
    BabyDog bbd = new BabyDog();
    bbd.eat();
    bbd.bark();
    bbd.weep();
  }
}