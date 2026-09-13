# Question

How do microservices communicate with each other?

# Explanation

## The original problem

The original interview problem is about `q063_service_communication`. The interviewer is asking whether you can explain Service Communication clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

A microservice is a small independently deployable service focused on one business capability. Independently deployable means it can be released without rebuilding the entire system.

A distributed system is a system split across multiple processes or machines. Failures become partial: one service can be healthy while another is slow or unavailable.

## How it works

The key idea in Service Communication is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect Service Communication to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Step-by-step flow

```text
Problem -> Identify Service Communication -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Service Communication. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

A standalone Java file is not required for this question right now. Add code later only if it teaches the concept better than text.

## Important methods or components

- Service Communication = topic for this stable question ID
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

Use Service Communication when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Service Communication only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Service Communication by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Service Communication is mainly about solving this problem: How do microservices communicate with each other? I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

No separate Java file is required for this question right now.

Use the explanation as the worked solution: state the problem, explain the concept, walk through a small example, then mention mistakes and trade-offs.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Service Communication solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Service Communication = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
