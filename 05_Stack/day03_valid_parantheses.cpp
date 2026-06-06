// Day: Day 03 (Problem 2)
// Date: 06 June 2026
// Problem Link: https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy

// Approach:
// 1. Used an `unordered_map` to establish relationships between closing and opening brackets.
// 2. Utilized a `std::stack` to track open bracket histories sequentially.
// 3. For closing tokens, validated matching pairs with the stack's top element before popping.
//    Invalid matches or early underflows drop out instantly via an early return false.
// Time Complexity: O(N) since we process every character in the string exactly once.
// Space Complexity: O(N) auxiliary space for the stack allocation during worst-case nesting profiles.
// ==============================================================================

#include <iostream>
#include <string>
#include <unordered_map>
#include <stack>

using namespace std;

class Solution {
public:
    bool isValid(string s) {
        // Map closing brackets to matching opening partners
        unordered_map<char, char> map = {
            {')', '('},
            {'}', '{'},
            {']', '['}
        };
        
        stack<char> st;

        for (char c : s) {
            // If the character is a closing bracket
            if (map.count(c)) {
                // Ensure stack isn't empty and the top matches the opening counterpart
                if (st.empty() || st.top() != map[c]) {
                    return false;
                }
                st.pop(); // Clear successfully validated pair
            } else {
                // If it's an opening bracket, push onto stack trace
                st.push(c);
            }
        }
        
        // Returns true if all open balances were cleared successfully
        return st.empty();
    }
};