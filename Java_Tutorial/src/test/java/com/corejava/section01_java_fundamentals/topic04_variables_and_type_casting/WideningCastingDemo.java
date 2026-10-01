package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Widening casting: smaller type -> bigger type. Happens automatically, no data loss. */
public class WideningCastingDemo {

    public static void main(String[] args) {
        int seconds = 10;
        double d = seconds; // int -> double, automatic
        System.out.println("int " + seconds + " widened to double " + d);

        long big = seconds;   // int -> long, automatic
        float f = big;        // long -> float, automatic
        System.out.println("int -> long -> float widening result: " + f);
    }
}
