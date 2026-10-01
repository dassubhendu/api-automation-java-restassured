package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Constant: static + final, named in UPPER_SNAKE_CASE, cannot be reassigned. */
public class ConstantDemo {

    static final String BASE_URL = "https://reqres.in";
    static final int MAX_RETRIES = 3;

    public static void main(String[] args) {
        System.out.println("BASE_URL = " + BASE_URL);
        System.out.println("MAX_RETRIES = " + MAX_RETRIES);
        // BASE_URL = "https://other.com"; // compile error: cannot assign a value to final variable
    }
}
