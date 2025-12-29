// Leetcode : Two Sum

// Explaination :
// Take input array and target.
//   Create a loop with variable i which starts with 0 upto < length of array.
//   Create 2nd loop having the variable j that starts with i+1 upto < length of array.
//   check wheather array [i] + array [j] equals to  target 
//   then return new int[]{i , j}          --(Create the integer array and store the i and j)
//   At last return new int[]{};


class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i =0 ; i<nums.length; i++)
        {
            for(int j =i+1 ; j<nums.length; j++)
        {
            if(nums[i]+nums[j] == target)
            {
                return new int[]{i,j};
            }
        }
        }
         return new int[]{};
    }
