package org.example.threads;

/**
 * The MainThreadDemo class demonstrates basic properties and operations
 * of the main thread in a Java application.
 */
public class MainThreadDemo {

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
