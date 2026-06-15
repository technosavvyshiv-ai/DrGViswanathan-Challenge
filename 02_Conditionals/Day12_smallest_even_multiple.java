// Day: Day 12 (Problem 1)
// Date: 15 June 2026
// Problem Link: https://leetcode.com/problems/smallest-even-multiple/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Applied fundamental number theory constraints from Striver's Basic Math module.
// 2. Evaluated if the input integer `n` is natively divisible by 2 using the modulo operator.
// 3. If `n % 2 == 0`, `n` itself is the Least Common Multiple (LCM) of 2 and `n`.
// 4. Otherwise, if `n` is odd, the lowest shared multiple must scale up to `n * 2`.
// Time Complexity: O(1) constant runtime execution.
// Space Complexity: O(1) absolute auxiliary space.
// ==============================================================================

class Solution {
    public int smallestEvenMultiple(int n) {
        // If the number is already even, it is its own smallest even multiple
        if (n % 2 == 0) {
            return n;
        }
        
        // If the number is odd, doubling it guarantees the smallest even multiple
        return n * 2;
    }
}