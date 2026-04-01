package exercises.project.one;

import java.util.Scanner;

import exercises.project.one.validations.InvalidAgeException;
import exercises.project.one.validations.InvalidIdException;
import exercises.project.one.validations.InvalidNameException;
import exercises.project.one.validations.StudentDuplicatedException;
import exercises.project.one.validations.StudentNotFoundException;

public class StudentRegistrationSystem implements AutoCloseable {

  private final StudentService studentService;
  private final Scanner scanner;

  public StudentRegistrationSystem(StudentService studentService) {
    this.studentService = studentService;
    this.scanner = new Scanner(System.in);
  }

  public void start() {
    int option;
    do {
      this.printMenu();
      option = this.scannerInteger("Select an option:");
      this.processOption(option);
    } while (option != 4);
  }

  public void printMenu() {
    System.out.println("\n");
    System.out.println("1. Add new students");
    System.out.println("2. Remove a student");
    System.out.println("3. Show students");
    System.out.println("4. Leave program");
  }

  public void processOption(int option) {
    switch (option) {
      case 1:
        this.createStudent();
        break;
      case 2:
        this.removeStudent();
        break;
      case 3:
        this.printStudents();
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
    String text = this.scanner.next();
    this.scanner.nextLine();
    return text;
  }

  public Integer scannerInteger(String msg) {
    while (true) {
      System.out.print(msg);
      if (this.scanner.hasNextInt()) {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
      } else {
        System.out.println("Write only numbers");
        scanner.nextLine();
      }
    }
  }

  public void createStudent() {
    String id = this.scannerString("id:");
    String name = this.scannerString("name:");
    Integer age = this.scannerInteger("age:");

    try {
      Student student = this.studentService.createStudent(id, name, age);
      System.out.println("Student created successfully: " + student);
    } catch (InvalidAgeException | InvalidIdException | InvalidNameException | StudentDuplicatedException e) {
      System.out.println("Error:  " + e.getMessage());
    }
  }

  public void removeStudent() {
    String id = this.scannerString("id:");
    try {
      Student student = this.studentService.removeStudent(id);
      System.out.println("Student removed successfully: " + student);
    } catch (StudentNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void printStudents() {
    System.out.println("\n--- List of Students ---");
    for (Student student : this.studentService.getStudents()) {
      System.out.println(student);
    }
  }

  @Override
  public void close() {
    if (this.scanner != null) {
      this.scanner.close();
    }
    System.out.println("The program has ended");
  }

}
