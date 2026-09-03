# Question

What is the difference between stateful and stateless operations in Java Streams?

# Explanation

A stateless operation can process the current element without remembering other elements.

Examples:

`filter()`, `map()`

A stateful operation needs information about other elements before it can produce the correct result.

Examples:

`sorted()`, `distinct()`, `limit()`, `skip()`

Example:

`filter()` can check each number independently.

`sorted()` must consider multiple elements to determine their order.

# Interview Answer

"Stateless stream operations process each element independently and do not need information about previously processed elements. Examples are filter and map. Stateful operations need information about other elements or maintain state while processing. Examples include sorted, distinct, limit and skip. Stateful operations may require buffering and can have a higher cost, especially with parallel streams."

# Solution

See `StatefulVsStateless.java`.

# Status

DONE