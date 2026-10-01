package com.corejava.section05_java8_and_practices.topic01_lambdas_functional_interfaces;

import java.util.function.Predicate;

/** Predicate<T>: a functional interface with one method, test(T) -> boolean. */
public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> isSuccess = code -> code >= 200 && code < 300;

        System.out.println("isSuccess.test(201) -> " + isSuccess.test(201)); // true
        System.out.println("isSuccess.test(404) -> " + isSuccess.test(404)); // false

        Predicate<String> isEmpty = String::isEmpty; // method reference also works
        System.out.println("isEmpty.test(\"\")    -> " + isEmpty.test(""));
    }
}
