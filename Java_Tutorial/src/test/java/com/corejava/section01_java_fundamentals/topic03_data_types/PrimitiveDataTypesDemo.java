package com.corejava.section01_java_fundamentals.topic03_data_types;

/** The 8 primitive types: they store simple values directly, not references. */
public class PrimitiveDataTypesDemo {

    public static void main(String[] args) {
        byte flag = 1;                              // 1 byte  - raw file/stream data
        short port = 8080;                           // 2 bytes - small numeric ranges
        int timeout = 30;                             // 4 bytes - waits, counts, status codes
        long start = System.currentTimeMillis();      // 8 bytes - timestamps, response times
        float rating = 4.5f;                          // 4 bytes - decimal values (less precise)
        double price = 1999.99;                       // 8 bytes - prices, totals in cart checks
        char grade = 'A';                             // 2 bytes - a single character
        boolean isDisplayed = true;                   // true/false - element visible? test passed?

        System.out.println("byte    flag        = " + flag);
        System.out.println("short   port        = " + port);
        System.out.println("int     timeout     = " + timeout);
        System.out.println("long    start       = " + start);
        System.out.println("float   rating      = " + rating);
        System.out.println("double  price       = " + price);
        System.out.println("char    grade       = " + grade);
        System.out.println("boolean isDisplayed = " + isDisplayed);
    }
}
