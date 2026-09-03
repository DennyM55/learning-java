# Question

Given a list of strings, find the first two elements whose length is even and concatenate them.

Example:

Input: `["cat", "java", "dog", "code", "spring"]`

Even-length elements: `java`, `code`

Output: `javacode`

# Explanation

Use a Stream:

`filter -> limit(2) -> joining`

- `filter` keeps strings whose length is even.
- `limit(2)` takes only the first two.
- `joining()` concatenates them.

Time Complexity: `O(n)`

# Interview Answer

"I filter the strings whose length is even, take the first two using limit(2), and concatenate them using Collectors.joining()."

# Solution

See `ConditionalStringConcatenation.java`.

# Status

DONE