# Question

Find the second-highest number from a list using Java Streams.

Example:

Input: `[10, 40, 20, 30]`

Output: `30`

# Explanation

Sort the numbers in descending order:

`[40, 30, 20, 10]`

Then:

`sorted(reverseOrder) -> skip(1) -> findFirst()`

- `sorted(reverseOrder)` puts the highest number first.
- `skip(1)` skips the highest number.
- `findFirst()` returns the next number.

Time Complexity: `O(n log n)` because of sorting.

# Interview Answer

"I sort the stream in descending order, skip the first element, which is the highest, and use findFirst to get the second-highest element."

# Solution

See `SecondHighest.java`.

# Status

DONE