package com.corejava.section05_java8_and_practices.topic01_lambdas_functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

/** Consumer<T>: accepts a value, returns nothing. Supplier<T>: takes nothing, returns a value. */
public class ConsumerSupplierDemo {

    public static void main(String[] args) {
        Consumer<String> log = message -> System.out.println("[LOG] " + message);
        log.accept("step completed");

        Supplier<String> sessionIdGenerator = () -> "session-" + System.currentTimeMillis();
        String sessionId = sessionIdGenerator.get();
        System.out.println("sessionId -> " + sessionId);
    }
}
