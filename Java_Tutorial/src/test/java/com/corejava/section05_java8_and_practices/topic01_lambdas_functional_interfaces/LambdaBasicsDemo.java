package com.corejava.section05_java8_and_practices.topic01_lambdas_functional_interfaces;

/** Lambda: an anonymous function - (params) -> expression. Works for any functional interface. */
public class LambdaBasicsDemo {

    public static void main(String[] args) {
        // Before Java 8: anonymous class
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Running via anonymous class");
            }
        };

        // Java 8: the same thing as a lambda
        Runnable r2 = () -> System.out.println("Running via lambda");

        r1.run();
        r2.run();
    }
}
