import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Animal bird = new Bird("Teo", 1, true, AnimalStatus.ADOPTED);
    Animal dog = new Dog("Mike", 0, "Buldog");

    List<Animal> animals = new ArrayList<>();

    animals.add(bird);
    animals.add(dog);

    animals.stream().forEach(animal -> {
      animal.makeASound();
      System.out.println(animal.toString());

    });

  }
}