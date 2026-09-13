package org.example.interview.dsa.strings.q002_first_non_repeating_character;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {

    public static Optional<Character> findFirstUnique(String text) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char character : text.toCharArray()) {
            // Use zero when absent, then add one occurrence.
            counts.put(character, counts.getOrDefault(character, 0) + 1);
        }

        for (char character : text.toCharArray()) {
            // Reading the original string preserves the required order.
            if (counts.get(character) == 1) {
                return Optional.of(character);
            }
        }

        return Optional.empty(); // No unique character exists.
    }

    public static void main(String[] args) {
        System.out.println(findFirstUnique("swiss").orElse(null)); // w
    }
}