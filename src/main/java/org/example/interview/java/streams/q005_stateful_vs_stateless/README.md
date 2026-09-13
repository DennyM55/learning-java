# Question

What is the difference between stateful and stateless operations in Java Streams?

# Explanation

## The original problem

The original interview problem is about `q005_stateful_vs_stateless`. The interviewer is asking whether you can explain Stateful Vs Stateless clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

A Java Stream is a pipeline for processing values from a source such as a List. It does not store data itself; it describes operations to run on data.

Streams exist to make collection processing clearer: filter values, transform values, sort values, group values, and reduce many values into one result without manual loop boilerplate.

## How it works

The key idea in Stateful Vs Stateless is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect Stateful Vs Stateless to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Topic-specific interview detail

A stateless stream operation handles each element independently. A stateful operation needs memory of other elements. For example, map is usually stateless, while sorted and distinct are stateful because they must compare or remember multiple values.

## Step-by-step flow

```text
Problem -> Identify Stateful Vs Stateless -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Stateful Vs Stateless. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

This folder has a runnable Java example: `StatefulVsStateless.java`. The package is `org.example.interview.java.streams.q005_stateful_vs_stateless` so it belongs to this question folder.

## Important methods or components

- Stateful Vs Stateless = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

## Common mistakes

- Giving only a definition and not explaining the problem it solves.
- Forgetting the trade-off, limitation, or failure mode.
- Using an acronym without expanding it the first time.
- Describing a production design without mentioning validation, monitoring, or rollback where those concerns matter.

## Important clarification

This README is self-contained. Do not assume another question explains the same term. If a term matters to the answer, define it here before relying on it.

## When to use it

Use Stateful Vs Stateless when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Stateful Vs Stateless only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Stateful Vs Stateless by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Stateful Vs Stateless is mainly about solving this problem: What is the difference between stateful and stateless operations in Java Streams? I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

Reference source file: `StatefulVsStateless.java`.

Read the code from `main()` first, then follow each helper method in the order it is called. The expected output demonstrates the concept rather than a production-ready framework.

If execution order can vary because multiple threads run independently, treat the output order as illustrative unless this README states otherwise.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Stateful Vs Stateless solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Stateful Vs Stateless = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
