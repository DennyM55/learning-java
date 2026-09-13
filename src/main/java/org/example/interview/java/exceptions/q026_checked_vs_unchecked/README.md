# Question

What is the difference between checked and unchecked exceptions?

# Explanation

## The original problem

The original interview problem is about `q026_checked_vs_unchecked`. The interviewer is asking whether you can explain Checked Vs Unchecked clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

An exception is an object that represents an abnormal situation. Java uses exceptions so normal logic and error handling do not have to be mixed everywhere.

A checked exception must be declared or handled at compile time. Compile time means when Java checks and builds the code. An unchecked exception does not need to be declared.

## How it works

The key idea in Checked Vs Unchecked is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect Checked Vs Unchecked to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Topic-specific interview detail

Use checked exceptions for recoverable situations the caller is expected to handle, such as a missing file. Use unchecked exceptions for programming errors or cases where forcing every caller to catch the error would add noise.

## Step-by-step flow

```text
Problem -> Identify Checked Vs Unchecked -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about Checked Vs Unchecked. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

A standalone Java file is not required for this question right now. Add code later only if it teaches the concept better than text.

## Important methods or components

- Checked Vs Unchecked = topic for this stable question ID
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

Use Checked Vs Unchecked when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use Checked Vs Unchecked only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare Checked Vs Unchecked by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

Checked Vs Unchecked is mainly about solving this problem: What is the difference between checked and unchecked exceptions? I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

No separate Java file is required for this question right now.

Use the explanation as the worked solution: state the problem, explain the concept, walk through a small example, then mention mistakes and trade-offs.

# Common Follow-Up Questions

## What should I say first?

Start with the problem Checked Vs Unchecked solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- Checked Vs Unchecked = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
