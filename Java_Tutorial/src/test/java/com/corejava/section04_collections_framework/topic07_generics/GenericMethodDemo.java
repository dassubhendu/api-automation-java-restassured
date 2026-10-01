package com.corejava.section04_collections_framework.topic07_generics;

import java.util.List;

/** A generic method: <T> lets one method work safely with any type. */
public class GenericMethodDemo {

    public static void main(String[] args) {
        String first = firstOrNull(List.of("a", "b", "c"));
        System.out.println("firstOrNull(Strings) -> " + first);

        Integer firstNum = firstOrNull(List.of(10, 20, 30));
        System.out.println("firstOrNull(Integers) -> " + firstNum);

        Integer empty = firstOrNull(List.of());
        System.out.println("firstOrNull(empty) -> " + empty);
    }

    public static <T> T firstOrNull(List<T> list) {
        return list.isEmpty() ? null : list.get(0);
    }
}
