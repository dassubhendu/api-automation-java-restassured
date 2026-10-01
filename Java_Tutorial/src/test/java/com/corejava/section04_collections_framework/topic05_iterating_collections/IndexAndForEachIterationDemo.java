package com.corejava.section04_collections_framework.topic05_iterating_collections;

import java.util.ArrayList;
import java.util.List;

/** Index loop works only for Lists; for-each is the simplest read-only traversal. */
public class IndexAndForEachIterationDemo {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("john", "jane", "guest"));

        for (int i = 0; i < users.size(); i++) { // index loop: needs get(i), only works on List
            System.out.println("index loop -> " + users.get(i));
        }

        for (String u : users) { // for-each: simplest read-only traversal
            System.out.println("for-each   -> " + u);
        }
    }
}
