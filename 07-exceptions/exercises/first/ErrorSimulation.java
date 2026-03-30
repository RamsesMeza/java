package exercises.first;

public class ErrorSimulation {

  public static void main(String[] args) {
    try {
      simulateError();
    } catch (Exception e) {

      System.out.println("ERROR");
      e.printStackTrace();
      StackTraceElement[] stack = e.getStackTrace();

      for (StackTraceElement element : stack) {
        System.out.println("\n");
        System.out.println("ClassName:" + element.getClassName());
        System.out.println("File:" + element.getFileName());
        System.out.println("Module:" + element.getModuleName());
        System.out.println("Method:" + element.getMethodName());
        System.out.println("Line:" + element.getLineNumber());
      }
    }
  }

  public static void simulateError() {
    causeError();
  }

  public static void causeError() throws RuntimeException {
    throw new RuntimeException("Se ha producido un error crítico");
  }

}
