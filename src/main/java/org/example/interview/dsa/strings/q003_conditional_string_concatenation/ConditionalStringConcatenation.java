package org.example.interview.dsa.strings.q003_conditional_string_concatenation;

import java.util.List;
import java.util.stream.Collectors;

public class ConditionalStringConcatenation {

    public static void main(String[] args) {

        List<String> words = List.of("cat", "java", "go", "spring");

        String result = words.stream()
                .filter(word -> word.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining());

        System.out.println(result); // javago
    }
}
