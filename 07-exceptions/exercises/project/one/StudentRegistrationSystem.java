package exercises.project.one;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentRegistrationSystem {

  private List<Student> students;
  private Scanner scanner;
  private Integer option;

  public StudentRegistrationSystem() {
    this.students = new ArrayList<>();
    this.students.add(new Student("A00001", "Derek", 23));
    this.students.add(new Student("A00002", "Alan", 26));
    this.students.add(new Student("A00003", "Pau", 25));
    this.scanner = new Scanner(System.in);
  }

  public void start() {
    do {
      this.printMenu();
      this.option = this.scanner.nextInt();
      this.processOption();
    } while (this.option != 4);
  }

  public void printMenu() {
    System.out.println("\n");
    System.out.println("1. Add new students");
    System.out.println("2. Remove a student");
    System.out.println("3. Show students");
    System.out.println("4. Leave program");
    System.out.print("Enter the number of the selected option:");

  }

  public void processOption() {
    switch (this.option) {
      case 1:
        this.addStudent();
        break;
      case 2:
        this.removeStudent();
        break;
      case 3:
        this.showStudents();
        break;
      case 4:
        System.out.println("Thanks for using the program!");
        break;

      default:
        System.out.println("That's not a valid option, try again");
        break;
    }
  }

  public String scannerString(String msg) {
    System.out.print(msg);
    return this.scanner.next();
  }

  public Integer scannerInteger(String msg) {
    System.out.print(msg);
    return this.scanner.nextInt();
  }

  public Student createStudent() {
    System.out.print("id:");
    String id = this.scanner.next();
    System.out.print("name:");
    String name = this.scanner.next();
    Integer age = this.scannerInteger("age:");
    return Student.createStudent(id, name, age);
  }

  public void addStudent() {
    Student newStudent = this.createStudent();
    this.students.add(newStudent);
    System.out.println("Student added correctly!");

  }

  public void removeStudent() {
    System.out.print("id:");
    String id = this.scanner.next();
    this.students.removeIf(s -> s.id.equals(id));
    System.out.println("Student removed!");
  }

  public void showStudents() {
    for (Student student : this.students) {
      System.out.println(student);
    }
  }

  @Override
  public String toString() {
    return "StudentRegistrationSystem [students=" + students + "]";
  }

}
