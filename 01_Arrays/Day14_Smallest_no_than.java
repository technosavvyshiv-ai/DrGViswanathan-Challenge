// Day: Day 14 (Problem 1)
// Date: 17 June 2026
// Problem Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Established a tracking array `ans` matching the length of the input dataset.
// 2. Used a nested loop execution path to perform a full relational search across the array.
// 3. For every element pinned by the outer loop index `i`, the inner iteration `j` evaluates 
//    the complete space, incrementing a scalar tracker whenever a smaller value is encountered.
// 4. Committed the tally to the respective index mapping and reset the scalar counter to zero.
// Time Complexity: O(N^2) due to the complete exhaustive nested array scan.
// Space Complexity: O(1) auxiliary space (excluding the allocated output array).
// ==============================================================================

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int k = 0;

        // Outer loop selects the targeted item for evaluation
        for (int i = 0; i < nums.length; i++) {
            // Inner loop exhaustively scans the entire dataset to compare elements
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    k = k + 1;
                }
            }
            ans[i] = k; // Map the gathered total count
            k = 0;      // Reset tracking state variable for the next pass
        }

        return ans;
    }
}