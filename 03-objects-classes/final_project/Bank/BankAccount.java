package final_project.Bank;

// Crear una clase BankAccount que tenga:

// Atributos privados:

// Titular de la cuenta.
// Saldo.
// Un constructor que inicialice ambos valores.

// Métodos públicos para:

// Depositar dinero (validando que el monto sea mayor a cero).
// Retirar dinero (validando que el monto sea válido y no supere el saldo).
// Mostrar el saldo actual por consola.
public class BankAccount {
  private String owner;
  private Integer balance;

  public BankAccount(String owner, Integer balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public void depositMoney(Integer amount) {
    if (amount < 0) {
      System.out.println("The amount need to be more then cero");
      return;
    }
    this.balance += amount;
    this.showBalance("You'r new balance: ");
  }

  public void takeOutMoney(Integer amount) {
    Boolean canTakeOutMoney = this.balance >= amount && amount > 0;
    if (!canTakeOutMoney) {
      System.out.println("You can't take out that amount of money, try with other amount");
      return;
    }
    this.balance -= amount;
    this.showBalance("You'r new balance: ");
  }

  public void showBalance() {
    System.out.println("\nYour current balance: " + this.balance);
  }

  public void showBalance(String message) {
    System.out.println("\n" + message + this.balance);
  }

  public String getOwner() {
    return owner;
  }

  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }
}
