// Leetcode : Shuffle The Array

// Explaination :
// Take input the array and one variable n(Mid) from where you have to shuffle the array.
// Intialize one variable index with '0'.
// Create array having size (n*2).
// Traverse loop from 0 to n
//   Intialize -
//   array[index++] = nums[i]
//   array[index++] = nums[i + n]

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int index=0;
        for(int i=0; i<n; i++)
        {
            ans[index++] =nums[i];
            ans[index++] =nums[n+i];
            
        }
        return ans;
    }
}
