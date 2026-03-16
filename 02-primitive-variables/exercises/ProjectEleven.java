package exercises;

import java.util.Scanner;

public class ProjectEleven {
  public static void main(String[] args) {
    // 0 1 1 2 3 5 8
    // los dos primeros números son 0 y 1
    // cada número siguiente es la suma de los dos anteriores

    Scanner scanner = new Scanner(System.in);
    System.out.print("Write a number: ");
    int number = scanner.nextInt();

    int first = 0;
    int next = 1;

    System.out.println(first);
    System.out.println(next);
    for (int i = 1; i <= number - 2; i++) {
      int saved = next;
      next = first + next;
      first = saved;
      System.out.println(next);
    }

    scanner.close();
  }
}
