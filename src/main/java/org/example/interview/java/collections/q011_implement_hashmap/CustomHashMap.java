package org.example.interview.java.collections.q011_implement_hashmap;

import java.util.Objects;

public class CustomHashMap<K, V> {

    // Fixed 16 storage positions called buckets: buckets[0] to buckets[15].
    private static final int CAPACITY = 16;

    // Each bucket stores the first Node of its chain: buckets[2] -> Node("Java", 10).
    private final Node<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        // Create an array containing 16 empty bucket positions, all initially null.
        buckets = (Node<K, V>[]) new Node[CAPACITY];
    }

    // One Node stores one key-value pair; next connects collisions: Java -> Spring.
    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        // Example: new Node<>("Java", 10) stores key="Java" and value=10.
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Convert a key into its bucket number: "Java" -> hash -> bucket 0-15.
    private int getBucketIndex(K key) {
        int hash = Objects.hashCode(key);
        return Math.floorMod(hash, buckets.length);
    }

    public void put(K key, V value) {

        // Find where the key belongs: "Java" -> for example bucket[2].
        int index = getBucketIndex(key);

        // Start checking from the first Node already stored in that bucket.
        Node<K, V> current = buckets[index];

        // Walk through the chain until the key is found or there are no more Nodes.
        while (current != null) {

            // Same key found: put("Java", 50) changes Java=10 to Java=50.
            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }

            // Move forward in the collision chain: Java -> Spring -> Kafka.
            current = current.next;
        }

        // Key does not exist, so create a new key-value Node: ("Kafka", 30).
        Node<K, V> newNode = new Node<>(key, value);

        // Connect new Node before the old first Node: Java -> Spring becomes Kafka -> Java -> Spring.
        newNode.next = buckets[index];

        // Make the new Node the first Node of this bucket: bucket[index] -> Kafka.
        buckets[index] = newNode;
    }

    public V get(K key) {

        // Find where the requested key should be: "Java" -> for example bucket[2].
        int index = getBucketIndex(key);

        // Start searching from the first Node stored in that bucket.
        Node<K, V> current = buckets[index];

        // Walk through the chain until the matching key is found or the chain ends.
        while (current != null) {

            // Matching key found: get("Java") returns its value, for example 50.
            if (Objects.equals(current.key, key)) {
                return current.value;
            }

            // Key did not match, so check the next Node in the same bucket.
            current = current.next;
        }

        // No matching key exists in the bucket, so get("Unknown") returns null.
        return null;
    }

    public static void main(String[] args) {

        // Create a map where keys are String and values are Integer.
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        // Store Java=10 and Spring=20.
        map.put("Java", 10);
        map.put("Spring", 20);

        // Read existing keys: prints 10 and 20.
        System.out.println(map.get("Java"));
        System.out.println(map.get("Spring"));

        // Java already exists, so update its value from 10 to 50.
        map.put("Java", 50);

        // Prints 50 because Java was updated.
        System.out.println(map.get("Java"));

        // Prints null because "Unknown" was never inserted.
        System.out.println(map.get("Unknown"));
    }
}
