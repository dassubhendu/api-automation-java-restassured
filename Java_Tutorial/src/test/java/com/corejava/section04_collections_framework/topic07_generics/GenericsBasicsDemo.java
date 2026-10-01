package com.corejava.section04_collections_framework.topic07_generics;

import java.util.ArrayList;
import java.util.List;

/** Generics give type safety at compile time, so wrong-type bugs are caught before running. */
public class GenericsBasicsDemo {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {
        // Without generics: casting and runtime failures
        List raw = new ArrayList();
        raw.add("text");
        try {
            Integer n = (Integer) raw.get(0); // ClassCastException at runtime!
        } catch (ClassCastException e) {
            System.out.println("Caught as expected: " + e.getMessage());
        }

        // With generics: the compiler checks the type for us
        List<String> safe = new ArrayList<>(); // diamond <>: compiler infers the type
        safe.add("text");
        // safe.add(10); // would be a compile error - caught before the test ever runs
        System.out.println("safe -> " + safe);
    }
}
