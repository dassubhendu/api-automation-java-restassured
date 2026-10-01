package com.corejava.section04_collections_framework.topic03_set;

import java.util.LinkedHashSet;
import java.util.Set;

/** LinkedHashSet: no duplicates, but keeps insertion order (unlike plain HashSet). */
public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> windowHandles = new LinkedHashSet<>();
        windowHandles.add("tab-1");
        windowHandles.add("tab-2");
        windowHandles.add("tab-1"); // ignored: duplicate

        System.out.println("windowHandles -> " + windowHandles); // prints in the order they were added
    }
}
