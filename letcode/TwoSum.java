package letcode;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    // { 3, 2, 3 };
    // [2,5,5,11]
    int[] numbers = { 0, 0 };
    for (int i = 0; i < nums.length - 1; i++) {
      int current = nums[i];

      for (int x = i; x < nums.length - 1; x++) {

        int next = nums[x + 1];

        if (current + next == target) {
          System.out.print("Vemos: ");
          System.out.println(i + " " + (x + 1));

          numbers[0] = i;
          numbers[1] = x + 1;
          return numbers;
        }

      }

    }

    return numbers;

  }
}
