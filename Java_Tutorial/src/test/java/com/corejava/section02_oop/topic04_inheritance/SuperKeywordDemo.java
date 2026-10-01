package com.corejava.section02_oop.topic04_inheritance;

/** super calls the parent class's constructor or a parent method. */
public class SuperKeywordDemo {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        car.display();
    }
}

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called for: " + brand);
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}

class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand); // calls Vehicle's constructor first
        this.model = model;
    }

    @Override
    void display() {
        super.display(); // calls Vehicle's display() before adding more detail
        System.out.println("Model: " + model);
    }
}
