// Leetcode : Merge Sorted array .

//   Explaination :

//   Take a input for both the arrays and their lengths.
//   Initialize one variable i with Size of first array , 
//   Similarly Second variable j with size of second array.
//   And another pointer K which is initialize with sum of size of both array.

//   Traverse the loop until i>=0 AND j>=0
//   Check wheather arr[i] > arr[j]
//          arr[k]=arr[i]
//          i--
//    Check wheather arr[i] < arr[j]
//          arr[k]=arr[j]
//          j--

// If anything remain in second array, Take that elements out.

//   return thar array.



  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int i =m-1;
      int j =n-1;
      int k = m+n-1;

      while(i>=0 && j>=0)
      {
        if(nums1[i]>nums2[j])
        {
            nums1[k]=nums1[i];
            i--;
        }
        else
        {
            nums1[k]=nums2[j];
            j--;
        }
        k--;

      }

      while (j>=0)
      {
        nums1[k]=nums2[j];
        k--;
        j--;
        
      }

    }
}
