// Leetcode :  Plus One 

// Explaination :
// Initialize 
//   Carry =1
//   len to arrays length -1
//   Iterate the loop 
//   from len until >=0 & decrement pointer by one after each iteration.
  
//   Add arr[len] with carry 
//   check wheather if the arr[len]==10
//   arr[len]=0
//   carry =1
//   if not 
//   set carry =0
//   return array
  
//   check after all iteration the carry =1 (Means Carry is Generated at MSB)
//   Create one Result array having size (Existing size of array) + 1
//   Set Result[0] MSB of resultant array to 1
//   Copy all elements existing array to resultant array.
//   -- System.arraycopy(existingArray , starting index , resultant array , starting index , length)
//   -- System.arraycopy(digits , 0, result , 1 , len)
//   return result
  


  class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int len = digits.length -1;
       
       for(int i=len ; i>=0 ; i--)
       {
        digits[i] += carry;
        if(digits[i]==10)
        {
            digits[i]=0;
            carry=1;

        }
        else
        {
            carry =0;
        }
       }
     if(carry ==1)
    {
        int[] result = new int [len +2];
        result[0] =1;
        System.arraycopy(digits , 0 , result , 1, digits.length);
        return result;

    }
         return digits;
    }

}
