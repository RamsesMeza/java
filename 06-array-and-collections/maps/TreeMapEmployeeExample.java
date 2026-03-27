package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeExample {
  public static void main(String[] args) {
    Map<Employee, Integer> employees = new TreeMap<>();

    // Create Read Update Delete
    // Create
    employees.put(new Employee(3, "Ramses"), 1);
    employees.put(new Employee(1, "Erick"), 1);
    employees.put(new Employee(2, "Mike"), 1);

    // Read
    System.out.println(employees);

    // Update
    employees.put(new Employee(1, "Paco"), 10);
    System.out.println(employees);

    // Delete
    employees.remove(new Employee(1, "Paco"));
    System.out.println(employees);
  }
}
