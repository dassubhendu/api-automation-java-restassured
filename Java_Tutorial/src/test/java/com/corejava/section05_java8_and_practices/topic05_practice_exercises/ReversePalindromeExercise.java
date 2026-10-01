package com.corejava.section05_java8_and_practices.topic05_practice_exercises;

/** Exercise: reverse a String without reverse(), and check whether it is a palindrome. */
public class ReversePalindromeExercise {

    public static void main(String[] args) {
        System.out.println("reverse(\"hello\") -> " + reverse("hello"));
        System.out.println("isPalindrome(\"madam\") -> " + isPalindrome("madam"));
        System.out.println("isPalindrome(\"hello\")  -> " + isPalindrome("hello"));
    }

    static String reverse(String input) {
        char[] chars = input.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }

    static boolean isPalindrome(String input) {
        return input.equals(reverse(input));
    }
}
