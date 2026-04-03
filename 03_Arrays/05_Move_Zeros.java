// Problem: Move Zeros to End
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// Keep all non-zero elements in front,
// push zeros to the end.

// ------------------------------------------------------
// ⚙️ Approach (Two Pointer):
// 1. Maintain a pointer j for placing non-zero elements
// 2. Traverse array with i
// 3. If nums[i] != 0 → swap nums[i] and nums[j], increment j

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

// ------------------------------------------------------
// 💡 Pattern: Two Pointer

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
