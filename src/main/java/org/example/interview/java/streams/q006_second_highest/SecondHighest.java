package org.example.interview.java.streams.q006_second_highest;

import java.util.Comparator;
import java.util.List;

public class SecondHighest {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 10, 10, 40, 20, 30);

        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(secondHighest);
    }
}