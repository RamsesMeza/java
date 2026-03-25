package final_project;

public class ElectricCar extends Car implements Electric {
  private int batteryLevel;

  public ElectricCar(String brand, String model, int year, CarType carType, int batteryLevel) {
    super(brand, model, year, carType);
    this.batteryLevel = batteryLevel;
  }

  @Override
  public void start() {
    System.out.println("El auto eléctrico está encendido");
  }

  @Override
  public void chargeBattery() {
    System.out.println("La batería está cargada al 100%");
    this.batteryLevel = 100;
  }

  @Override
  public String toString() {
    return "ElectricCar [batteryLevel=" + batteryLevel + ", getCarType()=" + getCarType() + ", getBrand()=" + getBrand()
        + ", toString()=" + super.toString() + ", getModel()=" + getModel() + ", getYear()=" + getYear() + "]";
  }

}
