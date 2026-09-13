# Question

Find the first character in a string that does not repeat.

# Explanation

## The original problem

The original interview problem is about `q002_first_non_repeating_character`. The interviewer is asking whether you can explain First Non Repeating Character clearly, apply it to a real situation, and recognize the mistakes that make the answer unsafe or incomplete.

## Basic idea

A data structure is a way to organize values in memory. An algorithm is a repeatable set of steps used to solve a problem.

This question exists because interviewers want to see whether you can turn a problem statement into clear steps and explain time complexity, which means how running time grows as input grows.

## How it works

The key idea in First Non Repeating Character is to explain the purpose first, then the mechanism, then the trade-off.

A practical answer should connect First Non Repeating Character to a small example, mention what can go wrong, and describe how you would verify that the solution works.

## Topic-specific interview detail

Count how many times each character appears, then scan the original string again and return the first character whose count is one. The second scan matters because a map alone does not tell you which non-repeating character appeared first in the original order.

## Step-by-step flow

```text
Problem -> Identify First Non Repeating Character -> Choose approach -> Explain trade-off -> Verify result
```

## Practical example

Imagine a backend interview asks about First Non Repeating Character. A strong answer should not jump directly to syntax. It should explain the real problem, choose the simplest correct approach, and mention the limitation that would matter in production.

## Java or Spring Boot implementation

This folder has a runnable Java example: `FirstNonRepeatingCharacter.java`. The package is `org.example.interview.dsa.strings.q002_first_non_repeating_character` so it belongs to this question folder.

## Important methods or components

- First Non Repeating Character = topic for this stable question ID
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

Use First Non Repeating Character when the problem matches its purpose and the trade-offs are acceptable for the system you are building.

## When not to use it

Do not use First Non Repeating Character only because it sounds advanced. Avoid it when a simpler design is clearer, safer, or easier to operate.

## Comparison

Compare First Non Repeating Character by asking: what problem does it solve, what cost does it add, how does it fail, and what alternative would I use when requirements are different?

# Interview Answer

First Non Repeating Character is mainly about solving this problem: Find the first character in a string that does not repeat. I would start by explaining why the problem exists, then describe the mechanism in simple steps, and finally mention the trade-off. In a real project I would choose it only when it makes the code or system clearer, safer, or more scalable. I would also verify the behavior with a small example, tests, logs, or metrics depending on the topic.

# Solution

Reference source file: `FirstNonRepeatingCharacter.java`.

Read the code from `main()` first, then follow each helper method in the order it is called. The expected output demonstrates the concept rather than a production-ready framework.

If execution order can vary because multiple threads run independently, treat the output order as illustrative unless this README states otherwise.

# Common Follow-Up Questions

## What should I say first?

Start with the problem First Non Repeating Character solves, then explain the mechanism.

## What is the most common mistake?

Using the term without explaining the trade-off or failure case.

## How do I make the answer practical?

Add one small real-world scenario and describe the flow step by step.

# Quick Revision

- First Non Repeating Character = topic for this stable question ID
- Problem first = explain why the concept exists before syntax or tools
- Trade-off = benefit plus cost or risk
- Scenario = small real example that proves understanding

# Status

DONE
