package org.example.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalSalaryByDepartment {

    record Employee(String name, String department, double salary) {}

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ravi", "IT", 110000),
                new Employee("Mary", "IT", 140000),
                new Employee("Sam", "HR", 90000)
        );

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::department,
                        Collectors.summingDouble(Employee::salary)
                ));

        System.out.println(result);
    }
}