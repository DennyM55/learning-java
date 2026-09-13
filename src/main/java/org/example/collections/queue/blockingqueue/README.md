# BlockingQueue

`BlockingQueue` is an interface in Java, and classes like `ArrayBlockingQueue` and `LinkedBlockingQueue` are its implementations.

## Comparison

```java
BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);
```
- Uses a fixed-size array internally.
- The capacity must be defined.

```java
BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);
```
- Uses linked nodes internally.
- Can be bounded (like capacity of 2) or unbounded.

## Interview Answer

"A `BlockingQueue` is a thread-safe queue designed for producer-consumer patterns. It blocks the producer if the queue is full and blocks the consumer if the queue is empty. `ArrayBlockingQueue` is backed by an array and is strictly bounded, while `LinkedBlockingQueue` is backed by linked nodes and can be optionally bounded."
