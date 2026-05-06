import java.util.HashMap;

/**
 * Problem: Longest Subarray with Sum K
 *
 * Given an array and integer K,
 * find the length of the longest subarray whose sum equals K.
 *
 * Example:
 * Input: arr = [1, 2, 3, 1, 1, 1, 1], K = 3
 * Output: 3
 *
 * Approach:
 * - Use prefix sum + hashmap
 * - Store first occurrence of prefix sum
 * - Check if (sum - K) exists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class LongestSubarraySumK {

    public static int longestSubarray(int[] arr, int k) {

        HashMap<Integer, Integer> prefixMap = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // If entire subarray from 0 to i gives sum k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Check if (sum - k) exists
            if (prefixMap.containsKey(sum - k)) {

                int length = i - prefixMap.get(sum - k);

                maxLen = Math.max(maxLen, length);
            }

            // Store first occurrence only
            if (!prefixMap.containsKey(sum)) {
                prefixMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;

        System.out.println("Longest Length: " + longestSubarray(arr, k));
    }
}
