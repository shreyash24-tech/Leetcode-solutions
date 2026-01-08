// Leetcode : Reverse String.

// Explanation:

// Take a Character array as input.
// Intiallize two pointer 
//   i which starts with 0 
//   j which starts with length of string -1.

//   Traverse the loop until (i<j)

//   Create one temporary variable (temp) and assign s[i]
//   Assign s[i] = s[j]
//   Assign s[j] = temp

//   return the result (character array).


  class Solution {
    public void reverseString(char[] s) {
    int len = s.length;
   int i=0; 
   int j=len-1;

   while(i<j)
   {
    char dem= s[i];
    s[i]=s[j];
    s[j]=dem;
    i++;
    j--;
   }
 

    }
    }
