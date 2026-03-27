package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
  public static void main(String[] args) {
    // LinkedHasSet provides order
    Set<Integer> numbers = new LinkedHashSet<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(10);

    System.out.println(numbers);

    System.out.println("Remove: " + numbers.remove(10));

    System.out.println(numbers);

    System.out.println("Remove: " + numbers.remove(8));
    System.out.println("Add: " + numbers.add(8));

    System.out.println(numbers);

  }
}
