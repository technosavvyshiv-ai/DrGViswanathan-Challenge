// Day: Day 16 (Problem 1)
// Date: 19 June 2026
// Problem Link: https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Leveraged the sorted nature of the array to apply Binary Search boundaries.
// 2. Pass 1: Located the first strictly positive integer (> 0). The `left` pointer 
//    converges on the first index where positive numbers start, making `n - left` the total count.
// 3. Pass 2: Located the last strictly negative integer (< 0). The `right` pointer 
//    converges on the last index of negative numbers, making `right + 1` the total count.
// 4. Returned the maximum of both counts, naturally ignoring any zeros present in the dataset.
// Time Complexity: O(log N) due to executing two independent logarithmic binary search runs.
// Space Complexity: O(1) absolute auxiliary space footprint.
// ==============================================================================

class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        // Binary Search Pass 1: Find the boundary where strictly positive numbers begin
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1; // Narrow down to look for an earlier positive number
            } else {
                left = mid + 1;
            }
        }
        int positiveCount = n - left;

        // Reset pointers for the next pass
        left = 0;
        right = n - 1;

        // Binary Search Pass 2: Find the boundary where strictly negative numbers end
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1; // Narrow down to look for a later negative number
            } else {
                right = mid - 1;
            }
        }
        int negativeCount = right + 1;

        // Return the larger value between the two calculated sub-segment spaces
        return Math.max(positiveCount, negativeCount);
    }
}