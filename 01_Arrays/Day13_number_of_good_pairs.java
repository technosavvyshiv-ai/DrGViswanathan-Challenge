// Day: Day 13 (Problem 1)
// Date: 16 June 2026
// Problem Link: https://leetcode.com/problems/number-of-good-pairs/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Implemented a nested structural scan across the array space to locate duplicates.
// 2. The outer iteration locks down index `i`, while the inner pointer `j` scans from 
//    `i + 1` to the array's boundary limit.
// 3. This coordinate offset implicitly preserves the mathematical rule (i < j) and 
//    increments the tracking total when `nums[i] == nums[j]`.
// Time Complexity: O(N^2) due to the nested linear matrix traversal.
// Space Complexity: O(1) absolute auxiliary space footprint.
// ==============================================================================

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        // Outer loop isolates the primary element reference point
        for (int i = 0; i < nums.length; i++) {
            // Inner loop scans forward elements to avoid checking self or duplicates backwards
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}