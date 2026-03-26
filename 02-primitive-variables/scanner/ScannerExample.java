package scanner;

import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write the first number:");
    int firstNumber = scanner.nextInt();
    System.out.println("Write the second number ");
    int secondNumber = scanner.nextInt();

    int addition = firstNumber + secondNumber;
    int subtraction = firstNumber - secondNumber;

    String additionMessage = "The addition of " + firstNumber + " + " + secondNumber + " = " + addition;
    String subtractionMessage = "The subtraction of " + firstNumber + " - " + secondNumber + " = " + subtraction;
    System.out.println(additionMessage);
    System.out.println(subtractionMessage);
    scanner.close();
  }
}