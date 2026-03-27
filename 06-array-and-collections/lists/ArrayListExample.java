package lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  public static void main(String[] args) {

    List<String> students = new ArrayList<>();

    students.add("Ramses");
    students.add("Derek");
    students.add("Pauline");

    students.add(2, "Hector");

    System.out.println(students);

    System.out.println("Get: " + students.get(0));

    System.out.println("Remove: " + students.remove(0));
    System.out.println("Remove: " + students.remove("Hector"));

    System.out.println(students);

    System.out.println("Set: " + students.set(0, "Rami"));

    System.out.println(students);

    System.out.println("Contains: " + students.contains("Derek"));

    students.addFirst("Holi");

    System.out.println(students);
  }
}
