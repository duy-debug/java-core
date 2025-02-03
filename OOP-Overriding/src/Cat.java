public class Cat extends Animal {
  public Cat() {
    super("Cat");
  }

  public Cat(String name) {
    super(name);
  }

  @Override
  public void eat() {
    System.out.println("Tôi ăn cá");
  }

  @Override
  public void makeSound() {
    System.out.println("Meo meo");
  }
}
