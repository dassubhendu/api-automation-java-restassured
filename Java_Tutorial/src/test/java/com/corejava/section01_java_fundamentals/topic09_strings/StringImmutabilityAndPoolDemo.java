package com.corejava.section01_java_fundamentals.topic09_strings;

/** Strings are immutable: every "change" returns a new String. Literals are reused (pooled). */
public class StringImmutabilityAndPoolDemo {

    public static void main(String[] args) {
        String original = "hello";
        String upper = original.toUpperCase(); // returns a NEW String

        System.out.println("original -> " + original); // unchanged: "hello"
        System.out.println("upper    -> " + upper);     // "HELLO"

        // String pool: literals with the same content are reused as the same object
        String a = "Login";
        String b = "Login";
        System.out.println("a == b (both literals, same pooled object) -> " + (a == b));

        // new String(...) always creates a brand new object, bypassing the pool
        String c = new String("Login");
        System.out.println("a == c (c is a new object)                 -> " + (a == c));
    }
}
