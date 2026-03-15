package exercises;

import java.util.Scanner;

public class ProjectFive {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write 20 numbers and I'll count how many are even or odd");

    int countEven = 0;
    int countOdd = 0;
    for (int i = 1; i <= 20; i++) {
      int number = scanner.nextInt();

      if (number % 2 == 0) {
        countEven++;
      } else {
        countOdd++;
      }
    }
    System.out.println("Even numbers: " + countEven);
    System.out.println("Odd numbers: " + countOdd);
    scanner.close();
  }
}
