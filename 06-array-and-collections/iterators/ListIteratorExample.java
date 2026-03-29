package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
  public static void main(String[] args) {
    List<String> books = new ArrayList<>();

    books.add("The hunger games");
    books.add("One pice");
    books.add("Atomic Habits");
    books.add("One note");

    ListIterator<String> bookListIterator = books.listIterator();

    while (bookListIterator.hasNext()) {
      String book = bookListIterator.next();
      System.out.println(book);

      if (book.contains("One")) {
        bookListIterator.remove();
      }
    }

    System.out.println(books);

  }
}
