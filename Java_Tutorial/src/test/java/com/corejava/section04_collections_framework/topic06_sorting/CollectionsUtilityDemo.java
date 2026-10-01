package com.corejava.section04_collections_framework.topic06_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** The Collections utility class: sort, reverse, max, min, frequency, shuffle. */
public class CollectionsUtilityDemo {

    public static void main(String[] args) {
        List<Integer> prices = new ArrayList<>(List.of(499, 99, 250, 99));

        Collections.sort(prices);
        System.out.println("sorted  -> " + prices);

        Collections.reverse(prices);
        System.out.println("reversed-> " + prices);

        System.out.println("max()       -> " + Collections.max(prices));
        System.out.println("min()       -> " + Collections.min(prices));
        System.out.println("frequency(99)-> " + Collections.frequency(prices, 99));
    }
}
