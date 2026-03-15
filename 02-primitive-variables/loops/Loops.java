package loops;

public class Loops {
  public static void main(String[] args) {
    // For
    for (int i = 1; i <= 10; i++) {
      System.out.println("Value " + i);
    }

    // While
    int counter = 15;
    while (counter < 10) {
      System.out.println("Counter: " + counter);
      counter++;
    }

    // DoWhile the condition is evaluated a the end
    int count = 10;
    do {
      System.out.println("Hola, counter es:" + count);

    } while (count < 10);
  }
}
