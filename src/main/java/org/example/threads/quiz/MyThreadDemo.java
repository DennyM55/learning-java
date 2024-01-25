package org.example.threads.quiz;

public class MyThreadDemo extends Thread {

    public void run() {

        System.out.println("Thread is running");

    }


    public static void main(String[] args) {

        MyThreadDemo obj = new MyThreadDemo();

        obj.setPriority(7);// 1

        obj.start();// 2

        obj.setDaemon(true);// 3

    }

}