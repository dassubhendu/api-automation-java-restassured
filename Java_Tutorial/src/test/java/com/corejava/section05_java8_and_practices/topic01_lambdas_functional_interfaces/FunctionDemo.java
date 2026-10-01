package com.corejava.section05_java8_and_practices.topic01_lambdas_functional_interfaces;

import java.util.function.Function;

/** Function<T,R>: a functional interface that transforms T into R, apply(T) -> R. */
public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, Integer> len = s -> s.length();

        System.out.println("len.apply(\"hello\") -> " + len.apply("hello"));

        // Functions can be chained
        Function<String, String> upper = String::toUpperCase;
        Function<String, Integer> upperThenLength = upper.andThen(String::length);
        System.out.println("upperThenLength.apply(\"abc\") -> " + upperThenLength.apply("abc"));
    }
}
