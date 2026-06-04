// Challenge: #DrGViswanathan Challenge
// Day: Day 01 (Problem 2)
// Date: 04 June 2026
// Problem Link: https://leetcode.com/problems/fizz-buzz/
// Difficulty: Easy
// Approach:
// 1. Used a standard linear loop running from 1 to n to evaluate each number.
// 2. Ordered the conditional checks starting with the strict compound condition 
//    (divisible by both 3 and 5) to prevent early termination errors on multiples of 15.
// 3. Handled string conversions for regular numbers using C++ standard `to_string()`.
// Time Complexity: O(N) since we iterate exactly n times.
// Space Complexity: O(1) auxiliary space (excluding the output vector required by the system).

class Solution {
public:
    vector<string> fizzBuzz(int n) {
        vector<string> ans;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.push_back("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.push_back("Fizz");
            } else if (i % 5 == 0) {
                ans.push_back("Buzz");
            } else {
                ans.push_back(to_string(i));
            }
        }

        return ans;
    }
};