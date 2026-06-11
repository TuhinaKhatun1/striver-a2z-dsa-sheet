/**
 * Problem: Next Permutation
 *
 * A permutation of an array of integers is an arrangement of its members
 * into a sequence or linear order.
 *
 * The next permutation of an array is the next lexicographically greater
 * permutation of its integers.
 *
 * If such an arrangement is not possible, the array must be rearranged
 * as the lowest possible order (sorted in ascending order).
 *
 * Example:
 * Input: [1,2,3]
 * Output: [1,3,2]
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {

        int index = -1;

        // Step 1: Find the first decreasing element from the end
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no such element exists, reverse the entire array
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 2: Find the next greater element
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 3: Reverse the remaining part
        reverse(nums, index + 1, nums.length - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
    }
}
