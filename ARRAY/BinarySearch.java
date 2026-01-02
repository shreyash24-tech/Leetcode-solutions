// Leetcode : Binary Search .

//   Explaination:

// Take a input array and key .
//   Initialize one variable (low) with 0 and 
//   another varible (high) with size -1 of an array.

//   Iterate the loop util low <= high
//   Calculate the mid =(low + high)/2

//   check wheather arr[mid] == key
//   return mid
//   if arr[mid] < key
//   then low = mid +1
//   else 
//   then high = mid -1



class Solution {
    public int search(int[] nums, int target) {
   int low =0; 
   int high =nums.length -1;

    while(low<=high)
    {
        int mid = (low + high)/2;

        if(nums[mid]==target)
        {
            return mid;

        } 
        else if(nums[mid]<target)
        {
            low =mid +1;
        }
        else
        {
            high = mid -1;
        }
    }
        return -1;
        
    }
}
