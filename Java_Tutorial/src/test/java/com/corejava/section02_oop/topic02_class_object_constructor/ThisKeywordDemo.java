package com.corejava.section02_oop.topic02_class_object_constructor;

/** this refers to the current object; this(...) calls another constructor of the same class. */
public class ThisKeywordDemo {

    public static void main(String[] args) {
        Profile p1 = new Profile();                  // uses this(...) internally
        Profile p2 = new Profile("John", "QA");

        p1.display();
        p2.display();
    }
}

class Profile {
    String name;
    String job;

    Profile() {
        this("Guest", "Viewer"); // calls the other constructor below
    }

    Profile(String name, String job) {
        this.name = name; // this.field = parameter, resolves the naming clash
        this.job = job;
    }

    void display() {
        System.out.println(name + " - " + job);
    }
}
