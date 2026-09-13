# Question

What is the difference between ArrayList and LinkedList in Java?

# Explanation

Both `ArrayList` and `LinkedList` implement the `List` interface, so both:

- maintain insertion order
- allow duplicate values
- allow `null`
- provide operations such as `add()`, `get()` and `remove()`

The major difference is how they store elements internally.

## ArrayList

`ArrayList` stores elements in a resizable array.

Conceptually:

`[A][B][C][D]`

The elements are stored by index.

Therefore:

`list.get(2)`

can directly access index `2`.

Average access by index:

`O(1)` — constant time.

## LinkedList

`LinkedList` stores elements as nodes connected to each other.

Java's `LinkedList` is a doubly linked list.

Each node knows:

- its value
- the previous node
- the next node

Conceptually:

`null <- [A] <-> [B] <-> [C] <-> [D] -> null`

To execute:

`list.get(2)`

LinkedList must move through nodes until it reaches the requested position.

Access by index:

`O(n)` — time can grow with the number of elements.

## Inserting or Removing Elements

In an `ArrayList`, inserting or removing an element in the middle may require shifting other elements.

Example:

Before:

`[A][B][C][D]`

Insert `X` at index 1:

`[A][X][B][C][D]`

`B`, `C` and `D` must be shifted.

Therefore, insertion or removal in the middle is generally:

`O(n)`

In a `LinkedList`, once the required node has already been located, inserting or removing by changing node links is:

`O(1)`

But finding a node by index is:

`O(n)`

Therefore, saying "LinkedList insertion is always O(1)" is incorrect.

## Memory

`ArrayList` mainly stores references to its elements inside an array.

`LinkedList` needs a separate node for each element containing references to both the previous and next nodes.

Therefore, LinkedList normally has more memory overhead.

## Which Should I Use?

Use `ArrayList` in most normal situations, especially when:

- reading elements frequently
- accessing elements by index
- iterating through data

Use `LinkedList` when its node-based structure specifically benefits the required operation.

Do not automatically choose LinkedList simply because the application performs insertions or removals; the cost of locating the required position also matters.

## Quick Comparison

| Operation | ArrayList | LinkedList |
|---|---|---|
| `get(index)` | `O(1)` | `O(n)` |
| Add at end | Usually `O(1)` | `O(1)` |
| Remove from end | `O(1)` | `O(1)` |
| Insert/remove by index | `O(n)` | `O(n)` because position must first be found |
| Memory usage | Lower | Higher |
| Internal structure | Resizable array | Doubly linked nodes |

`O(1)` means the operation takes approximately constant time regardless of list size.

`O(n)` means the work can increase as the number of elements increases.

# Interview Answer

"ArrayList uses a resizable array, while LinkedList uses a doubly linked list.

ArrayList provides constant-time index access, whereas LinkedList requires traversal, so index access is O(n).

ArrayList may need to shift elements when inserting or removing in the middle. LinkedList can change node links in constant time once the node is known, but finding that position is still O(n).

ArrayList also has lower memory overhead, so it is generally the better default choice unless I specifically need LinkedList's node-based operations."

# Solution

See `ArrayListVsLinkedList.java`.

# Status

DONE