import java.util.HashMap;

/**
 * Problem: Two Sum
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Approach:
 * - Use HashMap to store number and index
 * - Check if complement exists
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // If complement already exists
            if (map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
