package com.corejava.section05_java8_and_practices.topic03_best_practices;

import java.util.ArrayList;
import java.util.List;

/** Habits that keep a Java automation framework readable and reliable. */
public class BestPracticesDemo {

    private static final String BASE_URL = "https://reqres.in"; // 5. externalize config in real projects

    public static void main(String[] args) {
        // 1. Naming conventions: classes PascalCase, methods/variables camelCase, constants UPPER_CASE
        int retryCount = 3;

        // 2. equals(), not == , when comparing Strings/wrapper objects by content
        String expected = "PASS";
        String actual = new String("PASS");
        System.out.println("equals() comparison -> " + expected.equals(actual));

        // 3. Program to interfaces, not concrete classes
        List<String> results = new ArrayList<>();
        results.add("test1: PASS");

        // 4. No hard-coded waits: Thread.sleep(5000) would block for no reason; prefer
        //    condition-based waits like WebDriverWait in real Selenium code.

        // 6. Handle exceptions properly: never an empty catch block
        try {
            riskyStep();
        } catch (RuntimeException e) {
            System.out.println("Logged clearly instead of swallowing: " + e.getMessage());
        }

        System.out.println("BASE_URL -> " + BASE_URL + ", retryCount -> " + retryCount);
        System.out.println("results -> " + results);
    }

    private static void riskyStep() {
        throw new RuntimeException("simulated failure");
    }
}
