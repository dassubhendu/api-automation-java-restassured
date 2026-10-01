package com.corejava.section01_java_fundamentals.topic05_operators;

/** Classic pitfall: == compares object references for Strings, not their content. */
public class StringEqualityPitfallDemo {

    public static void main(String[] args) {
        String a = "Login";
        String b = new String("Login"); // forces a new object, even though content is equal

        System.out.println("a == b          -> " + (a == b));         // false: different objects
        System.out.println("a.equals(b)     -> " + a.equals(b));      // true: use this for content

        String c = "Login"; // literals are reused from the String pool
        System.out.println("a == c (pool)   -> " + (a == c));         // true: same pooled object
    }
}
