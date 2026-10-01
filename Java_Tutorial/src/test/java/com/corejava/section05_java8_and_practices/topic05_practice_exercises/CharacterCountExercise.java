package com.corejava.section05_java8_and_practices.topic05_practice_exercises;

import java.util.LinkedHashMap;
import java.util.Map;

/** Exercise: count the occurrences of each character in a String using a HashMap. */
public class CharacterCountExercise {

    public static void main(String[] args) {
        System.out.println(countCharacters("automation"));
    }

    static Map<Character, Integer> countCharacters(String input) {
        Map<Character, Integer> counts = new LinkedHashMap<>(); // LinkedHashMap keeps output order readable
        for (char c : input.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        return counts;
    }
}
