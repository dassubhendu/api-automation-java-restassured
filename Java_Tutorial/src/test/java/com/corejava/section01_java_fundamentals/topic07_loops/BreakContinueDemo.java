package com.corejava.section01_java_fundamentals.topic07_loops;

/** break exits the loop entirely; continue skips to the next iteration. */
public class BreakContinueDemo {

    public static void main(String[] args) {
        String[] pages = {"Home", "Cart", "Checkout", "Payment"};

        for (String p : pages) {
            if (p.equals("Cart")) {
                continue; // skip Cart, go straight to the next iteration
            }
            if (p.equals("Payment")) {
                break; // stop the loop completely once we reach Payment
            }
            System.out.println("Testing " + p);
        }
    }
}
