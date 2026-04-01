package com.json;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person personOne = new Person(1, "Ramses");

        Gson gson = new Gson();
        String personJson = gson.toJson(personOne, personOne.getClass());

        System.out.println(personJson);

    }
}
