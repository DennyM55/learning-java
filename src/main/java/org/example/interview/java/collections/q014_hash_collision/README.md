# Question

What is a hash collision in HashMap, and how does HashMap handle it?

# Explanation

A hash collision happens when two different keys are placed into the same bucket.

Example:

`KeyA -> bucket 5`

`KeyB -> bucket 5`

Even though the keys are different, both are mapped to the same bucket.

## Why can this happen?

HashMap has a limited number of buckets.

But there can be many possible keys.

Therefore, different keys can sometimes produce the same bucket index.

## What happens during put()?

Suppose:

`KeyA -> bucket 5`

and bucket 5 already contains:

`[KeyA, 10]`

Now we insert:

`KeyB -> 20`

and KeyB also maps to bucket 5.

HashMap checks whether KeyB is actually equal to KeyA.

If:

`KeyA.equals(KeyB) == false`

then HashMap knows they are different keys.

Both entries are kept in the same bucket.

Conceptually:

`bucket 5 -> [KeyA,10] -> [KeyB,20]`

## What happens during get()?

When we call:

`map.get(KeyB)`

HashMap calculates KeyB's hash and reaches bucket 5.

It then checks the entries in that bucket.

It compares the requested key with each stored key using `equals()`.

When it finds KeyB, it returns its value.

## Why is equals() important?

The hash tells HashMap which bucket to search.

`equals()` tells HashMap which exact key inside that bucket is the correct one.

Therefore:

`hashCode()` -> finds the bucket

`equals()` -> finds the exact key

## What if many keys collide?

Initially, entries inside one bucket are stored using linked nodes.

If one bucket becomes heavily populated, modern Java HashMap can convert that bucket into a balanced tree.

This improves lookup performance when many keys are stored in the same bucket.

## Important Rule

If two objects are equal according to `equals()`, they must return the same `hashCode()`.

But two different objects are allowed to return the same hash code.

That is why collisions are possible.

# Interview Answer

"A hash collision occurs when different keys map to the same bucket. HashMap does not overwrite them immediately. It checks whether the keys are equal using equals. If they are different, both entries are stored in the same bucket. During lookup, HashMap first finds the bucket using the hash and then uses equals to find the exact key. If a bucket becomes heavily populated, modern HashMap can convert its linked structure into a balanced tree."

# Solution

See `HashCollisionExample.java`.

# Status

DONE