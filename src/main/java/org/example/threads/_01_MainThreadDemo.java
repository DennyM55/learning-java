package org.example.threads;

/**
 * The MainThreadDemo class demonstrates basic properties and operations
 * of the main thread in a Java application.
 */
public class _01_MainThreadDemo {

    /**
     * The main method serves as the entry point of the application.
     *
     * @param args Command line arguments (not used in this demo)
     */
    public static void main(String[] args) {
        // Obtaining a reference to the currently executing thread (main thread)
        Thread currentThread = Thread.currentThread();

        // Displaying the thread's toString() representation, which includes
        // thread name, priority, and thread group information
        System.out.println(currentThread + "");

        // Displaying the name of the thread (default name is "main")
        System.out.println(currentThread.getName() + " <- Thread Name");

        // Displaying the priority of the thread (default is 5, NORM_PRIORITY)
        System.out.println(currentThread.getPriority() + " <- Default Thread Priority");
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _01_MainThreadDemo
 * Description: This class demonstrates the basic properties and operations of the main thread in a Java application.
 * The main thread is the initial thread that is created for any Java application. This class illustrates how to obtain 
 * a reference to the main thread, check its name, priority, and group.
 *
 * Methods:
 * - main(String[] args): Entry point of the application.
 *
 * Sample Output:
 * Thread[main,5,main] <- Thread toString() representation
 * main <- Thread Name
 * 5 <- Default Thread Priority
 *
 * Interview Questions and Answers:
 * 1. What is the main thread in a Java application?
 *    Answer: The main thread is the primary thread of any Java application, responsible for executing the main method.
 *
 * 2. How can you obtain a reference to the main thread?
 *    Answer: A reference to the main thread can be obtained by calling Thread.currentThread() within the main method.
 *
 * 3. What is the default priority of the main thread in Java?
 *    Answer: The default priority of the main thread in Java is 5, which is the NORM_PRIORITY constant in the Thread class.
 *
 * Important Notes:
 * - The main thread is crucial as it is responsible for executing the main method.
 * - Thread priorities in Java range from MIN_PRIORITY (1) to MAX_PRIORITY (10).
 */
