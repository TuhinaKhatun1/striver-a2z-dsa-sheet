/**
 * Problem: Sort Colors
 *
 * Given an array nums containing only 0s, 1s, and 2s,
 * sort the array in-place.
 *
 * Example:
 * Input: [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 *
 * Approach:
 * Dutch National Flag Algorithm
 *
 * - low → position for 0
 * - mid → current element
 * - high → position for 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class SortColors {

    public static void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            // If element is 0
            if (nums[mid] == 0) {

                swap(nums, low, mid);

                low++;
                mid++;
            }

            // If element is 1
            else if (nums[mid] == 1) {

                mid++;
            }

            // If element is 2
            else {

                swap(nums, mid, high);

                high--;
            }
        }
    }

    // Swap helper method
    public static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Print array
    public static void printArray(int[] nums) {

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.print("Before Sorting: ");
        printArray(nums);

        sortColors(nums);

        System.out.print("After Sorting: ");
        printArray(nums);
    }
}
