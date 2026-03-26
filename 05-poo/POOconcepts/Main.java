package POOconcepts;

public class Main {
  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Toyota", "B23043", 2020);

    vehicle.setYear(2027);
    String result = vehicle.toString();
    System.out.println(result);

    Car car = new Car("", "", 0, 0);
    Vehicle car2 = new Car("", "", 0, 0);
    car.getDoors();
    car2.getClass();
  }
}
