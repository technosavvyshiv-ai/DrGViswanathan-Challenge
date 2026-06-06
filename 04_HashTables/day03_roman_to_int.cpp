// Day: Day 03 (Problem 1)
// Date: 06 June 2026
// Problem Link: https://leetcode.com/problems/roman-to-integer/

// Approach:
// 1. Created a private helper function `val()` to map Roman character tokens to integer values.
// 2. Traversed the string linearly. For each character, compared its value against the next token.
// 3. If a smaller character precedes a larger one (e.g., IV), subtracted its value from the sum.
//    Otherwise, added the value to the accumulated total.
// Time Complexity: O(N) where N is the length of the Roman numeral string.
// Space Complexity: O(1) auxiliary space as character mapping uses fixed conditional branches.


#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        int sum = 0;

        for (int i = 0; i < s.size(); i++) {
            int cur = val(s[i]);

            // If current token is smaller than the next token, subtract it (Subtraction Rule)
            if (i < s.size() - 1 && cur < val(s[i + 1])) {
                sum -= cur;
            } else {
                sum += cur;
            }
        }

        return sum;
    }

private:
    // Simulated Hash Mapping for token conversions
    int val(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
};