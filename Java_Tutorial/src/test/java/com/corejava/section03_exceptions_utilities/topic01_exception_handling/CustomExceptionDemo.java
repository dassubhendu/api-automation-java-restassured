package com.corejava.section03_exceptions_utilities.topic01_exception_handling;

/** Custom exception: extend RuntimeException for clear, framework-specific errors. */
public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            loadConfig();
        } catch (FrameworkException e) {
            // Don't swallow: an empty catch hides real failures - log it clearly instead
            System.out.println("FrameworkException caught: " + e.getMessage());
        }
    }

    static void loadConfig() {
        throw new FrameworkException("config.properties not found");
    }
}

class FrameworkException extends RuntimeException {
    public FrameworkException(String msg) {
        super(msg);
    }
}
