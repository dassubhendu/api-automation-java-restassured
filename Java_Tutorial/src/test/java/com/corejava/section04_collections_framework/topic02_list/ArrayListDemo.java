package com.corejava.section04_collections_framework.topic02_list;

import java.util.ArrayList;
import java.util.List;

/** ArrayList: a resizable array. Keeps insertion order, allows duplicates/nulls. The default choice. */
public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Laptop");
        items.add("Mouse");
        items.add("Laptop");        // duplicates are allowed
        items.add(1, "Keyboard");   // insert at a specific index
        System.out.println("items -> " + items); // [Laptop, Keyboard, Mouse, Laptop]

        System.out.println("get(0)        -> " + items.get(0));
        items.set(2, "Monitor");
        System.out.println("after set(2)  -> " + items);
        items.remove("Laptop"); // removes the FIRST match only
        System.out.println("after remove  -> " + items);
        System.out.println("size()        -> " + items.size());
        System.out.println("contains()    -> " + items.contains("Mouse"));
        System.out.println("indexOf()     -> " + items.indexOf("Monitor"));
        System.out.println("isEmpty()     -> " + items.isEmpty());
    }
}
