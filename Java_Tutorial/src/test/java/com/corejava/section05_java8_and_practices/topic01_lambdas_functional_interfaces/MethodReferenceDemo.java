package com.corejava.section05_java8_and_practices.topic01_lambdas_functional_interfaces;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** Method reference: a shorthand for a lambda that just calls an existing method. */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob");

        names.forEach(name -> System.out.println(name)); // lambda form
        names.forEach(System.out::println);                // method reference form - same result

        Consumer<String> printer = System.out::println; // reference to an instance method
        printer.accept("via Consumer");

        Supplier<StringBuilder> sbMaker = StringBuilder::new; // reference to a constructor
        System.out.println("new StringBuilder via supplier -> " + sbMaker.get());
    }
}
