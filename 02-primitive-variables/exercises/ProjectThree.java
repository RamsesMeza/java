package exercises;

import java.util.Scanner;

public class ProjectThree {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for (int i = 1; i <= 10; i++) {

      String msg = (i == 1) ? "Write a number:" : "Write another number:";
      System.out.println(msg);

      int number = scanner.nextInt();
      sum = sum + number;
    }

    System.out.println("The total is equals to " + sum);
    scanner.close();
  }
}
