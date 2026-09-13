package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // Add key value pairs
        map.put("lang", "Java");
        map.put("framework", "Spring");
        
        // Duplicate key replaces old value
        map.put("lang", "Java 21");

        // Get value by key
        System.out.println("Language: " + map.get("lang"));
        System.out.println("Full map: " + map);
    }
}
