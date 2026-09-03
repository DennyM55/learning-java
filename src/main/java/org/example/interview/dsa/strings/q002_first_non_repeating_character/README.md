# Question

Find the first non-repeating character in a String.

Example:

Input: `swiss`

Output: `w`

# Explanation

First count how many times each character appears.

For `swiss`:

- `s` → 3
- `w` → 1
- `i` → 1

Then scan the original string from left to right.

The first character whose count is `1` is `w`.

Time Complexity: `O(n)`

Space Complexity: `O(n)`

# Interview Answer

"First I count the frequency of every character. Then I traverse the original string again and return the first character whose frequency is one. This keeps the original order and gives O(n) time."

# Solution

See `FirstNonRepeatingCharacter.java`.

# Status

DONE