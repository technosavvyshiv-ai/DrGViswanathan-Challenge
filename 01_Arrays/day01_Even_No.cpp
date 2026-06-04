// Day: Day 01 (Problem 1)
// Date: 04 June 2026
// Problem Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Difficulty: Easy

// Approach:
// 1. Iterated through the array of integers and passed each number to a helper function.
// 2. Counted the number of digits by repeatedly dividing the integer by 10 until it hit 0.
// 3. Optimized the parity check using the bitwise AND operator (digitCount & 1). 
//    If the result is 0, the digit count is even. This runs faster than standard modulo (%) operations.
// Time Complexity: O(N * D) where N is the number of elements and D is the number of digits.
// Space Complexity: O(1) auxiliary space as no extra data structures were used.

class Solution {
public:
 
    bool hasEvenDigits(int num) {
        int digitCount = 0;
        while (num) {
            digitCount++;
            num /= 10;
        }
        return (digitCount & 1) == 0;
    }

    int findNumbers(vector<int>& nums) {
    
        int evenDigitCount = 0;

        for (int num : nums) {
            if (hasEvenDigits(num))
                evenDigitCount++;
        }

        return evenDigitCount;
    }
};