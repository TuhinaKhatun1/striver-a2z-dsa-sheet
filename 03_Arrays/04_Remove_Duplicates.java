// Problem: Remove Duplicates from Sorted Array
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// Since array is sorted, duplicates are adjacent.
// We keep only unique elements using two pointers.

// ------------------------------------------------------
// ⚙️ Approach:
// 1. Use pointer i to track position of unique elements
// 2. Traverse array with j
// 3. If nums[j] != nums[i], move nums[j] to next position
// 4. Increase i

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

// ------------------------------------------------------
// 💡 Pattern: Two Pointer

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int i = 0;

        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1; // length of unique elements
    }
}
