package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Static variable: one copy shared by every object of the class. */
public class StaticVariableDemo {

    static int testCount = 0; // shared by all instances

    StaticVariableDemo() {
        testCount++; // every new object increments the SAME shared counter
    }

    public static void main(String[] args) {
        new StaticVariableDemo();
        new StaticVariableDemo();
        new StaticVariableDemo();

        System.out.println("Objects created so far (shared static counter): " + StaticVariableDemo.testCount);
    }
}
