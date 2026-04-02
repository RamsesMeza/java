package com.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AppConfigExample {

  public static AppConfig readConfiguration() {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ;
    try (FileReader reader = new FileReader("config.json")) {

      AppConfig appConfig = gson.fromJson(reader, AppConfig.class);

      return appConfig;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  public static AppConfig updateAppConfig(AppConfig appConfig) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    try (FileWriter writer = new FileWriter("config.json")) {

      gson.toJson(appConfig, writer);

      System.out.println("The config has edited");

    } catch (IOException e) {
      e.printStackTrace();
    }

    return null;
  }

  public static void main(String[] args) {
    AppConfig appConfig = readConfiguration();

    System.out.println(appConfig);

    updateAppConfig(appConfig);

    appConfig.setAppName("Nueva app xd");

    System.out.println(appConfig);

  }
}
