// Day: Day 20 (Problem 1)
// Date: 23 June 2026
// Problem Link: https://leetcode.com/problems/merge-sorted-array/
// Difficulty: Easy
// ==============================================================================
// Approach:
// 1. Leveraged the built-in padding space at the tail end of `nums1` (starting from index `m`).
// 2. Used a coordinated dual-pointer loop to inject all elements from `nums2` directly into 
//    the trailing zero positions of `nums1`.
// 3. Sorted the unified container using `Arrays.sort(nums1)` to guarantee a valid non-decreasing 
//    order across the newly combined dataset.
// Time Complexity: O((M + N) log(M + N)) due to sorting the full combined length of both arrays.
// Space Complexity: O(1) auxiliary space as modifications are executed completely in-place.
// ==============================================================================

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling nums1 from the index where valid elements end (index m)
        for (int j = 0; j < n; i = m; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        
        // Restore overall sorted order in-place
        Arrays.sort(nums1);
    }
}