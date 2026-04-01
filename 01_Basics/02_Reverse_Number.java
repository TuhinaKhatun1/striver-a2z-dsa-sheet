// Problem: Reverse Number
// Approach: Extract digits and build reversed number
// Time Complexity: O(log10 n)
// Space Complexity: O(1)

class Solution {
    public int reverseNumber(int n) {
        int rev = 0;
        
        while(n > 0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        
        return rev;
    }
}
