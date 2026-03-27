package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPersonExample {
  public static void main(String[] args) {
    // It is important that the custom clase implement Comparable
    Set<Person> persons = new LinkedHashSet<>();

    // create
    persons.add(new Person(5, "Ramses", "Meza", 19));
    persons.add(new Person(2, "Derek", "Ramirez", 19));
    persons.add(new Person(3, "Paulina", "Rodriguez", 19));
    persons.add(new Person(4, "Brayan", "Alexander", 19));

    System.out.println("Size: " + persons.size());

    // read
    System.out.println(persons);

    // delete
    System.out.println("Remove: " + persons.remove(new Person(4, "Brayan", "Alexander", 19)));
    System.out.println(persons);

    // update
    System.out.println("Remove: " + persons.remove(new Person(3, "Paulina", "Rodriguez", 19)));
    System.out.println("Add: " + persons.add(new Person(3, "Pau", "Meza", 23)));
    System.out.println(persons);

    // contains
    System.out.println("Contains: " + persons.contains(new Person(3, "Paulina", "Rodriguez", 19)));

  }
}
