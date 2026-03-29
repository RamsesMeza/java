package trycatch.withresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OneResourceMain {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"))) {

      String line = null;
      while (line != null) {
        System.out.println(line);
      }

    } catch (FileNotFoundException e) {
      System.out.println("Archivo no encontrado");
      e.printStackTrace();

    } catch (IOException e) {
      System.out.println("Ocurrió un error");
      e.printStackTrace();
    } finally {
      System.out.println("Finalizó");
    }
  }
}
