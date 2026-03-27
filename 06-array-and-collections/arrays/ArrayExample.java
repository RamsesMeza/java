package arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
  public static void main(String[] args) {

    System.out.println("\nFixed array with custom inputs");
    int[] numbers = { 1, 2, 3 };

    for (int n : numbers) {
      System.out.println(n);
    }

    System.out.println("\nFixed array initialized by 5 elements");

    int[] numbersFixed = new int[5];

    for (int i : numbersFixed) {
      System.out.println(i);
    }

    System.out.println(numbersFixed.length);

    System.out.println("\nArrayList");
    // Can store null when use wrapper primitive clases
    List<Integer> numbersTwo = new ArrayList<>();

    numbersTwo.add(10);
    numbersTwo.add(20);
    numbersTwo.add(40);

    numbersTwo.forEach(number -> System.out.println(number));
  }
}
