// Day: Day 11 (Problem 1)
// Date: 14 June 2026
// Problem Link: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Instantiated a destination integer array `ans` with exactly twice the capacity 
//    of the input data array (`nums.length * 2`).
// 2. Optimized the data transfer using a single linear loop spanning the entire length of `ans`.
// 3. Applied the modulo operator arithmetic (`i % nums.length`) to continuously map and recycle 
//    the source indices, duplicating the sequence cleanly in-place.
// Time Complexity: O(N) where N is the length of the input array.
// Space Complexity: O(1) auxiliary space (excluding the output array required by the problem context).
// ==============================================================================

class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];

        // Single pass layout strategy using mathematical wrapping
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }
}