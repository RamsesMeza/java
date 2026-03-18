package strings;

public class StringClass {
  public static void main(String[] args) {

    String name = "Ramses";
    String nameTwo = "Ramses";

    if (name == nameTwo) {
      System.out.println("Son iguales");
    } else {
      System.out.println("No son iguales");
    }

    Person person = new Person("Ramses", "Meza");
    person.printValues();
    System.out.println(person.getLastName().length());
  }
}
