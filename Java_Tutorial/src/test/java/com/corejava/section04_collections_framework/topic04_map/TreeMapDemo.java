package com.corejava.section04_collections_framework.topic04_map;

import java.util.Map;
import java.util.TreeMap;

/** TreeMap: sorted by key automatically. */
public class TreeMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> stock = new TreeMap<>();
        stock.put("pen", 10);
        stock.put("book", 4);
        stock.put("eraser", 20);

        System.out.println("stock (sorted by key) -> " + stock); // {book=4, eraser=20, pen=10}
    }
}
