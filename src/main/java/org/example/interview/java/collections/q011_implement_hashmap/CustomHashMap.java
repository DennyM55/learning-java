package org.example.interview.java.collections.q011_implement_hashmap;

import java.util.Objects;

public class CustomHashMap<K, V> {

    private static final int CAPACITY = 16;

    private final Node<K, V>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = (Node<K, V>[]) new Node[CAPACITY];
    }

    private static class Node<K, V> {

        K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getBucketIndex(K key) {
        int hash = Objects.hashCode(key);

        return (hash & 0x7fffffff) % buckets.length;
    }

    public void put(K key, V value) {

        int index = getBucketIndex(key);

        Node<K, V> current = buckets[index];

        while (current != null) {

            if (Objects.equals(current.key, key)) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        Node<K, V> newNode = new Node<>(key, value);

        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public V get(K key) {

        int index = getBucketIndex(key);

        Node<K, V> current = buckets[index];

        while (current != null) {

            if (Objects.equals(current.key, key)) {
                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    public static void main(String[] args) {

        CustomHashMap<String, Integer> map =
                new CustomHashMap<>();

        map.put("Java", 10);
        map.put("Spring", 20);

        System.out.println(map.get("Java"));
        System.out.println(map.get("Spring"));

        map.put("Java", 50);

        System.out.println(map.get("Java"));
        System.out.println(map.get("Unknown"));
    }
}