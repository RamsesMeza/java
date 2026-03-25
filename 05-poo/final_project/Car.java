package final_project;

public class Car extends Vehicle {

  private CarType carType;

  public Car(String brand, String model, int year, CarType carType) {
    super(brand, model, year);
    this.carType = carType;
  }

  @Override
  void start() {
    System.out.println("El auto arrancó");
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  @Override
  public String toString() {
    return "Car [carType=" + carType + ", getCarType()=" + getCarType() + ", getBrand()=" + getBrand() + ", getModel()="
        + getModel() + ", getYear()=" + getYear() + "]";
  }

}
