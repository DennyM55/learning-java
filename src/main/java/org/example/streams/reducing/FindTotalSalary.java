package org.example.streams.reducing;

import java.util.List;

public class FindTotalSalary {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 75_000),
                new Employee("Bob", 45_000),
                new Employee("Charlie", 95_000),
                new Employee("Diana", 55_000)
        );

        double totalSalary = employees.stream()
                .map(Employee::salary)
                .reduce(0.0, Double::sum);

        System.out.println("Total salary: " + totalSalary);
    }

    record Employee(String name, double salary) {
    }
}
