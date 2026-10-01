package com.corejava.section04_collections_framework.topic02_list;

import java.util.LinkedList;
import java.util.List;

/** LinkedList: a doubly linked list - fast add/remove at the ends, slower random access than ArrayList. */
public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("step1");
        queue.add("step2");

        queue.addFirst("step0"); // fast: no shifting needed, unlike ArrayList
        queue.addLast("step3");
        System.out.println("queue -> " + queue);

        System.out.println("removeFirst() -> " + queue.removeFirst());
        System.out.println("after removeFirst -> " + queue);

        // Still usable through the common List interface
        List<String> asList = queue;
        System.out.println("get(0) via List interface -> " + asList.get(0));
    }
}
