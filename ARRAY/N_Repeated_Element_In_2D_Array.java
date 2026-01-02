// Leetcode : N Repeated Element in 2D Array

//   Explaination:

//   Take input array.
//   Create for loop which (having variable i) starts with 0 upto length of array .
//   Create one varible key Assign first index of array .
//   Create another for loop (having variable j) which Starts with i+1 upto length of array.
//   Check wheather key = arr[j]
//   then return key 
//   Repeat the steps for all the elements.


class Solution {
    public int repeatedNTimes(int[] nums) {
        
    for(int i=0; i<nums.length; i++)
    {
        int key= nums[i];
        for(int j=i+1; j<nums.length; j++)
        {
            if(key==nums[j])
            {
                return key;
            }
        }
    }
    return 0;
        
    }
}
  
