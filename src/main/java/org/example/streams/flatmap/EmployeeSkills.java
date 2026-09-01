package org.example.streams.flatmap;

import java.util.List;

public class EmployeeSkills {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", List.of("Java", "Spring")),
                new Employee("Bob", List.of("SQL", "Docker")),
                new Employee("Charlie", List.of("Java", "AWS"))
        );

        employees.stream()
                .flatMap(employee -> employee.skills().stream())
                .distinct()
                .forEach(System.out::println);
    }

    record Employee(String name, List<String> skills) {
    }
}
