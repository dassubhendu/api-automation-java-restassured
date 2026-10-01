package com.corejava.section04_collections_framework.topic05_iterating_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/** forEach + lambda: a concise Java 8 style, available on both List and Map. */
public class LambdaForEachDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("john", "jane", "guest"));

        users.forEach(u -> System.out.println("lambda -> " + u));
        users.forEach(System.out::println); // method reference, same effect

        Map<String, Integer> stock = Map.of("pen", 10, "book", 4);
        stock.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
