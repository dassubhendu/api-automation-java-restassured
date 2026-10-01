package com.corejava.section01_java_fundamentals.topic10_methods;

/** Overloading: same method name, different parameter list. */
public class MethodOverloadingDemo {

    public static void main(String[] args) {
        MethodOverloadingDemo utils = new MethodOverloadingDemo();

        utils.waitFor(5);                      // calls the 1-parameter version
        utils.waitFor(5, "waiting for login");  // calls the 2-parameter version
    }

    public void waitFor(int seconds) {
        System.out.println("Waiting " + seconds + "s");
    }

    public void waitFor(int seconds, String reason) {
        System.out.println("Waiting " + seconds + "s: " + reason);
    }
}
