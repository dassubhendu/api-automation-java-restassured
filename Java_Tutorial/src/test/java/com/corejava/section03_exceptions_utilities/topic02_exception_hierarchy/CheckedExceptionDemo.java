package com.corejava.section03_exceptions_utilities.topic02_exception_hierarchy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/** Checked exceptions (e.g. IOException) must be handled or declared at COMPILE time. */
public class CheckedExceptionDemo {

    public static void main(String[] args) {
        try {
            readConfigFile("does-not-exist.properties"); // the compiler forces us to handle this
        } catch (IOException e) {
            System.out.println("Checked exception caught: " + e.getClass().getSimpleName());
        }
    }

    static void readConfigFile(String path) throws IOException {
        Files.readString(Path.of(path)); // declared to throw IOException - this won't compile without try/catch or throws
    }
}
