package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
  public static void main(String[] args) {

    Set<Integer> numbers = new HashSet<>();

    // create
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(10);

    // read
    System.out.println(numbers);

    // remove
    System.out.println("Remove: " + numbers.remove(10));

    System.out.println(numbers);

    // update
    System.out.println("Remove: " + numbers.remove(8));
    System.out.println("Add: " + numbers.add(8));

    System.out.println(numbers);
  }
}
