# Question

How does `HashMap.put(key, value)` work internally in Java?

# Explanation

When we write:

`map.put("Java", 10);`

HashMap must decide where to store this key-value pair.

## Step 1 — Get the key's hash code

Java calls the key's `hashCode()` method.

Example:

`"Java".hashCode() -> some integer`

A hash code is an integer calculated from an object.

## Step 2 — Improve the hash

Java's HashMap performs an additional calculation on the hash code.

This helps distribute keys more evenly across the internal array.

Conceptually:

`key -> hashCode() -> improved hash`

## Step 3 — Calculate the bucket index

HashMap internally contains an array.

Each position in this array is called a **bucket**.

The hash is converted into an array index.

Conceptually:

`hash -> bucket index`

Example:

`bucket index = 5`

## Step 4 — Check the bucket

If bucket `5` is empty:

`bucket[5] -> null`

HashMap stores the new entry there:

`bucket[5] -> [Java, 10]`

## Step 5 — What if the bucket already contains something?

This is called a **hash collision**.

A hash collision means different keys have been mapped to the same bucket.

Example:

`bucket[5] -> [Java,10]`

Now another key also maps to bucket `5`.

HashMap checks whether the existing key and new key are actually equal.

It uses the hash and `equals()` to determine this.

## Step 6 — If the same key already exists

Example:

`map.put("Java", 10);`

followed by:

`map.put("Java", 50);`

HashMap does NOT create another `"Java"` entry.

It replaces the old value:

`[Java,10] -> [Java,50]`

`put()` returns the previous value.

So the second call returns `10`.

## Step 7 — If it is a different key with the same bucket

HashMap stores both entries in that bucket.

Conceptually:

`bucket[5] -> [Java,10] -> [Spring,20]`

This is called collision handling.

Modern Java HashMap initially handles collisions using linked nodes.

If one bucket becomes heavily populated, HashMap can convert that bucket's linked structure into a balanced tree to improve lookup performance.

## Step 8 — Resize when the map becomes too full

HashMap has a **capacity** and a **load factor**.

Capacity = size of the internal bucket array.

Load factor = how full the HashMap is allowed to become before resizing.

Default initial capacity:

`16`

Default load factor:

`0.75`

Therefore:

`16 × 0.75 = 12`

When the number of entries exceeds the resize threshold, HashMap increases its internal capacity and redistributes entries.

## Complete Flow

`put(key, value)`

↓

`calculate hash`

↓

`calculate bucket index`

↓

`bucket empty?`

YES → insert entry

NO ↓

`same key already exists?`

YES → replace value

NO ↓

`collision`

↓

`add entry to bucket`

↓

`resize if threshold exceeded`

# Interview Answer

"When put is called, HashMap calculates the key's hash and uses it to determine a bucket in its internal array. If the bucket is empty, it inserts the entry. If the bucket already contains entries, HashMap compares the hash and key using equals. If the same key exists, its value is replaced. Otherwise it is treated as a collision and another entry is stored in that bucket. If the map crosses its load-factor threshold, the internal table is resized."

# Solution

See `HashMapPutExample.java`.

# Status

DONE