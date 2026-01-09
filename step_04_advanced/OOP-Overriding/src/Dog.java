public class Dog extends Animal {
  public Dog(){
    super("Dog");
  }

  @Override
  public void makeSound() {
    System.out.println("Go go");
  }

  @Override
  public void eat() {
    System.out.println("Tôi ăn xương");
  }
}
