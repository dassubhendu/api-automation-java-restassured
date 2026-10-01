package com.corejava.section01_java_fundamentals.topic05_operators;

/** Arithmetic operators: +  -  *  /  %  (modulus gives the remainder). */
public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        int passed = 18;
        int total = 20;

        System.out.println("passed + total = " + (passed + total));
        System.out.println("total - passed = " + (total - passed));
        System.out.println("passed * 2     = " + (passed * 2));
        System.out.println("total / passed = " + (total / passed));          // integer division -> 1
        System.out.println("total % passed = " + (total % passed));          // remainder -> 2

        double rate = passed * 100.0 / total; // use 100.0 to force decimal division
        System.out.println("pass rate %    = " + rate);
    }
}
