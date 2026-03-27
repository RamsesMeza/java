package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
  public static void main(String[] args) {
    Map<Integer, String> employees = new HashMap<>();

    employees.put(1, "Ramses");
    employees.put(2, "Derek");
    employees.put(3, "Pau");

    System.out.println(employees);

    employees.remove(2);

    System.out.println(employees);

    System.out.println(employees.containsValue("Ramses"));

    System.out.println(employees.get(1).contains("Ram"));

    System.out.println("Contains: " + employees.containsKey(5));

    System.out.println(employees.size());
  }
}
