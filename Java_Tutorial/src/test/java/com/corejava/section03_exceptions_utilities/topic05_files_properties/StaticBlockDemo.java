package com.corejava.section03_exceptions_utilities.topic05_files_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/** A static block runs once, when the class is first loaded - a good place to load config. */
public class StaticBlockDemo {

    private static final String PATH = "src/test/resources/config.properties";
    private static final Properties props = new Properties();

    static { // runs exactly once, before main() uses ConfigReader
        try (FileInputStream fis = new FileInputStream(PATH)) {
            props.load(fis);
            System.out.println("Static block ran: config loaded from " + PATH);
        } catch (IOException e) {
            throw new RuntimeException("Cannot load " + PATH, e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println("baseUrl -> " + StaticBlockDemo.get("baseUrl"));
        System.out.println("browser -> " + StaticBlockDemo.get("browser"));
    }
}
