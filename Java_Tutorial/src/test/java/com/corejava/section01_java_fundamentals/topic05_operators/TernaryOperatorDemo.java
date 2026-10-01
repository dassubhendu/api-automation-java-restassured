package com.corejava.section01_java_fundamentals.topic05_operators;

/** Ternary operator: condition ? valueIfTrue : valueIfFalse - a one-line if-else. */
public class TernaryOperatorDemo {

    public static void main(String[] args) {
        double rate = 90.0;

        String status = rate >= 80 ? "PASS" : "FAIL";
        System.out.println("status -> " + status);

        int statusCode = 404;
        String category = statusCode < 400 ? "OK" : "ERROR";
        System.out.println("category -> " + category);

        // ternaries can be chained, but keep it to one level for readability
        String grade = rate >= 90 ? "A" : rate >= 75 ? "B" : "C";
        System.out.println("grade -> " + grade);
    }
}
