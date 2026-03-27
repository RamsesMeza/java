package sets;

import java.util.HashSet;
import java.util.Set;

public class HashSetPersonExample {

  public static void main(String[] args) {
    Set<Person> persons = new HashSet<>();

    Person nullPerson = null;

    persons.add(new Person(1, "Ramses", "Meza", 19));
    persons.add(new Person(2, "Ramses", "Meza", 19));
    persons.add(new Person(2, "Ramses", "Meza", 19));
    persons.add(new Person(2, "Ramses", "Meza", 24));
    persons.add(new Person(2, "Maria", "Meza", 24));
    persons.add(new Person(2, null, null, 24));
    persons.add(nullPerson);

    persons.forEach(p -> {
      if (p != null) {
        System.out.println(p.toString());
      }
    });

  }

}
