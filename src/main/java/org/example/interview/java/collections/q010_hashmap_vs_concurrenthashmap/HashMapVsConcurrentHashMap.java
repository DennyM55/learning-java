package org.example.interview.java.collections.q010_hashmap_vs_concurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapVsConcurrentHashMap {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Java", 1);
        hashMap.put(null, 2);
        hashMap.put("Spring", null);

        System.out.println("HashMap: " + hashMap);


        Map<String, Integer> concurrentHashMap =
                new ConcurrentHashMap<>();

        concurrentHashMap.put("Java", 1);
        concurrentHashMap.put("Spring", 2);
        concurrentHashMap.put("Hibernate", 3);
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);
    }
}
