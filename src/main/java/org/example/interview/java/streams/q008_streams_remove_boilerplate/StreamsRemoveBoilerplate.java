package org.example.interview.java.streams.q008_streams_remove_boilerplate;

import java.util.ArrayList;
import java.util.List;

public class StreamsRemoveBoilerplate {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Traditional approach
        List<Integer> traditionalResult = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                traditionalResult.add(number * 10);
            }
        }

        // Stream approach
        List<Integer> streamResult = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 10)
                .toList();

        System.out.println(traditionalResult);
        System.out.println(streamResult);
    }
}