package org.example.interview.java.streams.q007_second_highest_distinct;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestDistinct {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 30, 20, 30, 40, 40);

        Optional<Integer> secondHighest =
                numbers.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();

        secondHighest.ifPresentOrElse(
                value -> System.out.println("Second highest distinct number: " + value),
                () -> System.out.println("No second highest distinct number exists")
        );
    }
}
