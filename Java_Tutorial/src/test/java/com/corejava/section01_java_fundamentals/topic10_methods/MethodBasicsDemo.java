package com.corejava.section01_java_fundamentals.topic10_methods;

/** Method signature = access modifier + return type + name + (parameters). */
public class MethodBasicsDemo {

    public static void main(String[] args) {
        greet(); // void: returns nothing

        int sum = add(2, 3); // returns a value
        System.out.println("add(2, 3) -> " + sum);
    }

    public static void greet() {
        System.out.println("Hello from a void method!");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
