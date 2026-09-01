package org.example.streams.sorting;

import java.util.Comparator;
import java.util.List;

public class SortEmployeesBySalaryDescending {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 75_000),
                new Employee("Bob", 45_000),
                new Employee("Charlie", 95_000),
                new Employee("Diana", 55_000)
        );

        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .forEach(System.out::println);
    }

    record Employee(String name, double salary) {
    }
}
