package exercises;

import java.util.Scanner;

public class ProjectTen {
  public static void main(String[] args) {
    final String SYMBOL = "*";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Write a number of rows:");
    int rows = scanner.nextInt();

    for (int v = 1; v <= rows; v++) {
      String pattern = "";
      for (int h = 1; h <= v; h++) {
        System.out.print("*");
        pattern = pattern.concat(SYMBOL);
      }
      System.out.println(pattern);
    }

    scanner.close();
  }
}
