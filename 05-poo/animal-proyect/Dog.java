public class Dog extends Animal implements CanAdopted {

  private String rasa;

  public Dog(String name, int age, String rasa) {
    super(name, age);
    this.rasa = rasa;
  }

  @Override
  public void adopt() {

  }

  @Override
  void makeASound() {
    System.out.println("Wow");
  }

  public String getRasa() {
    return rasa;
  }

  public void setRasa(String rasa) {
    this.rasa = rasa;
  }

  @Override
  public String toString() {
    return "Dog [rasa=" + rasa + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
  }

}
