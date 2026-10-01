package com.corejava.section01_java_fundamentals.topic09_strings;

/** Key String methods: trim, contains, split, replace, substring, startsWith, length. */
public class StringMethodsDemo {

    public static void main(String[] args) {
        String raw = "  Welcome, John | Dashboard  ";
        String t = raw.trim();
        System.out.println("trim()         -> \"" + t + "\"");
        System.out.println("length()       -> " + t.length());
        System.out.println("contains()     -> " + t.contains("Dashboard"));
        System.out.println("startsWith()   -> " + t.startsWith("Welcome"));
        System.out.println("toUpperCase()  -> " + t.toUpperCase());
        System.out.println("split(\"|\")[0]  -> " + t.split("\\|")[0].trim());
        System.out.println("substring(9,13)-> " + t.substring(9, 13));
        System.out.println("replace()      -> " + t.replace("John", "Jane"));

        // Cleaning UI text before comparing numbers
        String priceText = "$1,299.00";
        String clean = priceText.replaceAll("[$,]", "");
        double price = Double.parseDouble(clean);
        System.out.println("cleaned price  -> " + price);
    }
}
