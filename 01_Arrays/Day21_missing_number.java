// Day: Day 21 (Final Day)
// Date: 24 June 2026
// Problem Link: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Leveraged mathematical Gauss summation principles to achieve an optimized single pass.
// 2. Computed the total expected sum of a contiguous arithmetic progression from 0 to N 
//    using the formula: (N * (N + 1)) / 2.
// 3. Accumulated the actual sum of elements present inside the input array via a linear loop.
// 4. The absolute difference between the expected total sum and the actual elements sum 
//    mathematically isolates the unique missing integer value.
// Time Complexity: O(N) linear single-pass runtime traversal.
// Space Complexity: O(1) constant auxiliary memory footprint.
// ==============================================================================

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Mathematical expected total sum formula for 0 to N range
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        // Traverse array to accumulate the true sum
        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        // The discrepancy matches the missing element exactly
        return expectedSum - actualSum;
    }
}