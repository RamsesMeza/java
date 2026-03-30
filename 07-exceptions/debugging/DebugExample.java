package debugging;

public class DebugExample {
  public static void main(String[] args) {
    try {
      int[] number = new int[5];

      for (int i = 0; i < number.length; i++) {
        System.out.println(number[i + 1]);
      }

    } catch (Exception e) {
      System.out.println("An error occurred");
      StackTraceElement[] stack = e.getStackTrace();

      for (StackTraceElement element : stack) {
        System.out.println("ClassName:" + element.getClassName());
        System.out.println("File:" + element.getFileName());
        System.out.println("Module:" + element.getModuleName());
        System.out.println("Method:" + element.getMethodName());
        System.out.println("Line:" + element.getLineNumber());
      }
      // System.out.println("Message: " + e.getMessage());
      // System.out.println("Message: " + e.g());
      // System.out.println("Message: " + e.getMessage());
      // System.out.println("Message: " + e.getMessage());
    }
  }
}
