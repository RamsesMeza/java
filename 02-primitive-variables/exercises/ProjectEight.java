package exercises;

import java.util.Scanner;

public class ProjectEight {
  public static void main(String[] args) {
    // Factorial
    // 5! = 5 × 4 × 3 × 2 × 1 = 120
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number to calculate the factorial:");
    int number = scanner.nextInt();

    int factorial = 1;
    for (int i = 1; i <= number; i++) {
      factorial = factorial * i;
    }

    System.out.println("Factorial: " + factorial);
    scanner.close();
  }

}
