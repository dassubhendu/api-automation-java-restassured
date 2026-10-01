package com.corejava.section05_java8_and_practices.topic05_practice_exercises;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/** Exercise: remove duplicates from a List while keeping the original order (LinkedHashSet). */
public class RemoveDuplicatesPreserveOrderExercise {

    public static void main(String[] args) {
        List<String> browsers = List.of("chrome", "firefox", "chrome", "edge", "firefox");

        Set<String> unique = new LinkedHashSet<>(browsers); // dedupes AND keeps insertion order
        System.out.println("original -> " + browsers);
        System.out.println("unique   -> " + unique);
    }
}
