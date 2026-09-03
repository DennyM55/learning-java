package org.example.interview.java.streams.q005_stateful_vs_stateless;

import java.util.List;

public class StatefulVsStateless {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 2, 3, 2, 4, 1);

        // Stateless
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();

        // Stateful
        List<Integer> sortedDistinctNumbers = numbers.stream()
                .distinct()
                .sorted()
                .toList();

        System.out.println(evenNumbers);
        System.out.println(sortedDistinctNumbers);
    }
}