package com.corejava.section04_collections_framework.topic06_sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** Comparator: an EXTERNAL, custom order - doesn't require changing the class itself. */
public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("zoe", "Amy", "bob"));

        names.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("case-insensitive -> " + names);

        names.sort(Comparator.comparing(String::length)
                .thenComparing(Comparator.reverseOrder())); // chain with thenComparing()
        System.out.println("by length, then reverse alpha -> " + names);
    }
}
