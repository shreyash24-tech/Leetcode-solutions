// Leetcode : Single Number

// Explaination :

// Take input array.
// Initialize one variable result to 0;
// Travers the loop by for each loop 
// Put each element of nums into num.
// Perform - result ^= num     (XOR operation)
// return result


  class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int num :nums)
        {
            result ^=num;
        }
        return result;
    }
}
