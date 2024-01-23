package org.example.threads;

public class _03_CreateThreadUsingRunnableInterface implements Runnable {
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        System.out.println("_03_CreateThreadUsingRunnableInterface.run");
    }

    public static void main(String[] args) {
        _03_CreateThreadUsingRunnableInterface r = new _03_CreateThreadUsingRunnableInterface();
        Thread t = new Thread(r);
        t.start();
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _03_CreateThreadUsingRunnableInterface
 * Description: This class demonstrates creating a thread using the Runnable interface in Java.
 * It implements the Runnable interface and defines the run() method. A Thread object is then created by passing
 * an instance of this class and started.
 *
 * Methods:
 * - run(): Contains the code executed by the new thread.
 * - main(String[] args): Creates an instance of _03_CreateThreadUsingRunnableInterface and starts the thread.
 *
 * Sample Output:
 * _03_CreateThreadUsingRunnableInterface.run
 *
 * Interview Questions and Answers:
 * 1. What are the advantages of creating a thread using the Runnable interface over extending the Thread class?
 *    Answer: The main advantage of using the Runnable interface is that it enables the class to extend another class, as Java does not support multiple inheritance. Additionally, implementing Runnable makes the class more flexible, as it can be executed in contexts other than threads, and facilitates a clearer separation of the thread task from the Thread object.
 *
 * 2. How do you start a thread when you implement the Runnable interface?
 *    Answer: To start a thread when implementing the Runnable interface, you first create an instance of your Runnable class. Then, you create an instance of the Thread class, passing your Runnable object as a parameter to the Thread constructor. Finally, you call the start() method on the Thread instance to begin execution.
 *
 * 3. Can a single instance of a Runnable be shared among multiple threads?
 *    Answer: Yes, a single instance of a Runnable can be shared among multiple threads. When you pass the same Runnable instance to multiple Thread objects, each thread executes the same run() method, which can be useful for reducing the memory footprint and managing shared resources.
 *
 * Important Notes:
 * - Implementing the Runnable interface is preferred over extending the Thread class as it allows the class to extend
 *   other classes.
 * - The Runnable interface is functional and can be used with lambda expressions in Java 8 and above.
 * - Multiple threads can share the same instance of a Runnable, allowing for a lighter memory footprint.
 */
