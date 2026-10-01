package com.corejava.section05_java8_and_practices.topic05_practice_exercises;

/** Exercise: find the second largest number in an int array without sorting it. */
public class SecondLargestNumberExercise {

    public static void main(String[] args) {
        int[] numbers = {45, 90, 12, 90, 67, 23};
        System.out.println("secondLargest -> " + secondLargest(numbers));
    }

    static int secondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > largest) {
                secondLargest = largest; // the old largest becomes the new second largest
                largest = n;
            } else if (n > secondLargest && n != largest) {
                secondLargest = n; // skip duplicates of the largest value
            }
        }
        return secondLargest;
    }
}
