package exercises.project.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exercises.project.one.validations.InvalidAgeException;
import exercises.project.one.validations.InvalidIdException;
import exercises.project.one.validations.InvalidNameException;
import exercises.project.one.validations.StudentDuplicatedException;
import exercises.project.one.validations.StudentNotFoundException;

public class StudentService {
  private List<Student> students;

  public StudentService() {
    this.students = new ArrayList<>();
  }

  public StudentService(List<Student> students) {
    this.students = new ArrayList<>(students);
  }

  public void init() throws InvalidAgeException, InvalidIdException, InvalidNameException, StudentDuplicatedException {
    this.createStudent("A0001", "Ramses", 19);
    this.createStudent("A0002", "Derek", 20);
    this.createStudent("A0003", "Pau", 23);
  }

  public Optional<Student> findStudentById(String id) {
    return this.students.stream().filter(s -> s.getId().equals(id)).findFirst();
  }

  public Student createStudent(String id, String name, Integer age)
      throws InvalidAgeException, InvalidIdException, InvalidNameException, StudentDuplicatedException {

    Optional<Student> student = this.findStudentById(id);

    if (student.isPresent()) {
      throw new StudentDuplicatedException("Student is duplicated");
    }

    Student newStudent = new Student(id, name, age);
    this.students.add(newStudent);
    return newStudent;

  }

  public Student updateStudent(String id, String name, Integer age)
      throws StudentNotFoundException, InvalidAgeException, InvalidNameException {

    Student student = this.findStudentById(id)
        .orElseThrow(() -> new StudentNotFoundException("Student not found"));

    student.setAge(age);
    student.setName(name);

    return student;
  }

  public Student removeStudent(String id) throws StudentNotFoundException {
    Optional<Student> student = this.findStudentById(id);

    if (student.isEmpty()) {
      throw new StudentNotFoundException("Student not found");
    }
    Student existingStudent = student.get();
    this.students.remove(existingStudent);
    return existingStudent;
  }

  public List<Student> getStudents() {
    return new ArrayList<>(students);
  }

  public void printStudents() {
    System.out.println("\n--- Lista ---");
    for (Student student : this.students) {
      System.out.println(student);
    }
  }

}
