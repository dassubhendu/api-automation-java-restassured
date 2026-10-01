package com.corejava.section01_java_fundamentals.topic09_strings;

/** StringBuilder is mutable and fast - use it to build strings inside loops. */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Test");
        sb.append("-").append(101);
        System.out.println("after append -> " + sb);   // Test-101

        sb.reverse();
        System.out.println("after reverse -> " + sb);  // 101-tseT

        // Building a string inside a loop - avoids creating a new String on every iteration
        StringBuilder csv = new StringBuilder();
        String[] names = {"chrome", "firefox", "edge"};
        for (int i = 0; i < names.length; i++) {
            csv.append(names[i]);
            if (i < names.length - 1) {
                csv.append(",");
            }
        }
        System.out.println("csv -> " + csv);
    }
}
