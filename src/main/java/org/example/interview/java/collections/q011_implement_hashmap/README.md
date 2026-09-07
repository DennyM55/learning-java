# Question

How would you implement a simple HashMap in Java?

# Explanation

A HashMap stores data as:

`key -> value`

Example:

`"Java" -> 10`

Internally, we can use an array.

Each position in that array is called a **bucket**.

## Step 1 — Convert the key into an array position

Java provides:

`key.hashCode()`

A hash code is an integer generated from an object.

We convert that integer into a valid array index:

`index = (hashCode & 0x7fffffff) % arrayLength`

Example:

Array size = `16`

Hash code = `35`

`35 % 16 = 3`

So the entry goes into bucket `3`.

## Step 2 — Store the key and value

Each bucket can contain a node:

`Node(key, value)`

Example:

Bucket 3:

`["Java", 10]`

## Step 3 — Handle a collision

A **collision** means two different keys produce the same bucket index.

Example:

`"Java" -> bucket 3`

`"Spring" -> bucket 3`

We cannot overwrite the first entry.

For this simple implementation, each bucket therefore contains a linked list:

`bucket 3 -> [Java,10] -> [Spring,20] -> null`

## put(key, value)

When inserting:

1. Calculate the bucket index.
2. Check the nodes already in that bucket.
3. If the key already exists, update its value.
4. Otherwise add a new node.

## get(key)

When reading:

1. Calculate the same bucket index.
2. Search the nodes in that bucket.
3. Compare keys using `equals()`.
4. Return the matching value.
5. Return `null` if the key does not exist.

## Why both hashCode() and equals()?

`hashCode()` helps us find the bucket.

`equals()` confirms that we found the correct key.

Two different keys can have the same hash code, so checking only the hash code is not enough.

# Interview Answer

"I would implement a HashMap using an array of buckets. I use the key's hashCode to calculate the bucket index. Each bucket can contain multiple nodes to handle hash collisions. For put, I find the bucket, update the value if the key already exists, otherwise insert a new node. For get, I calculate the same bucket and compare keys using equals until I find the required key."

# Solution

See `CustomHashMap.java`.

# Status

DONE