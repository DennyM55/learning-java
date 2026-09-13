# Question

How do you investigate a slow database query?

# Explanation

## The original problem

The original interview problem is about `q086_slow_query`. The interviewer is asking whether you can explain Slow Query clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

Performance work means finding why a program is slow or resource-heavy, proving the cause with data, and changing the smallest thing that fixes the real bottleneck.

A bottleneck is the part of a system that limits overall speed. It may be CPU, memory, database, network, file input/output, locks, or external services.

## How it works

The key idea in Slow Query is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect Slow Query to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Topic-specific interview detail

To investigate a slow query, reproduce it, inspect the execution plan, check missing or unused indexes, verify row counts, and measure before and after changes.

## Step-by-step flow

```text
Problem -> Identify Slow Query -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Slow Query. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

A standalone Java file is not required for this question right now. Add code later only if it teaches the concept better than text.

## Important methods or components

- Slow Query = topic for this stable question ID
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

Use Slow Query when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Slow Query only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Slow Query by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Slow Query is mainly about solving this problem: How do you investigate a slow database query? I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

No separate Java file is required for this question right now.

Use the explanation as the worked solution: state the problem, explain the concept, walk through a small example, then mention mistakes and trade-offs.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Slow Query solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Slow Query = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
