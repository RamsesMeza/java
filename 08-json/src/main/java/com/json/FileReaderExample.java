package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class FileReaderExample {
  public static void main(String[] args) {
    Gson gson = new Gson();

    try (BufferedReader reader = new BufferedReader(new FileReader("person.json"))) {

      String json = reader.readLine();
      Person person = gson.fromJson(json, Person.class);

      System.out.println(person);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
