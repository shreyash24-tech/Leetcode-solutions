// Leetcode : Find Peak Element 

//   Explaination :

// Initialize the variable 
//   low =0
//   high = length of that array(nums.length -1)

//   Traverse the loop until --low < high
//   Calculate the mid = low + (high - low ) /2

//   Check wheather array of mid > array of mid +1
//   high = mid 
//   else 
//   low = mid +1

//   After all iterations We got our PEAK ELEMENT
//   return the low


class Solution {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high = nums.length-1;

        while(low < high)
        {
            int mid = low +(high-low)/2;

            if(nums[mid] > nums[mid+1])
            {
                high = mid;

            }
            else
            {
                low = mid + 1;
            }

        }
        return low;
    }
}
