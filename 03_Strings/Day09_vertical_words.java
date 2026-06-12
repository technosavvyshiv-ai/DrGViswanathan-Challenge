// Day: Day 09 (Problem 1)
// Date: 12 June 2026
// Problem Link: https://leetcode.com/problems/print-words-vertically/
// Difficulty: easy

// Approach:
// 1. Tokenized the string into an array of words using space delimiters via `.split(" ")`.
// 2. Executed a linear scan to find the maximum word length, establishing the vertical height.
// 3. Implemented nested iterations to sample characters column-by-column. Used a ternary
//    operator to append a blank space if the current index exceeds a word's length boundary.
// 4. Cleaned up trailing spaces dynamically using Java's built-in `.stripTrailing()`.
// Time Complexity: O(N * M) where N is the number of words and M is the maximum word length.
// Space Complexity: O(N * M) to allocate memory for the matrix result arrays.
// ==============================================================================

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> printVertically(String s) {
        List<String> res = new ArrayList<String>();
        String[] arr = s.split(" ");
        int len = 0;
        
        // Find the length of the longest word
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > len) {
                len = arr[i].length();
            }
        }
        
        // Construct characters vertically column-by-column
        for (int i = 0; i < len; i++) {
            StringBuilder sb = new StringBuilder();
            for (String word : arr) {
                // Ternary check handles padding spaces if word is shorter than column index
                sb.append(i < word.length() ? word.charAt(i) : ' ');
            }
            res.add(sb.toString().stripTrailing());
        }
        return res;
    }
}