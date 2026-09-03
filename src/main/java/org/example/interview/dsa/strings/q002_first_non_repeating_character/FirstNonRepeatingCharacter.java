package org.example.interview.dsa.strings.q002_first_non_repeating_character;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String input = "xpsswiss";

        Character result = findFirstNonRepeating(input);

        System.out.println(result);
    }

    private static Character findFirstNonRepeating(String input) {

        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (char ch : input.toCharArray()) {
            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return null;
    }
}