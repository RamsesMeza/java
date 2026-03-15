package exercises;

import java.util.Scanner;

public class ProjectOne {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean repite = true;
    do {
      System.out.println("Write your name:");
      String name = scanner.next();

      System.out.println("Welcome " + name + "!");
      System.out.println("Write your three grades:");
      int gradeOne = scanner.nextInt();
      int gradeTwo = scanner.nextInt();
      int gradeThree = scanner.nextInt();

      int gradeAverage = (gradeOne + gradeTwo + gradeThree) / 3;

      boolean haveApproved = gradeAverage >= 6;
      if (haveApproved) {
        System.out.println("You have approved, you got " + gradeAverage);
      } else {
        System.out.println("You have not approved, you got " + gradeAverage);
      }

      System.out.println("Would you like to try it again? yes/no");
      String yesOrNot = scanner.next().toLowerCase();

      switch (yesOrNot) {
        case "yes":
          repite = true;
          break;
        case "no":
          repite = false;
          break;
        default:
          System.out.println("That's not a correct option, the process has end");
          repite = false;
          break;
      }
    } while (repite);

    scanner.close();

  }
}
