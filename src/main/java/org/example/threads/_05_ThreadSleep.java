package org.example.threads;

/**
 * Demonstrates the usage of Thread.sleep method in Java.
 * This class creates and starts a new thread which prints messages
 * before and after sleeping for a specified duration.
 */
public class _05_ThreadSleep {

    /**
     * The main method where the thread is created and started.
     * It creates a new thread using the Runnable interface,
     * in which the run method is overridden.
     *
     * Inside the run method, the thread sleeps for 1 second (1000 milliseconds)
     * using the Thread.sleep method.
     *
     * @param args Command line arguments (not used).
     */
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

    /*
     * Important Notes:
     * - Thread.sleep causes the current thread to suspend execution for a specified period.
     * - This is an efficient way of making a thread pause without consuming CPU cycles.
     * - InterruptedException is thrown if any thread has interrupted the current thread while sleeping.
     *
     * Interview Questions and Answers:
     * 1. What is the purpose of the Thread.sleep method in Java?
     *    Answer: The purpose of Thread.sleep is to pause the execution of the current thread for a specified period of time. This allows other threads to execute or conserves CPU usage.
     *
     * 2. How does Thread.sleep affect the execution of a thread?
     *    Answer: Thread.sleep temporarily halts the execution of the current thread, allowing the CPU to execute other threads. The thread resumes execution after the specified sleep duration.
     *
     * 3. What is InterruptedException, and when is it thrown?
     *    Answer: InterruptedException is an exception thrown when a sleeping or waiting thread is interrupted. It's a signal to the thread that it should stop what it's doing and do something else, typically clean up and terminate.
     *
     * 4. Can Thread.sleep be used for precise timing control in Java applications?
     *    Answer: While Thread.sleep can introduce delays, it's not suitable for precise timing control due to potential inaccuracies introduced by the scheduler and the underlying OS.
     *
     * Sample Output:
     * Before Sleep
     * (approximately 1 second delay)
     * After Sleep
     */
}
