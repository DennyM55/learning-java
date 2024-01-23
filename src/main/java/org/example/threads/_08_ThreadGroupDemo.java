package org.example.threads;

/**
 * _08_ThreadGroupDemo class demonstrates the usage of ThreadGroup in Java.
 * ThreadGroup is a way to organize and manage threads in Java.
 */
public class _08_ThreadGroupDemo {

    /**
     * The main method creates a ThreadGroup, three threads, and demonstrates basic operations on the thread group.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating a new ThreadGroup
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");

        // Creating a common Runnable for threads
        Runnable r = () -> System.out.println("Thread created is :" + Thread.currentThread().getName());

        // Creating three threads and associating them with the ThreadGroup
        var t1 = new Thread(threadGroup, r, "one");
        var t2 = new Thread(threadGroup, r, "two");
        var t3 = new Thread(threadGroup, r, "three");

        // Starting the threads
        t1.start();
        t2.start();
        t3.start();

        // Displaying ThreadGroup information
        System.out.println("Thread Group Name: " + threadGroup.getName());
        threadGroup.list(); // Output shows information about threads in the ThreadGroup
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _08_ThreadGroupDemo
 * Description: This class demonstrates the concept of ThreadGroup in Java, which is used for organizing and managing threads.
 * The example creates a ThreadGroup and associates multiple threads with it, showing how to manage threads as a group.
 *
 * Methods:
 * - main(String[] args): The entry point of the program, demonstrating the creation and management of a ThreadGroup.
 *
 * Sample Output:
 * Thread created is :one
 * Thread created is :two
 * Thread created is :three
 * Thread Group Name: ThreadGroup
 * java.lang.ThreadGroup[name=ThreadGroup,maxpri=10]
 *     Thread[one,5,ThreadGroup]
 *     Thread[two,5,ThreadGroup]
 *     Thread[three,5,ThreadGroup]
 *
 * Interview Questions and Answers:
 * 1. What is a ThreadGroup and what are its benefits in Java?
 *    Answer: A ThreadGroup in Java is a mechanism for organizing a collection of threads into a single object. It allows for collective management and control of threads, such as setting priorities and handling exceptions in a uniform manner. It is particularly beneficial for grouping related threads, simplifying thread management, and enforcing security policies in larger applications.
 *
 * 2. How can you control the priority of threads in a ThreadGroup?
 *    Answer: The priority of threads within a ThreadGroup can be controlled using the setMaxPriority(int) method of the ThreadGroup class. This sets the maximum allowed priority for threads in the group. Individual threads can have their priorities set within the limits of the ThreadGroup's maximum priority.
 *
 * 3. What are some common methods provided by the ThreadGroup class for managing threads?
 *    Answer: Common methods provided by the ThreadGroup class include:
 *    - activeCount(): Returns the number of active threads in the group.
 *    - enumerate(): Copies every active thread in the group into a provided array.
 *    - interrupt(): Interrupts all threads in the group.
 *    - isDaemon(): Checks if the thread group is a daemon group.
 *    - setDaemon(): Sets the daemon status of the thread group.
 *    - destroy(): Destroys the thread group and all its subgroups.
 *
 * Important Notes:
 * - ThreadGroup allows for collective control over groups of threads, such as starting, stopping, or checking the status of multiple threads simultaneously.
 * - Thread priorities within a ThreadGroup can be controlled collectively, and new threads in a group inherit the priority of the group.
 * - Common methods in the ThreadGroup class include activeCount(), enumerate(), and destroy(), among others, providing various ways to manage and monitor threads within the group.
 */
