package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        String name = "Anastasiia";
        String surname = "Khylyk";

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", name);
        jsonObject.addProperty("lastName", surname);

        Gson gson = new Gson();
        String jsonOutput = gson.toJson(jsonObject);

        System.out.println(jsonOutput);
    }
}