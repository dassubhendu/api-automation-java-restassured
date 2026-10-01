package com.corejava.section04_collections_framework.topic05_iterating_collections;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/** Removing from a List inside a for-each throws ConcurrentModificationException. Use removeIf() instead. */
public class ConcurrentModificationPitfallDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("john", "jane", "guest"));

        try {
            for (String u : users) {
                if (u.startsWith("j")) {
                    users.remove(u); // WRONG: modifying the list while iterating it
                }
            }
        } catch (ConcurrentModificationException e) {
            System.out.println("Caught as expected: " + e.getClass().getSimpleName());
        }

        List<String> usersAgain = new ArrayList<>(List.of("john", "jane", "guest"));
        usersAgain.removeIf(u -> u.startsWith("j")); // RIGHT way (Java 8+)
        System.out.println("after removeIf -> " + usersAgain);
    }
}
