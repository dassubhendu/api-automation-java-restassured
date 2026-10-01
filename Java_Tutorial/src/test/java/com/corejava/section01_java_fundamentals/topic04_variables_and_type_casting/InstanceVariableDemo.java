package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Instance variable: belongs to an object; each object gets its own independent copy. */
public class InstanceVariableDemo {

    String browser; // instance variable

    public static void main(String[] args) {
        InstanceVariableDemo chromeRun = new InstanceVariableDemo();
        chromeRun.browser = "chrome";

        InstanceVariableDemo firefoxRun = new InstanceVariableDemo();
        firefoxRun.browser = "firefox";

        System.out.println("chromeRun.browser  = " + chromeRun.browser);
        System.out.println("firefoxRun.browser = " + firefoxRun.browser);
        // each object keeps its own copy of "browser" - changing one never affects the other
    }
}
