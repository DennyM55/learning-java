package org.example.threads;

public class _05_ThreadSleep {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Before Sleep");
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("After Sleep");
            }
        }).start();
    }
}
