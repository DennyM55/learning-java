package org.example.interview.java.lambda.q009_lambda_vs_anonymous_class;

import java.util.function.Consumer;

public class LambdaVsAnonymousClass {

    public static void main(String[] args) {

        // Anonymous class
        Consumer<String> anonymous = new Consumer<>() {
            @Override
            public void accept(String name) {
                System.out.println("Anonymous: " + name);
            }
        };

        // Lambda
        Consumer<String> lambda =
                name -> System.out.println("Lambda: " + name);

        anonymous.accept("Denny");
        lambda.accept("Denny");
    }
}