package strings;

public class Person {
  private String name;
  private String lastName;

  public Person(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

  public void printValues() {
    System.out.println(String.format("Person={name:%s,lastName:%s}", this.name, this.lastName));
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setName(String name) {
    this.name = name;
  }
}
