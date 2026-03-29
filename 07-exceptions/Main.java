import java.io.IOException;

import file.reader.FileHandler;

public class Main {

  public static void main(String[] args) {
    try {
      FileHandler.readFile("textfie.txt");
    } catch (IOException e) {
      System.out.println("Ocurrió un error");
      e.printStackTrace();
    } finally {
      System.out.println("Finally");
    }
    // try {
    // int result = 10 / 0;
    // System.out.println(result);
    // } catch (Exception e) {
    // System.out.println("Ocurrió un error");
    // } finally {
    // System.out.println("Termino el programa");
    // }
  }
}
