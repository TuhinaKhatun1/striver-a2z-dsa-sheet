// Problem: Check if Array is Sorted
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// If any element is smaller than its previous element,
// then the array is NOT sorted.

// ------------------------------------------------------
// ⚙️ Approach:
// 1. Traverse from index 1
// 2. Compare nums[i] with nums[i-1]
// 3. If nums[i] < nums[i-1], return false
// 4. Otherwise continue

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

class Solution {
    public boolean isSorted(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
