# Question

Explain Java Streams. What are they, why do we use them, and how do they work?

# Explanation

A Stream lets us process a sequence of data through a pipeline of operations.

Example:

`List -> filter -> map -> collect`

Streams do not store data. They process data coming from a source such as a List.

Example:

Given:

`[1, 2, 3, 4, 5, 6]`

Get only even numbers and multiply them by 10:

`[1,2,3,4,5,6] -> filter -> [2,4,6] -> map -> [20,40,60]`

A stream pipeline normally contains:

1. Source — where the data comes from.
2. Intermediate operations — filter/map/sorted etc.
3. Terminal operation — collect/forEach/reduce etc.

Intermediate operations are lazy. Processing starts when a terminal operation is called.

# Interview Answer

"Java Streams provide a declarative way to process collections of data. A stream pipeline has a source, intermediate operations such as filter and map, and a terminal operation such as collect. Intermediate operations are lazy and execute when the terminal operation is invoked. Streams also make operations such as filtering, transformation and aggregation easier to express and can support parallel processing."

# Solution

See `JavaStreamsExample.java`.

# Status

DONE