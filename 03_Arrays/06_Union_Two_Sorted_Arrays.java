// Problem: Union of Two Sorted Arrays
// Difficulty: Easy

// ------------------------------------------------------
// 🧠 Intuition:
// Since both arrays are sorted, we can merge them
// while avoiding duplicates.

// ------------------------------------------------------
// ⚙️ Approach:
// 1. Use two pointers i and j
// 2. Compare elements from both arrays
// 3. Add smaller element to result (avoid duplicates)
// 4. Move pointer accordingly
// 5. Process remaining elements

// ------------------------------------------------------
// ⏱️ Complexity:
// Time: O(n + m)
// Space: O(n + m)

// ------------------------------------------------------
// 💡 Pattern: Two Pointer / Merge

import java.util.*;

class Solution {
    public List<Integer> unionArray(int[] a, int[] b) {
        int i = 0, j = 0;
        List<Integer> result = new ArrayList<>();

        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                if(result.size() == 0 || result.get(result.size()-1) != a[i]){
                    result.add(a[i]);
                }
                i++;
            } else {
                if(result.size() == 0 || result.get(result.size()-1) != b[j]){
                    result.add(b[j]);
                }
                j++;
            }
        }

        while(i < a.length){
            if(result.size() == 0 || result.get(result.size()-1) != a[i]){
                result.add(a[i]);
            }
            i++;
        }

        while(j < b.length){
            if(result.size() == 0 || result.get(result.size()-1) != b[j]){
                result.add(b[j]);
            }
            j++;
        }

        return result;
    }
}
