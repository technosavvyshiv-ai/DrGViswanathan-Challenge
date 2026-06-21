// Day: Day 18 (Problem 1)
// Date: 21 June 2026
// Problem Link: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Avoided the unoptimized O(N log N) sorting strategy by implementing a single-pass scan.
// 2. Maintained two state variables, `max1` and `max2`, representing the highest and 
//    second-highest values found in the primitive array.
// 3. For each element, if it exceeds `max1`, cascaded the current maximum down to `max2`
//    before updating `max1`. Otherwise, checked if it uniquely updates `max2`.
// 4. Returned the computed mathematical product `(max1 - 1) * (max2 - 1)`.
// Time Complexity: O(N) linear single-pass traversal.
// Space Complexity: O(1) absolute auxiliary space footprint.
// ==============================================================================

class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;

        // Single pass stream tracking the top two maximum values
        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Cascade old maximum down to second place
                max1 = num;  // Update primary maximum
            } else if (num > max2) {
                max2 = num;  // Update secondary maximum
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}