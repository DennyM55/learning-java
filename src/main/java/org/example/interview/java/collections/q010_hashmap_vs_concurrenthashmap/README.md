# Question

What is the difference between HashMap and ConcurrentHashMap?

# Explanation

Both `HashMap` and `ConcurrentHashMap` store data as key-value pairs.

The main difference is how they behave when multiple threads access them.

## HashMap

`HashMap` is NOT thread-safe.

This means if multiple threads modify the same `HashMap` at the same time, we cannot safely rely on the result.

Use `HashMap` when the map is not being concurrently modified by multiple threads.

`HashMap` allows:

- one `null` key
- multiple `null` values

## ConcurrentHashMap

`ConcurrentHashMap` is thread-safe.

It is designed for situations where multiple threads need to read and update the same map concurrently.

It does NOT allow:

- `null` keys
- `null` values

## How does ConcurrentHashMap provide thread safety?

It does not simply lock the entire map for every operation.

Modern `ConcurrentHashMap` uses techniques such as:

### Compare-And-Set (CAS)

CAS means **Compare-And-Set**.

It is an atomic operation.

"Atomic" means the operation behaves as one indivisible action — another thread cannot observe it half-completed.

The idea is:

1. Read the current value.
2. Check whether it is still the value we expected.
3. If yes, replace it with the new value.
4. If another thread already changed it, the operation fails and can be retried.

Conceptually:

Expected value: `10`

Current value: `10`

New value: `20`

Because:

`current == expected`

the update succeeds:

`10 -> 20`

This allows some updates to happen safely without putting a traditional lock around the entire map.

`ConcurrentHashMap` also uses synchronization on small portions of its internal structure when necessary.

Therefore, multiple threads can often work on different parts of the map concurrently.

## Main Differences

| HashMap | ConcurrentHashMap |
|---|---|
| Not thread-safe | Thread-safe |
| Suitable for normal single-threaded use | Suitable for shared concurrent access |
| Allows one null key | Does not allow null keys |
| Allows null values | Does not allow null values |
| Iterator is fail-fast | Iterator is weakly consistent |
| No built-in concurrency control | Uses atomic operations and fine-grained synchronization |

## What does fail-fast mean?

If the collection is structurally modified while it is being iterated, other than through the iterator's permitted operations, the iterator may throw:

`ConcurrentModificationException`

## What does weakly consistent mean?

A `ConcurrentHashMap` iterator can continue while other threads modify the map.

It does not throw `ConcurrentModificationException` merely because another thread updates the map.

The iterator may reflect some modifications made after iteration started, but it is not guaranteed to show every concurrent modification.

# Interview Answer

"HashMap is not thread-safe, whereas ConcurrentHashMap is designed for multiple threads accessing and modifying the same map.

HashMap allows null keys and null values, while ConcurrentHashMap allows neither.

ConcurrentHashMap achieves thread safety using atomic operations such as Compare-And-Set and synchronization on small parts of its internal structure when necessary, instead of simply locking the entire map.

HashMap iterators are fail-fast, whereas ConcurrentHashMap iterators are weakly consistent."

# Solution

See `HashMapVsConcurrentHashMap.java`.

# Status

DONE