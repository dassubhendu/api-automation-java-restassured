package com.corejava.section02_oop.topic02_class_object_constructor;

/** A class is the blueprint (fields + methods); an object is a real instance built with new. */
public class ClassAndObjectDemo {

    public static void main(String[] args) {
        User u1 = new User(); // object 1
        u1.name = "Guest";
        u1.job = "Viewer";

        User u2 = new User(); // object 2 - a completely separate copy of the fields
        u2.name = "John";
        u2.job = "QA";

        u1.display();
        u2.display();
    }
}

class User {
    String name; // field: part of the class's state
    String job;

    void display() { // method: part of the class's behaviour
        System.out.println(name + " - " + job);
    }
}
