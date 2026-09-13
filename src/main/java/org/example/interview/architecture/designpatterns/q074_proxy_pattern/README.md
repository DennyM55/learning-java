# Question

Explain the Proxy design pattern.

# Explanation

## The original problem

The original interview problem is about `q074_proxy_pattern`. The interviewer is asking whether you can explain Proxy Pattern clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

Architecture is the set of important design decisions that shape a system: responsibilities, boundaries, data flow, failure handling, deployment, and long-term change.

A design pattern is a reusable solution shape for a common design problem. It is not a library; it is a way to arrange classes or components.

## How it works

A proxy is a substitute object that controls access to a real object.

Client -> Proxy -> Real object

In Spring, many features work through proxy objects. For example, a transactional service method may be called through a proxy so Spring can start and finish the transaction around the method call.

## Step-by-step flow

```text
Problem -> Identify Proxy Pattern -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Proxy Pattern. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

A standalone Java file is not required for this question right now. Add code later only if it teaches the concept better than text.

## Important methods or components

- Proxy Pattern = topic for this stable question ID
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

Use Proxy Pattern when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Proxy Pattern only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Proxy Pattern by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Proxy Pattern is mainly about solving this problem: Explain the Proxy design pattern. I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

No separate Java file is required for this question right now.

Use the explanation as the worked solution: state the problem, explain the concept, walk through a small example, then mention mistakes and trade-offs.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Proxy Pattern solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Proxy Pattern = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
