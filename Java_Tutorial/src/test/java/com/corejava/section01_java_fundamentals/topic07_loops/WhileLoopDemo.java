package com.corejava.section01_java_fundamentals.topic07_loops;

/** while: repeats while a condition is true - e.g. polling until a page is ready. */
public class WhileLoopDemo {

    public static void main(String[] args) {
        int retries = 0;
        boolean loaded = false;

        while (!loaded && retries < 3) {
            System.out.println("Checking if page is loaded... attempt " + (retries + 1));
            loaded = fakePageIsLoaded(retries); // simulate polling a real page
            retries++;
        }

        System.out.println(loaded ? "Page loaded!" : "Gave up after " + retries + " retries");
    }

    private static boolean fakePageIsLoaded(int attempt) {
        return attempt == 2; // pretend the page becomes ready on the 3rd check
    }
}
