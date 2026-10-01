package com.corejava.section01_java_fundamentals.topic07_loops;

/** for-each: the simplest way to walk through arrays and collections. */
public class ForEachLoopDemo {

    public static void main(String[] args) {
        String[] pages = {"Home", "Cart", "Checkout"};

        for (String page : pages) {
            System.out.println("Testing " + page);
        }
    }
}
