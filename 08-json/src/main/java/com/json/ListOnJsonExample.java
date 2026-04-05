package com.json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ListOnJsonExample {
  public static void main(String[] args) {
    Person personOne = new Person(1, "Derek");
    Person personTwo = new Person(2, "Ramses");
    Gson gson = new Gson();

    List<Person> personList = new ArrayList<>();

    personList.add(personOne);
    personList.add(personTwo);

    Type personTypeToken = new TypeToken<List<Person>>() {
    }.getType();

    // Write
    try (FileWriter writer = new FileWriter("persons.json")) {

      String personJson = gson.toJson(personList, personTypeToken);
      writer.write(personJson);

    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
      e.printStackTrace();
    }

    // Read
    try (BufferedReader reader = new BufferedReader(new FileReader("persons.json"))) {
      List<Person> persons = gson.fromJson(reader, personTypeToken);

      System.out.println(persons.get(1));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
