package org.example.interview.java.concurrency.q017_completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {

    public static void main(String[] args) {

        CompletableFuture<String> future =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("Calling payment service...");
                    return "Payment successful";
                });

        CompletableFuture<String> result =
                future.thenApply(message ->
                        message.toUpperCase());

        System.out.println(result.join());
    }
}
