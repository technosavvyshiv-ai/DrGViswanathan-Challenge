// Day: Day 04 (Problem 2)
// Date: 07 June 2026
// Problem Link: https://codeforces.com/problemset/problem/71/A
// Difficulty: 800 Rating (Codeforces)
// Approach:
// 1. Captured the initial integer `n` to determine the loop boundary.
// 2. Extracted the length of each string dynamically using `.length()`.
// 3. For strings exceeding 10 characters, constructed the abbreviation by isolating
//    index [0], calculating the intermediate distance (length - 2), and appending 
//    the final index [length - 1].
// Time Complexity: O(N) where N is the number of words processed.
// Space Complexity: O(1) beyond the memory required to hold the active string.

#include <iostream>
#include <string>

using namespace std;

int main() {
    int n;
    // Read how many words we need to process
    cin >> n;
    
    // Loop 'n' times to process each word one by one
    for (int i = 0; i < n; i++) {
        string word;
        cin >> word;
        
        // Get the total length of the word
        int length = word.length();
        
        // Check if the word is strictly longer than 10 characters
        if (length > 10) {
            // Print first letter, the count of middle letters, and the last letter
            cout << word[0] << (length - 2) << word[length - 1] << endl;
        } 
        else {
            // If it's 10 characters or less, print the word as it is
            cout << word << endl;
        }
    }
    
    return 0;
}