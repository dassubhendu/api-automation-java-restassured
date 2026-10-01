package com.corejava.section03_exceptions_utilities.topic04_enums;

/** Enums can have constructors, fields and methods, just like a regular class. */
public class EnumWithFieldsAndMethodsDemo {

    public static void main(String[] args) {
        Env env = Env.valueOf("QA");
        System.out.println("Environment: " + env + " -> " + env.getUrl());

        for (Env e : Env.values()) {
            System.out.println(e.name() + " -> " + e.getUrl());
        }
    }
}

enum Env {
    QA("https://qa.example.com"),
    STAGE("https://stage.example.com"),
    PROD("https://www.example.com");

    private final String url;

    Env(String url) { // enum constructors are always private/package-private
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
