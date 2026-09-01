package org.example.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeesByDepartment {
    record Employee(String name, String department) {
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ravi", "IT"),
                new Employee("Mary", "IT"),
                new Employee("Sam", "HR")
        );
        Map<String, Long> result = employees.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::department,
                                Collectors.counting())
                );
        System.out.println(result);
    }
}
