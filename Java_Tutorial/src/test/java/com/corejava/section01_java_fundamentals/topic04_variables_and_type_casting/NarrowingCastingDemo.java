package com.corejava.section01_java_fundamentals.topic04_variables_and_type_casting;

/** Narrowing casting: bigger type -> smaller type. Needs an explicit cast and can lose data. */
public class NarrowingCastingDemo {

    public static void main(String[] args) {
        double price = 99.78;
        int rounded = (int) price; // explicit cast; the decimal part is dropped, not rounded
        System.out.println("double " + price + " narrowed to int " + rounded);

        long bigNumber = 130L;
        byte smallNumber = (byte) bigNumber; // fits in byte's range, so no data lost here
        System.out.println("long " + bigNumber + " narrowed to byte " + smallNumber);

        int overflow = 300;
        byte lost = (byte) overflow; // byte range is -128..127, so this value overflows
        System.out.println("int " + overflow + " narrowed to byte (data lost!) -> " + lost);
    }
}
