// Day: Day 05 (Problem 1)
// Date: 08 June 2026
// Problem Link: https://leetcode.com/problems/maximum-subarray/
// Difficulty: Medium

// Approach:
// 1. Implemented Kadane's Algorithm to find the maximum contiguous subarray sum.
// 2. Maintained a `currentSum` that accumulates array values. If `currentSum` drops 
//    below 0, it resets to 0 (discarding the negative prefix).
// 3. Continuously updated `maxSum` with the highest `currentSum` encountered.
// Time Complexity: O(N) as it processes the array in a single pass.
// Space Complexity: O(1) auxiliary space.
// ==============================================================================

#include <iostream>
#include <vector>
#include <climits> // Required for INT_MIN

using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum = INT_MIN;
        int currentSum = 0;

        for (int i = 0; i < nums.size(); i++) {
            currentSum += nums[i];

            // Update max if current contiguous sum is the highest seen so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If the running sum becomes negative, it's a liability. Reset it to 0.
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }
};