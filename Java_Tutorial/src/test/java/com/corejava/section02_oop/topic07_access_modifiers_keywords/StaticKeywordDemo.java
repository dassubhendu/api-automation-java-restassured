package com.corejava.section02_oop.topic07_access_modifiers_keywords;

/** static: belongs to the class itself, not to any individual object. */
public class StaticKeywordDemo {

    static String driver; // one shared copy, e.g. a single WebDriver reused across helper methods

    public static void main(String[] args) {
        StaticKeywordDemo.driver = "chrome-session";
        System.out.println("driver -> " + StaticKeywordDemo.driver);

        printDriver(); // static methods can be called without creating an object
    }

    static void printDriver() {
        System.out.println("Accessed from a static method -> " + driver);
    }
}
