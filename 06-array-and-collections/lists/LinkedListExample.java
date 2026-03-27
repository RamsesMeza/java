package lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
  public static void main(String[] args) {

    List<String> cities = new LinkedList<>();

    cities.add("Aguascalientes");
    cities.add("Merida");
    cities.add("Monterrey");

    System.out.println(cities);

    cities.add("Hola");

    System.out.println(cities);

    cities.addFirst("Madrid");
    cities.addLast("New York");

    System.out.println(cities);

    System.out.println("Get: " + cities.get(3));

    System.out.println("Set: " + cities.set(1, "Ags"));

    System.out.println(cities);

    System.out.println("Remove: " + cities.remove(1));

    System.out.println(cities);

    System.out.println("Remove first " + cities.removeFirst());
    System.out.println("Remove last " + cities.removeLast());

    System.out.println(cities);

    System.out.println("Contains: " + cities.contains("Merida"));
  }
}
