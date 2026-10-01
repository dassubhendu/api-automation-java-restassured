package com.corejava.section01_java_fundamentals.topic10_methods;

/** Static methods are called on the class; instance methods need an object. */
public class StaticVsInstanceMethodDemo {

    public static void main(String[] args) {
        // static: call directly on the class, no object needed
        int sum = StaticVsInstanceMethodDemo.add(2, 3);
        System.out.println("static add(2, 3) -> " + sum);

        // instance: needs an object created with new
        StaticVsInstanceMethodDemo utils = new StaticVsInstanceMethodDemo();
        String url = utils.buildUrl("https://reqres.in", "/api/users");
        System.out.println("instance buildUrl -> " + url);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public String buildUrl(String base, String path) {
        return base + path;
    }
}
