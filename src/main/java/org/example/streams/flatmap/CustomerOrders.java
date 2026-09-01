package org.example.streams.flatmap;

import java.util.List;

public class CustomerOrders {

    public static void main(String[] args) {
        List<Customer> customers = List.of(
                new Customer("Alice", List.of("Laptop", "Mouse")),
                new Customer("Bob", List.of("Keyboard", "Monitor")),
                new Customer("Charlie", List.of("Desk"))
        );

        customers.stream()
                .flatMap(customer -> customer.orders().stream())
                .forEach(System.out::println);
    }

    record Customer(String name, List<String> orders) {
    }
}
