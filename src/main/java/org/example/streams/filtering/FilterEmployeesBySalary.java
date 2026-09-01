package org.example.streams.filtering;

import java.util.List;

public class FilterEmployeesBySalary {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 75_000),
                new Employee("Bob", 45_000),
                new Employee("Charlie", 95_000),
                new Employee("Diana", 55_000)
        );

        employees.stream()
                .filter(employee -> employee.salary() >= 60_000)
                .forEach(System.out::println);
    }

    record Employee(String name, double salary) {
    }
}
