# Question

How does `HashMap.get(key)` work internally in Java?

# Explanation

When we write:

`map.get("Java");`

HashMap must find the value associated with the key `"Java"`.

## Step 1 — Calculate the hash

HashMap gets the key's hash code using `hashCode()` and performs an additional hash calculation to improve distribution.

Conceptually:

`key -> hashCode() -> improved hash`

The important point is that the same key produces the same hash used when the entry was inserted.

## Step 2 — Calculate the bucket index

HashMap uses the hash to determine which position in its internal array should contain the key.

Conceptually:

`hash -> bucket index`

Example:

`"Java" -> bucket 5`

HashMap does NOT need to search every entry in the map.

It goes directly to the calculated bucket.

## Step 3 — Check the first entry

Suppose the bucket contains:

`bucket[5] -> [Java,10]`

HashMap compares the requested key with the stored key.

It checks the hash and then checks key equality.

For object keys, `equals()` is used to confirm that the keys are equal.

If the key matches:

`return 10`

## Step 4 — What if multiple keys are in the same bucket?

Different keys can map to the same bucket.

This is called a **hash collision**.

Example:

`bucket[5] -> [Java,10] -> [Spring,20] -> null`

HashMap checks the entries in that bucket until it finds the requested key.

For:

`map.get("Spring")`

it checks:

`Java` → not equal

then:

`Spring` → equal

then returns:

`20`

## Step 5 — What if the key does not exist?

If HashMap checks the relevant bucket and cannot find an equal key:

`get()` returns `null`.

Example:

`map.get("Python") -> null`

Be careful: HashMap allows null values.

Therefore, a `null` returned by `get()` can mean either:

1. The key does not exist.
2. The key exists but its value is `null`.

Use `containsKey()` when you need to distinguish these cases.

## Average Performance

Normally, `get()` is approximately:

Time Complexity: `O(1)`

`O(1)` means constant time — HashMap can calculate the bucket directly instead of searching the entire map.

If many keys collide, multiple entries in one bucket may need to be checked.

Modern Java HashMap can convert a heavily populated bucket from a linked structure into a balanced tree, improving lookup in that bucket.

## Complete Flow

`get(key)`

↓

`calculate hash`

↓

`calculate bucket index`

↓

`go directly to that bucket`

↓

`key found?`

YES → return value

NO ↓

`check next entry in the bucket`

↓

`still not found?`

↓

`return null`

# Interview Answer

"When get is called, HashMap calculates the key's hash and uses it to locate the correct bucket in its internal array. It then checks the entries in that bucket and uses equals to confirm the matching key. If it finds the key, it returns the associated value. If the key is not present, it returns null. The average lookup time is constant time, O(1)."

# Solution

See `HashMapGetExample.java`.

# Status

DONE