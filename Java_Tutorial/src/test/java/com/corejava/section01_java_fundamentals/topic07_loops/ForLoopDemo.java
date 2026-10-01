package com.corejava.section01_java_fundamentals.topic07_loops;

/** for: use when the number of iterations is known in advance. */
public class ForLoopDemo {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Attempt " + i);
        }

        // counting down
        for (int i = 3; i >= 1; i--) {
            System.out.println("Countdown " + i);
        }
    }
}
