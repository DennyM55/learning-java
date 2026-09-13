package org.example.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Add values
        list.add("Java");
        list.add("Spring");
        // Add duplicate value
        list.add("Java");

        // Get value by index
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Full list: " + list);
    }
}
