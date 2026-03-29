package custom.exceptions.checked;

public class Person {
  private Integer id;
  private String name;
  private Integer age;

  public Person(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public static Person create(Integer id, String name, Integer age) throws AgeValidationException {

    if (age < 18) {
      throw new AgeValidationException("Must to be of legal age");
    }
    return new Person(id, name, age);
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

}
