package com.corejava.section03_exceptions_utilities.topic04_enums;

/** enum: a fixed set of named constants. The compiler rejects values that don't exist. */
public class BasicEnumDemo {

    public static void main(String[] args) {
        Browser b = Browser.CHROME;
        System.out.println("b -> " + b);

        Browser fromString = Browser.valueOf("FIREFOX"); // from config / CLI argument
        System.out.println("fromString -> " + fromString);

        for (Browser browser : Browser.values()) {
            System.out.println("Supported browser: " + browser);
        }
        // Browser invalid = Browser.valueOf("OPERA"); // throws IllegalArgumentException at runtime
    }
}

enum Browser {
    CHROME, FIREFOX, EDGE
}
