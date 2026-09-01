package org.example.streams.debugging;

import java.util.List;

public class PeekExample {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3);

        List<Integer> result = nums.stream()
                .peek(System.out::println)
                .map(n -> n * 2)
                .toList();

        System.out.println(result);
    }
}