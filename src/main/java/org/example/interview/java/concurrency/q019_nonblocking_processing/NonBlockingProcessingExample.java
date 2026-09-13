package org.example.interview.java.concurrency.q019_nonblocking_processing;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NonBlockingProcessingExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            CompletableFuture<Void> processing =
                    CompletableFuture
                            .supplyAsync(() -> fetchCustomerName(101), executor)
                            .thenApply(name -> name.toUpperCase())
                            .thenAccept(name -> System.out.println("Customer: " + name))
                            .exceptionally(exception -> {
                                System.out.println("Processing failed: " + exception.getMessage());
                                return null;
                            });

            System.out.println("Main thread is free to perform other work");

            // In a small console demo, join keeps the JVM alive until the pipeline finishes.
            processing.join();
        } finally {
            executor.shutdown();
        }
    }

    private static String fetchCustomerName(int customerId) {
        System.out.println("Fetching customer using: " + Thread.currentThread().getName());

        try {
            Thread.sleep(500);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Customer operation was interrupted", exception);
        }

        return "Denny-" + customerId;
    }
}
