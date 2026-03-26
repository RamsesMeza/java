package POOconcepts;

public class Vehicle {
  private String brand;
  private String model;
  private int year;

  public Vehicle(String brand, String model, int year) {
    this.brand = brand;
    this.model = model;
    this.year = year;
  }

  public void start() {
    System.out.println("The vehicle is on");
  }

  public void stop() {
    System.out.println("The vehicle is stop");
  }

  @Override
  public String toString() {
    return "Vehicle [brand=" + brand + ", model=" + model + ", year=" + year + "]";
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    // Encapsulation means hiding and protecting data inside an object, and
    // controlling access to it
    int currentYear = java.time.Year.now().getValue();
    System.out.println(currentYear);
    if (year < currentYear || year > 0) {
      throw new IllegalArgumentException("Invalid year");
    }
    this.year = year;
  }

}
