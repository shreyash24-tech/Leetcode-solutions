// Leetcode : Longest Common Prefix.

//   Explanation :

//   Take a String array as input,
//   Create one variable "prefix" having the First value of string array.
//   (String prefix= strs[0])
//   Traverse the loop with variable i from 1 to strs of length.
//   Create a variable S and store the string in strs[i].
  
//   Calculate the minLen by comparing (prefix and s)
//   Intialize one pointer j .
//   Traverse the pointer for 0 to  minLen. 
//   Check wheather (prefix.charAt(j) != s.charAt(j))
//   prefix = prefix.substring(0, j).
//   break the loop.
//   --Safe condition 
//   if(j==minLen)                          -- If all thing are matched then we can missed the important condion.
//   prefix= prefix.substriing(0,j)
//   return prefix



class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for (int i=1; i<strs.length ;i++)
        {
            String s = strs[i];
            int minLen =Math.min(prefix.length(), s.length());
            int j;
            for(j=0; j<minLen; j++)
            {
            if(prefix.charAt(j) != s.charAt(j))
            {

                prefix = prefix.substring(0,j);
                break;
            }
               
            }
            if(j== minLen)
            {
             prefix = prefix.substring(0,j);
            
            }
            }
          
        
       if(prefix.isEmpty())
       {
        return "";

       }
       return prefix;
    }
}
    
