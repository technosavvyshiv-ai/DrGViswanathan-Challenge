// Day: Day 04 (Problem 1)
// Date: 07 June 2026
// Problem Link: https://codeforces.com/problemset/problem/4/A
// Difficulty: 800 Rating (Codeforces)

// Approach:
// 1. Read the integer weight of the watermelon.
// 2. Evaluated if the weight is strictly greater than 2 and is an even number.
// 3. The `w > 2` check prevents the edge case of 2, which can only be divided 
//    into two odd numbers (1 and 1).
// Time Complexity: O(1) as it executes a single constant-time conditional check.
// Space Complexity: O(1) auxiliary space.
// ==============================================================================

#include <iostream>

using namespace std;

int main() {
    int w;
    
    // Take the input for the weight of the watermelon
    cin >> w;
    
    // Check if the weight is greater than 2 AND it is an even number
    if (w > 2 && w % 2 == 0) {
        cout << "YES" << endl;
    } 
    else {
        cout << "NO" << endl;
    }
    
    return 0;
}