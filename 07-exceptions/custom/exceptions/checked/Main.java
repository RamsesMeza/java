package custom.exceptions.checked;

public class Main {
  public static void main(String[] args) {

    try {
      Person.create(1, "Ramses", 10);

    } catch (AgeValidationException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("No error");
    }
  }
}
