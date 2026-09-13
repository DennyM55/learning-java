package org.example.interview.java.collections.q016_blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue =
                new ArrayBlockingQueue<>(2);

        Thread producer = new Thread(() -> {
            try {
                queue.put("Java");
                System.out.println("Produced: Java");

                queue.put("Spring");
                System.out.println("Produced: Spring");

                queue.put("Kafka");
                System.out.println("Produced: Kafka");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                Thread.sleep(1000);

                System.out.println("Consumed: " + queue.take());
                System.out.println("Consumed: " + queue.take());
                System.out.println("Consumed: " + queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}