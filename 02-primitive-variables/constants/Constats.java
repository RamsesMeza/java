package constants;

public class Constats {
  public static void main(String[] args) {
    final float TAX_RATE = 0.16F;

    int grossSalary = 100;

    float tax = grossSalary * TAX_RATE;
    float totalSalary = grossSalary - tax;
    System.out.println(totalSalary);

  }
}
