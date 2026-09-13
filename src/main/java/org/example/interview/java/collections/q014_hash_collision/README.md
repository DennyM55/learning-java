# Question

What is a hash collision, and how does HashMap handle it?

# Explanation

## The original problem

The original interview problem is about `q014_hash_collision`. The interviewer is asking whether you can explain Hash Collision clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

A collection is an object that stores multiple values. Java collections exist so we can choose storage based on the operation we need most: lookup, insertion, ordering, or queueing.

A map stores key-value pairs. A key is the lookup value, and a value is the data attached to that key. A list stores values by position. A queue stores values in the order they should be processed.

## How it works

The key idea in Hash Collision is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect Hash Collision to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Topic-specific interview detail

A hash collision happens when two different keys land in the same bucket. HashMap handles this by storing multiple entries in that bucket and comparing keys with equals to find the correct one.

## Step-by-step flow

```text
Problem -> Identify Hash Collision -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Hash Collision. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

This folder has a runnable Java example: `HashCollisionExample.java`. The package is `org.example.interview.java.collections.q014_hash_collision` so it belongs to this question folder.

## Important methods or components

- Hash Collision = topic for this stable question ID
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

Use Hash Collision when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Hash Collision only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Hash Collision by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Hash Collision is mainly about solving this problem: What is a hash collision, and how does HashMap handle it? I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

Reference source file: `HashCollisionExample.java`.

Read the code from `main()` first, then follow each helper method in the order it is called. The expected output demonstrates the concept rather than a production-ready framework.

If execution order can vary because multiple threads run independently, treat the output order as illustrative unless this README states otherwise.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Hash Collision solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Hash Collision = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
