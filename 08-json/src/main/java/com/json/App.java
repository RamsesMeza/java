package com.json;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        Person personOne = new Person(1, "Ramses");

        Gson gson = new Gson();
        String personJson = gson.toJson(personOne, personOne.getClass());

        System.out.println(personJson);

        String json = """
                {
                    "id": 123,
                    "name": "Ramses",
                    "name2": "X"
                }
                """;

        Person personTwo = gson.fromJson(json, Person.class);
        Person personThree = gson.fromJson(personJson, Person.class);

        System.out.println(personTwo);
        System.out.println(personThree);

    }
}