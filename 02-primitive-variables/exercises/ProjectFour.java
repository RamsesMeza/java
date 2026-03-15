package exercises;

import java.util.Scanner;

public class ProjectFour {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number and you will recibe the multiplication");
    System.out.println("Write a number:");
    int number = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      String message = i + " x " + number + " = " + (i * number);
      System.out.println(message);
    }

    scanner.close();
  }
}
