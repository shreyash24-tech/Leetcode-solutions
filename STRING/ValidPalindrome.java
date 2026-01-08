// Leetcode : Valid Palindrome.

//   Explaination.

//   Take a input String.
//   Initialize two pointer i with -0
//   and j with string length -1.

//   Traverse the loop until i < j
  
//   Initially check wheather character at index i is Letter or Digit.
//                 If not then Increament i  & continue;
//   Then check wheather character at index i ia letter or Digit .\
//                 If not then Increament j & continue.

//   After that , 
// Store the character at index i in new variable "Left"
// Similarly store the character at index j in new variable "Right".

//   And chack wheather left is equal to right 
//   if not return false. 
//   if yes return true.





class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j)
        {
           

            if(!Character.isLetterOrDigit(s.charAt(i)))
            {
                i++;
                continue;
            } 
            if(!Character.isLetterOrDigit(s.charAt(j)))
            {
                j--;
                continue;
            }

            char l= s.charAt(i);
            char r= s.charAt(j);

            if(Character.toLowerCase(l) != Character.toLowerCase(r))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}
