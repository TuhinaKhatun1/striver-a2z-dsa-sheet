// Problem: Second Largest Element in an Array
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// We need the second largest DISTINCT element.
// So we track both largest and second largest while traversing.

// ------------------------------------------------------
// ⚙️ Approach:
// 1. Initialize largest and secondLargest
// 2. Traverse array
// 3. If current > largest:
//      secondLargest = largest
//      largest = current
// 4. Else if current > secondLargest AND current != largest:
//      update secondLargest

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

// ------------------------------------------------------
// 💡 Edge Cases:
// - All elements same → return -1
// - Negative numbers

class Solution {
    public int secondLargest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != largest){
                secondLargest = nums[i];
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }
}
