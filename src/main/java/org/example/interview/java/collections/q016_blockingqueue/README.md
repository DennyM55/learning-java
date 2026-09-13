# Question

What is a BlockingQueue in Java, and when would you use it?

# Explanation

A `BlockingQueue` is a thread-safe queue designed for communication between threads.

A queue normally follows:

`First In -> First Out`

Example:

`A -> B -> C`

`A` is removed first.

## What does "blocking" mean?

Blocking means a thread can automatically wait when an operation cannot be completed immediately.

There are two important situations:

### 1. Queue is empty

If a consumer calls:

`take()`

and there is no element available, the consumer thread waits.

It continues automatically when another thread adds an element.

### 2. Queue is full

If a producer calls:

`put()`

and the queue has reached its maximum capacity, the producer thread waits.

It continues automatically when space becomes available.

## Producer and Consumer Example

Producer:

`creates data -> put() -> queue`

Consumer:

`queue -> take() -> processes data`

Conceptually:

`Producer -> BlockingQueue -> Consumer`

The producer and consumer do not need to run at exactly the same speed.

The queue acts as a buffer between them.

## Important Methods

### put(element)

Adds an element.

If the queue is full, the calling thread waits until space becomes available.

### take()

Removes and returns an element.

If the queue is empty, the calling thread waits until an element becomes available.

### offer(element)

Attempts to add an element without waiting indefinitely.

It can return `false` if the element cannot be added immediately.

### poll()

Attempts to remove an element without waiting indefinitely.

It can return `null` if no element is available.

## Common Implementations

`ArrayBlockingQueue`

Uses a fixed-size array.

Example:

`new ArrayBlockingQueue<>(10)`

Maximum capacity = `10`.

`LinkedBlockingQueue`

Uses linked nodes internally.

It can be bounded by providing a capacity.

## Why use BlockingQueue?

It is commonly used in producer-consumer systems.

Examples:

- background task processing
- message processing
- worker threads
- job queues

It avoids manually writing complicated thread waiting and notification logic.

# Interview Answer

"A BlockingQueue is a thread-safe queue used mainly for communication between producer and consumer threads.

If a consumer calls take when the queue is empty, it waits until data becomes available. If a producer calls put when a bounded queue is full, it waits until space becomes available.

This makes producer-consumer coordination simpler because the queue handles the waiting and thread synchronization for us."

# Solution

See `BlockingQueueExample.java`.

# Status

DONE