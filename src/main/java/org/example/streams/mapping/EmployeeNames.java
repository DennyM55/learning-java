package org.example.streams.mapping;

import java.util.List;

public class EmployeeNames {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering"),
                new Employee("Bob", "Sales"),
                new Employee("Charlie", "Finance")
        );

        employees.stream()
                .map(Employee::name)
                .forEach(System.out::println);
    }

    record Employee(String name, String department) {
    }
}
