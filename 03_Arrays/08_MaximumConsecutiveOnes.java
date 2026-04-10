package arrays;

/**
 * Problem: Maximum Consecutive Ones
 *
 * Given a binary array nums, return the maximum number of consecutive 1s.
 *
 * Example:
 * Input: [1, 1, 0, 1, 1, 1]
 * Output: 3
 *
 * Approach:
 * - Traverse the array once
 * - Count consecutive 1s
 * - Reset count when 0 appears
 * - Track maximum count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumConsecutiveOnes {

    /**
     * Returns the maximum number of consecutive 1s in the array
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    /**
     * Utility method to print array
     */
    private static void printArray(int[] nums) {
        System.out.print("[ ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }

    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int[] nums3 = {0, 0, 0};

        System.out.print("Input: ");
        printArray(nums1);
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums1));

        System.out.print("\nInput: ");
        printArray(nums2);
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums2));

        System.out.print("\nInput: ");
        printArray(nums3);
        System.out.println("Max Consecutive Ones: " + findMaxConsecutiveOnes(nums3));
    }
}
