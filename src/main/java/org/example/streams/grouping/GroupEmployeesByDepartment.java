package org.example.streams.grouping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByDepartment {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Engineering"),
                new Employee("Bob", "Sales"),
                new Employee("Charlie", "Engineering"),
                new Employee("Diana", "Finance")
        );

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));

        employeesByDepartment.forEach((department, departmentEmployees) ->
                System.out.println(department + " -> " + departmentEmployees));
    }

    record Employee(String name, String department) {
    }
}
