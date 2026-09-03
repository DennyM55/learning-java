package org.example.interview.dsa.strings.q003_conditional_string_concatenation;

import java.util.List;
import java.util.stream.Collectors;

public class ConditionalStringConcatenation {

    public static void main(String[] args) {

        List<String> values = List.of("cat", "java", "dog", "code", "spring");

        String result = values.stream()
                .filter(value -> value.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}