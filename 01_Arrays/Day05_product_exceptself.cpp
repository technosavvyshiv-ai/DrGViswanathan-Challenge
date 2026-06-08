// Day: Day 05 (Problem 2)
// Date: 08 June 2026
// Problem Link: https://leetcode.com/problems/product-of-array-except-self/
// Difficulty: Medium

// Approach:
// 1. Solved without the division operator by using prefix and suffix accumulations.
// 2. First pass (left-to-right): Calculated the product of all elements to the left 
//    of index 'i' and stored them directly in the result array.
// 3. Second pass (right-to-left): Tracked a running suffix product and multiplied 
//    it into the result array in-place.
// Time Complexity: O(N) traversing the array twice linearly.
// Space Complexity: O(1) auxiliary space (excluding the returned result array).
// ==============================================================================

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> res(n);

        // Pass 1: Calculate prefix products
        int pre = 1;
        for(int i = 0; i < n; i++) {
            res[i] = pre;
            pre *= nums[i];
        }

        // Pass 2: Calculate suffix products and multiply with prefixes in-place
        int suf = 1;
        for(int i = n - 1; i >= 0; i--) {
            res[i] *= suf;
            suf *= nums[i];
        }

        return res;
    }
};