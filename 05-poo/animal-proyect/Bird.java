public class Bird extends Animal implements CanFly, CanAdopted {
  private boolean havePico;
  private AnimalStatus animalStatus = AnimalStatus.ADOPTED;

  public Bird(String name, int age, boolean havePico, AnimalStatus animalStatus) {
    super(name, age);
    this.havePico = havePico;
    this.animalStatus = animalStatus;
  }

  @Override
  public void adopt() {
    System.out.println("Adoptado");
  }

  @Override
  public void fly() {
    System.out.println(super.getName() + " esta volando");
  }

  public boolean isHavePico() {
    return havePico;
  }

  public void setHavePico(boolean havePico) {
    this.havePico = havePico;
  }

  public AnimalStatus getAnimalStatus() {
    return animalStatus;
  }

  public void setAnimalStatus(AnimalStatus animalStatus) {
    this.animalStatus = animalStatus;
  }

  @Override
  void makeASound() {
    System.out.println("Pio pio");
  }

  @Override
  public String toString() {
    return "Bird [havePico=" + havePico + ", animalStatus=" + animalStatus + ", getName()=" + getName() + ", getAge()="
        + getAge() + "]";
  }

}
