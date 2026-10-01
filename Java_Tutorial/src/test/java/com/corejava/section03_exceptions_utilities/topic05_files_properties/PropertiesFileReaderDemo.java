package com.corejava.section03_exceptions_utilities.topic05_files_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties: a key=value file for URL, browser, timeouts and credentials.
 * Reads src/test/resources/config.properties - run this class from the project root
 * so the relative path below resolves correctly.
 */
public class PropertiesFileReaderDemo {

    private static final String PATH = "src/test/resources/config.properties";

    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream(PATH)) { // try-with-resources: auto-closed
            props.load(fis);
        }

        System.out.println("baseUrl -> " + props.getProperty("baseUrl"));
        System.out.println("browser -> " + props.getProperty("browser"));
        System.out.println("timeout -> " + props.getProperty("timeout"));
        // Switch environment or browser by editing the file - no recompiling needed
    }
}
