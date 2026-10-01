package com.corejava.section01_java_fundamentals.topic02_program_structure;

import java.time.LocalDate; // import: bring in a class from another package

/**
 * The skeleton every Java file follows:
 * package -> import -> class -> main() -> statements/blocks.
 * File name must match the public class name: HelloAutomation.java.
 */
public class HelloAutomation {

    // main() is the entry point: the JVM starts execution here
    public static void main(String[] args) {
        System.out.println("Hello, Automation!");
        System.out.println("Today is " + LocalDate.now());
    }
}
