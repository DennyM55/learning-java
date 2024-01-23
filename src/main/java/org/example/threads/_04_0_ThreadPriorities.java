package org.example.threads;

public class _04_0_ThreadPriorities {
    static class MyThread extends Thread{}

    public static void main(String... args) {
        // Getting the priority of the current thread (main thread)
        System.out.println(Thread.currentThread().getPriority()); // 5

        // Setting the priority of the current thread (main thread) to 7
        Thread.currentThread().setPriority(7);

        // Creating an instance of MyThread
        MyThread t = new MyThread();

        // Getting the priority of the current thread after modification
        System.out.println(Thread.currentThread().getPriority()); // 7
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _04_0_ThreadPriorities
 * Description: This class demonstrates setting and getting the priorities of threads in Java.
 * It creates a thread and showcases how to get and set its priority.
 *
 * Methods:
 * - main(String[] args): Demonstrates the use of getPriority() and setPriority() methods on threads.
 *
 * Sample Output:
 * Default main thread priority: 5
 * Changed main thread priority: 7
 *
 * Interview Questions and Answers:
 * 1. What is the range of thread priorities in Java?
 *    Answer: In Java, thread priorities range from Thread.MIN_PRIORITY (1) to Thread.MAX_PRIORITY (10), with a default value of Thread.NORM_PRIORITY (5).
 *
 * 2. How do you set and get the priority of a thread in Java?
 *    Answer: The priority of a thread in Java can be set using the setPriority(int) method and retrieved using the getPriority() method of the Thread class. For example, thread.setPriority(7) sets the thread's priority to 7.
 *
 * 3. Does setting a thread's priority guarantee its execution order?
 *    Answer: No, setting a thread's priority does not guarantee its execution order. Thread priorities are used as hints by the Thread Scheduler, and the actual scheduling is dependent on the JVM implementation and underlying operating system. Higher priority threads are generally executed in preference to lower priority threads, but this is not guaranteed.
 *
 * Important Notes:
 * - Thread priorities in Java range from Thread.MIN_PRIORITY (1) to Thread.MAX_PRIORITY (10).
 * - The JVM does not guarantee that threads with higher priority will be executed first. Thread scheduling can
 *   depend on the underlying OS.
 * - Thread priorities should be used carefully as they can cause issues like thread starvation and deadlock.
 */
