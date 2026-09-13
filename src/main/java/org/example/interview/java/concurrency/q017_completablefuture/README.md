# Question

What is CompletableFuture in Java, and why do we use it?

# Explanation

`CompletableFuture` is used when we want a task to run asynchronously.

Asynchronous means:

The calling thread starts some work but does not have to wait there until that work finishes.

Example:

Without asynchronous processing:

`Request -> Call API -> WAIT -> Get response -> Continue`

With asynchronous processing:

`Request -> Start API call -> Continue other work`

The API call can complete separately.

## Simple Example

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(() -> "Payment completed");
```

`supplyAsync()` runs a task asynchronously and produces a result.

The result becomes available later through the `CompletableFuture`.

## runAsync() vs supplyAsync()

Use:

`runAsync()`

when the task does NOT return a value.

Example:

```java
CompletableFuture.runAsync(() -> sendEmail());
```

Use:

`supplyAsync()`

when the task DOES return a value.

Example:

```java
CompletableFuture<String> future =
        CompletableFuture.supplyAsync(() -> callPaymentApi());
```

## Chaining Operations

We can specify what should happen after an asynchronous operation completes.

```java
future.thenApply(result -> result.toUpperCase());
```

`thenApply()` receives the result, transforms it and returns another result.

Example flow:

`Call API -> Receive result -> Transform result`

## Combining Independent Operations

Suppose we need:

`Customer details`

and:

`Order details`

and these operations do not depend on each other.

They can run at the same time:

`Customer API -----> result`

`Order API --------> result`

Then their results can be combined.

This can reduce total waiting time compared with calling them one after another.

## Exception Handling

Asynchronous operations can fail.

`CompletableFuture` provides methods such as:

`exceptionally()`

to handle failures.

Example:

```java
future.exceptionally(exception -> "Fallback response");
```

## Important Warning

Calling:

`future.get()`

or:

`future.join()`

waits for the result.

Therefore, using `CompletableFuture` and immediately calling `get()` can remove much of the benefit of asynchronous processing.

## Interview Answer

"CompletableFuture is Java's API for asynchronous and non-blocking-style task composition.

I use `runAsync` when I don't need a return value and `supplyAsync` when I need a result.

The main advantage is that I can chain operations using methods like `thenApply`, combine independent asynchronous operations, and handle failures without writing complex thread-management code.

For example, if I need to call two independent services, I can start both calls asynchronously and combine their results instead of waiting for one call to finish before starting the other.

One thing I would be careful about is calling `get` or `join` too early, because those calls wait for the result and can make the flow blocking again."

# Solution

See `CompletableFutureExample.java`.

# Status

DONE