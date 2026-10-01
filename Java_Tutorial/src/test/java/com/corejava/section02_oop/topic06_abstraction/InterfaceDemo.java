package com.corejava.section02_oop.topic06_abstraction;

/** Interface: a contract of methods. A class can implement many interfaces. Java 8+ allows default/static methods. */
public class InterfaceDemo {

    public static void main(String[] args) {
        Reportable report = msg -> System.out.println("Custom log: " + msg); // lambda implements log()
        report.log("step 1 done");
        report.pass(); // default method, inherited for free

        // A class can implement several interfaces - not shown here to keep it simple,
        // but e.g.: class ChromeDriver implements WebDriver, TakesScreenshot { ... }
    }
}

interface Reportable {
    void log(String msg); // abstract method - part of the contract

    default void pass() { // Java 8+: interfaces can provide a default implementation
        log("PASS");
    }

    static Reportable console() { // Java 8+: interfaces can also have static methods
        return msg -> System.out.println(msg);
    }
}
