// Leetcode : Missing Number .

  
// Explanation :
// Take a input array.
  
// Find the formula which is used to find the sum of Natural number & assign that to variable 'Total'.
  
// Total = n*(n+1)
//         -------
//            2

// Find the sum of all the elements in an array by using for loop & assign it to variable 'sum'.

// Create another variable 'Result' having the value (Total - Sum).
// Return Result.
  
  

class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length ;
        int sum = (n*(n+1))/2;
        int total =0;
        for(int i=0; i<n;i++)
        total += nums[i];

        int result = sum - total; 
        return result;

    }
}
