package org.example.interview.java.concurrency.q017_completablefuture;

import java.util.concurrent.CompletableFuture;

public class Scartch {
    public static void main(String[] args) {
        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> "hello");

        CompletableFuture<String> upperFuture =
                future.thenApply(value -> value.toUpperCase());

        System.out.println(upperFuture.join());
    }
}
