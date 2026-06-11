/**
 * Problem: Longest Consecutive Sequence
 *
 * Given an unsorted array of integers nums,
 * return the length of the longest consecutive elements sequence.
 *
 * Example:
 * Input: [100, 4, 200, 1, 3, 2]
 * Output: 4
 *
 * Explanation:
 * The longest consecutive sequence is [1, 2, 3, 4].
 * Therefore, its length is 4.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {

            // Start only if num is the beginning of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longest = Math.max(longest, currentStreak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        System.out.println("Longest Consecutive Length = "
                + longestConsecutive(nums));
    }
}
