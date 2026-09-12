package org.example.interview.java.collections.q014_hash_collision;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCollisionExample {

    public static void main(String[] args) {

        Map<Employee, String> map = new HashMap<>();

        Employee employee1 = new Employee(1, "Denny");
        Employee employee2 = new Employee(2, "John");

        map.put(employee1, "Java");
        map.put(employee2, "Spring");

        System.out.println(map.get(employee1));
        System.out.println(map.get(employee2));
    }

    private static class Employee {

        private final int id;
        private final String name;

        Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return 1; // Forces every Employee into the same hash bucket for demonstration.
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (!(obj instanceof Employee other)) {
                return false;
            }

            return id == other.id
                    && Objects.equals(name, other.name);
        }
    }
}