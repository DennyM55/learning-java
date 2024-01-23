package org.example.threads;

/**
 * Demonstrates the concept of thread priorities in Java.
 * This class contains a nested static class MyThread that extends the Thread class.
 * It overrides the run() method to print a message multiple times.
 * The main method sets the priority of this thread and starts it,
 * while also printing a message from the main thread.
 */
public class _04_1_ThreadPriorities {

    /**
     * Nested static class MyThread.
     * This class extends Thread and overrides the run method
     * to print "child thread" five times.
     */
    static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("child thread");
            }
        }
    }

    /**
     * The main method demonstrating thread priorities.
     * It creates an instance of MyThread, sets its priority, and starts it.
     * It also prints "main thread" five times.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String... args) {
        MyThread t = new MyThread();
        t.setPriority(7); // line -1
        t.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("main thread");
        }
    }

    /*
     * Important Notes:
     * - Thread priorities are integers ranging from MIN_PRIORITY (1) to MAX_PRIORITY (10).
     * - The default priority of any thread is NORM_PRIORITY (5).
     * - The JVM scheduler may use thread priorities as hints for deciding which thread to execute.
     * - However, thread scheduling is platform-dependent, and setting priorities does not guarantee the order of execution.
     *
     * Interview Questions and Answers:
     * 1. What is the range of thread priorities in Java?
     *    Answer: Thread priorities in Java range from MIN_PRIORITY (1) to MAX_PRIORITY (10).
     *
     * 2. How does Java thread priority affect thread scheduling?
     *    Answer: Thread priorities are used as hints by the JVM scheduler to decide which threads should be executed. Higher priority threads are generally executed in preference to lower priority ones. However, the exact behavior is JVM and platform-dependent.
     *
     * 3. Can we rely on thread priorities for precise control of thread execution order?
     *    Answer: No, we cannot rely on thread priorities for precise control of execution order. While they provide hints to the scheduler, the actual execution order depends on several factors, including the operating system and JVM implementation.
     *
     * 4. What will happen if two threads have the same priority?
     *    Answer: If two threads have the same priority, the thread scheduler will decide the order of execution based on its scheduling policy, which can be unpredictable. The threads are treated equally in terms of priority, and other factors like thread creation time or the state of the thread may influence the execution order.
     *
     * Sample Output:
     * (Note: The actual output can vary depending on the JVM and the underlying platform's thread scheduling.)
     * child thread
     * main thread
     * child thread
     * main thread
     * ...
     */
}
