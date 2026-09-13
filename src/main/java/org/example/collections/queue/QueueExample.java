package org.example.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements using offer()
        queue.offer("Java");
        queue.offer("Spring");
        queue.offer("Kafka");

        // peek() shows the first element without removing it
        System.out.println("Peek: " + queue.peek());

        // poll() removes and returns elements
        // Java was added first, so it is processed first
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Poll: " + queue.poll());
    }
}
