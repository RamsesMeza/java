package maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeExample {
  public static void main(String[] args) {
    Map<Integer, Employee> employees = new HashMap<>();

    employees.put(1, new Employee(1, "Ramses"));
    employees.put(1, new Employee(1, "Erick"));
    employees.put(2, new Employee(2, "Mike"));

    System.out.println(employees);
  }
}
