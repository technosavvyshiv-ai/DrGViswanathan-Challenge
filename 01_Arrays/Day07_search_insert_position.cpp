// Day: Day 07 (Problem 1)
// Date: 10 June 2026
// Problem Link: https://leetcode.com/problems/search-insert-position/
// Difficulty: Easy

// Approach:
// 1. Implemented a classic Binary Search pattern to achieve logarithmic time.
// 2. Used an initial boundary check: if the target is larger than the final element, 
//    it must be inserted at index `nums.size()`.
// 3. Maintained `low` and `high` pointers, updating `mid` to continually bisect the array.
// 4. If the element is missing, the `low` pointer naturally converges to the correct insert index.
// Time Complexity: O(log N) due to the binary search bisection.
// Space Complexity: O(1) auxiliary space.
// ==============================================================================

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size();
        int mid;

        // Early check: if target belongs at the very end
        if (target > nums[high - 1]) {
            return high;
        }

        while (low <= high) {
            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            }

            if (target < nums[mid]) {
                high = mid - 1; // Narrow search to left half
            } else {
                low = mid + 1;  // Narrow search to right half
            }
        }

        return low; // Converted insertion index
    }
};

int main(){
    Solution s;
    vector<int> nums = {2, 3};
    int result = s.searchInsert(nums, 5);
    cout << result << endl;
    return 0;
}