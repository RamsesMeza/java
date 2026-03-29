package file.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  public static void main(String[] args) {
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("./textfile.txt"));

      String line = reader.readLine();
      while (line != null) {
        System.out.println(line);
        line = reader.readLine();
      }

    } catch (IOException e) {
      System.out.println("Ocurrió un error");
    } finally {
      try {
        if (reader != null) {
          reader.close();
          System.out.println("El archivo se cerró");
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
