# Question

What is the difference between a Lambda expression and an Anonymous Class in Java?

# Explanation

Both can provide an implementation of an interface.

Lambda:

`name -> System.out.println(name)`

Anonymous class:

`new Consumer<String>() { ... }`

Main differences:

- Lambda works with a Functional Interface — an interface with one abstract method.
- Anonymous class can implement interfaces with multiple abstract methods.
- Lambda is shorter and has less boilerplate.
- In a lambda, `this` refers to the enclosing object.
- In an anonymous class, `this` refers to the anonymous-class object itself.

# Interview Answer

"A lambda is a concise way to provide an implementation of a functional interface. An anonymous class creates a separate anonymous class implementation and can contain additional state and methods. Another important difference is `this`: inside a lambda it refers to the enclosing object, while inside an anonymous class it refers to the anonymous-class instance."

# Solution

See `LambdaVsAnonymousClass.java`.

# Status

DONE