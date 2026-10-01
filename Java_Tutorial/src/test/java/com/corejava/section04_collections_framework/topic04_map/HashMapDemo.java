package com.corejava.section04_collections_framework.topic04_map;

import java.util.HashMap;
import java.util.Map;

/** HashMap: unique keys map to values. Fast, no guaranteed order, allows one null key. */
public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer abc123");

        System.out.println("get(\"Content-Type\")   -> " + headers.get("Content-Type"));
        System.out.println("getOrDefault(\"Accept\")-> " + headers.getOrDefault("Accept", "*/*"));
        System.out.println("containsKey()          -> " + headers.containsKey("Authorization"));

        for (Map.Entry<String, String> e : headers.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        headers.remove("Authorization");
        System.out.println("after remove -> " + headers);
    }
}
