// Problem: Largest Element in an Array
// Link: (optional - add later)
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// We need to find the maximum number in the array.
// So we traverse the array and keep updating the max.

// ------------------------------------------------------
// ⚙️ Approach:
// 1. Assume first element is max
// 2. Traverse array from index 1
// 3. Compare each element with max
// 4. Update max if current element is greater

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

// ------------------------------------------------------
// 💡 Edge Cases:
// - Array with negative numbers
// - Array with all same elements

class Solution {
    public int largestElement(int[] nums) {
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        return max;
    }
}
