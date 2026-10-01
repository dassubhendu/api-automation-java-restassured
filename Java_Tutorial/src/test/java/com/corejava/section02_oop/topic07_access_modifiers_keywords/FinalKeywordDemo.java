package com.corejava.section02_oop.topic07_access_modifiers_keywords;

/** final: variable cannot change, method cannot be overridden, class cannot be extended. */
public class FinalKeywordDemo {

    static final int TIMEOUT = 10; // final variable: cannot be reassigned

    public static void main(String[] args) {
        System.out.println("TIMEOUT -> " + TIMEOUT);
        // TIMEOUT = 20; // compile error: cannot assign a value to final variable

        Browser chrome = new Chrome();
        chrome.launch();
    }
}

class Browser {
    final void launch() { // final method: subclasses cannot override this
        System.out.println("Launching browser...");
    }
}

class Chrome extends Browser {
    // void launch() { } // compile error if uncommented: cannot override a final method
}

final class UtilityClass { // final class: cannot be extended at all
    static void help() {
        System.out.println("helping...");
    }
}
