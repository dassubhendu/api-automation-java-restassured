package com.corejava.section03_exceptions_utilities.topic01_exception_handling;

/** try: run risky code. catch: handle the failure. finally: always runs, even after a return. */
public class TryCatchFinallyDemo {

    public static void main(String[] args) {
        System.out.println("isPresent(\"ok\")  -> " + isElementPresent("ok"));
        System.out.println("isPresent(\"fail\")-> " + isElementPresent("fail"));
    }

    static boolean isElementPresent(String locator) {
        try {
            if (locator.equals("fail")) {
                throw new RuntimeException("Simulated: element not found");
            }
            return true;
        } catch (RuntimeException e) {
            System.out.println("Not found: " + locator + " (" + e.getMessage() + ")");
            return false;
        } finally {
            System.out.println("Check completed for: " + locator); // always runs
        }
    }
}
