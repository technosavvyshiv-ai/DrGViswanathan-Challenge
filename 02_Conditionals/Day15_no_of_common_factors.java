// Day: Day 15 (Problem 1)
// Date: 18 June 2026
// Problem Link: https://leetcode.com/problems/number-of-common-factors/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Optimized the search space by finding the minimum of the two integers (`a` and `b`).
// 2. A common factor cannot exceed the smaller value, safely allowing us to cap the loop boundary.
// 3. Executed a linear scan starting from 1 up to `smallerNumber`.
// 4. Used nested conditional checks to ensure that the current index `i` cleanly divides both 
//    `a` and `b` with a remainder of zero before incrementing the accumulator.
// Time Complexity: O(min(A, B)) constant upper bound based on the smaller input value.
// Space Complexity: O(1) absolute auxiliary space footprint.
// ==============================================================================

class Solution {
    public int commonFactors(int a, int b) {
        int answer = 0;
        int smallerNumber = 0;

        // Optimize execution bounds by targeting the smaller integer threshold
        if (a < b) {
            smallerNumber = a;
        } else {
            smallerNumber = b;
        }

        // Scan common factors up to the minimized mathematical boundary limit
        for (int i = 1; i <= smallerNumber; i++) {
            if (a % i == 0) {
                if (b % i == 0) {
                    answer = answer + 1;
                }
            }
        }
        return answer;
    }
}