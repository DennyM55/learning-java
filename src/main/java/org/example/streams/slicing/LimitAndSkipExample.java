package org.example.streams.slicing;

import java.util.List;

public class LimitAndSkipExample {

    public static void main(String[] args) {

        List<Integer> nums = List.of(10, 20, 30, 40, 50);

        var limited = nums.stream()
                .limit(3)
                .toList();

        var skipped = nums.stream()
                .skip(2)
                .toList();

        System.out.println("limit(3) = " + limited);
        System.out.println("skip(2)  = " + skipped);
    }
}