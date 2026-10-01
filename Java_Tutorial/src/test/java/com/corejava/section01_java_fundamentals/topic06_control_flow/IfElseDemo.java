package com.corejava.section01_java_fundamentals.topic06_control_flow;

/** if / else if / else runs a block only when its boolean condition is true. */
public class IfElseDemo {

    public static void main(String[] args) {
        int statusCode = 404;

        if (statusCode >= 200 && statusCode < 300) {
            System.out.println("Success");
        } else if (statusCode >= 400 && statusCode < 500) {
            System.out.println("Client error"); // this branch runs
        } else {
            System.out.println("Server error");
        }

        // Nested conditions: prefer combining with && / || over deep nesting
        boolean isLoggedIn = true;
        boolean hasPermission = false;
        if (isLoggedIn) {
            if (hasPermission) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied: no permission");
            }
        }
    }
}
