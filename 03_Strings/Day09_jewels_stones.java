// Day: Day 09 (Problem 2)
// Date: 12 June 2026
// Problem Link: https://leetcode.com/problems/jewels-and-stones/
// Difficulty: Easy

// Approach:
// 1. Initialized an integer counter to keep track of matched jewel tokens.
// 2. Scanned through the `stones` string character by character using a linear loop.
// 3. Leveraged Java's built-in `.indexOf()` function to search for the character's presence
//    within the `jewels` sequence. If the returned index is not -1, incremented the total.
// Time Complexity: O(J * S) where J is the length of jewels and S is the length of stones.
// Space Complexity: O(1) auxiliary space as lookup is executed directly on the string parameters.
// ==============================================================================

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
        
        // Iterate through each stone and check if it matches a jewel character type
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                num++;
            }
        }
        return num;
    }
}