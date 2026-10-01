package com.corejava.section05_java8_and_practices.topic04_interview_questions;

/** Core Java interview questions every automation tester should be able to answer, with short answers. */
public class InterviewQuestionsAndAnswers {

    public static void main(String[] args) {
        print("1. Difference between == and equals()?",
                "== compares references (object identity) for objects, or values for primitives. " +
                        "equals() compares content, and can be overridden per class.");

        print("2. String vs StringBuilder vs StringBuffer?",
                "String is immutable. StringBuilder is mutable and fast but not thread-safe. " +
                        "StringBuffer is mutable and thread-safe (synchronized), so slower.");

        print("3. Why is String immutable?",
                "For security, caching in the String pool, thread-safety, and safe use as a HashMap key.");

        print("4. Method overloading vs overriding?",
                "Overloading: same name, different parameters, resolved at compile time. " +
                        "Overriding: subclass redefines a parent method with the same signature, resolved at runtime.");

        print("5. Abstract class vs interface?",
                "Abstract class can have state, constructors and a mix of abstract/concrete methods; " +
                        "a class extends only one. Interface is a pure contract; a class can implement many.");

        print("6. final vs finally vs finalize?",
                "final: makes a variable/method/class unchangeable. finally: a block that always runs after try/catch. " +
                        "finalize(): a deprecated method the GC used to call before reclaiming an object.");

        print("7. Checked vs unchecked exceptions?",
                "Checked exceptions must be handled or declared at compile time (e.g. IOException). " +
                        "Unchecked (RuntimeException and subclasses) surface only at runtime.");

        print("8. ArrayList vs LinkedList?",
                "ArrayList: resizable array, fast random access (get by index). " +
                        "LinkedList: doubly linked list, fast insert/remove at the ends, slower random access.");

        print("9. List vs Set vs Map?",
                "List: ordered, allows duplicates. Set: no duplicates. Map: key-value pairs with unique keys.");

        print("10. HashMap vs Hashtable vs ConcurrentHashMap?",
                "HashMap: not thread-safe, allows one null key. Hashtable: thread-safe (fully synchronized), legacy, no nulls. " +
                        "ConcurrentHashMap: thread-safe with better concurrency than Hashtable, no null keys/values.");

        print("11. How does HashMap work internally?",
                "Keys are hashed via hashCode() into buckets (an array of linked lists/trees). " +
                        "equals() resolves collisions within the same bucket to find/replace the exact key.");

        print("12. Comparable vs Comparator?",
                "Comparable: defines a class's own natural order via compareTo(), implemented inside the class. " +
                        "Comparator: an external, custom order, passed in separately and reusable in multiple ways.");
    }

    private static void print(String question, String answer) {
        System.out.println(question);
        System.out.println("   -> " + answer);
        System.out.println();
    }
}
