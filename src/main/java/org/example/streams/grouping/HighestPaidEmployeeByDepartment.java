package org.example.streams.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidEmployeeByDepartment {

    record Employee(String name, String department, double salary) {}

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ravi", "IT", 110000),
                new Employee("Mary", "IT", 140000),
                new Employee("Sam", "HR", 90000),
                new Employee("Anu", "HR", 120000)
        );

        Map<String, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.maxBy(
                                Comparator.comparingDouble(Employee::salary)
                        )
                ));

        System.out.println(result);
    }
}