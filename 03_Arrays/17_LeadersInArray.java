/**
 * Problem: Leaders in an Array
 *
 * An element is called a leader if it is greater than all
 * the elements to its right.
 *
 * The rightmost element is always a leader.
 *
 * Example:
 * Input: [10, 22, 12, 3, 0, 6]
 * Output: [22, 12, 6]
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static List<Integer> findLeaders(int[] nums) {

        List<Integer> leaders = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] > maxRight) {
                leaders.add(nums[i]);
                maxRight = nums[i];
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {

        int[] nums = {10, 22, 12, 3, 0, 6};

        System.out.println(findLeaders(nums));
    }
}
