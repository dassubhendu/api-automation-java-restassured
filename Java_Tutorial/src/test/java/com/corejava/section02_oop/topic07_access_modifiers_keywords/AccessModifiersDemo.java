package com.corejava.section02_oop.topic07_access_modifiers_keywords;

/**
 * Access modifiers control visibility:
 * public    -> visible everywhere
 * protected -> visible in the same package AND in subclasses (even in other packages)
 * (default) -> visible only in the same package (no modifier written)
 * private   -> visible only inside the same class
 *
 * Rule of thumb: fields private, helper methods protected in a BaseTest,
 * page actions and tests public.
 */
public class AccessModifiersDemo {

    public static void main(String[] args) {
        Config config = new Config();
        System.out.println("public baseUrl   -> " + config.baseUrl);
        System.out.println("package timeout  -> " + config.timeout);
        System.out.println("protected browser-> " + config.browser);
        // config.secretKey is private -> not accessible here, would be a compile error
        System.out.println("secretKey via getter -> " + config.getSecretKey());
    }
}

class Config {
    public String baseUrl = "https://reqres.in";
    int timeout = 10;                 // default (package-private)
    protected String browser = "chrome";
    private String secretKey = "abc123";

    public String getSecretKey() {
        return secretKey; // the only way outside code can read a private field
    }
}
