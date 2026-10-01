package com.corejava.section03_exceptions_utilities.topic03_wrapper_classes;

/** Like Strings, compare wrapper objects with equals(), not ==. */
public class IntegerEqualsPitfallDemo {

    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b (127, cached)      -> " + (a == b));        // true: Java caches -128..127
        System.out.println("a.equals(b)               -> " + a.equals(b));     // true: always safe

        Integer c = 200;
        Integer d = 200;
        System.out.println("c == d (200, not cached)  -> " + (c == d));        // false: outside the cache range
        System.out.println("c.equals(d)               -> " + c.equals(d));     // true: still safe
    }
}
