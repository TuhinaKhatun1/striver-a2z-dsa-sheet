/**
 * Problem: Subarray Sum Equals K
 *
 * Given an array of integers nums and an integer k,
 * return the total number of continuous subarrays
 * whose sum equals k.
 *
 * Example:
 * Input: nums = [1, 1, 1], k = 2
 * Output: 2
 *
 * Explanation:
 * The subarrays [1,1] and [1,1] have sum equal to 2.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        // Base case: sum 0 occurs once
        prefixSumCount.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {

            currentSum += num;

            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }

            prefixSumCount.put(
                    currentSum,
                    prefixSumCount.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Number of Subarrays = "
                + subarraySum(nums, k));
    }
}
