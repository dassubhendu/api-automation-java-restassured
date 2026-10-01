package com.corejava.section05_java8_and_practices.topic02_streams_api;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/** Terminal stream operations trigger the pipeline: collect, count, anyMatch, allMatch, findFirst. */
public class StreamTerminalOperationsDemo {

    public static void main(String[] args) {
        List<Integer> codes = List.of(200, 404, 201, 500, 200);

        long ok = codes.stream().filter(c -> c == 200).count();
        System.out.println("count(200) -> " + ok);

        boolean anyError = codes.stream().anyMatch(c -> c >= 400);
        System.out.println("anyMatch(>=400) -> " + anyError);

        boolean allSuccess = codes.stream().allMatch(c -> c < 300);
        System.out.println("allMatch(<300)  -> " + allSuccess);

        Optional<Integer> first = codes.stream().filter(c -> c >= 400).findFirst();
        System.out.println("findFirst(error) -> " + first.orElse(-1));

        List<String> emails = List.of("a@reqres.in", "b@gmail.com", "c@reqres.in");
        List<String> reqresEmails = emails.stream()
                .filter(e -> e.endsWith("@reqres.in"))
                .collect(Collectors.toList()); // classic collect() form
        System.out.println("reqresEmails -> " + reqresEmails);
    }
}
