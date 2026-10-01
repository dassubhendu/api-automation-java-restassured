package com.corejava.section04_collections_framework.topic04_map;

import java.util.LinkedHashMap;
import java.util.Map;

/** LinkedHashMap: keeps insertion order - handy for building readable JSON payloads. */
public class LinkedHashMapDemo {

    public static void main(String[] args) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("name", "John");
        body.put("job", "QA Engineer");

        System.out.println("body -> " + body); // prints in the exact order fields were added
        // A plain HashMap could print job before name - LinkedHashMap keeps the JSON readable
    }
}
