package equals;

public class EqualsExample {

  public static void main(String[] args) {
    Integer a = 200;
    Integer b = 200;

    // Compares the space in memory, 0 to 127 has the same space of memory
    System.out.println(a == b);

    // Compares the value
    System.out.println(a.equals(b));
  }

}
