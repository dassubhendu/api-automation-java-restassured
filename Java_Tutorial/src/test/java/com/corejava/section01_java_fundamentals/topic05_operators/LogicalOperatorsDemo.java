package com.corejava.section01_java_fundamentals.topic05_operators;

/** Logical operators: && (AND), || (OR), ! (NOT) — combine boolean conditions. */
public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        int passed = 18;
        int total = 20;
        double rate = passed * 100.0 / total; // 90.0

        boolean allPassed = passed == total;              // false
        boolean goodRun = rate >= 80 && !allPassed;        // true: rate is 90 AND not all passed
        boolean needsAttention = rate < 50 || allPassed;   // false

        System.out.println("allPassed      -> " + allPassed);
        System.out.println("goodRun        -> " + goodRun);
        System.out.println("needsAttention -> " + needsAttention);
    }
}
