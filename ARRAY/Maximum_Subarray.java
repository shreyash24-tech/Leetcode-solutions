// Leetcode : Maximum Subarray.

// Explanation:

// Take input array .
// Create varable 'curr' and assign it First index of array(arr[0]).
// Similarly create second variable 'max' and assign it to  First index of array(arr[0]).

// Create a for loop which starts with 1 upto length of an array.

// Now update the both variables -
//   curr = Math.max(arr[i] , curr + arr[i])
//   max = Math .max(max , curr)

//   return max


class Solution {
    public int maxSubArray(int[] nums) {

  int curr = nums[0];
  int max1 = nums[0];

  for(int i=1 ; i<nums.length ; i++)
  {
    curr = Math.max(nums[i] , nums[i] +curr);
    max1 = Math.max(curr , max1);

  }
  return max1;
    }
}
