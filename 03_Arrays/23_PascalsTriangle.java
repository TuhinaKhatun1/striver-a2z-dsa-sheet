/**
 * Problem: Pascal's Triangle
 *
 * Given an integer numRows, return the first numRows
 * of Pascal's Triangle.
 *
 * In Pascal's Triangle, each number is the sum of the
 * two numbers directly above it.
 *
 * Example:
 * Input: numRows = 5
 * Output:
 * [
 *   [1],
 *   [1, 1],
 *   [1, 2, 1],
 *   [1, 3, 3, 1],
 *   [1, 4, 6, 4, 1]
 * ]
 *
 * Time Complexity: O(N²)
 * Space Complexity: O(N²)
 */

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {

            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);

            for (int col = 1; col < row; col++) {
                int value = triangle.get(row - 1).get(col - 1)
                          + triangle.get(row - 1).get(col);

                currentRow.add(value);
            }

            if (row > 0) {
                currentRow.add(1);
            }

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        List<List<Integer>> result = generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
