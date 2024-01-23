package org.example.threads;

/**
 * _06_ThreadSetName class demonstrates the usage of Thread.setName() method to set a custom name for a thread.
 * Thread.setName() is used to change the name of a thread.
 */
public class _06_ThreadSetName {

    /**
     * The main method creates a new thread, prints its default name, sets a custom name, and then prints the updated name.
     *
     * @param args The command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Creating a new thread using an anonymous Runnable
        Thread t = new Thread(new Runnable() {

            /**
             * The run method is called when the thread is started. It contains the code to be executed by the thread.
             */
            @Override
            public void run() {
                try {
                    // Print a message before sleeping
                    System.out.println("Before Sleep");

                    // Sleep for 1000 milliseconds (1 second)
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    // Throw a runtime exception if interrupted during sleep
                    throw new RuntimeException(e);
                }

                // Print a message after waking up from sleep
                System.out.println("After Sleep");
            }
        });

        // Print the default name of the thread (usually "Thread-0")
        System.out.println("Default Thread Name: " + t.getName());

        // Set a custom name for the thread
        t.setName("New Name Thread");

        // Print the updated name of the thread
        System.out.println("Updated Thread Name: " + t.getName());
    }
}

/**
 * Documentation
 * --------------
 * Class Name: _06_ThreadSetName
 * Description: This class demonstrates how to set a custom name for a thread in Java using the setName() method.
 * It shows the process of changing a thread's name from its default (like "Thread-0") to a user-defined name.
 *
 * Methods:
 * - main(String[] args): The entry point of the program, demonstrating the setName() method.
 *
 * Sample Output:
 * Default Thread Name: Thread-0
 * Updated Thread Name: New Name Thread
 *
 * Interview Questions and Answers:
 * 1. Why would you want to set a custom name for a thread in Java?
 *    Answer: Setting a custom name for a thread in Java is beneficial for easier identification, especially during debugging and monitoring. Custom names can make log files more readable and help in quickly identifying thread-related issues in a multi-threaded environment.
 *
 * 2. How can you retrieve the name of a thread?
 *    Answer: The name of a thread can be retrieved using the `getName()` method of the Thread class. This method returns the current name of the thread, which can be the default name or a custom name set using `setName()`.
 *
 * 3. Is it possible to change a thread's name while it is running?
 *    Answer: Yes, it is possible to change a thread's name while it is running. The `setName()` method can be called at any point in the thread's lifecycle, allowing for dynamic updates to the thread's name based on the application's requirements.
 *
 * Important Notes:
 * - Naming threads can make debugging and monitoring easier, as it allows for more readable thread identification.
 * - The `getName()` method of the Thread class is used to retrieve the current name of a thread.
 * - A thread's name can be changed at any point in its lifecycle, including while it is running.
 */
