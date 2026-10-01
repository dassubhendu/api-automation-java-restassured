package com.corejava.section01_java_fundamentals.topic08_arrays;

import java.util.Arrays;

/** Arrays: fixed-size, zero-indexed containers of values of the same type. */
public class OneDArrayDemo {

    public static void main(String[] args) {
        String[] browsers = {"chrome", "firefox", "edge"};
        System.out.println("First element  -> " + browsers[0]);
        System.out.println("Array length   -> " + browsers.length);

        int[] scores = new int[3]; // defaults to {0, 0, 0}
        scores[1] = 90;
        System.out.println("scores[1]      -> " + scores[1]);

        Arrays.sort(browsers);
        System.out.println("sorted browsers -> " + Arrays.toString(browsers));

        // Limitation: size is fixed at creation; use an ArrayList if it needs to grow
    }
}
