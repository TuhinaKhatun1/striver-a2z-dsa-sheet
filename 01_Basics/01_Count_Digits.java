// Problem: Count Digits
// Approach: Repeated division by 10
// Time Complexity: O(log10 n)
// Space Complexity: O(1)

class Solution {
    public int countDigits(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}
