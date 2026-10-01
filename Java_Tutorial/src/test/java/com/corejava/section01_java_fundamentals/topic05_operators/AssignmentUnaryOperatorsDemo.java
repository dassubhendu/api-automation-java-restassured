package com.corejava.section01_java_fundamentals.topic05_operators;

/** Assignment & unary operators: =  +=  -=  *=  and  ++  -- to increment/decrement. */
public class AssignmentUnaryOperatorsDemo {

    public static void main(String[] args) {
        int passed = 18;
        int total = 20;

        passed++;          // passed becomes 19
        System.out.println("after passed++  -> " + passed);

        total += 5;         // total becomes 25
        System.out.println("after total+=5  -> " + total);

        total -= 2;          // total becomes 23
        System.out.println("after total-=2  -> " + total);

        int retries = 1;
        retries *= 3;        // retries becomes 3
        System.out.println("after retries*=3 -> " + retries);

        retries--;            // retries becomes 2
        System.out.println("after retries--  -> " + retries);
    }
}
