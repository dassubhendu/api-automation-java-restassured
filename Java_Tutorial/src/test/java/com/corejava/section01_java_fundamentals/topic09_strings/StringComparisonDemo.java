package com.corejava.section01_java_fundamentals.topic09_strings;

/** Always compare String content with equals() / equalsIgnoreCase(), never ==. */
public class StringComparisonDemo {

    public static void main(String[] args) {
        String a = "Login";
        String b = new String("Login");

        System.out.println("a.equals(b)                 -> " + a.equals(b));            // true
        System.out.println("\"Login\".equalsIgnoreCase(\"LOGIN\") -> " + "Login".equalsIgnoreCase("LOGIN")); // true
    }
}
