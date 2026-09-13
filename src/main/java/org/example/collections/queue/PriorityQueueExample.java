package org.example.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Reverse order processing
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer("A");
        pq.offer("Z");
        pq.offer("L");
        pq.offer("B");

        // Elements are removed based on reverse alphabetical priority
        System.out.println(pq.poll()); // Z
        System.out.println(pq.poll()); // L
        System.out.println(pq.poll()); // B
        System.out.println(pq.poll()); // A
    }
}
