package exercises.project.one;

public class Main {
  public static void main(String[] args) {

    try (StudentRegistrationSystem studentSystem = new StudentRegistrationSystem()) {
      studentSystem.start();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
