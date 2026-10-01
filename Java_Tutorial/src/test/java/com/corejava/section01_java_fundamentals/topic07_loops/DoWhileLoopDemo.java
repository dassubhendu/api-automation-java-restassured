package com.corejava.section01_java_fundamentals.topic07_loops;

/** do-while: like while, but the body always runs at least once. */
public class DoWhileLoopDemo {

    public static void main(String[] args) {
        int attempt = 0;

        do {
            System.out.println("This runs at least once, attempt " + attempt);
            attempt++;
        } while (attempt < 0); // condition is false immediately, but the body already ran once
    }
}
