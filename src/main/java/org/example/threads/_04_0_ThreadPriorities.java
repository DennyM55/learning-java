package org.example.threads;

public class _04_ThreadPriorities {
    static class MyThread extends Thread{}
    public static void main(String... args)
    {
        System.out.println(Thread.currentThread().getPriority());//5
        Thread.currentThread().setPriority(7);
        MyThread t= new MyThread();
        System.out.println(Thread.currentThread().getPriority());//7
    }
}
//MyThread is creating by mainThread, so priority of mainThread will be shared as a priority for MyThread.