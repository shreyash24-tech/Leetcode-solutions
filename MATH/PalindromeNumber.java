// LeetCode Problem: Palindrome Number
//   Difficulty: Easy
 
//   Problem Statement:
//   Given an integer x, return true if x is a palindrome, and false otherwise.
 
//   Approach:
//   - Negative numbers are not palindromes
//   - Reverse the number
//   - Compare reversed number with original
 
//   Time Complexity: O(n)
//   Space Complexity: O(1)


class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
       
        int digit =0;
        int rev=0;
        while(num !=0)
        {
            digit= num % 10;
            rev = (rev*10) + digit;

            num= num/10;

        }
        if(x < 0)
        {
            return false ;
        }
        if(x == rev)
        {
            return true;
        }
        else
        {
            return false;

        }
        
    }
}
