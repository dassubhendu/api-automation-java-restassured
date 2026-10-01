package com.corejava.section03_exceptions_utilities.topic03_wrapper_classes;

import java.util.ArrayList;
import java.util.List;

/** Wrapper classes (Integer, Double, Boolean...) are object versions of primitives. */
public class AutoboxingUnboxingDemo {

    public static void main(String[] args) {
        int count = 5;
        Integer boxed = count; // autoboxing: primitive -> wrapper, done automatically
        int back = boxed;      // unboxing: wrapper -> primitive

        System.out.println("boxed -> " + boxed);
        System.out.println("back  -> " + back);

        // Collections can only store objects, never raw primitives
        List<Integer> ids = new ArrayList<>();
        ids.add(101); // int autoboxed into Integer
        System.out.println("ids -> " + ids);

        // Watch out: unboxing a null Integer throws a NullPointerException
        Integer missing = null;
        try {
            int crash = missing; // unboxing null
        } catch (NullPointerException e) {
            System.out.println("Unboxing null threw NullPointerException as expected");
        }
    }
}
