# Question

Find the maximum sum of a contiguous subarray using Kadane's algorithm.

Example:

Input: `[-2, 1, -3, 4, -1, 2, 1, -5, 4]`

Output: `6`

The maximum-sum contiguous subarray is `[4, -1, 2, 1]`.

# Explanation

At each number, we have only two choices:

1. Start a new subarray from the current number.
2. Continue the previous subarray by adding the current number.

So:

`currentSum = max(current number, currentSum + current number)`

We also keep `maxSum`, which remembers the largest sum found anywhere so far.

Example:

- When we reach `4`, carrying the previous negative sum is useless, so we start again from `4`.
- Then `4 + (-1) + 2 + 1 = 6`.
- No later subarray beats `6`.

Time Complexity: `O(n)`

Space Complexity: `O(1)`

# Interview Answer

"Kadane's algorithm scans the array once. At every element, I decide whether to start a new subarray from the current element or extend the previous subarray. I maintain the best sum ending at the current position and the best overall sum. Therefore the solution is O(n) time and O(1) space."

# Solution

See `MaximumSubarrayKadane.java`.

# Status

DONE