package custom.exceptions.unchecked;

public class BankAccount {
  private Double balance;

  public BankAccount(Double balance) {
    this.balance = balance;
  }

  public void withdraw(Double amount) {

    Boolean canWithdraw = (amount - this.balance) < 0;

    if (!canWithdraw) {
      throw new NegativeBalanceException("You don't have that amount of money");
    }

    this.balance -= amount;
    System.out.println("New balance: " + this.balance);
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

}
