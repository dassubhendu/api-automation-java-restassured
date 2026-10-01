package com.corejava.section04_collections_framework.topic05_iterating_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Iterator: the only SAFE way to remove elements from a collection while looping over it. */
public class IteratorDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("john", "jane", "guest"));

        Iterator<String> it = users.iterator();
        while (it.hasNext()) {
            String user = it.next();
            if (user.equals("guest")) {
                it.remove(); // safe removal through the iterator itself
            }
        }

        System.out.println("after removing guest -> " + users);
    }
}
