package final_project;

import final_project.Bank.BankAccount;
import final_project.Bank.BankApp;

public class Main {
  public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount("Ramses Meza", 200);

    BankApp bankApp = new BankApp(bankAccount);

    bankApp.startApp();
  }
}
