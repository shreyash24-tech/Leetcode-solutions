// Leetcode : Remove Duplicate from Sorted Array.

//   Explaination :
  
//   Intialize two pointers -
//   slow =0
//   fast =1 
//   Traverse the loop from fast=1 to len-1
  
//   if arr[slow] having the same value like arr[fast]
//   then skip
  
//   otherwise 
//   increment slow first 
//   copy arr[fast] into arr[slow]
//   return slow + 1

//   Example :
//   Input :-
//   [0,0,1,1,1,2,2,3,3,4]
//   Output :-
//   [0,1,2,3,4]


class Solution {
    public int removeDuplicates(int[] nums) {
        int slow =0;
        for(int fast=1; fast<nums.length; fast++)
        {
            if(nums[fast] != nums[slow])
            {
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow + 1;
    }
}
