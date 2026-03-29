package trycatch.withresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MultipleResourcesMain {
  public static void main(String[] args) {
    try (
        BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader("example2.txt"));) {

      System.out.println("\n----File 1----");
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }

      System.out.println("\n----File 2----");
      System.out.println(reader2.readLine());

    } catch (FileNotFoundException e) {
      System.out.println("File or directory not found");
      e.printStackTrace();

    } catch (IOException e) {
      System.out.println("An error happen");
      e.printStackTrace();
    } finally {
      System.out.println("Multiple resource example process end");
    }
  }
}
