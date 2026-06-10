// Day: Day 07 (Problem 2)
// Date: 10 June 2026
// Problem Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Approach:
// 1. Walked through the string backwards starting from the final character.
// 2. Used a boolean flag `counting` to identify when we cross from trailing whitespace 
//    into the actual alphanumeric characters of the last word.
// 3. Incremented the tracking variable for every character belonging to that word, 
//    and triggered an immediate break the moment a space is encountered after counting.
// Time Complexity: O(N) where N is the length of the string (worst case with no trailing spaces).
// Space Complexity: O(1) auxiliary space since modification is done completely in-place.
// ==============================================================================

#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int lengthOfLastWord(string s) {
        int length = 0;
        bool counting = false;

        // Scan backwards to isolate the final word instantly
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] != ' ') {
                counting = true; // Started reading character blocks
                length++;
            } 
            else if (counting) {
                // If we encounter a space AFTER we started counting, the last word is finished
                break;
            }
        }

        return length;
    }
};