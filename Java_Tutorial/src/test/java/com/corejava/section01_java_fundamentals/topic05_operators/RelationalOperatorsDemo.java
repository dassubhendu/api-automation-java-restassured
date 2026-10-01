package com.corejava.section01_java_fundamentals.topic05_operators;

/** Relational operators: ==  !=  >  <  >=  <=  — they always return a boolean. */
public class RelationalOperatorsDemo {

    public static void main(String[] args) {
        int passed = 18;
        int total = 20;

        System.out.println("passed == total -> " + (passed == total));
        System.out.println("passed != total -> " + (passed != total));
        System.out.println("passed > total  -> " + (passed > total));
        System.out.println("passed < total  -> " + (passed < total));
        System.out.println("passed >= 18    -> " + (passed >= 18));
        System.out.println("passed <= 17    -> " + (passed <= 17));
    }
}
