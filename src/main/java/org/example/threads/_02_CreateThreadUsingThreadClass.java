package org.example.threads;

/**
 * The _02_CreateThreadUsingThreadClass class demonstrates the creation and running
 * of a thread using the Thread class in Java.
 */
public class _02_CreateThreadUsingThreadClass extends Thread {

    /**
     * Main method - the entry point of the program.
     * It creates an instance of this class and starts the thread.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        _02_CreateThreadUsingThreadClass thread = new _02_CreateThreadUsingThreadClass();
        thread.start(); // Initiating the thread execution
    }

    /**
     * This method is executed when the thread is started.
     * It overrides the run method from the Thread class.
     */
    @Override
    public void run() {
        // Code to be executed in this thread
        System.out.println("Thread is running.");
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _02_CreateThreadUsingThreadClass
 * Description: This class demonstrates the creation and running of a thread by extending the Thread class in Java.
 * It extends the Thread class and overrides the run() method to define the code that constitutes the new thread.
 *
 * Methods:
 * - run(): The entry point for the thread.
 * - main(String[] args): Creates an instance of _02_CreateThreadUsingThreadClass and starts the thread.
 *
 * Sample Output:
 * Thread is running.
 *
 * Interview Questions and Answers:
 * 1. How do you create a thread by extending the Thread class in Java?
 *    Answer: To create a thread by extending the Thread class, you create a subclass of Thread and override its run() method. Then, you create an instance of your subclass and call its start() method to begin the thread's execution.
 *
 * 2. What is the role of the run() method in a thread?
 *    Answer: The run() method defines the code that constitutes the new thread's task. When a thread is started using its start() method, the JVM calls the run() method of that thread to execute its task.
 *
 * 3. Can you start a thread twice in Java? What happens if you do?
 *    Answer: No, you cannot start a thread twice in Java. Once a thread has completed its execution, it cannot be restarted. Attempting to start a thread that has already been started will throw a java.lang.IllegalThreadStateException.
 *
 * Important Notes:
 * - A thread created by extending the Thread class must override the run() method.
 * - The start() method of the Thread class is used to start the newly created thread.
 * - Attempting to start a thread that is already started will throw a java.lang.IllegalThreadStateException.
 */
