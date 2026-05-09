/**
 * Problem: Majority Element
 *
 * Given an array nums of size n,
 * return the majority element.
 *
 * The majority element appears more than n / 2 times.
 *
 * Example:
 * Input: [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Approach:
 * Boyer-Moore Voting Algorithm
 *
 * - Maintain candidate and count
 * - If count becomes 0 → choose new candidate
 * - Same element increases count
 * - Different element decreases count
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // Choose new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increase or decrease count
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element: " + majorityElement(nums));
    }
}
