package com.corejava.section03_exceptions_utilities.topic02_exception_hierarchy;

/** Unchecked exceptions (RuntimeException and its subclasses) surface at RUNTIME, not compile time. */
public class UncheckedExceptionDemo {

    public static void main(String[] args) {
        safeCall(() -> {
            int[] arr = new int[2];
            int x = arr[5]; // ArrayIndexOutOfBoundsException
        });

        safeCall(() -> {
            String s = null;
            s.length(); // NullPointerException
        });

        safeCall(() -> {
            int x = Integer.parseInt("abc"); // NumberFormatException
        });

        safeCall(() -> {
            int x = 10 / 0; // ArithmeticException
        });
    }

    static void safeCall(Runnable risky) {
        try {
            risky.run();
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
    }
}
