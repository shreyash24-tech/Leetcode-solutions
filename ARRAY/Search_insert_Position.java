// Leetcode : Search insert Position 

// Explaination :

// Take a input array and target.
// Initialize 
// left =0 and right = len-1
// Traverse the loop until left <= right 
// calculate mid = (left +right) /2

// check if arr[mid] == target 
// return mid

// check if arr[mid] < target
// update left = mid +1

// else arr[mid] > target
// update right  = mid -1

// if all condition are false then pointer will come outside loop 
// where left > right 
// we easily return the left     (As array is sorted, target value should be less than it previous (left)).

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4


class Solution {
    public int searchInsert(int[] nums, int target) {
   
   int left =0, right =nums.length-1;
   while(left<= right)
   {
    int mid = (left +right)/2;
    if(nums[mid]==target)
    {
        return mid;
    }
    else if(nums[mid]<target)
    {
        left =mid+1;

    }
    else
    {
        right = mid -1;
    }
   }

   return left;

  
    }
}
