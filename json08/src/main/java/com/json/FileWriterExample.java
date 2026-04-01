package com.json;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class FileWriterExample {
  public static void main(String[] args) {
    Person personOne = new Person(1, "Derek");
    Gson gson = new Gson();

    try (FileWriter writer = new FileWriter("person.json")) {

      String personJson = gson.toJson(personOne);
      writer.write(personJson);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }

  }
}
