package org.example.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        // Add values
        list.add("Java");
        list.add("Spring");
        // Add duplicate value
        list.add("Java");

        // Get value by index
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Full list: " + list);
    }
}
