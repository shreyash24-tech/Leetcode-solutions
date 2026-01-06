// Leetcode : Length of last word.

// Explanation : 
// Take String as input.
// Check wheather first input is (' ') space -> Skip.
  
// Traverse the loop util character is(' ') -->Space.
// Increament count

// return result


class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        int count=0;
    while(i>=0 && (s.charAt(i))==(' '))
    {
        i--;
    }

    while(i>=0 && (s.charAt(i)) != ' ')
    {
        count ++;
        i--;
    }
    return count;
    }
}
