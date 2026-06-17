/**
 * Problem: Majority Element II
 *
 * Given an integer array of size n, find all elements
 * that appear more than ⌊n/3⌋ times.
 *
 * Example:
 * Input: [3, 2, 3]
 * Output: [3]
 *
 * Input: [1, 1, 1, 3, 3, 2, 2, 2]
 * Output: [1, 2]
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        // Phase 1: Find potential candidates
        for (int num : nums) {

            if (candidate1 == num) {
                count1++;
            } else if (candidate2 == num) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Phase 2: Verify candidates
        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }

        List<Integer> result = new ArrayList<>();

        int threshold = nums.length / 3;

        if (count1 > threshold) {
            result.add(candidate1);
        }

        if (count2 > threshold) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 3, 3, 2, 2, 2};

        System.out.println(majorityElement(nums));
    }
}
