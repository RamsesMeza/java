package exercises.project.one;

import exercises.project.one.validations.InvalidAgeException;
import exercises.project.one.validations.InvalidIdException;
import exercises.project.one.validations.InvalidNameException;

public class Student {
  private String id;
  private String name;
  private Integer age;

  public Student(String id, String name, Integer age)
      throws InvalidAgeException, InvalidIdException, InvalidNameException {
    this.validateName(name);
    this.validateId(id);
    this.validateAge(age);
    this.id = id.trim();
    this.name = name.trim();
    this.age = age;
  }

  public void validateName(String name) throws InvalidNameException {
    if (name == null || name.trim().isEmpty()) {
      throw new InvalidNameException("The name must not be empty");
    }
  }

  public void validateAge(Integer age) throws InvalidAgeException {
    if (age == null || age < 17 || age > 100) {
      throw new InvalidAgeException("The age must be between 17 and 100");
    }
  }

  public void validateId(String id) throws InvalidIdException {
    if (id == null || !id.trim().matches("A\\d{4}")) {
      throw new InvalidIdException("The id must have exactly five characters");
    }
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) throws InvalidIdException {
    this.validateId(id);
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) throws InvalidNameException {
    this.validateName(name);
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) throws InvalidAgeException {
    this.validateAge(age);
    this.age = age;
  }

}
