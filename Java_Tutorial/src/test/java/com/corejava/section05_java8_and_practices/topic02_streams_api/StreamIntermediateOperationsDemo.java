package com.corejava.section05_java8_and_practices.topic02_streams_api;

import java.util.List;

/** Intermediate stream operations are lazy and return a new stream: filter, map, sorted, distinct, limit. */
public class StreamIntermediateOperationsDemo {

    public static void main(String[] args) {
        List<Integer> codes = List.of(200, 404, 201, 500, 200);

        List<Integer> errors = codes.stream()
                .filter(c -> c >= 400) // keep only values matching the condition
                .toList();
        System.out.println("filter (errors) -> " + errors);

        List<Integer> unique = codes.stream()
                .distinct()  // remove duplicates
                .sorted()    // ascending order
                .toList();
        System.out.println("distinct + sorted -> " + unique);

        List<Integer> firstTwo = codes.stream()
                .limit(2) // only take the first N elements
                .toList();
        System.out.println("limit(2) -> " + firstTwo);
    }
}
