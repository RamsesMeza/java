package file.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

  public static void main(String[] args) {
    try {
      FileHandler.readFile("textfile.txt");
    } catch (IOException e) {
      System.out.println("Ocurrió un error");
      e.printStackTrace();
    } finally {
      System.out.println("Finally");
    }
  }

  public static void readFile(String filePath) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(filePath));

    String line = reader.readLine();
    while (line != null) {
      System.out.println(line);
      line = reader.readLine();
    }

    if (reader != null) {
      reader.close();
      System.out.println("El archivo se cerró");
    }

  }

}
