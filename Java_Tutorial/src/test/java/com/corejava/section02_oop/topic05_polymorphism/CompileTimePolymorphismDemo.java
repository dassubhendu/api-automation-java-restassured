package com.corejava.section02_oop.topic05_polymorphism;

/** Compile-time polymorphism: method overloading, resolved by the parameter list. */
public class CompileTimePolymorphismDemo {

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));          // calls add(int, int)
        System.out.println(calc.add(2.5, 3.5));       // calls add(double, double)
        System.out.println(calc.add(1, 2, 3));        // calls add(int, int, int)
        // Java decides WHICH method to call at compile time, based on the arguments
    }
}

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
