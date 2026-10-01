package com.corejava.section03_exceptions_utilities.topic03_wrapper_classes;

/** Parsing turns UI/API text into numbers, and valueOf() turns numbers back into text. */
public class WrapperParsingDemo {

    public static void main(String[] args) {
        String cartText = "3"; // e.g. text read from driver.findElement(...).getText()
        int items = Integer.parseInt(cartText);
        System.out.println("items -> " + items);

        double total = Double.parseDouble("249.99");
        System.out.println("total -> " + total);

        boolean flag = Boolean.parseBoolean("true");
        System.out.println("flag -> " + flag);

        String code = String.valueOf(404); // number -> text
        System.out.println("code -> " + code);

        System.out.println("Integer.MAX_VALUE -> " + Integer.MAX_VALUE);
    }
}
