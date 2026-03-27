package arrays;

public class ArrayMethods {
  private int[] numbers;

  public ArrayMethods(int[] numbers) {
    this.numbers = numbers;
  }

  public void delete(int position) {

    for (int i = position; i < this.numbers.length - 1; i++) {
      this.numbers[i] = this.numbers[i + 1];
    }

    this.numbers[this.numbers.length - 1] = 0;
  }

  public void print() {
    for (int i : this.numbers) {
      System.out.println(i);
    }
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

}
