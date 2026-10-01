package com.corejava.section04_collections_framework.topic01_collections_hierarchy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * java.util hierarchy:
 *   Iterable -> Collection -> List / Set / Queue
 *   Map is a SEPARATE hierarchy: key-value pairs, not a Collection.
 * Best practice: "program to the interface", not the concrete class.
 */
public class CollectionsHierarchyDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();  // interface reference, concrete implementation
        names.add("chrome");
        System.out.println("List<String> -> " + names);

        Set<String> uniqueTags = new HashSet<>();
        uniqueTags.add("smoke");
        System.out.println("Set<String> -> " + uniqueTags);

        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        System.out.println("Map<String,String> -> " + headers);

        // Swapping the implementation later only requires changing the "new ...()" part
    }
}
