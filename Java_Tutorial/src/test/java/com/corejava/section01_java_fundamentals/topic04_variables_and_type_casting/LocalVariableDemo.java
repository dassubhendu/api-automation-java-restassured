package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Local variable: declared inside a method; must be initialized before use. */
public class LocalVariableDemo {

    public static void main(String[] args) {
        int retries = 3; // local to main()
        System.out.println("retries = " + retries);

        printDoubled(5);
        printDoubled(10);
    }

    private static void printDoubled(int value) {
        int doubled = value * 2; // local to this method only, a fresh copy on every call
        System.out.println(value + " doubled = " + doubled);
    }
}
