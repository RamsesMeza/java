package exercises;

import java.util.Scanner;

public class ProjectSix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write 10 number:");

    int biggestNumber = 0;
    for (int i = 1; i <= 10; i++) {
      int number = scanner.nextInt();

      if (number > biggestNumber) {
        biggestNumber = number;
      }

    }
    System.out.println("The biggest number is: " + biggestNumber);
    scanner.close();

  }
}
