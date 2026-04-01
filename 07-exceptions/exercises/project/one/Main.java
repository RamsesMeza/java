package exercises.project.one;

public class Main {
  public static void main(String[] args) {

    StudentService studentService = new StudentService();
    try {
      studentService.init();
    } catch (Exception e) {
      System.out.println("Error init service");
    }
    try (StudentRegistrationSystem studentSystem = new StudentRegistrationSystem(studentService)) {
      studentSystem.start();
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
