package com.corejava.section02_oop.topic01_four_pillars_overview;

/**
 * A quick map of the four OOP pillars to the automation patterns covered in
 * later topics of this section. Each pillar gets its own dedicated demo folder.
 */
public class FourPillarsOverview {

    public static void main(String[] args) {
        System.out.println("ENCAPSULATION -> hide data behind private fields, expose it through methods.");
        System.out.println("                 Example: Page Objects keep locators private; POJOs wrap API payloads.");
        System.out.println();
        System.out.println("INHERITANCE   -> a child class reuses the fields and methods of a parent class.");
        System.out.println("                 Example: every test class extends a BaseTest that opens/closes the browser.");
        System.out.println();
        System.out.println("POLYMORPHISM  -> one reference, many forms (overloading and overriding).");
        System.out.println("                 Example: WebDriver driver = new ChromeDriver() or new FirefoxDriver().");
        System.out.println();
        System.out.println("ABSTRACTION   -> expose WHAT an object does, hide HOW it does it.");
        System.out.println("                 Example: WebDriver is an interface; each browser driver implements it.");
    }
}
