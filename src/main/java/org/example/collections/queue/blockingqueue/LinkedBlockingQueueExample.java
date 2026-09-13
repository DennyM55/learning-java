package org.example.collections.queue.blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        try {
            // Create a queue with a small capacity of 2
            BlockingQueue<String> queue = new LinkedBlockingQueue<>(2);

            // Add elements
            queue.put("Java");
            queue.put("Spring");

            // Take an element
            String item = queue.take();
            System.out.println("Took: " + item);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
