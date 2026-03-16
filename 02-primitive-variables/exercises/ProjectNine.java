package exercises;

import java.util.Scanner;

public class ProjectNine {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number:");
    int number = scanner.nextInt();

    // To check if can be divisible by other numbers
    for (int i = 2; i < number; i++) {
      System.out.println(i);
      boolean isDivisible = number % i == 0;
      if (isDivisible) {
        System.out.println("No es numero primo" + i);
        scanner.close();
        return;
      }
    }
    System.out.println("Es primo");

    scanner.close();
  }
}
