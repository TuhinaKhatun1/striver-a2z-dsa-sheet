/**
 * Problem: Rotate Matrix by 90 Degrees Clockwise
 *
 * Given an n x n 2D matrix representing an image,
 * rotate the image by 90 degrees clockwise.
 *
 * You must rotate the matrix in-place.
 *
 * Example:
 * Input:
 * [
 *   [1, 2, 3],
 *   [4, 5, 6],
 *   [7, 8, 9]
 * ]
 *
 * Output:
 * [
 *   [7, 4, 1],
 *   [8, 5, 2],
 *   [9, 6, 3]
 * ]
 *
 * Time Complexity: O(N²)
 * Space Complexity: O(1)
 */

import java.util.Arrays;

public class RotateMatrix {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int[] row : matrix) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);

        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
