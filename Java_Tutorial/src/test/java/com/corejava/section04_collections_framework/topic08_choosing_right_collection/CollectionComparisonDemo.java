package com.corejava.section04_collections_framework.topic08_choosing_right_collection;

/** A quick reference for picking the right collection - prints the decision table used in practice. */
public class CollectionComparisonDemo {

    public static void main(String[] args) {
        printRow("Class", "Order", "Duplicates", "Null", "Best used for");
        printRow("ArrayList", "Insertion", "Yes", "Yes", "Element lists, test data, API arrays");
        printRow("LinkedList", "Insertion", "Yes", "Yes", "Frequent add/remove at the ends, queues");
        printRow("HashSet", "None", "No", "One", "Unique values, window handles");
        printRow("LinkedHashSet", "Insertion", "No", "One", "Unique values in display order");
        printRow("TreeSet", "Sorted", "No", "No", "Sorted unique values");
        printRow("HashMap", "None", "Keys: no", "One key", "Headers, config, lookups");
        printRow("LinkedHashMap", "Insertion", "Keys: no", "One key", "Ordered JSON payloads, reports");
        printRow("TreeMap", "Sorted by key", "Keys: no", "No key", "Sorted summaries");
    }

    private static void printRow(String... cols) {
        System.out.printf("%-15s %-14s %-10s %-9s %-40s%n", (Object[]) cols);
    }
}
