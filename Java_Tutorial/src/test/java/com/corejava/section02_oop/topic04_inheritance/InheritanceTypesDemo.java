package com.corejava.section02_oop.topic04_inheritance;

/** extends: a child class inherits the fields/methods of its parent. A class can extend only one. */
public class InheritanceTypesDemo {

    public static void main(String[] args) {
        // Single inheritance: Dog extends Animal
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel inheritance: Puppy extends Dog extends Animal
        Puppy puppy = new Puppy();
        puppy.eat();   // inherited from Animal
        puppy.bark();  // inherited from Dog
        puppy.play();  // defined in Puppy

        // Hierarchical inheritance: Cat also extends Animal, as a sibling of Dog
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal { // single inheritance
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog { // multilevel inheritance: Puppy -> Dog -> Animal
    void play() {
        System.out.println("Puppy plays");
    }
}

class Cat extends Animal { // hierarchical inheritance: Dog and Cat share the same parent
    void meow() {
        System.out.println("Cat meows");
    }
}
