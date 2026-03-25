package final_project;

public class Main {
  public static void main(String[] args) {
    Vehicle myCar = new Car("Toyota", "AB23", 2025, CarType.SEDAN);
    Vehicle myElectricCar = new ElectricCar("Tesla", "Modelo 3", 2026, CarType.TRUCK, 50);

    myCar.start();
    myElectricCar.start();

    System.out.println(myCar.toString());
    // A ver esto es importante porque como la guardamos en un Vehicle, esa clase no
    // conoce chargeBattery que es parte de ElectricCar
    ((ElectricCar) myElectricCar).chargeBattery();
    System.out.println(myElectricCar.toString());

  }
}
