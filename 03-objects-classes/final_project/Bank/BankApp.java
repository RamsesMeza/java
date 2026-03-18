package final_project.Bank;

import java.util.Scanner;

// Crear una clase BankApp que:

// Reciba una cuenta bancaria por constructor.

// Muestre un menú interactivo en consola con las opciones:

// Depositar dinero
// Retirar dinero
// Mostrar saldo
// Salir
// Permita al usuario ingresar opciones y montos utilizando Scanner.

// Procese las opciones usando una estructura switch.

public class BankApp {

  private BankAccount bankAccount;
  private Scanner scanner;

  public BankApp(BankAccount bankAccount) {
    this.bankAccount = bankAccount;
    this.scanner = new Scanner(System.in);
  }

  public void startApp() {
    Boolean isRunning = true;
    do {
      System.out.println("\n" + this.bankAccount.getOwner());
      System.out.println("Welcome to the menu");
      System.out.println("1. Deposit money");
      System.out.println("2. Take out money");
      System.out.println("3. Show balance");
      System.out.println("4. Leave");
      System.out.print("Select a number option:");
      Integer option = this.scanner.nextInt();

      switch (option) {
        case 1:
          System.out.println("\nWhat amount would you like to deposit?");
          Integer depositAmount = this.scanner.nextInt();
          this.bankAccount.depositMoney(depositAmount);
          break;
        case 2:
          System.out.println("\nWhat amount would you like to take out?");
          Integer takeOutAmount = this.scanner.nextInt();
          this.bankAccount.depositMoney(takeOutAmount);
          break;
        case 3:
          this.bankAccount.showBalance();
          break;
        case 4:
          isRunning = false;
          scanner.close();
          System.out.println("\nThanks, see you soon!");
          return;
        default:
          isRunning = false;
          scanner.close();
          System.out.println("\nThat not a valid option");
          return;
      }

      System.out.println("\nWould you like to perform another operation? yes/no");
      String yesOrNo = this.scanner.next();
      Boolean canContinue = yesOrNo.toLowerCase().equals("yes");

      if (canContinue) {
        isRunning = true;
      } else {
        isRunning = false;
        scanner.close();
        System.out.println("\nThanks, see you soon!");

      }

    } while (isRunning);
  }

}
