// Problem: Find Missing Number
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// Numbers are from 0 to n
// One number is missing

// XOR property:
// x ^ x = 0
// x ^ 0 = x

// ------------------------------------------------------
// ⚙️ Approach (XOR):
// 1. XOR all numbers from 0 to n
// 2. XOR all elements in array
// 3. Result = missing number

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n)
// Space: O(1)

// ------------------------------------------------------
// 💡 Pattern: XOR

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int xor1 = 0; // XOR of 0 to n
        int xor2 = 0; // XOR of array elements

        for(int i = 0; i <= n; i++){
            xor1 ^= i;
        }

        for(int i = 0; i < n; i++){
            xor2 ^= nums[i];
        }

        return xor1 ^ xor2;
    }
}
