// Day: Day 06 (Problem 1)
// Date: 09 June 2026
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy

// Approach:
// 1. Utilized a two-pointer approach to modify the array in-place.
// 2. The `index` pointer tracks the position for the next unique element.
// 3. Iterated through the array starting at index 1. If the current element differs 
//    from the previous one, it's unique—placed it at `nums[index]` and incremented `index`.
// Time Complexity: O(N) as it requires a single linear pass.
// Space Complexity: O(1) auxiliary space (in-place modification).
// ==============================================================================

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int index = 1; // Start placing unique elements at index 1
        
        for (int i = 1; i < nums.size(); i++) {
            // If current element is different from the previous, it is a new unique number
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // The index variable naturally represents the count of unique elements
        return index;
    }
};