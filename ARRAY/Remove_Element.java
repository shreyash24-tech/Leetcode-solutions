// Leetcode  : Remove Element

//   Explaination :

//   Take a input array and value 
//   Initialize 
  
//     writeIndex =0
//     Traverse loop from 0 to len -1
//     check wheather arr[i] != val
//     then arr[writeIndex] = arr[i]
//     writeIndex++

//   return writeIndex
    

class Solution {
    public int removeElement(int[] nums, int val) {
        int writeIndex =0;
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i] != val)
            {
                nums[writeIndex] = nums[i];
                writeIndex ++;

            }
        }
        return writeIndex ;
    }
}
