// Leetcode : Find First and Last position.

// Explaination :
// Take a sorted array as input along with target to find .
// Make a two functions to find First and Last Element.

//   in first function 
//   Intialize low =0 & high = length of array
//   find the mid 
//   Initialize another variable ans =-1
  
//   check wheather if array of mid == target 
//   store the mid index in that Variable (ans).
//   Update the high = mid -1

//   if array mid < target element 
//   then Update high = mid + 1

//   if array mid > target element 
//   then Update low = mid - 1


// Similarly Follow all the steps for last element 

//     Intialize low =0 & high = length of array
//   find the mid 
//   Initialize another variable ans =-1
  
//   check wheather if array of mid == target 
//   store the mid index in that Variable (ans).
//   Update the low = mid +1

//   if array mid < target element 
//   then Update high = mid + 1

//   if array mid > target element 
//   then Update low = mid - 1
  
// return first and last element


class Solution {
    public int[] searchRange(int[] nums, int target) {
    int first = firstElement(nums, target);
    int last = lastElement(nums, target);
    return  new int[] {
        first , last
    };

    }

    private int firstElement(int[] nums, int target)
    {
        int ans =-1;
        int low =0;
        int high =nums.length-1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid]== target)
            {
                ans = mid;
                high = mid-1;
            }
            else if(nums[mid] < target)
            {
                low = mid+1;

            }
            else
            {
                high = mid -1;

            }
            
        }
        return ans;
    }

        private int lastElement(int[] nums, int target)
        {
            int ans =-1;
            int low =0; 
            int high = nums.length -1;

            while(low <= high)
            {
                int mid = low + (high - low )/2;

                if(nums[mid]== target)
                {
                    ans = mid;
                    low = mid+1;

                }
                else if(nums[mid]<target)
                {
                    low = mid +1;
                }
                else
                {
                    high = mid -1;
                }
                
            }
            return ans;
        }

    
}
