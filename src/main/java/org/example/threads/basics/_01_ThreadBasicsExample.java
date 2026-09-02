package org.example.threads.basics;

public class _01_ThreadBasicsExample {

    public static void main(String[] args) {

        System.out.println(
                "Current thread: " +
                        Thread.currentThread().getName()
        );

        Thread worker = new Thread(() -> {
            System.out.println(
                    "Downloading on: " +
                            Thread.currentThread().getName()
            );
        }, "download-worker");

        worker.start();
    }
}