// Day: Day 10 (Problem 1)
// Date: 13 June 2026
// Problem Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy

// Approach:
// 1. Converted the incoming primitive integer `x` to a string object using `String.valueOf()`.
// 2. Implemented a two-pointer meeting logic traversing only up to the midpoint (`n / 2`).
// 3. Compared the character at index `i` directly with its symmetric counterpart at `n - i - 1`.
//    If any pairing fails the check, it triggers an immediate early return of false.
// Time Complexity: O(D) where D is the number of digits in the integer.
// Space Complexity: O(D) memory representation required to allocate the temporary string.
// ==============================================================================

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();

        // Check characters from both ends moving towards the center
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false; // Early exit on mismatch
            }
        }

        return true; // Symmetrical mapping verified
    }
}