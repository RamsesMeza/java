package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsExample {
  public static void main(String[] args) {
    List<String> books = new ArrayList<>();

    books.add("The hunger games");
    books.add("One pice");
    books.add("Atomic Habits");
    books.add("One note");

    Iterator<String> booksIterator = books.iterator();

    while (booksIterator.hasNext()) {
      String book = booksIterator.next();
      System.out.println(book);
      System.out.println("Contains(One):" + book.contains("One"));
    }
  }
}
