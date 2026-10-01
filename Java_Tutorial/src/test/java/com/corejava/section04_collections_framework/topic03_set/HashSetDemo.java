package com.corejava.section04_collections_framework.topic03_set;

import java.util.HashSet;
import java.util.Set;

/** HashSet: no duplicates, fastest Set implementation, order is NOT guaranteed. */
public class HashSetDemo {

    public static void main(String[] args) {
        Set<String> tags = new HashSet<>();
        tags.add("smoke");
        tags.add("regression");
        boolean added = tags.add("smoke"); // duplicate - add() returns false

        System.out.println("added duplicate? -> " + added);
        System.out.println("tags.size()      -> " + tags.size()); // 2, not 3

        // Typical use: detect duplicate dropdown options
        String[] options = {"Red", "Green", "Red", "Blue"};
        Set<String> seen = new HashSet<>();
        for (String opt : options) {
            if (!seen.add(opt)) {
                System.out.println("Duplicate option found: " + opt);
            }
        }
    }
}
