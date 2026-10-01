package com.corejava.section03_exceptions_utilities.topic02_exception_hierarchy;

/** Errors are JVM-level problems (e.g. StackOverflowError) and should NOT be caught/handled. */
public class ErrorDemo {

    public static void main(String[] args) {
        try {
            recurseForever(0);
        } catch (StackOverflowError e) {
            // Caught here only to show what it looks like - in real code, let Errors crash the JVM
            System.out.println("Caught a StackOverflowError (for demo purposes only)");
        }
    }

    static void recurseForever(int depth) {
        recurseForever(depth + 1); // never terminates -> eventually exhausts the call stack
    }
}
