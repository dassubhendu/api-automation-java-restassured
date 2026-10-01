package com.corejava.section02_oop.topic03_encapsulation;

/** Encapsulation: private fields + public getters/setters. The basis of POJOs and Page Objects. */
public class EncapsulationDemo {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setAge(30);

        System.out.println(e.getName() + " is " + e.getAge() + " years old");
        // e.age = -5; // compile error: age is private, cannot be touched directly

        try {
            e.setAge(10); // setter validates before storing
        } catch (IllegalArgumentException ex) {
            System.out.println("Rejected by setter: " + ex.getMessage());
        }
    }
}

class Employee { // a POJO: Plain Old Java Object
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Too young");
        }
        this.age = age;
    }
}
