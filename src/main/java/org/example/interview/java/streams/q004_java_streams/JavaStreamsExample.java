package org.example.interview.java.streams.q004_java_streams;

import java.util.List;

public class JavaStreamsExample {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 10)
                .toList();

        System.out.println(result);
    }
}