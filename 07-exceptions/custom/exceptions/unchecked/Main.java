package custom.exceptions.unchecked;

public class Main {
  public static void main(String[] args) {
    BankAccount ramsesBankAccount = new BankAccount(400.0);

    try {
      ramsesBankAccount.withdraw(100.0);
      ramsesBankAccount.withdraw(500.0);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }

    System.out.println("End of the program");
  }
}
