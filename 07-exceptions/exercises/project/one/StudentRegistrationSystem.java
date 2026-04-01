package exercises.project.one;

import java.util.Scanner;

import exercises.project.one.validations.InvalidAgeException;
import exercises.project.one.validations.InvalidIdException;
import exercises.project.one.validations.InvalidNameException;
import exercises.project.one.validations.StudentDuplicatedException;
import exercises.project.one.validations.StudentNotFoundException;

public class StudentRegistrationSystem implements AutoCloseable {

  private StudentService studentService;
  private Scanner scanner;

  public StudentRegistrationSystem()
      throws InvalidAgeException, InvalidIdException, InvalidNameException, StudentDuplicatedException {
    this.studentService = new StudentService();
    this.studentService.init();
    this.scanner = new Scanner(System.in);
  }

  public void start() throws InvalidAgeException, InvalidIdException, InvalidNameException, StudentDuplicatedException,
      StudentNotFoundException {
    Integer option;
    do {
      this.printMenu();
      option = this.scanner.nextInt();
      this.processOption(option);
    } while (option != 4);
  }

  public void printMenu() {
    System.out.println("\n");
    System.out.println("1. Add new students");
    System.out.println("2. Remove a student");
    System.out.println("3. Show students");
    System.out.println("4. Leave program");
    System.out.print("Enter the number of the selected option:");

  }

  public void processOption(Integer option) throws InvalidAgeException, InvalidIdException, InvalidNameException,
      StudentDuplicatedException, StudentNotFoundException {
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
    return this.scanner.next();
  }

  public Integer scannerInteger(String msg) {
    System.out.print(msg);
    Integer intValue = null;
    try {
      intValue = this.scanner.nextInt();
    } catch (Exception e) {
      System.out.println("Write only numbers");
    }

    return intValue;
  }

  public void createStudent()
      throws InvalidAgeException, InvalidIdException, InvalidNameException, StudentDuplicatedException {
    String id = this.scannerString("id:");
    String name = this.scannerString("name:");
    Integer age = this.scannerInteger("age:");

    this.studentService.createStudent(id, name, age);
  }

  public void removeStudent() throws StudentNotFoundException {
    String id = this.scannerString("id:");
    this.studentService.removeStudent(id);
  }

  public void printStudents() {
    System.out.println("\n--- List of Students ---");
    for (Student student : this.studentService.getStudents()) {
      System.out.println(student);
    }
  }

  @Override
  public void close() throws Exception {
    System.out.println("The program has ended");
  }

}
