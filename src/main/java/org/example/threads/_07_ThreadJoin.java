package org.example.threads;

/**
 * _07_ThreadJoin class demonstrates the usage of Thread.join() method in Java.
 * Thread.join() is used to make a calling thread wait for the completion of another thread.
 */
public class _07_ThreadJoin {

    /**
     * The main method creates two threads,
     * where the second thread waits for the completion of the first thread using join().
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating the first thread
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread 1 is executing some task.");
                Thread.sleep(2000); // Simulating a time-consuming operation
                System.out.println("Thread 1 completed its task.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Creating the second thread
        Thread t2 = new Thread(() -> {
            try {
                System.out.println("Thread 2 is waiting for Thread 1 to complete.");
                t1.join(); // Waits for t1 to complete before proceeding
                System.out.println("Thread 2's operation after Thread 1 is complete.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _07_ThreadJoin
 * Description: This class demonstrates how to use the Thread.join() method to synchronize the execution of threads.
 * It creates two threads where the second thread (t2) waits for the first thread (t1) to complete before continuing its own execution.
 *
 * Methods:
 * - main(String[] args): The entry point of the program, demonstrating the join() method.
 *
 * Sample Output:
 * Thread 1 is executing some task.
 * Thread 2 is waiting for Thread 1 to complete.
 * Thread 1 completed its task.
 * Thread 2's operation after Thread 1 is complete.
 *
 * Interview Questions and Answers:
 * 1. What is the purpose of the Thread.join() method in Java?
 *    Answer: The purpose of the Thread.join() method is to allow one thread to wait for the completion of another. It is a mechanism of synchronization that ensures that a thread pauses its execution until the specified thread finishes its task.
 *
 * 2. Can Thread.join() be interrupted, and how does it handle interruptions?
 *    Answer: Yes, Thread.join() can be interrupted. If the thread on which join() is called is interrupted, it throws an InterruptedException. This means the thread is forced out of its waiting state and must either handle the exception or propagate it further.
 *
 * 3. How does join() help in thread synchronization?
 *    Answer: join() helps in thread synchronization by allowing threads to wait for others to complete, thus ensuring a certain order of execution. This is particularly useful when the execution of one thread depends on the completion of another, or when you need to ensure that resources used by multiple threads are processed in a controlled manner.
 *
 * Important Notes:
 * - The join() method is used to pause the execution of the calling thread until the specified thread completes its execution.
 * - If the join() method is interrupted, it throws an InterruptedException.
 * - Using join() is a simple way to ensure that one thread completes its execution before another thread starts or continues its task.
 */
