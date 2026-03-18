
public class House {
  private int doors;
  private int windows;

  public House(int doors, int windows) {
    this.doors = doors;
    this.windows = windows;
  }

  public void printMessage() {
    String message = String.format("The house has %d doors and %d windows", this.doors, this.windows);
    System.out.println(message);
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public void setWindows(int windows) {
    this.windows = windows;
  }

  public int getDoors() {
    return doors;
  }

  public int getWindows() {
    return windows;
  }
}
