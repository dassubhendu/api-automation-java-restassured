package com.corejava.section04_collections_framework.topic06_sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Comparable: the class defines its OWN natural sort order via compareTo(). */
public class ComparableDemo {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Mouse", 25));
        products.add(new Product("Laptop", 999));
        products.add(new Product("Keyboard", 45));

        Collections.sort(products); // uses Product's own compareTo()
        System.out.println(products);
    }
}

class Product implements Comparable<Product> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price); // natural order: by price, ascending
    }

    @Override
    public String toString() {
        return name + "(" + price + ")";
    }
}
