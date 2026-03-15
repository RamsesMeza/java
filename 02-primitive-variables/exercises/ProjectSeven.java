package exercises;

import java.util.Scanner;

public class ProjectSeven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    final int GUESS_NUMBER = 494;
    boolean running = true;

    System.out.println("--- Guess the number ---");
    do {
      System.out.println("What's your chose?");
      int number = scanner.nextInt();

      if (number == GUESS_NUMBER) {
        System.out.println("Correct, you get it!");
        running = false;
      } else if (number > GUESS_NUMBER) {
        System.out.println("You are too high");
      } else {
        System.out.println("You were too low");
      }
    } while (running);

    scanner.close();
  }
}
