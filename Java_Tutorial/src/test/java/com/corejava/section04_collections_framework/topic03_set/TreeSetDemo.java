package com.corejava.section04_collections_framework.topic03_set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/** TreeSet: no duplicates, keeps elements sorted automatically. null is not allowed. */
public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> sorted = new TreeSet<>(List.of(5, 1, 3));
        System.out.println("sorted -> " + sorted); // [1, 3, 5]

        // TreeSet.add(null) would throw a NullPointerException - unlike HashSet
    }
}
