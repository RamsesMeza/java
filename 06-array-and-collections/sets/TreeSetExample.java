package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
  public static void main(String[] args) {
    Set<Integer> numbers = new TreeSet<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(10);

    System.out.println(numbers.size());

    System.out.println(numbers);

    System.out.println("Remove: " + numbers.remove(10));

    System.out.println(numbers);

    System.out.println("Remove: " + numbers.remove(8));
    System.out.println("Add: " + numbers.add(8));

    System.out.println(numbers);

    System.out.println("Contains: " + numbers.contains(40));

    numbers.removeIf(x -> x < 21);
    System.out.println(numbers);

    System.out.println(numbers.size());

  }
}
