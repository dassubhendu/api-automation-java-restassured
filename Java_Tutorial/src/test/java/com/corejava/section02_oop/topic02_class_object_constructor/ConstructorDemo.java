package com.corejava.section02_oop.topic02_class_object_constructor;

/** Constructor: same name as the class, no return type, initializes the object. */
public class ConstructorDemo {

    public static void main(String[] args) {
        Account a1 = new Account();                 // default (no-arg) constructor
        Account a2 = new Account("john", "admin");   // parameterized constructor

        a1.display();
        a2.display();
    }
}

class Account {
    String username;
    String role;

    Account() {
        // Java only adds a no-arg constructor automatically if you write NONE at all.
        // Since we defined a parameterized constructor below, we must write this one explicitly.
        this.username = "guest";
        this.role = "viewer";
    }

    Account(String username, String role) {
        this.username = username;
        this.role = role;
    }

    void display() {
        System.out.println(username + " - " + role);
    }
}
