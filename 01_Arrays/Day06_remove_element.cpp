// Day: Day 06 (Problem 2)
// Date: 09 June 2026
// Problem Link: https://leetcode.com/problems/remove-element/
// Difficulty: Easy

// Approach:
// 1. Deployed a fast/slow two-pointer strategy.
// 2. The `index` pointer serves as the slow pointer, keeping track of the valid array boundary.
// 3. The `i` pointer acts as the fast scanner. If `nums[i]` does not equal the target value, 
//    it is written to the slow pointer's position.
// Time Complexity: O(N) single pass.
// Space Complexity: O(1) in-place modification.
// ==============================================================================

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int index = 0; // Tracks the placement position for valid elements
        
        for(int i = 0; i < nums.size(); i++){
            // If the element is NOT the target value, keep it
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
};

int main(){
    Solution s;
    return 0;
}