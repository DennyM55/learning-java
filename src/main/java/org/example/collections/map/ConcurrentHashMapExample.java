package org.example.collections.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Designed for concurrent access by multiple threads
        Map<String, String> map = new ConcurrentHashMap<>();

        // Add key value pairs
        map.put("lang", "Java");
        map.put("framework", "Spring");

        // Get value by key
        System.out.println("Framework: " + map.get("framework"));
        System.out.println("Full map: " + map);
    }
}
