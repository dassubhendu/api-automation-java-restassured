package com.corejava.section01_java_fundamentals.topic03_data_types;

/** Non-primitive (reference) types: String, arrays and objects. Default value is null. */
public class NonPrimitiveDataTypesDemo {

    public static void main(String[] args) {
        // String is a non-primitive type: URLs, locators, JSON all live in Strings
        String url = "https://reqres.in";
        System.out.println("String url = " + url);

        // Arrays are reference types too
        int[] scores = new int[3];
        System.out.println("Uninitialized int[] element defaults to: " + scores[0]);

        String[] browsers = new String[2];
        System.out.println("Uninitialized String[] element defaults to: " + browsers[0]);

        // Any class type is a reference type
        StringBuilder sb = new StringBuilder("ready");
        System.out.println("StringBuilder reference: " + sb);

        // Reference types can explicitly hold null; primitives never can
        String notAssignedYet = null;
        System.out.println("Explicit null reference: " + notAssignedYet);
    }
}
