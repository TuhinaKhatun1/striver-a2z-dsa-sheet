/**
 * Problem: Rearrange Array Elements by Sign
 *
 * Given an array nums of even length consisting of an equal number
 * of positive and negative integers.
 *
 * Rearrange the array such that:
 * 1. Every consecutive pair has opposite signs.
 * 2. The relative order of positive and negative integers is preserved.
 * 3. The array begins with a positive integer.
 *
 * Example:
 * Input: [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.Arrays;

public class RearrangeArrayBySign {

    public static int[] rearrangeArray(int[] nums) {

        int[] result = new int[nums.length];

        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {

            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2;
            } else {
                result[negIndex] = num;
                negIndex += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
