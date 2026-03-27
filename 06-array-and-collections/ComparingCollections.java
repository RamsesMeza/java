import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import sets.Person;

public class ComparingCollections {
  public static void main(String[] args) {

    Person p1 = new Person(3, "Juan", "Perez", 20);
    Person p2 = new Person(1, "Ana", "Lopez", 25);
    Person p3 = new Person(2, "Luis", "Martinez", 30);
    Person p4 = new Person(1, "Ana", "Lopez", 25);

    List<Person> list = new ArrayList<>();
    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);

    Set<Person> hashSet = new HashSet<>();
    hashSet.add(p1);
    hashSet.add(p2);
    hashSet.add(p3);
    hashSet.add(p4);

    Set<Person> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add(p1);
    linkedHashSet.add(p2);
    linkedHashSet.add(p3);
    linkedHashSet.add(p4);

    Set<Person> treeSet = new TreeSet<>();
    treeSet.add(p1);
    treeSet.add(p2);
    treeSet.add(p3);
    treeSet.add(p4);

    System.out.println("LIST:");
    System.out.println(list);

    System.out.println("\nHASHSET:");
    System.out.println(hashSet);

    System.out.println("\nLINKEDHASHSET:");
    System.out.println(linkedHashSet);

    System.out.println("\nTREESET:");
    System.out.println(treeSet);

  }
}
