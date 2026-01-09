package Main;

public class Box1<T> {
  private T value;

  public Box1(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
