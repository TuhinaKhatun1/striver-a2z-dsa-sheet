/**
 * Problem: Maximum Subarray Sum (Kadane's Algorithm)
 *
 * Given an integer array nums, find the contiguous subarray
 * with the largest sum and return that sum.
 *
 * Example:
 * Input: [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 *
 * Explanation:
 * The subarray [4,-1,2,1] has the largest sum = 6.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class KadanesAlgorithm {

    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            currentSum += num;

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
