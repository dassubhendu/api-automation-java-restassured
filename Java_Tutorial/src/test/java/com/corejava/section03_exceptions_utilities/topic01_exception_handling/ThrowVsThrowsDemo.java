package com.corejava.section03_exceptions_utilities.topic01_exception_handling;

import java.io.IOException;

/** throw raises an exception right now; throws declares on a method that it might raise one. */
public class ThrowVsThrowsDemo {

    public static void main(String[] args) {
        try {
            readFile("missing.txt");
        } catch (IOException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            validateAge(10);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

    // throws: tells the caller "you must handle this checked exception"
    static void readFile(String path) throws IOException {
        throw new IOException("Cannot find file: " + path); // throw: raises it right now
    }

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+, got " + age);
        }
    }
}
