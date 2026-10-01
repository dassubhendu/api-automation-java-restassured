package com.corejava.section01_java_fundamentals.topic01_jdk_jre_jvm;

/**
 * JDK = JRE + development tools (javac, jar, javadoc).
 * JRE = JVM + core libraries (java.lang, java.util, java.io ...).
 * JVM = loads and executes bytecode, manages memory and garbage collection.
 */
public class JdkJreJvmDemo {

    public static void main(String[] args) {
        // These values are reported by the JVM that is running this program right now
        System.out.println("Java version (comes from the JRE): " + System.getProperty("java.version"));
        System.out.println("JDK vendor (who built the compiler/tools): " + System.getProperty("java.vendor"));
        System.out.println("Operating system (a different JVM exists per OS): " + System.getProperty("os.name"));

        System.out.println();
        System.out.println("How this program got here:");
        System.out.println("1. You write JdkJreJvmDemo.java          -> source code");
        System.out.println("2. javac compiles it (JDK tool)          -> JdkJreJvmDemo.class (bytecode)");
        System.out.println("3. java launches the JVM (part of JRE)   -> JVM executes the bytecode");
        System.out.println("The .class file is the same on every OS; only the JVM that runs it differs.");
    }
}
