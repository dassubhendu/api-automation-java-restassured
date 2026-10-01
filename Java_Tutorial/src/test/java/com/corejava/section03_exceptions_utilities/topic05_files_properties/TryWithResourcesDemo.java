package com.corejava.section03_exceptions_utilities.topic05_files_properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** try-with-resources: the resource is closed automatically, even if an exception is thrown. */
public class TryWithResourcesDemo {

    private static final String PATH = "src/test/resources/config.properties";

    public static void main(String[] args) {
        // BufferedReader implements AutoCloseable, so it qualifies for try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("line -> " + line);
            }
        } catch (IOException e) {
            System.out.println("Could not read file: " + e.getMessage());
        }
        // No explicit reader.close() needed - it happens automatically here
    }
}
