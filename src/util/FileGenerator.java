package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public static void generateJson(Object json, String fileName) {
        // Code to generate a JSON file
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(fileName + ".json")) {
            writer.write(gson.toJson(json));
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
    }
}
