import arrays.ArrayMethods;

public class Main {
  public static void main(String[] args) {

    int[] intArray = { 1, 2, 3, 4, 5 };
    ArrayMethods array = new ArrayMethods(intArray);

    array.print();
    array.delete(2);
    System.out.println(" ");
    array.print();

    System.out.println(" ");

    array.delete(0);
    array.print();
  }
}
