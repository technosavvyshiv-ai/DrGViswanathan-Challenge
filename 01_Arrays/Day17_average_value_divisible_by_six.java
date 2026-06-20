// Day: Day 17 (Problem 1)
// Date: 20 June 2026
// Problem Link: https://leetcode.com/problems/average-value-of-even-numbers-that-are-divisible-by-three/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Optimized the condition mathematically: numbers that are both even (divisible by 2)
//    and divisible by 3 must be multiples of their Least Common Multiple, which is 6.
// 2. Ran a single range-based linear loop over the primitive integer array.
// 3. Isolated eligible numbers using `if (i % 6 == 0)`, adding them to a running sum 
//    and tracking the count.
// 4. Handled division-by-zero edge cases using an inline ternary operators block to safely 
//    return 0 if no matching digits exist.
// Time Complexity: O(N) linear single pass across the data set.
// Space Complexity: O(1) absolute auxiliary space footprint.
// ==============================================================================

class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        // Linear filter utilizing the combined modulo condition
        for (int i : nums) {
            if (i % 6 == 0) {
                count++;
                sum += i;
            }
        }
        
        // Ternary validation handles empty sets safely to prevent arithmetic division errors
        return count > 0 ? sum / count : 0;
    }
}