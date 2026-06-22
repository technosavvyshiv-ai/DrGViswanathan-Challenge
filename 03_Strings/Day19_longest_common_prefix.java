// Day: Day 19 (Problem 1)
// Date: 22 June 2026
// Problem Link: https://leetcode.com/problems/longest-common-prefix/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Leveraged alphabetical sorting properties via `Arrays.sort(strs)`. Sorting forces the 
//    most textually divergent elements to opposite ends of the array.
// 2. Isolated the lexicographically first string (`s1`) and the last string (`s2`).
// 3. Ran a linear character comparison loop solely between `s1` and `s2`, incrementing 
//    the tracking marker `idx` as long as characters match exactly.
// 4. Returned the shared prefix subset using Java's built-in `.substring(0, idx)`.
// Time Complexity: O(M * N log N) where N is the number of strings and M is the maximum string length due to sorting.
// Space Complexity: O(1) auxiliary space beyond the sorting mechanism execution overhead.
// ==============================================================================

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort alphabetically to put the most dissimilar strings at the absolute boundaries
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int idx = 0;

        // Compare characters between the first and last string only
        while (idx < s1.length() && idx < s2.length()) {
            if (s1.charAt(idx) == s2.charAt(idx)) {
                idx++;
            } else {
                break; // Mismatch found, terminate evaluation
            }
        }

        return s1.substring(0, idx);
    }
}