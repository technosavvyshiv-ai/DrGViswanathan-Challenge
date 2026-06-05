// Day: Day 02 (Problem 1)
// Date: 05 June 2026
// Problem Link: https://leetcode.com/problems/valid-palindrome/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Used a range-based loop to iterate through the string and filtered out non-alphanumeric 
//    characters using `std::isalnum()`.
// 2. Converted valid characters to lowercase via `std::tolower()` and pushed them into a vector.
// 3. Created a copy of the vector, reversed it using `std::reverse()`, and compared the two 
//    to check if the string reads the same forwards and backwards.
// Time Complexity: O(N) where N is the length of the string.
// Space Complexity: O(N) auxiliary space to store the filtered character vectors.


#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <cctype>

using namespace std;

class Solution {
public:
    bool isPalindrome(string s) {
        vector<char> temp;

        // Filter out punctuation/spaces and convert text to lowercase
        for (int i = 0; i < s.size(); i++) {
            if (std::isalnum(s[i])) {
                temp.push_back(std::tolower(s[i]));
            }
        }

        // Create a separate vector copy to invert and compare
        vector<char> c = temp;
        std::reverse(temp.begin(), temp.end());

        // Returns true if the inverted layout matches the original layout
        return temp == c;
    }
};