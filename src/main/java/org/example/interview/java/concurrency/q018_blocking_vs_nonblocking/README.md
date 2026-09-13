# Question

What is the difference between blocking and non-blocking processing in Java?

# Explanation

## 1. What is a thread?

A program may need to perform several pieces of work.

For example, a backend application may need to:

- receive an HTTP request
- read customer information from a database
- call a payment service
- create a response

A **thread** is a worker that executes these instructions.

```text
Thread -> Instruction 1 -> Instruction 2 -> Instruction 3
```

A thread normally executes one instruction at a time.

## 2. The original problem

Some operations do not finish immediately.

Examples:

- waiting for a database response
- waiting for another service
- reading a large file
- waiting for a network response
- intentionally pausing with `Thread.sleep()`

These are often called **slow operations**.

Many of them are also called **Input/Output operations**, or **I/O operations**, because the program is waiting to receive data from or send data to something outside its current memory.

The important question is:

```text
What should the thread do while the slow operation is unfinished?
```

This gives us two approaches:

1. blocking
2. non-blocking

## 3. Blocking processing

**Blocking** means the thread must wait until the current operation finishes.

Consider an external payment service that takes five seconds to respond.

```text
Main thread
    |
    | Call payment service
    |
    | Wait for 5 seconds
    |
    | Receive result
    |
    | Continue next work
```

The thread cannot continue to its next instruction during those five seconds.

That is why it is called blocking: the unfinished operation blocks the thread from moving forward.

### Blocking example

```java
String result = slowOperation();

System.out.println(result);
System.out.println("Continue other work");
```

Execution order:

```text
Call slowOperation()
Wait until it finishes
Store its returned value in result
Print result
Continue other work
```

`slowOperation()` must finish before the next line can run.

## 4. Why can blocking become a problem?

Blocking is not automatically bad.

It is simple and may be perfectly acceptable for small applications.

The problem appears when many requests arrive together.

```text
Request 1 -> Thread 1 waits
Request 2 -> Thread 2 waits
Request 3 -> Thread 3 waits
Request 4 -> Thread 4 waits
```

Every waiting request may occupy a thread.

A computer has limited memory and processing capacity. Creating and managing too many threads consumes resources and can make the application slow.

## 5. Non-blocking processing

**Non-blocking** means the calling thread does not remain stuck waiting for the result.

It starts or registers the operation and remains free to continue other work.

```text
Main thread -> Start slow operation -> Continue other work
                         |
                         | Operation finishes later
                         v
                    Handle result
```

The result is not immediately available, so the program needs a way to handle it later.

In Java, one way to represent a result that will become available later is `CompletableFuture`.

## 6. What is a CompletableFuture?

A normal variable contains a value that is already available:

```java
String name = "Denny";
```

A `CompletableFuture<String>` represents a `String` that may become available later:

```java
CompletableFuture<String> future;
```

The word **future** fits because it represents a value expected in the future.

The word **completable** means the operation can eventually be completed successfully or exceptionally with an error.

```text
CompletableFuture<String>
          |
          | currently running
          |
          v
"Payment successful"
```

`String` tells Java what type of result the future will eventually contain.

## 7. Starting work asynchronously

**Asynchronous** means the calling thread starts work without waiting there until it finishes.

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(() -> slowOperation());
```

### What does supplyAsync mean?

`supplyAsync()` starts a task asynchronously and expects that task to return a value.

The name can be understood as:

```text
supply = provide a result
async  = perform without making the calling thread wait
```

Because `slowOperation()` returns a `String`, `supplyAsync()` returns:

```java
CompletableFuture<String>
```

### What does this part mean?

```java
() -> slowOperation()
```

This is a **lambda expression**.

A lambda is a short way to pass a piece of executable code to another method.

Here, it means:

```text
When the asynchronous task runs, call slowOperation().
```

It is equivalent to creating a `Supplier<String>`:

```java
Supplier<String> task = new Supplier<String>() {
    @Override
    public String get() {
        return slowOperation();
    }
};
```

A `Supplier` is a Java functional interface representing a task that:

- receives no input
- supplies or returns one result

The lambda is simply the shorter form.

## 8. What is a worker thread?

`supplyAsync()` normally executes the task using another thread.

That other thread is commonly called a **worker thread** because it performs the background work.

```text
Main thread                     Worker thread
     |                                |
     | Start asynchronous task ------>|
     |                                | Run slowOperation()
     | Continue other work            | Wait for completion
     |                                | Produce result
```

By default, `supplyAsync()` uses Java's common pool of reusable worker threads.

A **thread pool** is a managed collection of threads that can be reused for multiple tasks instead of creating a new thread for every task.

## 9. Handling the result with thenApply

Suppose the future eventually produces:

```text
"operation completed"
```

We may want to transform it to uppercase.

```java
CompletableFuture<String> uppercaseFuture =
        future.thenApply(result -> result.toUpperCase());
```

`thenApply()` means:

```text
When the previous result becomes available, apply this transformation to it.
```

It receives the previous result and returns a new result.

```text
future
   |
   | produces "operation completed"
   v
thenApply()
   |
   | converts it
   v
uppercaseFuture
   |
   | contains "OPERATION COMPLETED"
```

It returns another `CompletableFuture` because the transformed result may also become available later.

Use `thenApply()` when you want to transform one value into another value.

## 10. Handling the result with thenAccept

If we only want to use the result without producing another result, we can use `thenAccept()`.

```java
uppercaseFuture.thenAccept(result -> System.out.println(result));
```

`thenAccept()` means:

```text
When the result becomes available, accept it and perform an action.
```

In this example, the action is printing the result.

Use `thenAccept()` when you want to consume the value, such as:

- printing it
- logging it
- sending it somewhere
- updating another object

Difference:

```text
thenApply()  -> receives a value and returns a new value
thenAccept() -> receives a value and performs an action
```

## 11. What is a callback?

The code given to `thenApply()` or `thenAccept()` is often called a **callback**.

A callback means:

```text
Do not run this code immediately.
Call this code later when the result is ready.
```

Example:

```java
future.thenAccept(result -> System.out.println(result));
```

The printing code is called after the future produces its result.

## 12. Complete flow

```text
Main thread
    |
    | supplyAsync()
    |--------------------------------------+
    |                                      |
    | Continue other work                  | Worker thread
    |                                      | runs slowOperation()
    |                                      | produces result
    |                                      |
    |                              thenApply()
    |                              transforms result
    |                                      |
    |                              thenAccept()
    |                              prints result
```

## 13. What does join do?

```java
uppercaseFuture.join();
```

`join()` waits until the `CompletableFuture` finishes and then returns its result.

Therefore, `join()` is a blocking operation.

In a small console program, the main method may finish and terminate the program before the background task completes. We use `join()` at the end of the example only to keep the program alive long enough to see the result.

```text
Asynchronous work happens first
Main thread performs other work
join() waits only when the result is finally required
```

Calling `join()` immediately after `supplyAsync()` would remove much of the benefit:

```java
String result = CompletableFuture
        .supplyAsync(() -> slowOperation())
        .join();
```

The work starts asynchronously, but the main thread immediately waits for it.

## 14. Important clarification

Moving a blocking operation to another thread does not make the operation itself truly non-blocking.

In this example:

```java
CompletableFuture.supplyAsync(() -> slowOperation());
```

the main thread does not wait, but `slowOperation()` contains:

```java
Thread.sleep(3000);
```

Therefore, the worker thread is blocked for three seconds.

```text
Main thread   -> free
Worker thread -> blocked
```

This code provides asynchronous behaviour to the main thread, but the underlying slow operation still blocks a worker thread.

A truly non-blocking system avoids keeping a thread waiting for the external operation. It is notified when the result becomes available.

## 15. Blocking vs asynchronous vs non-blocking

These words are related, but they do not mean exactly the same thing.

### Blocking

The current thread waits.

```text
Call operation -> Wait -> Receive result
```

### Asynchronous

The result is handled later, allowing the calling code to continue.

```text
Start operation -> Continue -> Handle result later
```

### Non-blocking

No thread remains occupied merely waiting for the external operation.

```text
Register operation -> Thread becomes free -> Notification arrives later
```

`CompletableFuture.supplyAsync()` can make the calling code asynchronous, but the worker thread can still be blocked by a database, file or network call.

## 16. Comparison

| Blocking | Non-blocking |
|---|---|
| The thread waits | The thread remains free |
| Result is handled after waiting | Result is handled when it becomes available |
| Execution flow is simpler | Result handling requires another mechanism |
| Many waiting operations may require many threads | Fewer threads can manage more waiting operations |
| Example: direct database call | Example: non-blocking reactive database driver |

## 17. When should blocking processing be used?

Blocking processing can be suitable when:

- the application is small
- the number of simultaneous requests is limited
- the operation finishes quickly
- simple code is more valuable than extra complexity
- the libraries being used provide only blocking methods

## 18. When should non-blocking processing be used?

Non-blocking processing can be useful when:

- many requests must be handled simultaneously
- the application spends significant time waiting for network or database responses
- threads must not be occupied while waiting
- the libraries support non-blocking operations
- the additional complexity is justified

# Interview Answer

"Blocking processing means the current thread waits until an operation completes. For example, if an external API takes five seconds, the thread remains occupied for those five seconds.

In non-blocking processing, the thread starts or registers the operation, remains free to perform other work, and handles the result when it becomes available.

CompletableFuture can make the calling code asynchronous by moving work to another thread. However, if that worker thread performs a blocking database or API call, the underlying operation is still blocking. Therefore, asynchronous and truly non-blocking are related concepts, but they are not always the same."

# Solution

Create `BlockingVsNonBlockingExample.java`.

```java
package org.example.interview.java.concurrency.q018_blocking_vs_nonblocking;

import java.util.concurrent.CompletableFuture;

public class BlockingVsNonBlockingExample {

    public static void main(String[] args) {

        runBlockingExample();
        runAsynchronousExample();
    }

    private static void runBlockingExample() {

        System.out.println("Blocking example started");

        // The main thread waits here until slowOperation() returns.
        String result = slowOperation();

        System.out.println(result);
        System.out.println("Main thread continues after waiting");
    }

    private static void runAsynchronousExample() {

        System.out.println("Asynchronous example started");

        // A worker thread runs slowOperation() and will supply a String result.
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> slowOperation());

        // The main thread reaches this line without waiting for slowOperation().
        System.out.println("Main thread continues other work");

        // Transform the String when it becomes available.
        CompletableFuture<String> uppercaseFuture =
                future.thenApply(result -> result.toUpperCase());

        // Print the transformed result when it becomes available.
        uppercaseFuture.thenAccept(result -> System.out.println(result));

        // Keep this console program alive until the demonstration finishes.
        uppercaseFuture.join();
    }

    private static String slowOperation() {

        try {
            // Simulate a slow external operation lasting three seconds.
            Thread.sleep(3000);
        } catch (InterruptedException exception) {
            // Restore the interruption signal so other code can detect it.
            Thread.currentThread().interrupt();

            throw new RuntimeException(
                    "The slow operation was interrupted",
                    exception
            );
        }

        return "Slow operation completed";
    }
}
```

Expected output:

```text
Blocking example started
Slow operation completed
Main thread continues after waiting

Asynchronous example started
Main thread continues other work
SLOW OPERATION COMPLETED
```

The important observation is:

```text
Blocking example:
The main thread continues only after the slow result arrives.

Asynchronous example:
The main thread continues before the slow result arrives.
```

# Common Follow-Up Questions

## Is CompletableFuture always non-blocking?

No.

It can prevent the calling thread from waiting, but the worker thread may still be blocked by the operation it performs.

## Are asynchronous and non-blocking the same?

No.

Asynchronous describes when the result is handled. Non-blocking describes whether a thread must remain waiting.

## What is the difference between thenApply and thenAccept?

`thenApply()` transforms a result and produces another result.

`thenAccept()` uses a result but does not produce another result.

## Is join a blocking method?

Yes.

`join()` waits for the future to complete. It should normally be called only when the result is genuinely required.

# Quick Revision

```text
Thread          = worker executing instructions
Blocking        = current thread waits
Asynchronous    = result is handled later
Non-blocking    = no thread remains occupied just waiting
CompletableFuture = represents a result available now or later
supplyAsync     = starts a task that supplies a result
thenApply       = transforms the result
thenAccept      = uses the result
join            = waits for completion
```

# Status

DONE